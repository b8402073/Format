package Personal;

import java.util.Comparator;
import java.util.Stack;
import java.util.Vector;

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
    public static class PairSort implements Comparator{
        public int compare(Object obj1,Object obj2) {
            Pair E1=(Pair) obj1;
            Pair E2=(Pair) obj2;
            if (E1.getStart() < E2.getStart())
                return -1;
            else if (E1.getStart()> E2.getStart())
                return 1;
            else
                return 0;
        }
    }
    public enum  LineType { AFTER_LINE, NEXT_LINE};
    public final static PairSort PairSortObj=new PairSort();
    public final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final static String EMPTY = " \t\r\n\0";
    public final static String NUMBER="0123456789";

    public static String GetString(char c, int count) {
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < count; i++) {
            ret.append(c);
        }
        return ret.toString();
    }

    public static StringBuffer MyText, OutputText;
    
    public Vector<Integer> SmallLeft; // Record the position of '('
    public Vector<Integer> SmallRight;// Record the position of ')'

    public Vector<Pair> SQArea;
    public Vector<Pair> DQArea;
    public Vector<Pair> CommentArea;
    public Vector<FocusPair> FuncHeaderArea;
    public Vector<FocusPair> ClassArea;
    public Vector<Pair> ArrayArea;
    public Vector<Resolution> Analysis; 
    public Vector<Focus> MyFocus;
    
    public JspStatic(StringBuffer Text) {
        MyText = GetMyText(Text);
        init();
        Build(0,MyText.length());
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea, SmallLeft, SmallRight);
        Build_Array_Area(MyText,ArrayArea);             
        Build_MyFocus();     
        Build_Class_Area(ClassArea); 
        Build_Header_Area(FuncHeaderArea);  

        //建完Focus Tokens以後,如果有必要,要做  Focus-->Resolution的轉換 (也許沒有必要)
        
        StringBuffer output=Make0(LineType.AFTER_LINE);
    }
    
    /***
     * 輸出一份完全沒有註釋的程式碼,全部AFTER_LINE or NEXT_LINE  as much as possible,結尾是\n
     */
    public StringBuffer Make0(LineType lt) {       
        Stack<Integer> _do=new Stack<Integer>();       
        final String sHead="#####";
        final char sLv='\t';
        int Level=0;
        String line;
        StringBuffer ret=new StringBuffer();
        for (int i=0; i<MyFocus.size(); i++) {
            FocusPair F=GetPair(i,ClassArea);
            if (F!=null) {
                //確認進入ClassArea
                line=sHead+GetString(sLv,Level)+F.toString(MyFocus);
                ret.append(line);
                i=F.getEnd(); 
                continue;
            }
            F=GetPair(i,FuncHeaderArea);
            if (F!=null) {
                //確認進入FuncHeaderArea
                line=sHead+GetString(sLv,Level)+F.toString(MyFocus);
                ret.append(line);
                i=F.getEnd();
                continue;
            }
            String that=MyFocus.get(i).getString();
            if (that.equals("{")) {
                switch(lt) {
                    case AFTER_LINE:
                        ret.append(" {"+"\n");
                        Level+=1;
                        break;
                    case NEXT_LINE:
                        ret.append("\n");
                        line=sHead+GetString(sLv,Level)+"{"+"\n";
                        Level+=1;
                        ret.append(line);
                        break;
                }
                continue;
            }
            if (that.equals("}")) {                
                //被do攔截
                if (_do.peek()==i) {
                    _do.pop();
                    line=sHead+GetString(sLv,Level)+"}";
                    ret.append(line);
                    FocusPair Brace=FindSymmetricSmallBraceToken(i,MyFocus);
                    ret.append(" "+Brace.toString(MyFocus));
                    ret.append(";\n");
                    i=Brace.getEnd()+1;
                    continue;
                }
                //預設的狀況
                line=sHead+GetString(sLv,Level)+"}"+"\n";
                Level-=1;
                ret.append(line);
                continue;
            }
            if (that.equals("do"))  {
                line=sHead+GetString(sLv,Level)+"do ";
                ret.append(line);
                FocusPair Block=FindSymmetricBigBraceToken(i,MyFocus);
                _do.push(Block.getEnd());                
            }else if (that.equals("for")) {
                line=sHead+GetString(sLv,Level)+"for ";
                ret.append(line);
                FocusPair Brace=FindSymmetricSmallBraceToken(i,MyFocus);
                ret.append(Brace.toString(MyFocus));
                i=Brace.getEnd();
                continue;
            }else if (that.equals("while")) {
                line=sHead+GetString(sLv,Level)+"while ";
                ret.append(line);
                FocusPair Brace=FindSymmetricSmallBraceToken(i,MyFocus);
                ret.append(Brace.toString(MyFocus));
                i=Brace.getEnd();
                continue;
            }else if (that.equals("if")) {
                line=sHead+GetString(sLv,Level)+"if ";
                ret.append(line);
                FocusPair Brace=FindSymmetricSmallBraceToken(i,MyFocus);
                ret.append(Brace.toString(MyFocus));
                i=Brace.getEnd();
                continue;
            }else if (that.equals("else")) {
                line=sHead+GetString(sLv,Level)+"else ";
                ret.append(line);
            }else if (that.equals("try")) {
                line=sHead+GetString(sLv,Level)+"try ";
                ret.append(line);
            }else if (that.equals("catch")) {
                line=sHead+GetString(sLv,Level)+" catch ";
                ret.append(line);
                FocusPair Brace=FindSymmetricSmallBraceToken(i,MyFocus);
                ret.append(Brace.toCatchString(MyFocus));
            }else if (that.equals("finally")) {
                line=sHead+GetString(sLv,Level)+" finally ";
                ret.append(line);                
            }else {
                //基本上當成一個Statement處理
                int HeadPos=SearchForStatementHeadPos(i,MyFocus);
                int EndPos=SearchForTokenPos(i,";",MyFocus);
                FocusPair tmp=new FocusPair(HeadPos,EndPos);
                line=sHead+GetString(sLv,Level)+ tmp.toString(MyFocus);
                ret.append(line+"\n");
            }
        }
        return ret;
    }
    public void Build_MyFocus() {
        Vector<Focus> tmp=new Vector<Focus>();
        Focus hand=JspStatic.GetOneToken(MyText, 0, CommentArea, ArrayArea, DQArea, SQArea); 
        while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic.GetOneToken(MyText, hand.NextCharPos, CommentArea, ArrayArea, DQArea, SQArea); 
        }
        final String[] op3={">>>","<<=",">>="};
        Vector<Focus> tmp2=OP_Replacement(tmp,op3);
        //到這裡把三個字元的運算子都替換掉        
        final String[] op2={"++","--","==","!=",">=","<=","<<",">>","&&","||","+=","-=","*=","/=","%=","&=","^=","|="};
        Vector<Focus> tmp3=OP_Replacement(tmp2,op2);
        MyFocus=FloatNUM_Replacement(tmp3);
    }

    public static Vector<Focus> OP_Replacement(Vector<Focus> origin,final String[] op) {
        for (int x=1; x<op.length; x++) {
            if (op[0].length()!=op[x].length())
                return null;
        }
        final int op_length=op[0].length();
        Vector<Focus> ret=new Vector<Focus>();
        for (int i=0; i<origin.size()-op_length+1; i++) {
           boolean newElement=false;
            for (int j=0; j<op.length; j++) {
                String that=op[j];
                boolean _all_length_is_1=true;
                boolean _all_equal=true;
                for (int k=0; k<op_length; k++) {
                    if (origin.get(i+k).getString().length()!=1)
                        _all_length_is_1=false;
                    if (origin.get(i+k).getString().charAt(0)!=that.charAt(k))
                        _all_equal=false;
                }
                if (_all_length_is_1 && _all_equal) {
                    Focus tmpFocus=new Focus(op[j],origin.get(i).StartPos,origin.get(i+op_length-1).NextCharPos);
                    ret.add(tmpFocus);
                    newElement=true;
                    i+= (op_length-1);
                    break;
                }
            }
            if (!newElement) {
                ret.add(origin.get(i));
            }            
        }
        for (int i=origin.size()-op_length; i<origin.size(); i++) {
            ret.add(origin.get(i));
        }
        return ret;
    }
    public static Vector<Focus> FloatNUM_Replacement(Vector<Focus> origin) {
        Vector<Focus> ret=new Vector<Focus>();
        for (int i=0; i<origin.size()-1; i++) {
            String that=origin.get(i).getString();
            if (that.equals(".")) {
                Focus prev=origin.get(i-1);
                Focus next=origin.get(i+1);  //選用條件
                if (IsNumber(prev.getString())) {
                    if (prev.StartPos+ prev.getString().length()==origin.get(i).StartPos) {
                        if (IsNumber(next.getString())) {
                            ret.removeElementAt(ret.size()-1);
                            ret.add(new Focus(prev.getString()+"."+next.getString(),prev.StartPos,next.NextCharPos));
                            ++i;
                        }else {
                            ret.removeElementAt(ret.size()-1);
                            ret.add(new Focus(prev.getString()+".0",prev.StartPos,origin.get(i).NextCharPos));
                        }
                    }                    
                }
            }else {
                ret.add(origin.get(i));
            }
        }
        return ret;
    }


    public static boolean isToken(StringBuffer text, int Pos, String str) {
        if (text.substring(Pos).startsWith(str)) {
            if (ALPHABET.indexOf(text.charAt(Pos - 1)) < 0 && ALPHABET.indexOf(text.charAt(Pos+str.length())) < 0) {
                return true;
            }
        }
        return false;
    }

    public void init() {
        OutputText = new StringBuffer();
        SmallLeft = new Vector<Integer>();
        SmallRight =    new Vector<Integer>();

        SQArea = new Vector<Pair>();
        DQArea = new Vector<Pair>();
        CommentArea = new Vector<Pair>();
        FuncHeaderArea = new Vector<FocusPair>();
        ClassArea = new Vector<FocusPair>();
        ArrayArea= new Vector<Pair>();
    }

    public void Build(int start,int end) {
        int Level = 0;
        for (int i = start; i < end; i++) {
            switch (MyText.charAt(i)) {
                case '{':
                    Level++;
                    break;
                case '}':
                    Level--;
                    break;
                case '(':
                    if (Level == 0) {
                        SmallLeft.add(i);
                    }
                    break;
                case ')':
                    if (Level == 0) {
                        SmallRight.add(i);
                    }
                    break;
            }
        }
    }

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

    public static void Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(StringBuffer text, Vector<Pair> SQArea,
            Vector<Pair> DQArea, Vector<Pair> CommentArea, Vector<Integer> SmallLeft, Vector<Integer> SmallRight) {
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
            for (int i = SmallLeft.size() - 1; i >= 0; i--) {
                int that = SmallLeft.get(i);
                if (Comment.getStart() <= that && that <= Comment.getEnd()) {
                    SmallLeft.removeElementAt(i);
                }
            }
            for (int i = SmallRight.size() - 1; i >= 0; i--) {
                int that = SmallRight.get(i);
                if (Comment.getStart() <= that && that <= Comment.getEnd()) {
                    SmallRight.removeElementAt(i);
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

    public void Build_Header_Area(Vector<FocusPair> destHeaderArea) {
        CompoundStack S=new CompoundStack();
        for (int i=0; i<MyFocus.size(); i++) {
            Focus that=MyFocus.get(i);
            FocusPair F=GetPair(i,ClassArea);
            if (F!=null) {
                i=F.getEnd()+1;
                S.meetClassAndLeft();
            }else if (that.getString().equals("{")) {
                S.meetLeft();
            }else if (that.getString().equals("}")) {
                S.meetRight();
            }else if (that.getString().equals("(")) {
                if (!S.OK_for_FunctionHeader()) {
                    continue;
                }else {
                    //有可能可以接受FunctionHeader以後要判定這個statement有沒有等號
                    int headpos=SearchForStatementHeadPos(i,MyFocus);
                    boolean _found_equal_symbol=false;
                    int nearest_eq= SearchForTokenPos(headpos,"=",MyFocus);
                    if (nearest_eq>i || nearest_eq==-1) {
                        int right_brace_pos=SearchForTokenPos(i,")",MyFocus);
                        destHeaderArea.add(new FocusPair(headpos,right_brace_pos));
                        i=right_brace_pos;
                    }
                }
            }
        }
    }

    public void Build_Class_Area(Vector<FocusPair> destClassArea) {     
        final String[] prev_accept={"private","protected","public","final","static","abstract"};
        //final String[] next_accept={"extends","implements","<",">",","};
        int classStart=(-1),classEnd=(-1);
        for (int i=0; i<MyFocus.size(); i++) {
            Focus that=MyFocus.get(i);
            if (that.getString().equals("class") || that.getString().equals("interface")) {
                //處理class之前的部分
                classStart=i;
                int j=i-1;
                while(j>=0) {
                    String hand=MyFocus.get(j).getString();
                    boolean match=false;
                    for (int k=0; k<prev_accept.length; k++) {
                        if (hand.equals(prev_accept[k])) {
                            match=true;
                            break;
                        }
                    }
                    if (match) {
                        classStart=j;
                        --j;continue;
                    }else {
                       break; 
                    }
                }
                //處理class之後的部分
                // MyFocus.get(i+1)是class name
                /*
                for (j=i+2; j<MyFocus.size(); j++) {
                    if (MyFocus.get(j).getString().equals("{")) {
                        classEnd=j-1;
                        destClassArea.add(new FocusPair(classStart,classEnd));
                        break;
                    }
                }*/
                
                classEnd=SearchForTokenPos(i+1,"{",MyFocus);
                destClassArea.add(new FocusPair(classStart,classEnd-1));
                        
            }
        }
        
        
        /*
        for (int i = 0; i < text.length(); i++) {
            if (isToken(text, i, "class")) {
                if (!Main.In(i, DQArea) && !Main.In(i, CommentArea)) {
                    int t = GetLineHead(text, i);   //t is the left-end of new  HeaderArea;
                    t = GetFirstAlphabetAfterPos(text, t);
                    while (Main.In(t, CommentArea)) {
                        t++;
                        if (t == text.length()) {
                            throw new RuntimeException("We meet the end of text...t=" + t);
                        }
                    }
                    int q = text.indexOf("{", i + 5);
                    while (Main.In(q, CommentArea)) {
                        q = text.indexOf("{", q + 1);
                        if (q == text.length()) {
                            throw new RuntimeException("Wee meet the end of text...q=" + q);
                        }
                    }
                   StringBuffer tmpLine=new StringBuffer(text.substring(t,q));
                   for (int x=0; x<CommentArea.size(); x++) {
                       Pair that=CommentArea.get(x);
                       if (that.i_start>=t && that.i_end<=q) {
                           String thatComment=text.substring(that.i_start,that.i_end+1);
                           String corresponding=tmpLine.substring(that.i_start-t,that.i_end-t+1);
                           if (thatComment.equals(corresponding)) {
                               tmpLine.replace(that.i_start-t, that.i_end-t+1, "");  
                               //System.out.println(tmpLine.toString()); 
                           }
                       }
                   }
                   //tmpLine就是經過替換後的classArea(沒有註釋),但是這邊後來通通要改掉
                   //下面是Old Running code.. 
                    
                    
                    
                   
                    
                    if (t >= 0 && q >= 0) {
                        dest.add(new Pair(t, q-1));
                    } else {
                        throw new RuntimeException("Class_Area Wrong: i=" + i + "  t=" + t);
                    }
                    int r=FindSymmetric(text,q,CommentArea,DQArea,SQArea);
                    SmallLeft.clear(); SmallRight.clear();                    
                    Build(q+1,r);
                    Build_Header_Area(text, SmallLeft, SmallRight,FuncHeaderArea);   
                    Collections.sort(FuncHeaderArea,PairSortObj);
                }
            }
        }
        */
        
    }
    public  void Build_Array_Area(StringBuffer text,Vector<Pair> dest) {
        for (int i=0; i<text.length(); i++) {
            if ((text.charAt(i)=='=' || text.substring(i).startsWith("new"))
                 && !Main.In(i,SQArea) && !Main.In(i,DQArea) && !Main.In(i, CommentArea)) {
                int start=i;
                int end=GetFirstCharInCodeAfterPos(text,';',i,DQArea,SQArea,CommentArea);
                int pairStart=(-1),pairEnd;
                boolean hasComma=false;
                for (int j=i+1; j<end; j++ ) {
                    if (text.charAt(j)=='{' && !Main.In(j,SQArea) && !Main.In(j, DQArea) && !Main.In(j, CommentArea)) {
                        pairStart=j;
                    }else if (text.charAt(j)==',' && !Main.In(j, SQArea) && !Main.In(j,DQArea) && !Main.In(j,CommentArea)) {
                        hasComma=true;
                    }else if (text.charAt(j)=='}' && !Main.In(j, SQArea) && !Main.In(j, DQArea) && !Main.In(j,CommentArea)) {
                        pairEnd=j;
                        if (hasComma && pairStart>=0) {
                            ArrayArea.add(new Pair(pairStart,pairEnd+1));
                            i=pairEnd;
                            break;
                        }
                    }
                }                
            }
        }
    }
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

    public static int GetFirstAlphabetAfterPos(StringBuffer text, int pos) {
        while (pos < text.length()) {
            if (ALPHABET.indexOf(text.charAt(pos)) >= 0) {
                return pos;
            } else {
                pos++;
            }
        }
        return (-1);
    }

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

    public static int GetFirstCharAfterPos(StringBuffer text, char c, int pos) {
        pos++;
        while (pos < text.length()) {
            if (text.charAt(pos) == c) {
                return pos;
            }
            pos++;
        }
        return (-1);
    }

    public static int GetFirstCharAfterPos(StringBuffer text, char c, int pos, int end) {
        int e = Math.min(end, text.length());
        for (int i = pos; i <= e; i++) {
            if (text.charAt(i) == c) {
                return i;
            }
        }
        return (-1);
    }

    public static int GetFirstCharBeforePos(StringBuffer text, char c, int pos) {
        int i = pos;
        while (i >= 0) {
            if (text.charAt(i) == c) {
                return i;
            }
            i--;
        }
        return (-1);
    }

    public static int GetFirstCharBeforePosAfterStartLimit(StringBuffer text, char c, int pos, int StartLimit) {
        int i = pos;
        while (i >= StartLimit) {
            if (text.charAt(i) == c) {
                return i;
            }
            i--;
        }
        return (-1);
    }

    public static StringBuffer GetMyText(StringBuffer buf) {
        int C1 = buf.indexOf("<%!");
        int C2 = buf.lastIndexOf("%>");
        String my = buf.substring(C1 + 3, C2);
        return new StringBuffer(my);
    }

    public static Focus GetOneToken(StringBuffer text,int from_pos,Vector<Pair>CommentArea,Vector<Pair> ArrayArea, Vector<Pair> DQArea,Vector<Pair> SQArea) {
        final String WHITE=" \t\n\r\0";
        StringBuffer retStr=new StringBuffer();
        int _First_Alphabet_Position=(-1);
        for (int i=from_pos; i<text.length(); i++) {
            char that=text.charAt(i);
            //String sThat=new String(new char[]{that});
            if (WHITE.indexOf(that)>=0) {  
                if (retStr.length()>=1) {
                    return new Focus(retStr.toString(),_First_Alphabet_Position,i);
                }
                continue;
            }else {
                boolean CommentHit=false;
                Pair comment=GetPair(i,CommentArea);
                if (comment!=null) {
                    i=comment.getEnd();
                    CommentHit=true;
                }    
                boolean ArrayHit=false;
                Pair array=GetPair(i,ArrayArea);
                if (array!=null) {
                    ArrayHit=true;
                    if (_First_Alphabet_Position<0)
                        _First_Alphabet_Position=array.getStart();
                }
                boolean DQHit=false;        
                Pair DQ=GetPair(i,DQArea);
                if (DQ!=null) {
                    DQHit=true;
                     if (_First_Alphabet_Position<0)
                        _First_Alphabet_Position=DQ.getStart();
                }
                boolean SQHit=false;
                Pair SQ=GetPair(i,SQArea);
                if (SQ!=null) {
                    SQHit=true;
                     if (_First_Alphabet_Position<0)
                        _First_Alphabet_Position=SQ.getStart();
                }
                if (CommentHit) {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),_First_Alphabet_Position,i+1);
                    }else { 
                        continue;                        
                    }
                }else if (ArrayHit)  {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),_First_Alphabet_Position,array.getStart());
                    }else { 
                        return new Focus(Uncomment(text,array,CommentArea),_First_Alphabet_Position,array.getEnd()+1);
                    }                    
                }else if (DQHit)  {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),_First_Alphabet_Position,DQ.getStart());
                    }else { 
                        return new Focus(text.substring(DQ.getStart(), DQ.getEnd()+1),_First_Alphabet_Position,DQ.getEnd()+1);
                    } 
                }else if (SQHit) {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),_First_Alphabet_Position,SQ.getStart());
                    }else { 
                        return new Focus(text.substring(SQ.getStart(),SQ.getEnd()+1),_First_Alphabet_Position,SQ.getEnd()+1);
                    }                     
                }else {                    
                   retStr.append(that);
                   if (retStr.length()==1 && _First_Alphabet_Position<0) {
                       _First_Alphabet_Position=i;
                   }                   
                   final String Special_OneCharacter_Token="{}()[];=><+-*/%^~@,:!|.~?";
                   if (Special_OneCharacter_Token.contains(retStr.toString())) {
                       return new Focus(retStr.toString(),_First_Alphabet_Position,i+1);
                   }else if (Special_OneCharacter_Token.indexOf(retStr.charAt(retStr.length()-1))>=0) {
                       int length=retStr.length();
                       return new Focus(retStr.substring(0,length-1),_First_Alphabet_Position,i);
                   }
                }
            }
        }
        return null;
    }
    public static Vector<Pair> GetAllComment(FocusPair F,Vector<Focus> refMyFocus,Vector<Pair> refCommentArea) {
        int start=refMyFocus.get(F.getStart()).StartPos;
        int end=refMyFocus.get(F.getEnd()).StartPos;
        Vector<Pair> ret=new Vector<Pair>();
        for (int i=0; i<refCommentArea.size(); i++) {
            Pair P=refCommentArea.get(i);
            if (start<= P.getStart() && P.getEnd()<= end) {
                ret.add(P);
            }
        }
        return ret;        
    }
    public static String Comments_Into_String1(Vector<Pair> comments,StringBuffer refMyText) {
        StringBuffer ret=new StringBuffer();
        Pair P;
        for (int i=0; i<comments.size()-1; i++) {
            P=comments.get(i);
            ret.append(refMyText.substring(P.getStart(),P.getEnd()+1)+"\n");
        }
        P=comments.get(comments.size()-1);
        ret.append(refMyText.substring(P.getStart(),P.getEnd()+1));
        return ret.toString();
    }
    public static String Uncomment(StringBuffer text,Pair P,Vector<Pair> commentArea) {
        StringBuffer ret=new StringBuffer(text.substring(P.getStart(), P.getEnd()+1));
        int t=P.getStart();
        for (int i=commentArea.size()-1; i>=0; i--) {
            Pair that=commentArea.get(i);
            if (that.getStart()>=P.getStart() && that.getEnd()<=P.getEnd() ) {
                String thatComment=text.substring(that.getStart(), that.getEnd()+1);
                String corresponding=ret.substring(that.getStart()-t, that.getEnd()-t+1);
                if (thatComment.equals(corresponding)) {
                    ret.replace(that.getStart()-t, that.getEnd()-t+1, "");
                }                
            }
        }
        return ret.toString();
    }
    public static StringBuffer GetComment(StringBuffer text, int pos, Vector<Pair> CommentArea) {
        for (int i = 0; i < CommentArea.size(); i++) {
            Pair that = CommentArea.get(i);
            if (that.getStart() <= pos && pos <= that.getEnd()) {
                return new StringBuffer(text.substring(that.getStart(), that.getEnd() + 1));
            }
        }
        return null;
    }

    public static Pair GetPair(int pos, Vector<Pair> src) {
        for (Pair p : src) {
            if (p.getStart() <= pos && pos <= p.getEnd()) {
                return p;
            }
        }
        return null;
    }
    public static FocusPair GetPair(Integer pos,Vector<FocusPair> src) {
        for (FocusPair F:src) {
            if (F.getStart()<= pos && pos<=F.getEnd() ) {
                return F;
            }
        }
        return null;
    }

    public static StringBuffer TrimLeft(StringBuffer inn) {
        while (inn.length() >= 1 && EMPTY.contains(String.valueOf(inn.charAt(0)))) {
            inn.deleteCharAt(0);
        }
        return inn;
    }

    public static String TrimLeft(String str) {
        StringBuffer that = new StringBuffer(str);
        while (EMPTY.contains(String.valueOf(that.charAt(0)))) {
            that.deleteCharAt(0);
        }
        return that.toString();
    }



    public static int QuickSearchAfterPos(Vector<Integer> src, char c, int pos) {
        for (int i = 0; i < src.size() - 1; i++) {
            if (src.get(i) <= pos && pos < src.get(i + 1)) {
                return src.get(i + 1);
            }
        }
        return (-1);
    }


    public int QuickSearchIndexAfterPos(Vector<Integer> src, char c, int pos) {
        for (int i = 0; i < src.size(); i++) {
            if (src.get(i) <= pos && pos < src.get(i + 1)) {
                return (i + 1);
            }
        }
        return (-1);
    }

    public static void DeleteLastCr(StringBuffer that) {
        while (that.length() >= 0 && that.charAt(that.length() - 1) != '\n') {
            that.deleteCharAt(that.length() - 1);
        }
        that.deleteCharAt(that.length() - 1);
    }

    public static String ConvertComment(StringBuffer text, Pair p) {
        String that = text.substring(p.getStart(), p.getEnd());
        if (that.startsWith("//") && that.endsWith("\n")) {
            that = that.replace("\n", "*/");
            StringBuffer ret = new StringBuffer(that);
            ret.replace(1, 2, "*");
            return ret.toString();
        }
        return "@@GGYY@@";
    }   
    public static int FindSymmetric(StringBuffer text,int start,Vector<Pair> refCommentArea,Vector<Pair> refDQArea,Vector<Pair> refSQArea) {
        switch(text.charAt(start)) {
            case'{':
                return FindSymmetricBigBrace(text,start, refCommentArea, refDQArea, refSQArea);
            case'(':
                return FindSymmetricSmallBrace(text,start, refCommentArea,refDQArea,refSQArea);
            case'[':
                return FindSymmetricMiddleBrace(text,start,refCommentArea,refDQArea, refSQArea);
        }
        return(-1);
    }
    public static int FindSymmetricBigBrace(StringBuffer text,int start,Vector<Pair> refCommentArea,Vector<Pair> refDQArea,Vector<Pair> refSQArea) {
        int Level=1;
        for (int i=start+1; i<text.length(); i++) {
            if (text.charAt(i)=='{' && !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea))
                ++Level;
            else if (text.charAt(i)=='}'  && !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea)) {
                --Level;
                if (Level==0)
                    return i;
            }
        }
        return (-1);
    }
    public static  FocusPair FindSymmetricBigBraceToken(int start,Vector<Focus> refMyFocus) {
        int Level=0,retStart=(-1),retEnd=(-1);
        if (refMyFocus.get(start).getString().equals("{")) {
            Level+=1;
            retStart=start;
        }
        for (int i=start+1; i<refMyFocus.size(); i++) {
            if (refMyFocus.get(i).getString().equals("{")) {
                if (retStart<0) {
                    retStart=i;
                }
                ++Level;
            }else if (refMyFocus.get(i).getString().equals("}")) {
                --Level;
                if (Level==0) {
                    retEnd=i;
                    return new FocusPair(retStart,retEnd);
                }
            }
        }
        return null;
    }    
    public static int FindSymmetricSmallBrace(StringBuffer text,int start,Vector<Pair> refCommentArea,Vector<Pair> refDQArea,Vector<Pair> refSQArea) {
        int Level=1;
        for (int i=start+1; i<text.length(); i++) {
            if (text.charAt(i)=='(' && !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea))
                ++Level;
            else if (text.charAt(i)==')' &&  !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea)) {
                --Level;
                if (Level==0)
                    return i;
            }                
        }
        return(-1);
    }
    public static  FocusPair FindSymmetricSmallBraceToken(int start,Vector<Focus> refMyFocus) {
        int Level=0,retStart=(-1),retEnd=(-1);
        if (refMyFocus.get(start).getString().equals("(")) {
            Level+=1;
            retStart=start;
        }
        for (int i=start+1; i<refMyFocus.size(); i++) {
            if (refMyFocus.get(i).getString().equals("(")) {
                if (retStart<0) {
                    retStart=i;
                }
                ++Level;
            }else if (refMyFocus.get(i).getString().equals(")")) {
                --Level;
                if (Level==0) {
                    retEnd=i;
                    return new FocusPair(retStart,retEnd);
                }
            }
        }
        return null;
    }
    public static int FindSymmetricMiddleBrace(StringBuffer text,int start,Vector<Pair> refCommentArea,Vector<Pair> refDQArea,Vector<Pair> refSQArea) {
        int Level=1;
        for(int i=start+1; i<text.length(); i++) {
            if (text.charAt(i)=='[' &&  !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea)) {
                ++Level;
            }else if (text.charAt(i)==']' &&  !Main.In(i, refCommentArea) && !Main.In(i, refDQArea) && !Main.In(i, refSQArea)) {
                --Level;
                if (Level==0)
                    return i;
            }
        }
        return(-1);
    }
    public static int max(int t1,int t2,int t3) {
        if (t1>=t2 &&  t1>=t3)
            return t1;
        else if (t2>=t1 && t2>=t3)
            return t2;
        return t3;
    }
    
    public int GetFuncBase(int pos) {
        for (int i=0; i<FuncHeaderArea.size(); i++) {
            FocusPair that=FuncHeaderArea.get(i);
            int start=SearchForTokenPos(that.getEnd(),"{",MyFocus);
            FocusPair ret=FindSymmetricBigBraceToken(start,MyFocus);
            if (ret.getStart()<=pos  && pos<=ret.getEnd())
                return start;
        }
        return (-1);
    }
    public int GetClassBase(int pos) {
        for (int i=ClassArea.size()-1; i>=0; i--) {
            FocusPair that=ClassArea.get(i);
            int start=SearchForTokenPos(that.getEnd(),"{",MyFocus);
            FocusPair ret=FindSymmetricBigBraceToken(start,MyFocus);
            if (ret.getStart()<=pos && pos<=ret.getEnd()) {
                return start;
            }
        }
        return (-1);
    }
    public static boolean IsNumber(String input) {
        for (int i=0; i<input.length(); i++) {
            if (NUMBER.indexOf(input.charAt(i))<0)
                return false;
        }
        return true;
    }
    public static int SearchForStatementHeadPos(int pos,Vector<Focus> refMyFocus) {
        int i=pos-1;
        while(i>=0) {
            String that=refMyFocus.get(i).getString();
            if (that.equals("}") || that.equals(";")) {
                return (i+1);
            }
            --i;
        }
        return 0;
    }
    public static int SearchForTokenPos(int pos,String str,Vector<Focus> refMyFocus) {
        int i=pos+1;
        while(i<refMyFocus.size()) {
            if (refMyFocus.get(i).getString().equals(str)) {
                return i;
            }
            ++i;
        }
        return -1;
    }
}