package Personal;

import java.util.Comparator;
import java.util.Optional;
import java.util.Stack;
import java.util.Vector;
//2017_1015_2200;
/*
 * I've been having this problem for a few months now. 
 * I'd be debugging a java app and every time I'd hit a constructor, 
 * eclipse would try to find matching java core library 
 * ClassNotFoundException's source code. 
   I solved this problem by right-clicking in Debug window on the 
   ClassNotFoundException when I hit it, and clicking on Filter Type. 
   I would then right-click in the debug window again and choose Edit 
   Step Filters.... In the Edit Step Filters window I checked everything
    in the Defined Step Filters section and unchecked everything in the
     bottom of the window (Filter synthetic methods, 
     Filter static initializers, etc). 

Hope this helps others in the future.

 */

public class JspStatic {

    public static class PairSort implements Comparator {

        public int compare(Object obj1, Object obj2) {
            Pair E1 = (Pair) obj1;
            Pair E2 = (Pair) obj2;
            if (E1.getStart() < E2.getStart()) {
                return -1;
            } else if (E1.getStart() > E2.getStart()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public enum LineType {
        AFTER_LINE, NEXT_LINE
    };
    public static String sHead = "#####";
    public static String sLv = "   ";

    public final static PairSort PairSortObj = new PairSort();
    public final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final static String EMPTY = " \t\r\n\0";
    public final static String NUMBER = "0123456789";
    public final static String[] op2 = {"++", "--", "==", "!=", ">=", "<=", "<<", ">>", "&&", "||", "+=", "-=", "*=", "/=", "%=", "&=", "^=", "|="};
    public final static String[] op3 = {">>>", "<<=", ">>="};
    public final static String OC="()[];=><+-*/%^~@,:!|.~?";

    /**
     * **
     * �Ǧ^�@�Ӧr��,�o�Ӧr��O���Ʀr��space���ƤFcount�� �Φbmake�t�C�禡���غcline�ܼ�
     *
     * @param space �n���ƪ����r��
     * @param count ���ƪ�����
     * @return �Ǧ^���r��
     */
    public static String GetString(String space, int count) {
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < count; i++) {
            ret.append(space);
        }
        return ret.toString();
    }
    public static StringBuffer MyText, OutputText;

    //public Vector<Integer> SmallLeft; // Record the position of '('
    //public Vector<Integer> SmallRight;// Record the position of ')'
    /**
     * *
     * ��޸��ϰ�=SQArea SQ=Single Quote
     */
    public Vector<Pair> SQArea;
    /**
     * *
     * ���޸��ϰ�=DQArea DQ=Double Quote
     */
    public Vector<Pair> DQArea;
    /**
     * *
     * CommentArea=���Ѱϰ�
     */
    public Vector<Pair> CommentArea;
    /**
     * *
     * FuncHeaderArea=�禡�ϰ�
     */
    public Vector<FocusPair> FuncHeaderArea;
    /**
     * *
     * ClassArea=Class�ŧi�ϰ�
     */
    public Vector<FocusPair> ClassArea;
    /**
     * *
     * ArrayArea=�}�C�ϰ�
     */
    public Vector<FocusPair> ArrayArea;

    //public Vector<Resolution> Analysis; 
    /**
     * *
     * �Τ@��Focus�N��@�s���ε{���X��Token
     */
    public Vector<Focus> MyFocus;

    public Vector<FocusPair> AttributeArea;
    /**
     * **
     * �غc�l
     *
     * @param Text
     */
    public JspStatic(StringBuffer Text) {
        MyText = GetMyText(Text);
        init();
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea);

    }

    public String warning() {
        StringBuffer ret = new StringBuffer();
        for (Pair P : CommentArea) {
            String that=Main.ToStr(P,MyText);
            int _SQ_count=0, _DQ_count=0;
            for (int i=0; i<that.length(); i++) {
                if (that.charAt(i)=='\'')  _SQ_count++;
                if (that.charAt(i)=='\"')  _DQ_count++;
            }
            if (_SQ_count%2>0 || _DQ_count%2>0) {
                ret.append("SQ_DQ_�����:"+that+"\n");
            }
        }
        return ret.toString();
    }

