
package Personal;

import java.util.Stack;
import java.util.Optional;
import java.util.Vector;

/**
 *
 * @author easterday
 */
public class JspStatic3  {
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
    public static StringBuffer MyText, OutputText;  
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
     * *
     * �]�wClass���A����ܤ覡
     */
    public final static LineType ClassType = LineType.NEXT_LINE;
    /**
     * *
     * �]�wFunc���A����ܤ覡
     */
    public final static LineType FuncType = LineType.AFTER_LINE;
    /**
     * *
     * ��L���c���A����ܤ覡
     */
    public static LineType OtherType = LineType.AFTER_LINE;
    /**
     * *
     * Try�᭱��Catch�n��bTry_Block���᭱(After_LINE)�άO�U�@��(NEXT_LINE)
     */
    public static LineType Catch_After_Try_Block = LineType.AFTER_LINE;
    /**
     * *
     * ����Ÿ�
     */
    public static String NexLine = "\n";

    /**
     * *
     * �]�wOtherType; �Ǧ^JspStatic3���󥻨��i�H�s��]�w��L��LineType
     *
     * @param lt
     * @return �Ǧ^JspStatic3����
     */
    public JspStatic3 setOtherType(LineType lt) {
        OtherType = lt;
        return this;
    }

    /**
     * *
     * �]�wCatchType; �Ǧ^JspStatic3���󥻨��i�H�s��]�w��L��LineType
     *
     * @param lt
     * @return �Ǧ^JspStatic3����
     */
    public JspStatic3 setCatchType(LineType lt) {
        Catch_After_Try_Block = lt;
        return this;
    }
    public JspStatic3() {
        //do nothing
        super();
    }
    /**
     * *
     * �غc�l
     *
     * @param Text �ǤJ������,�]�t<%!  %>
     */
    public JspStatic3(StringBuffer Text) {
        MyText=GetMyText(Text);
        init();
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea);
        
        sHead = "#####";
        sLv = "   ";
    }
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
     * *
     * ��ܽs�ƫ᪺��r
     *
     * @return �Ǧ^�s�ƫ᪺��r
     */
    public StringBuffer Make3() {
        Stack<TextLevel> Complex = new Stack<TextLevel>();
        Stack<Pair> StackCommentArea = CopyCommentAreaIntoStackCommentArea(CommentArea);
        Complex.push(new TextLevel("class", FocusPair.MotherFocusPair, 0));
        StringBuffer ret = new StringBuffer();
        Integer Level = 0;
        int i = 0;
        Vector<Integer> Eye = new Vector<Integer>();
        Eye.add(-1);
        try {
            for (i = 0; i < MyFocus.size(); i++) {
                if (Eye.size() <= 2) {
                    Eye.add(i);
                } 
                if (Eye.size()>2){
                    Eye.removeElementAt(0);
                }
                if (Eye.size() >= 2) {
                    int sz = Eye.size();
                    FocusPair Range = new FocusPair(Eye.get(sz - 2), Eye.get(sz - 1));
                    //old:  Vector<Pair> comments = GetAllComment(Range, MyFocus, CommentArea);
                    Vector<Pair> comments= GetAllCommentFromStackCommentArea(Range,MyFocus,StackCommentArea);
                    for (Pair P : comments) {
                        //old code: ret.append(ToStr(P,MyText,Level));
                        ret.append(TempToStr(P, Level));
                    }
                }
                FocusPair F = GetPair(i, ClassArea);
                if (F != null) {
                    i = Make_Class_Function_Area(ret, Level, F, FindSymmetricBigBraceToken(i, MyFocus), Complex, "class");
                    continue;
                }
                F = GetPair(i, FuncHeaderArea);
                if (F != null) {
                    i = Make_Class_Function_Area(ret, Level, F, FindSymmetricBigBraceToken(i, MyFocus), Complex, "func");
                    continue;
                }
                switch (MyFocus.get(i).getString()) {
                    case "{":
                        MakeLeftBigBrace(ret, Level, Complex);
                        Level++;
                        break;
                    case "}":
                        i = MakeRightBigBrace(ret, i, Level, Complex);
                        Level--;
                        break;
                    case "do": //do�᭱�@�w��Block
                        i = MakeDo(ret, i, Level, FindSymmetricBigBraceToken(i, MyFocus), Complex);
                        break;
                    case "for":
                        i = Make_For_While(ret, i, Level, Complex, "for");
                        break;
                    case "while":
                        i = Make_For_While(ret, i, Level, Complex, "while");
                        break;
                    case "if":
                        i = Make_If_ElseIf(ret, i, Level, Complex, "if");
                        break;
                    case "else if":
                        i = Make_If_ElseIf(ret, i, Level, Complex, "else if");
                        break;
                    case "else":  //else��finally�欰�p�G��Catch_after_Try�N���@��
                        i = i = Make_Else(ret, i, Level, Complex);
                        break;
                    case "catch":
                        i = MakeCatch(ret, i, Level, FindSymmetricSmallBraceToken(i, MyFocus), Complex);
                        break;
                    case "try":  //try�᭱�@�w��Block
                        i = MakeTry(ret, i, Level, FindSymmetricBigBraceToken(i, MyFocus), Complex);
                        break;
                    case "finally"://else��finally�欰�p�G��Catch_after_Try�N���@��
                        i = Make_Finally(ret, i, Level, Complex);
                        break;
                    case "@":
                        i = MakeAttribute(ret, i, Level);
                        break;
                    case "switch":
                        i = Make_Switch(ret, i, Level, Complex);
                        break;
                    case "case":
                        Level = Complex.peek().Level;
                        i = Make_Case_Default(ret, i, Level, Complex, "case");
                        Level++;
                        break;
                    case "default":
                        Level = Complex.peek().Level;
                        i = Make_Case_Default(ret, i, Level, Complex, "default");
                        Level++;
                        break;
                    case "synchronized":
                        if (InFunction(i, Complex)) {
                            i = Make_Synchronized(ret, i, Level, Complex);
                            break;
                        }
                        throw new NullPointerException("Keyword\"Synchronzied\" appears in no function...");
                    default:
                        i = MakeStatement(ret, i, Level, Complex);
                        break;
                }
            }
            while(!StackCommentArea.empty()) {
                Pair P=StackCommentArea.pop();
                //old code: ret.append(ToStr(P,MyText,Level));
                ret.append(TempToStr(P, Level));                                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ret;
    }

    /**
     * *
     * �B�zCase����r�MDefault����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b���r("case" or "default")����m
     * @param level �{�b��Level
     * @param refComplex �{�b���϶����|
     * @param what �{�b�J�쪺�r�O"case" or "default"
     * @return �Ǧ^�_���Ҧb��m
     */
    public int Make_Case_Default(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex, String what) {
        int Colum = SearchForTokenPos(NowPos, ":", MyFocus);
        String line;
        switch (what) {
            case "case":
                FocusPair _case = new FocusPair(NowPos + 1, Colum - 1);
                line = sHead + GetString(sLv, level) + what + " " + _case.toString(MyFocus) + ":" + NexLine;
                refRet.append(line);
                return Colum;
            case "default":
                line = sHead + GetString(sLv, level) + "default:" + NexLine;
                refRet.append(line);
                return Colum;
            default:
                throw new NullPointerException("bad " + what + " without �_�� NowPos=" + NowPos);
        }
    }

    /**
     * *
     * �B�z"if"����r�M"else if"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b���r("if" or "else if")����m
     * @param level �{�b��Level
     * @param refComplex �{�b���϶����|
     * @param what �{�b�J�쪺�r�O"if" or "else if"
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int Make_If_ElseIf(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex, String what) {
        switch (what) {
            case "if":
            case "else if":
                break;
            default:
                throw new NullPointerException("Bad Make_If_ElseIf: NowPos=" + NowPos + " what=" + what);
        }
        String line = sHead + GetString(sLv, level) + what;
        FocusPair Brace = GetSmallBrace(NowPos);
        refRet.append(line + " " + Brace.toString(MyFocus));
        switch (Next(Brace.getEnd())) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL = new TextLevel(what, Block, level);
                refComplex.push(newTL);
                return Brace.getEnd();
            case "for":
            case "while":
            case "try":
            case "switch":
            case "do":
            case "if":
            case "synchronized":
                throw new NullPointerException(what + "�᭱����ԭz���A�X�λs�yblock������r---�o�˪��X����F");
            default:
                refRet.append(NexLine);
                return MakeStatement(refRet, Brace.getEnd() + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     * �B�z"switch"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b���r("switch")����m
     * @param level �{�b��Level
     * @param refComplex �{�b���϶����|
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int Make_Switch(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex) {
        FocusPair Brace = GetSmallBrace(NowPos);
        String line = sHead + GetString(sLv, level) + "switch" + Brace.toString(MyFocus);
        refRet.append(line);
        switch (Next(Brace.getEnd())) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL = new TextLevel("switch", Block, level);
                refComplex.push(newTL);
                return Brace.getEnd();
            default:
                throw new NullPointerException("Bad Switch without following Block: NowPos=" + NowPos);
        }

    }

    /**
     * *
     * �B�z"for"����r�M"while"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b���r("for" or "while")����m
     * @param level �{�b��Level
     * @param refComplex �{�b���϶����|
     * @param what �{�b���r("for" or "what
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int Make_For_While(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex, String what) {
        switch (what) {
            case "for":
            case "while":
                break;
            default:
                throw new NullPointerException("Bad Make_For_While: NowPos=" + NowPos + " what=" + what);
        }
        String line = sHead + GetString(sLv, level) + what;
        FocusPair Brace = GetSmallBrace(NowPos);
        refRet.append(line + Brace.toString(MyFocus));
        switch (Next(Brace.getEnd())) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL = new TextLevel(what, Block, level);
                refComplex.push(newTL);
                return Brace.getEnd();
            case ";":
                refRet.append(";" + NexLine);
                return Brace.getEnd() + 1;

            case "for":
            case "while":
            case "try":
            case "switch":
            case "do":
            case "if":
            case "synchronized":
                throw new NullPointerException(what + "�᭱����ԭz���A�X�λs�yblock������r---�o�˪��X����F");

            default:
                //�J��stmt
                refRet.append(NexLine);
                return MakeStatement(refRet, Brace.getEnd() + 1, level + 1, refComplex);
        }
    }//Make_Synchronized(ret,i,Level,Complex);

    public int Make_Synchronized(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex) {
        String line = sHead + GetString(sLv, level) + "synchronized";
        FocusPair Brace = GetSmallBrace(NowPos);
        refRet.append(line + Brace.toString(MyFocus));
        switch (Next(Brace.getEnd())) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL = new TextLevel("synchronized", Block, level);
                refComplex.push(newTL);
                return Brace.getEnd();
            default:
                throw new NullPointerException("keyword \"synchronized\" do not have a block");
        }
    }

    /**
     * *
     * �������o�@�ӱԭz���d��
     *
     * @param i �}�l�j�M��m
     * @return �Ǧ^�ԭz��FocusPair
     */
    public FocusPair GetStmt(int i) {
        int EndPos = SearchForTokenPos(i, ";", MyFocus);
        return new FocusPair(i, EndPos);
    }

    /**
     * *
     * �Ǧ^�U�@��Focus���N��r��
     *
     * @param i �}�l�j�M��m
     * @return �Ǧ^�r��
     */
    public String Next(int i) {
        if (i + 1 < MyFocus.size()) {
            return MyFocus.get(i + 1).RetString;
        }
        throw new NullPointerException("i=" + i + "  i+1=" + (i + 1));
    }

    public String Prev(int i) {
        if (i - 1 >= 0) {
            return MyFocus.get(i - 1).RetString;
        }
        throw new NullPointerException("i=" + i + "  i-1=" + (i - 1));
    }

    /**
     * *
     * ����M���٪��p�A��
     *
     * @param i �}�l�j�M��m
     * @return �Ǧ^�p�A���d��
     */
    public FocusPair GetSmallBrace(int i) {
        return FindSymmetricSmallBraceToken(i, MyFocus);
    }

    /**
     * *
     * �B�z"catch"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�bcatch����m
     * @param level �{�b��Level
     * @param Brace catch�᭱���۪��p�A���d��
     * @param refComplex �϶����|
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int MakeCatch(StringBuffer refRet, int NowPos, int level, FocusPair Brace, Stack<TextLevel> refComplex) {
        String line = "<bad catch>";
        if (Catch_After_Try_Block == LineType.NEXT_LINE) {
            line = sHead + GetString(sLv, level) + "catch";
        } else if (Catch_After_Try_Block == LineType.AFTER_LINE) {
            line = "catch";
        }
        refRet.append(line);
        refRet.append(Brace.toCatchString(MyFocus).get());
        switch (Next(Brace.getEnd())) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL = new TextLevel("catch", Block, level);
                refComplex.push(newTL);
                return Brace.getEnd();
            default:
                refRet.append(NexLine);
                return MakeStatement(refRet, NowPos, level + 1, refComplex);
        }
    }

    /**
     * *
     * �B�z"do"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�bdo����m
     * @param level �{�b��Level
     * @param Block do�᭱���۪��j�A���d��
     * @param refComplex �϶����|
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int MakeDo(StringBuffer refRet, int NowPos, int level, FocusPair Block, Stack<TextLevel> refComplex) {
        if (Prev(NowPos).equals("}") && refRet.charAt(refRet.length() - 1) != '\n') {   //�o�y���ﵽ�Ŷ�...
            refRet.append(NexLine);
        }
        String line = sHead + GetString(sLv, level) + "do";
        refRet.append(line);
        TextLevel newTL = new TextLevel("do", Block, level);
        refComplex.push(newTL);
        return NowPos;
    }

    /**
     * *
     * �B�z"try"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�btry����m
     * @param Level �{�b��Level
     * @param Block try�᭱���۪��j�A���d��
     * @param refComplex �϶����|
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int MakeTry(StringBuffer refRet, int NowPos, int Level, FocusPair Block, Stack<TextLevel> refComplex) {
        String line = sHead + GetString(sLv, Level) + "try";
        refRet.append(line);
        TextLevel newTL = new TextLevel("try", Block, Level);
        refComplex.push(newTL);
        return NowPos;
    }

    /**
     * *
     * �B�z"else"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�belse����m
     * @param level �{�b��Level
     * @param refComplex �϶����|
     * @return �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int Make_Else(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex) {
        String line = sHead + GetString(sLv, level) + "else";
        refRet.append(line);
        switch (Next(NowPos)) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                refComplex.push(new TextLevel("else", Block, level));
                return NowPos;
            case "for":
            case "while":
            case "try":
            case "switch":
            case "do":
            case "if":
            case "synchronized":
                throw new NullPointerException("else �᭱����ԭz���A�X�λs�yblock������r---�o�˪��X����F");
            default:
                //�J��stmt
                refRet.append(NexLine);
                return MakeStatement(refRet, NowPos + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     * �B�z"finally"����r
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�bfinally����m
     * @param level �{�b��Level
     * @param refComplex �϶����|
     * @return �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int Make_Finally(StringBuffer refRet, int NowPos, int level, Stack<TextLevel> refComplex) {
        String line = "<bad finally>";
        if (Catch_After_Try_Block == LineType.AFTER_LINE) {
            line = "finally" + " ";
        } else if (Catch_After_Try_Block == LineType.NEXT_LINE) {
            line = sHead + GetString(sLv, level) + "finally" + " ";
        }
        refRet.append(line);
        switch (Next(NowPos)) {
            case "{":
                FocusPair Block = FindSymmetricBigBraceToken(NowPos, MyFocus);
                refComplex.push(new TextLevel("finally", Block, level));
                return NowPos;
            case "for":
            case "while":
            case "try":
            case "switch":
            case "do":
            case "if":
            case "synchronized":
                throw new NullPointerException("finally �᭱����ԭz���A�X�λs�yblock������r---�o�˪��X����F");
            default:
                //�J��stmt
                refRet.append(NexLine);
                return MakeStatement(refRet, NowPos + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b@����m
     * @param Level �{�b��Level
     * @return �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int MakeAttribute(StringBuffer refRet, int NowPos, final Integer Level) {
        String line = sHead + GetString(sLv, Level) + "@" + MyFocus.get(NowPos + 1).RetString + NexLine;
        refRet.append(line);
        return NowPos + 1;
    }

    /**
     * *
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param StartPos �ԭz�}�l��m
     * @param Level �{�b��Level
     * @param refComplex �϶����|
     * @return �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int MakeStatement(StringBuffer refRet, int StartPos, int Level, Stack<TextLevel> refComplex) {
        //FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());  //������o�˶]����...        
        Optional<FocusPair> L = GetFuncBase(StartPos, refComplex);
        if (!L.isPresent()) {
            L = GetClassBase(StartPos, refComplex);
        }
        FocusPair Limit = L.get();
        FocusPair Stmt = new FocusPair(StartPos, SearchForTokenPos(StartPos, ";", MyFocus));
        if (Limit.contains(Stmt)) {
            //old String line=sHead+GetString(sLv,Level)+Stmt.toString(MyFocus);
            String line = sHead + GetString(sLv, Level) + Stmt.toStringCompact(MyFocus);
            refRet.append(line + NexLine);
            return Stmt.getEnd();
        }
        throw new NullPointerException("Bad ComplexStack: NowPos=" + StartPos);
    }

    /**
     * *
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param level �{�b��Level
     * @param f �ǤJ��FocusPair�d��,�o�ӽd��i��bClassArea�άOFuncHeaderArea
     * @param block class��function���j�A���d��
     * @param refComplex �϶����|
     * @param what ���"class"��"func"
     * @return �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int Make_Class_Function_Area(StringBuffer refRet, int level, FocusPair f, FocusPair block, Stack<TextLevel> refComplex, String what) {
        switch (what) {
            case "class":
            case "func":
                break;
            default:
                throw new NullPointerException("Bad MakeClass_Function_Area");
        }
        String line = sHead + GetString(sLv, level) + f.toString(MyFocus);
        refRet.append(line);
        TextLevel newTL = new TextLevel(what, block, level);
        refComplex.push(newTL);
        return f.getEnd();
    }

    /**
     * *
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param level �{�b��Level
     * @param refComplex �϶����|
     */
    public void MakeLeftBigBrace(StringBuffer refRet, int level, Stack<TextLevel> refComplex) {
        LineType use;
        TextLevel top = refComplex.peek();
        switch (top.Type) {
            case "class":
                use = JspStatic3.ClassType;
                break;
            case "func":
                use = JspStatic3.FuncType;
                break;
            default:
                use = JspStatic3.OtherType;
                break;
        }
        switch (use) {
            case AFTER_LINE:
                refRet.append(" {" + NexLine);
                break;
            case NEXT_LINE:
                refRet.append(NexLine);
                String line = sHead + GetString(sLv, level) + "{" + NexLine;
                refRet.append(line);
                break;
        }
    }

    /**
     * *
     *
     * @param refRet �n�g�J�Ǧ^������
     * @param NowPos �{�b�k�j�A������m
     * @param Level �{�b��Level
     * @param refComplex �϶����|
     * @return �U�@�ӱ��y�ǳƦ�m
     * @throws Exception
     */
    public int MakeRightBigBrace(StringBuffer refRet, int NowPos, Integer Level, Stack<TextLevel> refComplex) throws Exception {
        TextLevel Top = refComplex.peek();
        if (Top.StartToEnd.getEnd() == NowPos) {
            TextLevel newTL = refComplex.pop();
            Level = newTL.Level;
            String line;
            switch (Top.Type) {
                case "do":
                    //�p�G�Y��do block���k�j�A��
                    FocusPair Brace = FindSymmetricSmallBraceToken(NowPos, MyFocus);
                    line = sHead + GetString(sLv, Level) + "} while" + Brace.toString(MyFocus) + ";" + NexLine;
                    refRet.append(line);
                    return Brace.getEnd() + 1;

                case "try":
                case "catch":
                    //�p�G�Y��try��catch���k�j�A��
                    line = sHead + GetString(sLv, Level) + "}";
                    refRet.append(line);
                    if (Catch_After_Try_Block == LineType.NEXT_LINE) {
                        switch (Next(NowPos)) {
                            case "catch":
                            case "finally":
                                //�p�G�k�A�����᭱�򱵵۬Ocatch��finally
                                refRet.append(NexLine);
                            default:
                        }
                    }
                    return NowPos;
                default:
                    //including "func","class","if","else if","else","while","for","try","catch","finally","switch","synchronized"
                    line = sHead + GetString(sLv, Level) + "}" + NexLine;
                    refRet.append(line);
                    return NowPos;
            }
        } else {
            // System.out.println("**************************************");
            // System.out.println(refRet.toString());
            // System.out.println("**************************************");
            throw new Exception("NowPos=" + NowPos + " ComplexStack is broken");
        }
    }

    public static String ToStr(Pair p, StringBuffer text, int level) {
        StringBuffer ret = new StringBuffer();
        String that = text.substring(p.getStart(), p.getEnd() + 1);
        if (that.startsWith("/*")) {
            String[] sArr = that.split("\n");
            for (String S : sArr) {
                ret.append(sHead + GetString(sLv, level) + S + NexLine);
            }
        } else {
            ret.append(sHead + GetString(sLv, level) + that + NexLine);
        }
        return ret.toString();
    }

    public static String GetCommentID(Pair that, Vector<Pair> refCommentArea) {
        for (int i = 0; i < refCommentArea.size(); i++) {
            if (that.equals(refCommentArea.get(i))) {
                return String.format("@%d@", i);
            }
        }
        return "@NO_ID@";
    }

    public String TempToStr(Pair p, int level) {
        String ID = GetCommentID(p, CommentArea);
        StringBuffer ret = new StringBuffer();
        String that = MyText.substring(p.getStart(), p.getEnd() + 1);
        if (that.startsWith("/*")) {
            String[] sArr = that.split("\n");
            for (int i = 0; i < sArr.length; i++) {
                String S;
                if (i > 0 && i < sArr.length - 1) {
                    S = ID + sArr[i];
                } else if (i == 0) {
                    String line = sArr[i].replace("/*", "");
                    S = "/*" + ID + line;
                } else {
                    String line = sArr[i].replace("*/", "");
                    S = ID + line + "*/";
                }
                ret.append(sHead + GetString(sLv, level) + S + NexLine);
            }
        } else {
            that = that.replace("//", ID).replace("\n", "");
            ret.append(sHead + GetString(sLv, level) + "//" + that + NexLine);
        }
        return ret.toString();
    }

    public static boolean InFunction(int NowPos, Stack<TextLevel> refComplex) {
        for (TextLevel T : refComplex) {
            if ("func".equals(T.Type)) {
                return true;
            }
        }
        return false;
    }

    public static Stack<Pair> CopyCommentAreaIntoStackCommentArea(Vector<Pair> refCommentArea) {
        Stack<Pair> ret = new Stack<Pair>();
        for (int i = refCommentArea.size() - 1; i >= 0; i--) {
            ret.push(refCommentArea.get(i));
        }
        return ret;
    }

    public static Vector<Pair> GetAllCommentFromStackCommentArea(FocusPair F, Vector<Focus> refMyFocus, Stack<Pair> refStackCommentArea) {
        Vector<Pair> ret = new Vector<Pair>();
        if (F.getStart() >= 0) {
            int start = refMyFocus.get(F.getStart()).StartPos;
            int end = refMyFocus.get(F.getEnd()).StartPos;
            if (!refStackCommentArea.empty()) {
                do {
                    Pair P = refStackCommentArea.peek();
                    if (start <= P.getStart() && P.getEnd() <= end) {
                        ret.add(refStackCommentArea.pop());
                    } else {
                        break;
                    }
                } while (!refStackCommentArea.empty());
            }

        } else {
            if (!refStackCommentArea.empty()) {
                do {
                    Pair P=refStackCommentArea.peek();
                    if (P.getStart()< refMyFocus.get(0).StartPos) {
                        ret.add(refStackCommentArea.pop());
                    }else {
                        break;
                    }
                }while(!refStackCommentArea.empty());
            }
        }
        return ret;
    }
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
                for (; i < text.length() - 1; i++) {
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
        final String[] prev_accept = {"private", "protected", "public", "final", "static", "abstract","synchronized"};
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
    /**
     * **
     * �غcFocus�C��,�M��̬Y�ǭ�h�ץ�
     */
    public void Build_MyFocus() {

        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(MyText, 0, CommentArea, DQArea, SQArea);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(MyText, hand.NextCharPos, CommentArea, DQArea, SQArea);
        }
        //final String[] op3={">>>","<<=",">>="};
        Vector<Focus> tmp2 = OP_Replacement(tmp, JspStatic3.op3);
        //��o�̧�T�Ӧr�����B��l��������        
        //final String[] op2={"++","--","==","!=",">=","<=","<<",">>","&&","||","+=","-=","*=","/=","%=","&=","^=","|="};
        Vector<Focus> tmp3 = OP_Replacement(tmp2, JspStatic3.op2);
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

    
}
