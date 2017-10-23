
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
     * 單引號區域=SQArea SQ=Single Quote
     */
    public Vector<Pair> SQArea;
    /**
     * *
     * 雙引號區域=DQArea DQ=Double Quote
     */
    public Vector<Pair> DQArea;
    /**
     * *
     * CommentArea=註解區域
     */
    public Vector<Pair> CommentArea;
    /**
     * *
     * FuncHeaderArea=函式區域
     */
    public Vector<FocusPair> FuncHeaderArea;
    /**
     * *
     * ClassArea=Class宣告區域
     */
    public Vector<FocusPair> ClassArea;
    /**
     * *
     * ArrayArea=陣列區域
     */
    public Vector<FocusPair> ArrayArea;

    //public Vector<Resolution> Analysis; 
    /**
     * *
     * 用一串Focus代表一群有用程式碼的Token
     */
    public Vector<Focus> MyFocus;

    public Vector<FocusPair> AttributeArea;    
    /**
     * *
     * 設定Class的括號顯示方式
     */
    public final static LineType ClassType = LineType.NEXT_LINE;
    /**
     * *
     * 設定Func的括號顯示方式
     */
    public final static LineType FuncType = LineType.AFTER_LINE;
    /**
     * *
     * 其他結構的括號顯示方式
     */
    public static LineType OtherType = LineType.AFTER_LINE;
    /**
     * *
     * Try後面的Catch要放在Try_Block的後面(After_LINE)或是下一行(NEXT_LINE)
     */
    public static LineType Catch_After_Try_Block = LineType.AFTER_LINE;
    /**
     * *
     * 換行符號
     */
    public static String NexLine = "\n";

    /**
     * *
     * 設定OtherType; 傳回JspStatic3物件本身可以連續設定其他的LineType
     *
     * @param lt
     * @return 傳回JspStatic3物件
     */
    public JspStatic3 setOtherType(LineType lt) {
        OtherType = lt;
        return this;
    }

    /**
     * *
     * 設定CatchType; 傳回JspStatic3物件本身可以連續設定其他的LineType
     *
     * @param lt
     * @return 傳回JspStatic3物件
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
     * 建構子
     *
     * @param Text 傳入的本文,包含<%!  %>
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
     * 基礎建設; 要建立正確的(CommentArea+DQArea+SQArea),所以
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
                ret.append("SQ_DQ_不對稱:"+that+"\n");
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
        //建完Focus Tokens以後,如果有必要,要做  Focus-->Resolution的轉換 (也許沒有必要)

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
     * 顯示編排後的文字
     *
     * @return 傳回編排後的文字
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
                    case "do": //do後面一定有Block
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
                    case "else":  //else跟finally行為如果有Catch_after_Try就不一樣
                        i = i = Make_Else(ret, i, Level, Complex);
                        break;
                    case "catch":
                        i = MakeCatch(ret, i, Level, FindSymmetricSmallBraceToken(i, MyFocus), Complex);
                        break;
                    case "try":  //try後面一定有Block
                        i = MakeTry(ret, i, Level, FindSymmetricBigBraceToken(i, MyFocus), Complex);
                        break;
                    case "finally"://else跟finally行為如果有Catch_after_Try就不一樣
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
     * 處理Case關鍵字和Default關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在的字("case" or "default")的位置
     * @param level 現在的Level
     * @param refComplex 現在的區塊堆疊
     * @param what 現在遇到的字是"case" or "default"
     * @return 傳回冒號所在位置
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
                throw new NullPointerException("bad " + what + " without 冒號 NowPos=" + NowPos);
        }
    }

    /**
     * *
     * 處理"if"關鍵字和"else if"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在的字("if" or "else if")的位置
     * @param level 現在的Level
     * @param refComplex 現在的區塊堆疊
     * @param what 現在遇到的字是"if" or "else if"
     * @return 傳回準備下一個掃描位置
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
                throw new NullPointerException(what + "後面的單敘述不適合用製造block的關鍵字---這樣的碼太醜了");
            default:
                refRet.append(NexLine);
                return MakeStatement(refRet, Brace.getEnd() + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     * 處理"switch"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在的字("switch")的位置
     * @param level 現在的Level
     * @param refComplex 現在的區塊堆疊
     * @return 傳回準備下一個掃描位置
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
     * 處理"for"關鍵字和"while"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在的字("for" or "while")的位置
     * @param level 現在的Level
     * @param refComplex 現在的區塊堆疊
     * @param what 現在的字("for" or "what
     * @return 傳回準備下一個掃描位置
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
                throw new NullPointerException(what + "後面的單敘述不適合用製造block的關鍵字---這樣的碼太醜了");

            default:
                //遇到stmt
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
     * 幫忙取得一個敘述的範圍
     *
     * @param i 開始搜尋位置
     * @return 傳回敘述的FocusPair
     */
    public FocusPair GetStmt(int i) {
        int EndPos = SearchForTokenPos(i, ";", MyFocus);
        return new FocusPair(i, EndPos);
    }

    /**
     * *
     * 傳回下一個Focus的代表字串
     *
     * @param i 開始搜尋位置
     * @return 傳回字串
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
     * 往後尋找對稱的小括號
     *
     * @param i 開始搜尋位置
     * @return 傳回小括號範圍
     */
    public FocusPair GetSmallBrace(int i) {
        return FindSymmetricSmallBraceToken(i, MyFocus);
    }

    /**
     * *
     * 處理"catch"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在catch的位置
     * @param level 現在的Level
     * @param Brace catch後面緊跟著的小括號範圍
     * @param refComplex 區塊堆疊
     * @return 傳回準備下一個掃描位置
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
     * 處理"do"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在do的位置
     * @param level 現在的Level
     * @param Block do後面緊跟著的大括號範圍
     * @param refComplex 區塊堆疊
     * @return 傳回準備下一個掃描位置
     */
    public int MakeDo(StringBuffer refRet, int NowPos, int level, FocusPair Block, Stack<TextLevel> refComplex) {
        if (Prev(NowPos).equals("}") && refRet.charAt(refRet.length() - 1) != '\n') {   //這句有改善空間...
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
     * 處理"try"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在try的位置
     * @param Level 現在的Level
     * @param Block try後面緊跟著的大括號範圍
     * @param refComplex 區塊堆疊
     * @return 傳回準備下一個掃描位置
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
     * 處理"else"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在else的位置
     * @param level 現在的Level
     * @param refComplex 區塊堆疊
     * @return 傳回準備下一個掃描位置
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
                throw new NullPointerException("else 後面的單敘述不適合用製造block的關鍵字---這樣的碼太醜了");
            default:
                //遇到stmt
                refRet.append(NexLine);
                return MakeStatement(refRet, NowPos + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     * 處理"finally"關鍵字
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在finally的位置
     * @param level 現在的Level
     * @param refComplex 區塊堆疊
     * @return 傳回下一個掃描準備位置
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
                throw new NullPointerException("finally 後面的單敘述不適合用製造block的關鍵字---這樣的碼太醜了");
            default:
                //遇到stmt
                refRet.append(NexLine);
                return MakeStatement(refRet, NowPos + 1, level + 1, refComplex);
        }
    }

    /**
     * *
     *
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在@的位置
     * @param Level 現在的Level
     * @return 傳回下一個掃描準備位置
     */
    public int MakeAttribute(StringBuffer refRet, int NowPos, final Integer Level) {
        String line = sHead + GetString(sLv, Level) + "@" + MyFocus.get(NowPos + 1).RetString + NexLine;
        refRet.append(line);
        return NowPos + 1;
    }

    /**
     * *
     *
     * @param refRet 要寫入傳回的本文
     * @param StartPos 敘述開始位置
     * @param Level 現在的Level
     * @param refComplex 區塊堆疊
     * @return 傳回下一個掃描準備位置
     */
    public int MakeStatement(StringBuffer refRet, int StartPos, int Level, Stack<TextLevel> refComplex) {
        //FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());  //為什麼這樣跑不對...        
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
     * @param refRet 要寫入傳回的本文
     * @param level 現在的Level
     * @param f 傳入的FocusPair範圍,這個範圍可能在ClassArea或是FuncHeaderArea
     * @param block class或function的大括號範圍
     * @param refComplex 區塊堆疊
     * @param what 表示"class"或"func"
     * @return 傳回下一個掃描準備位置
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
     * @param refRet 要寫入傳回的本文
     * @param level 現在的Level
     * @param refComplex 區塊堆疊
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
     * @param refRet 要寫入傳回的本文
     * @param NowPos 現在右大括號的位置
     * @param Level 現在的Level
     * @param refComplex 區塊堆疊
     * @return 下一個掃描準備位置
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
                    //如果吃到do block的右大括號
                    FocusPair Brace = FindSymmetricSmallBraceToken(NowPos, MyFocus);
                    line = sHead + GetString(sLv, Level) + "} while" + Brace.toString(MyFocus) + ";" + NexLine;
                    refRet.append(line);
                    return Brace.getEnd() + 1;

                case "try":
                case "catch":
                    //如果吃到try或catch的右大括號
                    line = sHead + GetString(sLv, Level) + "}";
                    refRet.append(line);
                    if (Catch_After_Try_Block == LineType.NEXT_LINE) {
                        switch (Next(NowPos)) {
                            case "catch":
                            case "finally":
                                //如果右括號的後面緊接著是catch或finally
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
     * 傳回一個字串,這個字串是重複字串space重複了count次 用在make系列函式的建構line變數
     *
     * @param space 要重複的母字串
     * @param count 重複的次數
     * @return 傳回的字串
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
     * DQ=Double Quote 初步建立DQArea,但是這樣建立一定會有錯(因為註解裡面也有可能有DQ符號) 之後再修正
     * 基本上DQArea和CommentArea有可能會有"雞生蛋蛋生雞"的邏輯狀況出現 所以現在跑的碼面對在註解區域裡落單的DQ符號可能會有問題 例如
     * String,S,=,DQ,A,B,C,DQ,; // DQ /n String,T,=,DQ,C,D,E,DQ,;
     * 所以要求使用者在CommentArea如果用DQ符號一定要成雙 例如 String,S,=,DQ,A,B,C,DQ,; // (DQ)(DQ)
     * /n String,T,=,DQ,C,D,E,DQ,;
     *
     * @param text 解析的本文(不含"<!%","%>")
     * @param dest 放DQArea的地方
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
     * SQ=Single Quote 建立SQArea 初步建立SQArea,但是這樣建立一定會有錯(因為註解裡面也有可能有SQ符號) 之後再修正
     * 基本上SQArea和CommentArea有可能會有"雞生蛋蛋生雞"的邏輯狀況出現 所以現在跑的碼面對在註解區域裡落單的SQ符號可能會有問題 例如
     * String,S,=,SQ,A,SQ,; // SQ /n String,T,=,SQ,C,SQ,;
     * 所以要求使用者在CommentArea如果用DQ符號一定要成雙 例如 String,S,=,SQ,A,SQ,; // (SQ)(SQ) /n
     * String,T,=,SQ,C,SQ,;
     *
     * @param text 解析的本文(不含"<!%","%>")
     * @param RefDQArea 參考的DQArea資訊
     * @param dest 放SQArea的地方
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
     * 建立CommentArea
     *
     * @param text 參考的本文
     * @param RefDQArea 參考的DQArea
     * @param RefSQArea 參考的SQArea
     * @param dest 放置CommentArea的地方
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
     * 基本上這個修正是錯的,但是錯得不明顯,暫時可以接受,就接受吧
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
     * 用MyFocus建立HeaderArea
     *
     * @param destHeaderArea 放置HeaderArea的地方
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
                    //有可能可以接受FunctionHeader以後要判定這個statement有沒有等號
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
     * 用MyFocus建立ClassArea
     *
     * @param destClassArea 放置ClassArea的地方
     */
    public void Build_Class_Area(Vector<FocusPair> destClassArea) {
        final String[] prev_accept = {"private", "protected", "public", "final", "static", "abstract","synchronized"};
        //final String[] next_accept={"extends","implements","<",">",","};
        int classStart = (-1), classEnd = (-1);
        for (int i = 0; i < MyFocus.size(); i++) {
            Focus that = MyFocus.get(i);
            if (that.getString().equals("class") || that.getString().equals("interface")) {
                //處理class之前的部分
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
                //處理class之後的部分                
                classEnd = SearchForTokenPos(i + 1, "{", MyFocus);
                destClassArea.add(new FocusPair(classStart, classEnd - 1));

            }
        }
    }
    /**
     * **
     * 要重寫
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
                    if (retStr.length() == 1 && Special_OneCharacter_Token.indexOf(retStr.charAt(0)) >= 0) {  //如果吃到單一的符號(例如'+')
                        return new Focus(retStr.toString(), _First_Alphabet_Position, i + 1);
                    } else if (Special_OneCharacter_Token.indexOf(retStr.charAt(retStr.length() - 1)) >= 0) { //如果在英文後面吃到符號(例如'+')
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
     * 把某段區間全部的註解都收集起來
     *
     * @param F 表示區間的FocusPair
     * @param refMyFocus 紀錄全部的Focus
     * @param refCommentArea 傳入全部的CommentArea
     * @return 傳回一些相關的Pair物件
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
     * 由一群Pair中找pos所在的Pair,然後傳回
     *
     * @param pos 某個文本位置
     * @param src 某個Pair串列
     * @return 傳回一個Pair
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
     * 由一群FocusPair找pos所在的FocusPair,然後傳回
     *
     * @param pos 某個位置
     * @param src 某個FocusPair串列
     * @return 傳回一個FocusPair
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
     * 找start位置後的對稱的大括號
     *
     * @param start 搜尋起始位置
     * @param refMyFocus 傳入要搜尋的Focus串列
     * @return 傳回一對對稱的大括號位置,以FocusPair的形式
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
     * 由起始位置搜尋對稱的小括號
     *
     * @param start 搜尋起始位置
     * @param refMyFocus 搜尋的Focus串列
     * @return 傳回一對小括號,以FocusPair的形式
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
     * 要計算現在這個位置,如果在某個Func裡面,相關的第一個左大括號在哪裡...
     *
     * @param pos               現在的位置
     * @param refComplex        參考的Complex Stack
     * @return 傳回某個左大括號的位置
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
     * 要計算現在這個位置,如果在某個Class裡面,相關的第一個左大括號在哪裡
     *
     * @param pos               現在的位置
     * @param refComplex        參考的Complex Stack
     * @return 傳回某個左大括號的位置
     */
    public static Optional<FocusPair> GetClassBase(int pos,Stack<TextLevel> refComplex) {        
        return SearchComplexStackFromTop(pos,"class",refComplex);
    }

    /**
     * *
     * 檢查某字串是否全為數字
     *
     * @param input 輸入字串
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
     * 由某個位置找可能是本敘述(statement)的頭的位置
     * 方法是往前找"{","}",";"三個符號,如果找到應該就是了(不過還不確定是不是Statement
     * head,所以要用GetClassBase/GetFuncBase來輔佐)
     *
     * @param pos 開始往前尋找的位置
     * @param refMyFocus 尋找的Focus串列
     * @return 傳回的位置
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
                case "@":  //如果遇到Attribute
                    return i+2;
                default:
                    --i;
            }
        }
        return 0;
    }

    /**
     * **
     * 用某個字串符號,往後搜尋某個位置
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
     * 建構Focus列表,然後依某些原則修正
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
        //到這裡把三個字元的運算子都替換掉        
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
     * 把三個字或兩個字的運算元合併成一個運算元
     *
     * @param origin 來源的Focus列表,可能包含("+","+")這種東西
     * @param op 三個字或兩個字的運算元
     * @return 要傳回的Focus列表( 化簡成("++") )
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
     * 把浮點數集中成一個Token的函式
     *
     * @param origin 來源的Focus列表(可能包含"3",".","1","4","1","5","9")
     * @return 傳回的Focus列表(傳回"3.14159")
     */
    public static Vector<Focus> FloatNUM_Replacement(Vector<Focus> origin) {
        Vector<Focus> ret = new Vector<Focus>();
        for (int i = 0; i < origin.size() - 1; i++) {
            String that = origin.get(i).getString();
            if (that.equals(".")) {
                Focus prev = origin.get(i - 1);
                Focus next = origin.get(i + 1);  //選用條件
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