    public void go() {
        System.out.println(warning());
        Build_MyFocus();
        Build_AttributeArea(AttributeArea);
        Build_Class_Area(ClassArea);
        Build_Header_Area(FuncHeaderArea);
        Build_Array_Area(ArrayArea);
        //�ا�Focus Tokens�H��,�p�G�����n,�n��  Focus-->Resolution���ഫ (�]�\�S�����n)

        /*
        OutputText = Make0(LineType.AFTER_LINE);
        System.out.println(OutputText.toString());
        System.out.println("*Next_LINE*****************************************************************");
        OutputText = new StringBuffer();
        OutputText = Make0(LineType.NEXT_LINE);
        System.out.println(OutputText.toString());
        */
        
    }
    void Build_AttributeArea(Vector<FocusPair> destArea) {
        for (int i=0; i<MyFocus.size()-1; i++) {
            if (MyFocus.get(i).getString().equals("@")) {
                destArea.add(new FocusPair(i,i+1));
            }
        }
    }
    /**
     * **
     * ��X�@�������S���������{���X,����AFTER_LINE or NEXT_LINE as much as possible,�����O\n
     *
     * �p�G�ӥثe���o�ˤl���[�c,�̽����������N�b�o��;���ӭn�̤u�{��h��o�Ө禡��p... �����X���}�G�{�׻PMake�禡�������{�צ�����
     *
     * @param lt ��ܮ榡���ܼ�(AFTER_LINE or NEXT_LINE)
     * @return ��X�@��StringBuffer�ܼ�
     */
    public StringBuffer Make0(LineType lt) {
        Stack<TextLevel> Complex = new Stack<TextLevel>();
        Complex.push(new TextLevel("class", FocusPair.MotherFocusPair, 0));
        int Level = 0;
        String line;
        TextLevel newTL;
        StringBuffer ret = new StringBuffer();
        int i=0;
        try {

            for ( i = 0; i < MyFocus.size(); i++) {
                FocusPair F = GetPair(i, ClassArea);
                if (F != null) {
                    //�T�{�i�JClassArea
                    line = sHead + GetString(sLv, Level) + F.toString(MyFocus);
                    ret.append(line);
                    i = F.getEnd();
                    FocusPair block = FindSymmetricBigBraceToken(i, MyFocus);
                    // old code:  _class.push(new TextLevel(block.getEnd(),Level));
                    newTL = new TextLevel("class", block, Level);
                    Complex.push(newTL);
                    continue;
                }
                F = GetPair(i, FuncHeaderArea);
                if (F != null) {
                    //�T�{�i�JFuncHeaderArea
                    line = sHead + GetString(sLv, Level) + F.toString(MyFocus);
                    ret.append(line);
                    i = F.getEnd();
                    FocusPair block = FindSymmetricBigBraceToken(i, MyFocus);
                    // old code: _func.push(new TextLevel(block.getEnd(),Level));
                    newTL = new TextLevel("func", block, Level);
                    Complex.push(newTL);
                    continue;
                }
                String that = MyFocus.get(i).getString();
                if (that.equals("{")) {
                    switch (lt) {
                        case AFTER_LINE:
                            ret.append(" {" + "\n");
                            Level += 1;
                            break;
                        case NEXT_LINE:
                            ret.append("\n");
                            line = sHead + GetString(sLv, Level) + "{" + "\n";
                            Level += 1;
                            ret.append(line);
                            break;
                    }
                    continue;
                }
                if (that.equals("}")) {
                    //�Qdo�d�I
                    TextLevel Top = Complex.peek();
                    if (Top.StartToEnd.getEnd() == i) {
                        switch (Top.Type) {
                            case "func":
                            case "class":
                                newTL = Complex.pop();
                                Level = newTL.Level;
                                line = sHead + GetString(sLv, Level) + "}" + "\n";
                                ret.append(line);
                                if (i==MyFocus.size()-1)
                                    return ret;
                                break;
                            case "if":
                            case "else if":
                            case "else":
                            case "while":
                            case "for":
                            case "try":
                            case "catch":
                            case "finally":
                                //�w�]�����p
                                newTL = Complex.pop();
                                Level = newTL.Level;
                                line = sHead + GetString(sLv, Level) + "}" + "\n";
                                ret.append(line);
                                break;
                            case "do":
                                if (MyFocus.get(i + 1).getString().equals("while")) {
                                    newTL = Complex.pop();
                                    Level = newTL.Level;
                                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                                    line = sHead + GetString(sLv, Level) + "} while" + Brace.toString(MyFocus) + ";\n";
                                    ret.append(line);
                                    i = Brace.getEnd() + 1;
                                    continue;
                                } else {
                                    ret.append("compiling error at i=" + i);
                                    return ret;
                                }
                            default:
                                ret.append("something wrong at i=" + i);
                                return ret;
                        }
                        continue;
                    }
                }

                if (that.equals("do")) {
                    line = sHead + GetString(sLv, Level) + "do ";
                    ret.append(line);
                    FocusPair Block = FindSymmetricBigBraceToken(i, MyFocus);
                    newTL = new TextLevel("do", Block, Level);
                    Complex.push(newTL);
                } else if (that.equals("for")) {                    
                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                    line = sHead + GetString(sLv, Level) + "for "+ Brace.toString(MyFocus);
                    ret.append(line);                                        
                    if (MyFocus.get(Brace.getEnd()+1).getString().equals(";")) {
                        ret.append(";\n"); 
                        i=Brace.getEnd()+1;
                        continue;
                    }else if (!MyFocus.get(Brace.getEnd()+1).getString().equals("{")) {
                        ret.append("\n");
                        Level += 1;
                        int semicolon_pos = SearchForTokenPos(Brace.getEnd()+1, ";", MyFocus);
                        FocusPair stmt = new FocusPair(Brace.getEnd()+1, semicolon_pos);
                        line = sHead + GetString(sLv, Level) + stmt.toString(MyFocus);
                        ret.append(line + "\n");
                        Level -= 1;
                        i = stmt.getEnd();
                        continue;                        
                    }                
                    FocusPair Block = FindSymmetricBigBraceToken(Brace.getEnd() + 1, MyFocus);
                    newTL = new TextLevel("for", Block, Level);
                    Complex.push(newTL);                    
                    i = Brace.getEnd();
                    continue;
                } else if (that.equals("while")) {
                    line = sHead + GetString(sLv, Level) + "while ";
                    ret.append(line);
                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                    ret.append(Brace.toString(MyFocus));
                    if (MyFocus.get(Brace.getEnd() + 1).getString().equals(";")) {
                        ret.append(";\n");
                        i = Brace.getEnd() + 1;
                    } else if (!MyFocus.get(Brace.getEnd() + 1).getString().equals("{")) {
                        ret.append("\n");
                        Level += 1;
                        int semicolon_pos = SearchForTokenPos(Brace.getEnd()+1, ";", MyFocus);
                        FocusPair stmt = new FocusPair(Brace.getEnd()+1, semicolon_pos);
                        line = sHead + GetString(sLv, Level) + stmt.toString(MyFocus);
                        ret.append(line + "\n");
                        Level -= 1;
                        i = stmt.getEnd();
                        continue;
                    } else {
                        FocusPair Block = FindSymmetricBigBraceToken(Brace.getEnd(), MyFocus);
                        newTL = new TextLevel("while", Block, Level);
                        Complex.push(newTL);
                        i = Brace.getEnd();
                    }
                    continue;
                } else if (that.equals("if")) {
                    line = sHead + GetString(sLv, Level) + "if ";
                    ret.append(line);
                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                    ret.append(Brace.toString(MyFocus));
                    Focus next = MyFocus.get(Brace.getEnd() + 1);
                    if (!next.getString().equals("{")) {
                        ret.append("\n");
                        Level += 1;
                        int semicolon_pos = SearchForTokenPos(i + 1, ";", MyFocus);
                        FocusPair stmt = new FocusPair(Brace.getEnd() + 1, semicolon_pos);
                        line = sHead + GetString(sLv, Level) + stmt.toString(MyFocus);
                        ret.append(line + "\n");
                        Level -= 1;
                        i = stmt.getEnd();
                        continue;
                    } else {
                        FocusPair Block = FindSymmetricBigBraceToken(Brace.getEnd(), MyFocus);
                        newTL = new TextLevel("if", Block, Level);
                        Complex.push(newTL);
                    }
                    i = Brace.getEnd();
                    continue;
                } else if (that.equals("else if")) {
                    //�X�G�O��if���P�˪���...�ҥH�ȮɥΰŶK��
                    line = sHead + GetString(sLv, Level) + "else if ";
                    ret.append(line);
                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                    ret.append(Brace.toString(MyFocus));
                    Focus next = MyFocus.get(Brace.getEnd() + 1);
                    if (!next.getString().equals("{")) {
                        ret.append("\n");
                        Level += 1;
                        int semicolon_pos = SearchForTokenPos(i + 1, ";", MyFocus);
                        FocusPair stmt = new FocusPair(Brace.getEnd() + 1, semicolon_pos);
                        line = sHead + GetString(sLv, Level) + stmt.toString(MyFocus);
                        ret.append(line + "\n");
                        Level -= 1;
                        i = stmt.getEnd();
                        continue;
                    } else {
                        FocusPair Block = FindSymmetricBigBraceToken(Brace.getEnd(), MyFocus);
                        newTL = new TextLevel("else if", Block, Level);
                        Complex.push(newTL);
                    }
                    i = Brace.getEnd();
                    continue;
                } else if (that.equals("else")) {
                    line = sHead + GetString(sLv, Level) + "else ";
                    ret.append(line);
                    if (!MyFocus.get(i + 1).RetString.equals("{")) {
                        ret.append("\n");
                        Level += 1;
                        int semicolon_pos = SearchForTokenPos(i + 1, ";", MyFocus);
                        FocusPair stmt = new FocusPair(i + 1, semicolon_pos);
                        line = sHead + GetString(sLv, Level) + stmt.toString(MyFocus);
                        ret.append(line + "\n");
                        Level -= 1;
                        i = stmt.getEnd();
                        continue;
                    } else {
                        FocusPair Block = FindSymmetricBigBraceToken(i, MyFocus);
                        newTL = new TextLevel("else", Block, Level);
                        Complex.push(newTL);
                        
                    }
                } else if (that.equals("try")) {
                    line = sHead + GetString(sLv, Level) + "try ";
                    ret.append(line);
                    FocusPair Block = FindSymmetricBigBraceToken(i, MyFocus);
                    newTL = new TextLevel("try", Block, Level);
                    Complex.push(newTL);
                } else if (that.equals("catch")) {
                    line = sHead + GetString(sLv, Level) + " catch ";
                    ret.append(line);
                    FocusPair Brace = FindSymmetricSmallBraceToken(i, MyFocus);
                    ret.append(Brace.toCatchString(MyFocus).get());
                    FocusPair Block = FindSymmetricBigBraceToken(i, MyFocus);
                    newTL = new TextLevel("catch", Block, Level);
                    Complex.push(newTL);
                    i = Brace.getEnd();
                } else if (that.equals("finally")) {
                    line = sHead + GetString(sLv, Level) + " finally ";
                    ret.append(line);
                    FocusPair Block = FindSymmetricBigBraceToken(i, MyFocus);
                    newTL = new TextLevel("finally", Block, Level);
                    Complex.push(newTL);
                } else if (that.equals(";")) {
                    ret.append(";\n");  //@@?�H�K�g�g...
                } else {
                    //�򥻤W���@��Statement�B�z
                    int HeadPos = SearchForStatementHeadPos(i, MyFocus);
                    Optional<FocusPair> FuncBase = GetFuncBase(i,Complex);
                    FocusPair Limit= FuncBase.orElse(GetClassBase(i,Complex).get()); 
                    //���O�o�̫��B�zmother?
                    int StartPos = Math.max(HeadPos,Limit.getStart()+1);
                    int EndPos = SearchForTokenPos(i, ";", MyFocus);
                    FocusPair tmp = new FocusPair(StartPos, EndPos);
                    line = sHead + GetString(sLv, Level) + tmp.toString(MyFocus);
                    ret.append(line + "\n");
                    i = EndPos;
                }
            }
        } catch (Exception ex) {
            System.out.println("exception at i="+i);
        }
        return ret;
    }

