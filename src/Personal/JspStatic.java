package Personal;

import java.util.Collections;
import java.util.Comparator;
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
    
    public final static PairSort PairSortObj=new PairSort();
    public final static String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final static String EMPTY = " \t\r\n";

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
    public Vector<Pair> FuncHeaderArea;
    public Vector<Pair> ClassArea;
    public Vector<Pair> ArrayArea;
    public Vector<Resolution> Analysis;    
    
    public JspStatic(StringBuffer Text) {
        MyText = GetMyText(Text);
        init();
        Build(0,MyText.length());
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea, SmallLeft, SmallRight);
        Build_Header_Area(MyText, SmallLeft, SmallRight, FuncHeaderArea);
        Build_Class_Area(MyText, ClassArea);
        Build_Array_Area(MyText,ArrayArea);
        System.out.println(Main.ToStr(ArrayArea, MyText));
        Make();
        
        for (int i = 0; i < Analysis.size(); i++) {
           System.out.println(Analysis.get(i).that.toString());
           System.out.println(Analysis.get(i).toString(MyText));
        }
        
        Make2();
    }

    public void Make() {
        Analysis = new Vector<Resolution>();
        for (int i = 0; i < MyText.length(); i++) {
            if (Main.In(i, CommentArea)) {
                Pair that = GetPair(i, CommentArea);
                if (that != null) {
                    //Analysis.add("comment#" + MyText.substring(that.getStart(), that.getEnd() + 1));
                    Analysis.add(new Resolution("comment#",that.getStart(), that.getEnd()));
                    i = that.getEnd() + 1;
                    continue;
                } else {
                    throw new RuntimeException("Bad CommentArea");
                }
            } else if (Main.In(i, ClassArea)) {
                Pair that = GetPair(i, ClassArea);
                if (that != null) {
                    //Analysis.add("class#" + MyText.substring(that.getStart(), that.getEnd() + 1));
                    Analysis.add(new Resolution("class#",that.getStart(),that.getEnd()));
                    i = that.getEnd();
                    continue;
                } else {
                    throw new RuntimeException("Bad CommentArea");
                }
            } else if (Main.In(i, FuncHeaderArea)) {
                Pair that = GetPair(i, FuncHeaderArea);
                if (that != null) {
                    //Analysis.add("func#" + MyText.substring(that.getStart(), that.getEnd() + 1));
                    Analysis.add(new Resolution("func#",that.getStart(),that.getEnd()));
                    i = that.getEnd() ;
                     continue;
                } else {
                    throw new RuntimeException("Bad CommentArea");
                }
            } else if (MyText.charAt(i) == '{' || MyText.charAt(i) == '}')  {
                if (Main.In(i, ArrayArea) || Main.In(i, CommentArea) || Main.In(i, DQArea) || Main.In(i, SQArea))
                    continue;
                //Analysis.add("" + MyText.charAt(i));
                Analysis.add(new Resolution(""+MyText.charAt(i),i,i));
                continue;
            } else if (isToken(MyText,i,"try") && !Main.In(i,DQArea) && !Main.In(i,CommentArea))  {
                Analysis.add(new Resolution("TRY#",i,i+2));
                i+=3;
                continue;                
            } else if (isToken(MyText,i,"catch") && !Main.In(i,DQArea) && !Main.In(i,CommentArea)) {
                int sL=GetFirstCharInCodeAfterPos(MyText,'(',i,DQArea,SQArea,CommentArea);
                int eL=FindSymmetric(MyText,sL,CommentArea,DQArea,SQArea);
                Analysis.add(new Resolution("CATCH#",i,eL+1));
                continue;
            }else if (isToken(MyText, i, "if") && !Main.In(i, DQArea)) {
                int t = GetLineHead(MyText, i);   //t is the left-end of new  HeaderArea;
                t = GetFirstAlphabetAfterPos(MyText, t);
                int sL = GetFirstCharInCodeAfterPos(MyText, '(', i, DQArea, SQArea, CommentArea);
                int eL =  FindSymmetric(MyText,sL,CommentArea,DQArea,SQArea);                                
                Analysis.add(new Resolution("if#",t,eL));
                i=eL;
                continue;
            } else if (isToken(MyText, i, "else") && !Main.In(i, DQArea)) {
                Analysis.add(new Resolution("#else",i,i+5));
                i+=3;
                continue;
            } else if (isToken(MyText, i, "while") && !Main.In(i, DQArea)) {
                int t = GetLineHead(MyText, i);   //t is the left-end of new  HeaderArea;
                t = GetFirstAlphabetAfterPos(MyText, t);
                int sL = GetFirstCharInCodeAfterPos(MyText, '(', i, DQArea, SQArea, CommentArea);
                int eL = FindSymmetric(MyText,sL,CommentArea,DQArea,SQArea);
                Analysis.add(new Resolution("while#",t,eL));                
                i=eL;
                continue;
            } else if (isToken(MyText, i, "for") && !Main.In(i, DQArea)) {
                int t = GetLineHead(MyText, i);   //t is the left-end of new  HeaderArea;
                t = GetFirstAlphabetAfterPos(MyText, t);
                int sL = GetFirstCharInCodeAfterPos(MyText, '(', i, DQArea, SQArea, CommentArea);
                int eL = FindSymmetric(MyText,sL,CommentArea,DQArea,SQArea);
                Analysis.add(new Resolution("for#",t,eL));
                i=eL;
                 continue;
            } else if (isToken(MyText, i, "switch") && !Main.In(i, DQArea)) {
                int t = GetLineHead(MyText, i);   //t is the left-end of new  HeaderArea;
                t = GetFirstAlphabetAfterPos(MyText, t);
                int sL = GetFirstCharInCodeAfterPos(MyText, '(', i, DQArea, SQArea, CommentArea);
                int eL = FindSymmetric(MyText,sL,CommentArea,DQArea,SQArea);
                Analysis.add(new Resolution("switch#",t,eL));
                i=eL;
                 continue;
            } else if (isToken(MyText, i, "case") && !Main.In(i, DQArea)) {
                int sL = GetFirstCharInCodeAfterPos(MyText, ':', i, DQArea, SQArea, CommentArea);                
                Analysis.add(new Resolution("case#",i,sL+1));
                i=sL;
            } else if (MyText.charAt(i) == ';' && !Main.In(i, DQArea) && !Main.In(i, SQArea)) { 
                int Base=Math.max(GetFuncBase(i),GetClassBase(i));
                //新增ArrayArea這個變數
                int t1 = GetFirstCharInCodeBeforePos(MyText, ';', i, DQArea, SQArea, CommentArea);
                if (t1<Base)  t1=(-2);
                int t2=  GetFirstCharInCodeBeforePos(MyText,'{',i,DQArea,SQArea,CommentArea);
                while (Main.In(t2, ArrayArea)) {
                    t2= GetFirstCharInCodeBeforePos(MyText,'{',t2-1,DQArea,SQArea,CommentArea);
                }
                if (t2<Base)  t2=(-1);                
                int t3=  GetFirstCharInCodeBeforePos(MyText,'}',i,DQArea,SQArea,CommentArea);
                while(Main.In(t3, ArrayArea)) {
                    t3=GetFirstCharInCodeBeforePos(MyText,'}',t3-1,DQArea,SQArea,CommentArea);
                }
                if (t3<Base)  t3=(-1);
                int statement_Start= max(t1,t2,t3)+1;
                Analysis.add(new Resolution("stmt#",statement_Start,i+1));
                
            }
            
        }
    }
    public void Make2() {        
        Vector<String> List=new Vector<String>();
        for (int i=0; i<Analysis.size(); i++) {
            Vector<Resolution> Hand= Resolution.GetResolution(Analysis.get(i), CommentArea,MyText);
            for (int j=0; j<Hand.size(); j++) {
                List.add(Hand.get(j).toString(MyText));
            }
        }
        System.out.println("List");
        for (int i=0; i<List.size(); i++) {
            System.out.println(List.get(i));
        }
        
    }
    public static boolean isToken(StringBuffer text, int Pos, String str) {
        if (text.substring(Pos).startsWith(str)) {
            if (Alphabet.indexOf(text.charAt(Pos - 1)) < 0 && Alphabet.indexOf(text.charAt(Pos+str.length())) < 0) {
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
        FuncHeaderArea = new Vector<Pair>();
        ClassArea = new Vector<Pair>();
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
    /***
     * 建構Function Header的東西...
     * @param text
     * @param refSmallLeft
     * @param refSmallRight
     * @param dest 
     */
    public  void Build_Header_Area(StringBuffer text, Vector<Integer> refSmallLeft, Vector<Integer> refSmallRight, Vector<Pair> dest) {
        if (refSmallLeft.size() != refSmallRight.size()) {
            throw new RuntimeException("小括號不對稱");
        }
        for (int i = 0; i < refSmallLeft.size(); i++) {
            int RightEnd = refSmallRight.get(i);
            int LeftEnd = refSmallLeft.get(i);
            int t = GetLineHead(text, LeftEnd);   //t is the left-end of new  HeaderArea;
            t = GetFirstAlphabetAfterPos(text, t);
            while (Main.In(t, CommentArea)) {
                t++;
                if (t == text.length()) {
                    throw new RuntimeException("We meet the end of text...t=" + t);
                }
            }
            int q = RightEnd + 1;		//q is the right-end of new Header Area;
            int q2= GetFirstCharInCodeAfterPos(text,'{',q,DQArea,SQArea,CommentArea);
            /*
			while(text.charAt(q)!='{'||Main.In(q, refCommentArea)) {
				q++;
				if (q==text.length())
					throw new RuntimeException("We meet the end of text...q="+q);
			}
             */
            
            if (t >= 0 && q2 >= 0) {
                String thatString= text.substring(t,q);
                if (thatString.indexOf("=")>=0)
                    return;                        //含有等號就不是FuncArea,應該當成stmt處理
                else
                    dest.add(new Pair(t, q2-1));
            } else {
                throw new RuntimeException("Build_Header_Area Wrong: i=" + i + "  t=" + t);
            }
        }
    }

    public void Build_Class_Area(StringBuffer text, Vector<Pair> dest) {     
        /*
        for(int i=0; i<text.length(); i++) {
            String hand=GetOneToken(text,i,CommentArea);
            if (hand.equals("class")) {
                final String ClassName=GetOneToken(text,i+6,CommentArea);
                String AfterName=GetOneToken(text, text.indexOf(ClassName)+ ClassName.length(),CommentArea);
                if (AfterName.equals("extends")) {
                    String afterClass=text.substring(i);
                    
                    String SuperClass=GetOneToken(text,afterClass.indexOf("extends"), text.indexOf())
                }else if (AfterName.equals("implements")) {
                    
                }
            }
        }
        */
        
        
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
            if (Alphabet.indexOf(text.charAt(pos)) >= 0) {
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
        for (int i=from_pos; i<text.length(); i++) {
            Character that=text.charAt(i);
            String sThat=new String(new char[]{that});
            if (WHITE.contains(sThat)) {
                if (retStr.length()>=1) {
                    return new Focus(retStr.toString(),i);
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
                }
                boolean DQHit=false;        
                Pair DQ=GetPair(i,DQArea);
                if (DQ!=null) {
                    DQHit=true;
                }
                boolean SQHit=false;
                Pair SQ=GetPair(i,SQArea);
                if (SQ!=null) {
                    SQHit=true;
                }
                if (CommentHit) {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),i+1);
                    }else { 
                        continue;                        
                    }
                }else if (ArrayHit)  {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),array.getStart());
                    }else { 
                        return new Focus(Uncomment(text,array,CommentArea),array.getEnd()+1);
                    }                    
                }else if (DQHit)  {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),DQ.getStart());
                    }else { 
                        return new Focus(text.substring(DQ.getStart(), DQ.getEnd()+1),DQ.getEnd()+1);
                    } 
                }else if (SQHit) {
                    if (retStr.length()>0) {
                        return new Focus(retStr.toString(),SQ.getStart());
                    }else { 
                        return new Focus(text.substring(SQ.getStart(),SQ.getEnd()+1),SQ.getEnd()+1);
                    }                     
                }else {                    
                   retStr.append(that);
                   final String Special_OneCharacter_Token="{}()[];=><+-*/%^~@,:!|";
                   if (Special_OneCharacter_Token.contains(retStr.toString())) {
                       return new Focus(retStr.toString(),i+1);
                   }
                }
            }
        }
        return null;
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
    public  int GetFuncBase(int pos) {
        for (int i=0; i<FuncHeaderArea.size(); i++) {
            Pair that=FuncHeaderArea.get(i);
            int start=GetFirstCharInCodeAfterPos(MyText,'{',that.getEnd(),DQArea,SQArea,CommentArea);
            int end=FindSymmetric(MyText,start,CommentArea,DQArea,SQArea);
            if (start<=pos && pos<=end)
                return start;
        }
        return (-1);
    }
    public int GetClassBase(int pos) {
        for (int i=ClassArea.size()-1; i>=0; i--) {
            Pair that=ClassArea.get(i);
            int start=GetFirstCharInCodeAfterPos(MyText,'{',that.getEnd(),DQArea,SQArea,CommentArea);
            int end=FindSymmetric(MyText,start,CommentArea,DQArea,SQArea);
            if (start<=pos && pos<=end) {
                return start;
            }
        }
        return (-1);
    }

}