    /**
     * **
     * �غcFocus�C��,�M��̬Y�ǭ�h�ץ�
     */
    public void Build_MyFocus() {

        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic.GetOneToken(MyText, 0, CommentArea, DQArea, SQArea);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic.GetOneToken(MyText, hand.NextCharPos, CommentArea, DQArea, SQArea);
        }
        //final String[] op3={">>>","<<=",">>="};
        Vector<Focus> tmp2 = OP_Replacement(tmp, JspStatic.op3);
        //��o�̧�T�Ӧr�����B��l��������        
        //final String[] op2={"++","--","==","!=",">=","<=","<<",">>","&&","||","+=","-=","*=","/=","%=","&=","^=","|="};
        Vector<Focus> tmp3 = OP_Replacement(tmp2, JspStatic.op2);
        Vector<Focus> tmp4 = ELSE_IF_Replacement(tmp3);
        MyFocus = FloatNUM_Replacement(tmp4);

    }

    public static Vector<Focus> ELSE_IF_Replacement(Vector<Focus> origin) {
        Vector<Focus> ret = new Vector<Focus>();
        for (int i = 0; i < origin.size() - 1; i++) {
            Focus f1 = origin.get(i);
            Focus f2 = origin.get(i + 1);
            if (f1.getString().equals("else")) {
                if (f2.getString().equals("if")) {
                    Focus F = new Focus("else if", f1.StartPos, f2.NextCharPos);
                    ret.add(F);
                    ++i;
                    continue;
                }
            }
            ret.add(origin.get(i));
        }
        Focus last = origin.get(origin.size() - 1);
        ret.add(last);
        return ret;
    }

    /**
     * **
     * ��T�Ӧr�Ψ�Ӧr���B�⤸�X�֦��@�ӹB�⤸
     *
     * @param origin �ӷ���Focus�C��,�i��]�t("+","+")�o�تF��
     * @param op �T�Ӧr�Ψ�Ӧr���B�⤸
     * @return �n�Ǧ^��Focus�C��( ��²��("++") )
     */
    public static Vector<Focus> OP_Replacement(Vector<Focus> origin, final String[] op) {
        for (int x = 1; x < op.length; x++) {
            if (op[0].length() != op[x].length()) {
                return null;
            }
        }
        final int op_length = op[0].length();
        Vector<Focus> ret = new Vector<Focus>();
        for (int i = 0; i < origin.size() - op_length + 1; i++) {
            boolean newElement = false;
            for (int j = 0; j < op.length; j++) {
                String that = op[j];
                boolean _all_length_is_1 = true;
                boolean _all_equal = true;
                for (int k = 0; k < op_length; k++) {
                    if (origin.get(i + k).getString().length() != 1) {
                        _all_length_is_1 = false;
                    }
                    if (origin.get(i + k).getString().charAt(0) != that.charAt(k)) {
                        _all_equal = false;
                    }
                }
                if (_all_length_is_1 && _all_equal) {
                    Focus tmpFocus = new Focus(op[j], origin.get(i).StartPos, origin.get(i + op_length - 1).NextCharPos);
                    ret.add(tmpFocus);
                    newElement = true;
                    i += (op_length - 1);
                    break;
                }
            }
            if (!newElement) {
                ret.add(origin.get(i));
            }
        }
        for (int i = origin.size() - op_length + 1; i < origin.size(); i++) {
            ret.add(origin.get(i));
        }
        return ret;
    }

    /**
     * **
     * ��B�I�ƶ������@��Token���禡
     *
     * @param origin �ӷ���Focus�C��(�i��]�t"3",".","1","4","1","5","9")
     * @return �Ǧ^��Focus�C��(�Ǧ^"3.14159")
     */
    public static Vector<Focus> FloatNUM_Replacement(Vector<Focus> origin) {
        Vector<Focus> ret = new Vector<Focus>();
        for (int i = 0; i < origin.size() - 1; i++) {
            String that = origin.get(i).getString();
            if (that.equals(".")) {
                Focus prev = origin.get(i - 1);
                Focus next = origin.get(i + 1);  //��α���
                if (IsNumber(prev.getString())) {
                    if (prev.StartPos + prev.getString().length() == origin.get(i).StartPos) {
                        if (IsNumber(next.getString())) {
                            ret.removeElementAt(ret.size() - 1);
                            ret.add(new Focus(prev.getString() + "." + next.getString(), prev.StartPos, next.NextCharPos));
                            ++i;
                            continue;
                        } else {
                            ret.removeElementAt(ret.size() - 1);
                            ret.add(new Focus(prev.getString() + ".0", prev.StartPos, origin.get(i).NextCharPos));
                            continue;
                        }
                    }
                }
            }
            ret.add(origin.get(i));
        }
        ret.add(origin.get(origin.size() - 1));
        return ret;
    }

    /*
    public static boolean isToken(StringBuffer text, int Pos, String str) {
        if (text.substring(Pos).startsWith(str)) {
            if (ALPHABET.indexOf(text.charAt(Pos - 1)) < 0 && ALPHABET.indexOf(text.charAt(Pos+str.length())) < 0) {
                return true;
            }
        }
        return false;
    }
     */
    /**
     * *
     * ��¦�س]; �n�إߥ��T��(CommentArea+DQArea+SQArea),�ҥH
     */
    public void init() {
        OutputText = new StringBuffer();

        SQArea = new Vector<Pair>();
        DQArea = new Vector<Pair>();
        CommentArea = new Vector<Pair>();
        FuncHeaderArea = new Vector<FocusPair>();
        ClassArea = new Vector<FocusPair>();
        ArrayArea = new Vector<FocusPair>();
        AttributeArea=new Vector<FocusPair>();
    }

    /**
     * **
     * DQ=Double Quote ��B�إ�DQArea,���O�o�˫إߤ@�w�|����(�]�����Ѹ̭��]���i�঳DQ�Ÿ�) ����A�ץ�
     * �򥻤WDQArea�MCommentArea���i��|��"���ͳJ�J����"���޿説�p�X�{ �ҥH�{�b�]���X����b���Ѱϰ�̸��檺DQ�Ÿ��i��|�����D �Ҧp
     * String,S,=,DQ,A,B,C,DQ,; // DQ /n String,T,=,DQ,C,D,E,DQ,;
     * �ҥH�n�D�ϥΪ̦bCommentArea�p�G��DQ�Ÿ��@�w�n���� �Ҧp String,S,=,DQ,A,B,C,DQ,; // (DQ)(DQ)
     * /n String,T,=,DQ,C,D,E,DQ,;
     *
     * @param text �ѪR������(���t"<!%","%>")
     * @param dest ��DQArea���a��
     */
    public static void Build_DQ_Area(StringBuffer text, Vector<Pair> dest) {
        int startDQ = (-1);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\"') {
                if (i >= 1 && text.charAt(i - 1) == '\\') {
                    continue;
                }
                if (startDQ >= 0 && i > startDQ) {
                    dest.add(new Pair(startDQ, i));
                    startDQ = (-1);
                } else {
                    startDQ = i;
                }
            } else if (text.charAt(i) == '\n') {
                startDQ = (-1);
            }
        }
    }

    /**
     * **
     * SQ=Single Quote �إ�SQArea ��B�إ�SQArea,���O�o�˫إߤ@�w�|����(�]�����Ѹ̭��]���i�঳SQ�Ÿ�) ����A�ץ�
     * �򥻤WSQArea�MCommentArea���i��|��"���ͳJ�J����"���޿説�p�X�{ �ҥH�{�b�]���X����b���Ѱϰ�̸��檺SQ�Ÿ��i��|�����D �Ҧp
     * String,S,=,SQ,A,SQ,; // SQ /n String,T,=,SQ,C,SQ,;
     * �ҥH�n�D�ϥΪ̦bCommentArea�p�G��DQ�Ÿ��@�w�n���� �Ҧp String,S,=,SQ,A,SQ,; // (SQ)(SQ) /n
     * String,T,=,SQ,C,SQ,;
     *
     * @param text �ѪR������(���t"<!%","%>")
     * @param RefDQArea �ѦҪ�DQArea��T
     * @param dest ��SQArea���a��
     */
    public static void Build_SQ_Area(StringBuffer text, Vector<Pair> RefDQArea, Vector<Pair> dest) {
        int startSQ = (-1);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\'') {
                if (Main.In(i, RefDQArea)) {
                    continue;
                }
                if (i >= 1 && text.charAt(i - 1) == '\\') {
                    continue;
                }
                if (startSQ >= 0 && i > startSQ) {
                    dest.add(new Pair(startSQ, i));
                    startSQ = (-1);
                } else {
                    startSQ = i;
                }
            } else if (text.charAt(i) == '\n') {
                startSQ = (-1);
            }
        }
    }

    /**
     * **
     * �إ�CommentArea
     *
     * @param text �ѦҪ�����
     * @param RefDQArea �ѦҪ�DQArea
     * @param RefSQArea �ѦҪ�SQArea
     * @param dest ��mCommentArea���a��
     */
    public static void Build_Comment_Area(StringBuffer text, Vector<Pair> RefDQArea, Vector<Pair> RefSQArea,
            Vector<Pair> dest) {
        int start = (-1);
        for (int i = 0; i < text.length() - 2; i++) {
            String hand = text.substring(i, i + 2);
            if (hand.equals("//")) {
                if (Main.In(i, RefDQArea) || Main.In(i, RefSQArea) || Main.In(i, dest)) {
                    continue;
                }
                start = i;
                for (; i < text.length() - 2; i++) {
                    if (text.charAt(i) == '\n') {
                        Pair p = new Pair(start, i);
                        dest.add(p);
                        start = (-1);
                        break;
                    }
                }
            } else if (hand.equals("/*")) {
                if (Main.In(i, RefDQArea) || Main.In(i, RefSQArea) || Main.In(i, dest)) {
                    continue;
                }
                start = i;
                for (; i < text.length() - 2; i++) {
                    String hand2 = text.substring(i, i + 2);
                    if (hand2.equals("*/")) {
                        Pair p = new Pair(start, i + 1);
                        dest.add(p);
                        start = (-1);
                        break;
                    }
                }
            }
        }
        if (start > 0) {
            String hand2 = text.substring(text.length() - 2);
            int crlf = hand2.indexOf("\n");
            int cmt2 = hand2.indexOf("*/");
            if (hand2.contains("\n")) {
                dest.add(new Pair(start, text.length() - 2 + crlf));
            } else if (hand2.contains("*/")) {
                dest.add(new Pair(start, text.length() - 2 + cmt2));
            }
        }
    }

    /**
     * **
     * �򥻤W�o�ӭץ��O����,���O���o������,�Ȯɥi�H����,�N�����a
     */
    public static void Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(StringBuffer text, Vector<Pair> SQArea,
            Vector<Pair> DQArea, Vector<Pair> CommentArea) {
        Vector<Integer> ALLSQ = new Vector<Integer>();
        Vector<Integer> ALLDQ = new Vector<Integer>();
        for (Pair SQ : SQArea) {
            ALLSQ.add(SQ.getStart());
            ALLSQ.add(SQ.getEnd());
        }
        for (Pair DQ : DQArea) {
            ALLDQ.add(DQ.getStart());
            ALLDQ.add(DQ.getEnd());
        }
        for (int t = CommentArea.size() - 1; t >= 0; t--) {
            Pair Comment = CommentArea.get(t);
            for (int i = ALLSQ.size() - 1; i >= 0; i--) {
                int that = ALLSQ.get(i);
                if (Comment.getStart() <= that && that <= Comment.getEnd()) {
                    ALLSQ.removeElementAt(i);
                }
            }
            for (int i = ALLDQ.size() - 1; i >= 0; i--) {
                int that = ALLDQ.get(i);
                if (Comment.getStart() <= that && that <= Comment.getEnd()) {
                    ALLDQ.removeElementAt(i);
                }
            }
        }
        if (ALLDQ.size() % 2 == 1) {
            System.out.println("ALLDQ=" + ALLDQ);
            throw new RuntimeException("DQ not paired");
        }
        if (ALLSQ.size() % 2 == 1) {
            System.out.println("ALLSQ=" + ALLSQ);
            throw new RuntimeException("SQ not paired");
        }
        SQArea.clear();
        DQArea.clear();
        for (int i = 0; i < ALLSQ.size(); i += 2) {
            SQArea.add(new Pair(ALLSQ.get(i), ALLSQ.get(i + 1)));
        }
        for (int i = 0; i < ALLDQ.size(); i += 2) {
            DQArea.add(new Pair(ALLDQ.get(i), ALLDQ.get(i + 1)));
        }
    }

    /**
     * **
     * ��MyFocus�إ�HeaderArea
     *
     * @param destHeaderArea ��mHeaderArea���a��
     */
    public void Build_Header_Area(Vector<FocusPair> destHeaderArea) {
        CompoundStack S = new CompoundStack();
        for (int i = 0; i < MyFocus.size(); i++) {
            Focus that = MyFocus.get(i);
            FocusPair F = GetPair(i, ClassArea);
            if (F != null) {
                i = F.getEnd() + 1;
                S.meetClassAndLeft();
            } else if (that.getString().equals("{")) {
                S.meetLeft();
            } else if (that.getString().equals("}")) {
                S.meetRight();
            } else if (that.getString().equals("(")) {
                if (!S.OK_for_FunctionHeader()) {
                    continue;
                } else {
                    //���i��i�H����FunctionHeader�H��n�P�w�o��statement���S������
                    int headpos = SearchForStatementHeadPos(i, MyFocus);
                    boolean _found_equal_symbol = false;
                    int nearest_eq = SearchForTokenPos(headpos, "=", MyFocus);
                    if (nearest_eq > i || nearest_eq == -1) {
                        int right_brace_pos = SearchForTokenPos(i, ")", MyFocus);
                        destHeaderArea.add(new FocusPair(headpos, right_brace_pos));
                        i = right_brace_pos;
                    }
                }
            }
        }
    }

    /**
     * *
     * ��MyFocus�إ�ClassArea
     *
     * @param destClassArea ��mClassArea���a��
     */
    public void Build_Class_Area(Vector<FocusPair> destClassArea) {
        final String[] prev_accept = {"private", "protected", "public", "final", "static", "abstract"};
        //final String[] next_accept={"extends","implements","<",">",","};
        int classStart = (-1), classEnd = (-1);
        for (int i = 0; i < MyFocus.size(); i++) {
            Focus that = MyFocus.get(i);
            if (that.getString().equals("class") || that.getString().equals("interface")) {
                //�B�zclass���e������
                classStart = i;
                int j = i - 1;
                while (j >= 0) {
                    String hand = MyFocus.get(j).getString();
                    boolean match = false;
                    for (int k = 0; k < prev_accept.length; k++) {
                        if (hand.equals(prev_accept[k])) {
                            match = true;
                            break;
                        }
                    }
                    if (match) {
                        classStart = j;
                        --j;
                        continue;
                    } else {
                        break;
                    }
                }
                //�B�zclass���᪺����                
                classEnd = SearchForTokenPos(i + 1, "{", MyFocus);
                destClassArea.add(new FocusPair(classStart, classEnd - 1));

            }
        }
    }

    /**
     * **
     * �n���g
     *
     */
    public void Build_Array_Area(Vector<FocusPair> destArrayArea) {
        for (int i = 0; i < MyFocus.size() - 1; i++) {
            FocusPair Outter = FindOutterBigBraceToken(i, MyFocus);
            Focus F = MyFocus.get(i);
            Focus nx = MyFocus.get(i + 1);
            if (nx.getString().equals("{")) {
                switch (F.getString()) {
                    case "=":
                    case "]":
                        FocusPair after = FindSymmetricBigBraceToken(i, MyFocus);
                        if (Outter == null || (Outter.getStart() < after.getStart() && after.getEnd() < Outter.getEnd())) {
                            destArrayArea.add(after);
                        }
                    default:
                        continue;
                }
            }
        }

    }

    /*�n���Τ���
    public static int GetLineHead(StringBuffer text, int pos) {
        while (pos >= 0) {
            if (text.charAt(pos) != '\n') {
                pos--;
            } else {
                return pos;
            }
        }
        return (0);
    }
     */

    public static int GetFirstCharInCodeBeforePos(StringBuffer text, char inn, int pos,
            Vector<Pair> refDQArea, Vector<Pair> refSQArea, Vector<Pair> refCommentArea) {
        int i = pos - 1;
        while (i >= 0) {
            char c = text.charAt(i);
            if (inn == c) {
                if (!Main.In(i, refDQArea)
                        && !Main.In(i, refSQArea)
                        && !Main.In(i, refCommentArea)) {
                    return i;
                }
            }
            i--;
        }
        return (-1);
    }

    //�o�ӭn
    public static int GetFirstCharInCodeAfterPos(StringBuffer text, char inn, int pos,
            Vector<Pair> refDQArea, Vector<Pair> refSQArea, Vector<Pair> refCommentArea) {
        int i = pos + 1;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (inn == c) {
                if (!Main.In(i, refDQArea)
                        && !Main.In(i, refSQArea)
                        && !Main.In(i, refCommentArea)) {
                    return i;
                }
            }
            i++;
        }
        return (-1);
    }

    public static StringBuffer GetMyText(StringBuffer buf) {
        int C1 = buf.indexOf("<%!");
        int C2 = buf.lastIndexOf("%>");
        String my = buf.substring(C1 + 3, C2);
        return new StringBuffer(my);
    }

    public static Focus GetOneToken(StringBuffer text, int from_pos, Vector<Pair> CommentArea, Vector<Pair> DQArea, Vector<Pair> SQArea) {
        final String WHITE = " \t\n\r\0";
        StringBuffer retStr = new StringBuffer();
        int _First_Alphabet_Position = (-1);
        for (int i = from_pos; i < text.length(); i++) {
            char that = text.charAt(i);
            if (WHITE.indexOf(that) >= 0) {
                if (retStr.length() >= 1) {
                    return new Focus(retStr.toString(), _First_Alphabet_Position, i);
                }
                continue;
            } else {
                boolean CommentHit = false;
                Pair comment = GetPair(i, CommentArea);
                if (comment != null) {
                    i = comment.getEnd();
                    CommentHit = true;
                }
                /*
                boolean ArrayHit=false;
                Pair array=GetPair(i,ArrayArea);
                if (array!=null) {
                    ArrayHit=true;
                    if (_First_Alphabet_Position<0)
                        _First_Alphabet_Position=array.getStart();
                }
                 */

                boolean DQHit = false;
                Pair DQ = GetPair(i, DQArea);
                if (DQ != null) {
                    DQHit = true;
                    if (_First_Alphabet_Position < 0) {
                        _First_Alphabet_Position = DQ.getStart();
                    }
                }
                boolean SQHit = false;
                Pair SQ = GetPair(i, SQArea);
                if (SQ != null) {
                    SQHit = true;
                    if (_First_Alphabet_Position < 0) {
                        _First_Alphabet_Position = SQ.getStart();
                    }
                }
                if (CommentHit) {
                    if (retStr.length() > 0) {
                        return new Focus(retStr.toString(), _First_Alphabet_Position, i + 1);
                    } else {
                        continue;
                    }
                }/*else if (ArrayHit)  {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),_First_Alphabet_Position,array.getStart());
                    }else { 
                        return new Focus(Uncomment(text,array,CommentArea),_First_Alphabet_Position,array.getEnd()+1);
                    }                    
                }*/ else if (DQHit) {
                    if (retStr.length() > 0) {
                        return new Focus(retStr.toString(), _First_Alphabet_Position, DQ.getStart());
                    } else {
                        return new Focus(text.substring(DQ.getStart(), DQ.getEnd() + 1), _First_Alphabet_Position, DQ.getEnd() + 1);
                    }
                } else if (SQHit) {
                    if (retStr.length() > 0) {
                        return new Focus(retStr.toString(), _First_Alphabet_Position, SQ.getStart());
                    } else {
                        return new Focus(text.substring(SQ.getStart(), SQ.getEnd() + 1), _First_Alphabet_Position, SQ.getEnd() + 1);
                    }
                } else {
                    retStr.append(that);
                    if (retStr.length() == 1 && _First_Alphabet_Position < 0) {
                        _First_Alphabet_Position = i;
                    }

                    final String Special_OneCharacter_Token = "{}()[];=><+-*/%^~@,:!|.~?";
                    if (retStr.length() == 1 && Special_OneCharacter_Token.indexOf(retStr.charAt(0)) >= 0) {  //�p�G�Y���@���Ÿ�(�Ҧp'+')
                        return new Focus(retStr.toString(), _First_Alphabet_Position, i + 1);
                    } else if (Special_OneCharacter_Token.indexOf(retStr.charAt(retStr.length() - 1)) >= 0) { //�p�G�b�^��᭱�Y��Ÿ�(�Ҧp'+')
                        int length = retStr.length();
                        return new Focus(retStr.substring(0, length - 1), _First_Alphabet_Position, i);
                    }
                }
            }
        }
        return null;
    }

    /**
     * **
     * ��Y�q�϶����������ѳ������_��
     *
     * @param F ��ܰ϶���FocusPair
     * @param refMyFocus ����������Focus
     * @param refCommentArea �ǤJ������CommentArea
     * @return �Ǧ^�@�Ǭ�����Pair����
     */
    public static Vector<Pair> GetAllComment(FocusPair F, Vector<Focus> refMyFocus, Vector<Pair> refCommentArea) {
        Vector<Pair> ret = new Vector<Pair>();
        if (F.getStart()>=0 ) {
            int start = refMyFocus.get(F.getStart()).StartPos;
            int end = refMyFocus.get(F.getEnd()).StartPos;            
            for (int i = 0; i < refCommentArea.size(); i++) {
                Pair P = refCommentArea.get(i);
                if (start <= P.getStart() && P.getEnd() <= end) {
                    ret.add(P);
                }
            }            
        }else {
            for (int i=0; i<refCommentArea.size(); i++) {
                Pair P=refCommentArea.get(i);
                if (P.getStart()< refMyFocus.get(0).StartPos) {
                    ret.add(P);
                }
            }
        }
        return ret;
    }

    /**
     * **
     * �Y�Ӥ@�s�����ন�r�� �o�Ө禡�O�s�g��,���@�w����,���O�N��@�ǷQ�k
     *
     * @param comments �n��X�����Ѹs����,���A�OVector<Pair>
     * @param refMyText �ѷӪ�����
     * @return �Ǧ^���r��
     */
    public static String Comments_Into_String1(Vector<Pair> comments, StringBuffer refMyText) {
        StringBuffer ret = new StringBuffer();
        Pair P;
        for (int i = 0; i < comments.size() - 1; i++) {
            P = comments.get(i);
            ret.append(refMyText.substring(P.getStart(), P.getEnd() + 1) + "\n");
        }
        P = comments.get(comments.size() - 1);
        ret.append(refMyText.substring(P.getStart(), P.getEnd() + 1));
        return ret.toString();
    }

    /**
     * **
     * ��P�ϰ쪺����,�p�G�]�t����,�������� �`�N�������Ѫ��ʧ@�n�Ѥ好����e�ʧ@�~�|���T
     *
     * @param text ����
     * @param P �d��
     * @param commentArea ����
     * @return �Ǧ^��
     */
    public static String Uncomment(StringBuffer text, Pair P, Vector<Pair> commentArea) {
        StringBuffer ret = new StringBuffer(text.substring(P.getStart(), P.getEnd() + 1));
        int t = P.getStart();
        for (int i = commentArea.size() - 1; i >= 0; i--) {
            Pair that = commentArea.get(i);
            if (that.getStart() >= P.getStart() && that.getEnd() <= P.getEnd()) {
                String thatComment = text.substring(that.getStart(), that.getEnd() + 1);
                String corresponding = ret.substring(that.getStart() - t, that.getEnd() - t + 1);
                if (thatComment.equals(corresponding)) {
                    ret.replace(that.getStart() - t, that.getEnd() - t + 1, "");
                }
            }
        }
        return ret.toString();
    }

    /**
     * **
     * �Ѥ@�sPair����pos�Ҧb��Pair,�M��Ǧ^
     *
     * @param pos �Y�Ӥ奻��m
     * @param src �Y��Pair��C
     * @return �Ǧ^�@��Pair
     */
    public static Pair GetPair(int pos, Vector<Pair> src) {
        for (Pair p : src) {
            if (p.getStart() <= pos && pos <= p.getEnd()) {
                return p;
            }
        }
        return null;
    }

    /**
     * **
     * �Ѥ@�sFocusPair��pos�Ҧb��FocusPair,�M��Ǧ^
     *
     * @param pos �Y�Ӧ�m
     * @param src �Y��FocusPair��C
     * @return �Ǧ^�@��FocusPair
     */
    public static FocusPair GetPair(Integer pos, Vector<FocusPair> src) {
        for (FocusPair F : src) {
            if (F.getStart() <= pos && pos <= F.getEnd()) {
                return F;
            }
        }
        return null;
    }

    /**
     * *
     * �]�\�H��αo��
     *
     * @param that
     */
    public static void DeleteLastCr(StringBuffer that) {
        while (that.length() >= 0 && that.charAt(that.length() - 1) != '\n') {
            that.deleteCharAt(that.length() - 1);
        }
        that.deleteCharAt(that.length() - 1);
    }

    public static FocusPair FindOutterBigBraceToken(int start, Vector<Focus> refMyFocus) {
        int f = SearchForTokenBeforePos(start, "{", refMyFocus);
        if (f < 0) {
            return null;
        } else {
            FocusPair ret = FindSymmetricBigBraceToken(f, refMyFocus);
            return ret;
        }
    }

    /**
     * **
     * ��start��m�᪺��٪��j�A��
     *
     * @param start �j�M�_�l��m
     * @param refMyFocus �ǤJ�n�j�M��Focus��C
     * @return �Ǧ^�@���٪��j�A����m,�HFocusPair���Φ�
     */
    public static FocusPair FindSymmetricBigBraceToken(int start, Vector<Focus> refMyFocus) {
        int Level = 0, retStart = (-1), retEnd = (-1);
        if (refMyFocus.get(start).getString().equals("{")) {
            Level += 1;
            retStart = start;
        }
        for (int i = start + 1; i < refMyFocus.size(); i++) {
            if (refMyFocus.get(i).getString().equals("{")) {
                if (retStart < 0) {
                    retStart = i;
                }
                ++Level;
            } else if (refMyFocus.get(i).getString().equals("}")) {
                --Level;
                if (Level == 0) {
                    retEnd = i;
                    return new FocusPair(retStart, retEnd);
                }
            }
        }
        return null;
    }

    /**
     * **
     * �Ѱ_�l��m�j�M��٪��p�A��
     *
     * @param start �j�M�_�l��m
     * @param refMyFocus �j�M��Focus��C
     * @return �Ǧ^�@��p�A��,�HFocusPair���Φ�
     */
    public static FocusPair FindSymmetricSmallBraceToken(int start, Vector<Focus> refMyFocus) {
        int Level = 0, retStart = (-1), retEnd = (-1);
        if (refMyFocus.get(start).getString().equals("(")) {
            Level += 1;
            retStart = start;
        }
        for (int i = start + 1; i < refMyFocus.size(); i++) {
            if (refMyFocus.get(i).getString().equals("(")) {
                if (retStart < 0) {
                    retStart = i;
                }
                ++Level;
            } else if (refMyFocus.get(i).getString().equals(")")) {
                --Level;
                if (Level == 0) {
                    retEnd = i;
                    return new FocusPair(retStart, retEnd);
                }
            }
        }
        return null;
    }

    /**
     * *
     * ��̤j��
     *
     * @param t1
     * @param t2
     * @param t3
     * @return
     */
    public static int max(int t1, int t2, int t3) {
        if (t1 >= t2 && t1 >= t3) {
            return t1;
        } else if (t2 >= t1 && t2 >= t3) {
            return t2;
        }
        return t3;
    }

    /**
     * **
     * �n�p��{�b�o�Ӧ�m,�p�G�b�Y��Func�̭�,�������Ĥ@�ӥ��j�A���b����...
     *
     * @param pos               �{�b����m
     * @param refComplex        �ѦҪ�Complex Stack
     * @return �Ǧ^�Y�ӥ��j�A������m
     */
    public static Optional<FocusPair> GetFuncBase(int pos,Stack<TextLevel> refComplex) {
        return SearchComplexStackFromTop(pos,"func",refComplex);
    }
    public static Optional<FocusPair> SearchComplexStackFromTop(int pos,String type,Stack<TextLevel> refComplex) {
        if (!refComplex.empty()) {
            for (int i=refComplex.size()-1; i>=0; i--) {
                TextLevel TL=refComplex.get(i);
                if (type.equals(TL.Type))
                    return Optional.of(TL.StartToEnd);                            
            }
        }
        return Optional.empty();
    }

    /**
     * *
     * �n�p��{�b�o�Ӧ�m,�p�G�b�Y��Class�̭�,�������Ĥ@�ӥ��j�A���b����
     *
     * @param pos               �{�b����m
     * @param refComplex        �ѦҪ�Complex Stack
     * @return �Ǧ^�Y�ӥ��j�A������m
     */
    public static Optional<FocusPair> GetClassBase(int pos,Stack<TextLevel> refComplex) {        
        return SearchComplexStackFromTop(pos,"class",refComplex);
    }

    /**
     * *
     * �ˬd�Y�r��O�_�����Ʀr
     *
     * @param input ��J�r��
     * @return true/false
     */
    public static boolean IsNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (NUMBER.indexOf(input.charAt(i)) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * **
     * �ѬY�Ӧ�m��i��O���ԭz(statement)���Y����m
     * ��k�O���e��"{","}",";"�T�ӲŸ�,�p�G������ӴN�O�F(���L�٤��T�w�O���OStatement
     * head,�ҥH�n��GetClassBase/GetFuncBase�ӻ���)
     *
     * @param pos �}�l���e�M�䪺��m
     * @param refMyFocus �M�䪺Focus��C
     * @return �Ǧ^����m
     */
    public static int SearchForStatementHeadPos(int pos, Vector<Focus> refMyFocus) {
        int i = pos - 1;
        while (i >= 0) {
            String that = refMyFocus.get(i).getString();
            switch (that) {
                case "}":
                case ";":
                case "{":
                    return i + 1;
                case "@":  //�p�G�J��Attribute
                    return i+2;
                default:
                    --i;
            }
        }
        return 0;
    }

    /**
     * **
     * �άY�Ӧr��Ÿ�,����j�M�Y�Ӧ�m
     *
     * @param pos
     * @param str
     * @param refMyFocus
     * @return
     */
    public static int SearchForTokenPos(int pos, String str, Vector<Focus> refMyFocus) {
        int i = pos + 1;
        while (i < refMyFocus.size()) {
            if (refMyFocus.get(i).getString().equals(str)) {
                return i;
            }
            ++i;
        }
        return -1;
    }

    public static int SearchForTokenBeforePos(int pos, String str, Vector<Focus> refMyFocus) {
        int i = pos - 1;
        while (i >= 0) {
            if (refMyFocus.get(i).getString().equals(str)) {
                return i;
            }
            --i;
        }
        return -1;
    }

}
