/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/**
 * 上次專案Main class裡面寫了一大堆不知所云的東西的根本原因是因為 對於HTML tag的處理有一點不確定所以就....亂寫一通
 * 這次我決定把Tag先分成兩種: Container / Not Container Container tag:
 * 對於父親一定要縮排；如果有內容就先列出來就好 Not Container: 就列出來就好 其實還有<Script></Script>這種很麻煩的tag;
 * 但是我們先很單純的只把這種tag列出來就好
 *
 * @author easterday
 */
public class HTML {

    //讀進來的一個檔案
    public final StringBuffer MyText;
    //很可能是HTML裡面的Attribute或是JavaScript的字串
    public Vector<Pair> DQArea;
    //很可能是HTML裡面的Attribute或是Javascript的字串
    public Vector<Pair> SQArea;
    //很可能是Javascript裡面的註解,或是JSP裡面的// or /**/註解....
    //這裡有點複雜到我還無法掌握
    public Vector<Pair> CommentArea;
    //很可能是全部的左角括號
    public Vector<Integer> Left;
    //很可能是全部的右角括號
    public Vector<Integer> Right;
    //很可能是全部的
    public Vector<Integer> LeftOrRight;
    //游離子(例如在內容中看到的<,>,".'等等)
    public Vector<Integer> Radical;
    //未完成的Tag:[例如<p     ](沒有右括號)
    public Vector<Integer> UnFinished;
    //設定準備要翻譯的特殊符號  
    public Vector<Character> defRadical;
    //視為空白的符號集合
    public static final String White=" |\t|\r|\n|\000";

    public void PrintIssues() {
        System.out.println("DQArea=" + DQArea.toString());
        System.out.println("SQArea=" + SQArea.toString());
        System.out.println("CommentArea=" + CommentArea.toString());
        System.out.println("Left=" + Left.toString());
        System.out.println("Right=" + Right.toString());
        System.out.println("LeftOrRight=" + LeftOrRight.toString());
        System.out.println("Radical=" + Radical.toString());
        System.out.println("UnFinished=" + UnFinished.toString());
    }

    public HTML(StringBuffer inn) {
        MyText = inn;
        Main.refineStringBuffer(MyText);
        Character[] RadicalSet = {'<', '>', '\'', '"', '&'};
        setDefRadical(RadicalSet);
    }

    public void go() {
        DQArea = new Vector<Pair>();
        SQArea = new Vector<Pair>();
        CommentArea = new Vector<Pair>();
        Radical = new Vector<Integer>();
        UnFinished = new Vector<Integer>();
        // defRadical= new Vector<Character>();    

        JspStatic3.Build_DQ_Area(MyText, DQArea);
        JspStatic3.Build_SQ_Area(MyText, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_in_CommentArea();
        Left = new Vector<Integer>();
        Right = new Vector<Integer>();
        LeftOrRight = new Vector<Integer>();

        Build();
        for (Integer e : Left) {
            LeftOrRight.add(e);
        }
        for (Integer e : Right) {
            LeftOrRight.add(e);
        }
        Collections.sort(LeftOrRight);

    }

    public void Fix_if_SQDQ_in_CommentArea() {
        Vector<Integer> ALLSQ = new Vector<Integer>();
        for (Pair SQ : SQArea) {
            ALLSQ.add(SQ.getStart());
            ALLSQ.add(SQ.getEnd());
        }
        Vector<Integer> ALLDQ = new Vector<Integer>();
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
        DQArea.clear();
        SQArea.clear();
        for (int i = 0; i < ALLDQ.size(); i += 2) {
            DQArea.add(new Pair(ALLDQ.get(i), ALLDQ.get(i + 1)));
        }
        for (int i = 0; i < ALLSQ.size(); i += 2) {
            SQArea.add(new Pair(ALLSQ.get(i), ALLSQ.get(i + 1)));
        }
    }

    private int searchForRightAngleBranket1(int start) {
        for (int i = start; i < MyText.length(); i++) {
            if (Main.In(i, DQArea) || Main.In(i, SQArea)) {
                continue;
            } else {
                if (MyText.charAt(i) == '>') {
                    return i;
                }
            }
        }
        return (-1);
    }

    private int searchForRightAngleBranket2(int start) {
        for (int i = start; i < MyText.length(); i++) {
            if (Main.In(i, DQArea) || Main.In(i, SQArea) || Main.In(i, CommentArea)) {
                continue;
            } else {
                if (MyText.charAt(i) == '%' && MyText.charAt(i + 1) == '>') {
                    return i + 1;
                }
            }
        }
        return (-1);
    }

    private void StackTagRoutine(int i, int e) {
        Left.add(i);
        Right.add(e);
    }

    public void setDefRadical(Character[] RadicalSet) {
        defRadical = new Vector<Character>();
        for (Character that : RadicalSet) {
            defRadical.add(that);
        }
    }

    public void Build() {
        final int StringLength = MyText.length();
        //boolean flag_in_js = false;        boolean flag_in_jsp = false;        boolean flag_in_pre=false;        boolean flag_in_style=false;
        //用一個stack來代替四五個flag...
        Stack<Focus> stack = new Stack<Focus>();  // Stack for "HTML Comment like <!-- -->"
        for (int i = 0; i < StringLength; i++) {
            int e = (-1);   //應該是對應的右角號位置            
            if (Main.In(i, DQArea) || Main.In(i, SQArea)) {
                continue;
            }
            if (MyText.charAt(i) == '<') {
                if (i + 4 < StringLength && "<!--".equals(MyText.substring(i, i + 4))) {
                    if (Left.size() - UnFinished.size() - Right.size() == 0) {
                        Focus f = new Focus("<!--", i, i + 1);
                        stack.push(f);
                        Left.add(i);
                    }
                    continue;
                }
                if (i + 1 < StringLength && MyText.charAt(i + 1) != '/') {
                    Focus f = null;
                    if (i + 7 < StringLength && "<script".equals(MyText.substring(i, i + 7).toLowerCase())) {
                        f = new Focus("<script", i, i + 7);
                        stack.push(f);
                        e = searchForRightAngleBranket1(i + 7);
                        /*
                        //這一句可以在面對<script />之後的文字
                          視為"不是在<script></script>"之間
                          但是這種行為不是Chrome的行為...
                        if (MyText.substring(e-1,e+1).equals("/>")) {
                            stack.pop();
                        }
                         */
                        StackTagRoutine(i, e);
                        i = e;
                        continue;
                    } else if (i + 6 < StringLength && "<style".equals(MyText.substring(i, i + 6).toLowerCase())) {
                        f = new Focus("<style", i, i + 6);
                        stack.push(f);
                        e = searchForRightAngleBranket1(i + 6);
                        StackTagRoutine(i, e);
                        i = e;
                        continue;
                    } else if (i + 4 < StringLength && "<pre".equals(MyText.substring(i, i + 4).toLowerCase())) {
                        f = new Focus("<pre", i, i + 4);
                        stack.push(f);
                        e = searchForRightAngleBranket1(i + 4);
                        StackTagRoutine(i, e);
                        i = e;
                        continue;
                    } else if (i + 2 < StringLength && "<%".equals(MyText.substring(i, i + 2))) {
                        f = new Focus("<%", i, i + 2);
                        stack.push(f);
                        e = searchForRightAngleBranket2(i + 2);
                        if (e >= 0) {
                            StackTagRoutine(i, e);
                            i = e;
                            stack.pop();
                        } else {
                            Left.add(i);
                            break;
                        }
                        continue;
                    }
                } else {
                    if (i + 8 < StringLength && "</script".equals(MyText.substring(i, i + 8).toLowerCase())) {
                        if (stack.size() > 0 && stack.peek().RetString.equals("<script")) {
                            stack.pop();
                            e = searchForRightAngleBranket1(i + 8);
                            StackTagRoutine(i, e);
                            i = e;
                            continue;
                        } else {
                            //有可能是這份HTML有問題,因為<script> </script>不成對
                            //但是這不是我們工作的重點...所以不理它
                            throw new RuntimeException("Unpair: </script>");
                        }
                    } else if (i + 7 < StringLength && "</style".equals(MyText.substring(i, i + 7).toLowerCase())) {
                        if (stack.size() > 0 && stack.peek().RetString.equals("<style")) {
                            stack.pop();
                            e = searchForRightAngleBranket1(i + 7);
                            StackTagRoutine(i, e);
                            i = e;
                            continue;
                        } else {
                            //有可能是這份HTML有問題,因為<style> </stlye>不成對
                            //但是這不是我們工作的重點...所以不理它
                            throw new RuntimeException("Unpair: </style>");
                        }
                    } else if (i + 5 < StringLength && "</pre".equals(MyText.substring(i, i + 5).toLowerCase())) {
                        if (stack.size() > 0 && stack.peek().RetString.equals("<pre")) {
                            stack.pop();
                            e = searchForRightAngleBranket1(i + 5);
                            StackTagRoutine(i, e);
                            i = e;
                            continue;
                        } else {
                            //有可能是這份HTML有問題,因為<pre> </pre>不成對
                            //但是這不是我們工作的重點...所以不理它
                            throw new RuntimeException("Unpair: </pre>");
                        }
                    }
                }
                if (stack.empty()) {
                    if (i + 1 < StringLength && Character.isWhitespace(MyText.charAt(i + 1))) {
                        Radical.add(i);
                    } else {
                        if (Left.size() - UnFinished.size() - Right.size() == 1) {
                            UnFinished.add(Left.get(Left.size() - 1));
                        }
                        Left.add(i);
                        if (e >= 0) {
                            Right.add(e);
                            i = e;
                        }
                    }
                }
            } else if (MyText.charAt(i) == '-') {
                if (i + 3 < StringLength && "-->".equals(MyText.substring(i, i + 3))) {
                    if (Left.size() - UnFinished.size() - Right.size() == 1) {
                        if (stack.size() > 0 && stack.peek().RetString.equals("<!--")) {
                            stack.pop();
                            Right.add(i + 2);
                            i = i + 2;
                        } else if (stack.size() == 0) {
                            //跑到這裡來應該是類似這樣的情形 <p  <!-- comment --> >
                            Right.add(i + 2);
                            i = i + 2;
                        }
                    }
                    //i=i+2;    //也許加這一句會有比較對稱性的結果，但是IE和Chrome不是這樣解析HTML的...
                    continue;
                }
            } else if (MyText.charAt(i) == '%') {
                if (i + 2 < StringLength && "%>".equals(MyText.substring(i, i + 2).toLowerCase())) {
                    //正常來說應該不會跑到這裡來；應該是在發現到"<%"時就處裡掉了
                    //這一段碼只是放在這裡有備無患....
                    if (stack.size() > 0 && stack.peek().RetString.equals("<%")) {
                        stack.pop();
                        Right.add(i + 1);
                    } else {
                        //有可能是這份HTML有問題,因為<%        %>不成對
                        //但是這是我們工作的重點....所以丟出錯誤
                        throw new RuntimeException("unpaired!");
                    }
                }
            } else if (MyText.charAt(i) == '>') {  //如果是其他的普通Tag
                if (stack.empty()) {
                    if (Left.size() - UnFinished.size() - Right.size() == 1) {
                        Right.add(i);
                    } else {
                        Radical.add(i);
                    }
                }
            } else if (stack.size() == 0 && defRadical.contains(MyText.charAt(i))) {
                if (Right.size() == Left.size() - UnFinished.size()) {
                    Radical.add(i);
                }
            }

        }
        if (stack.size() == 1 && stack.peek().RetString.equals("<!--")) {
            UnFinished.add(Left.get(Left.size() - 1));
        } else if (stack.size() == 1 && stack.peek().RetString.equals("<%")) {
            UnFinished.add(Left.get(Left.size() - 1));
        }
    }

    public Vector<String> GetAllTags() {
        Vector<String> ret = new Vector<String>();
        for (int i = 0; i < LeftOrRight.size(); i++) {
            int Start = LeftOrRight.get(i);
            int End = (-1);
            if (i + 1 <= LeftOrRight.size() - 1) {
                End = LeftOrRight.get(i + 1);
            } else {
                End = MyText.length() - 1;
            }

            if (MyText.charAt(Start) == '<') {
                if (MyText.charAt(End) == '>') {
                    ret.add(Main.ToSTR(new Pair(Start, End), MyText));
                } else if (MyText.charAt(End) == '<' && UnFinished.contains(Start)) {
                    ret.add(Main.ToSTR(new Pair(Start, End - 1), MyText));
                } else if (UnFinished.contains(Start)) {  //位在結尾的UnFinished...
                    ret.add(Main.ToSTR(new Pair(Start, End), MyText));
                }
            }
            if (i + 1 == LeftOrRight.size() - 1) {
                if (MyText.charAt(End) == '>') {
                    break;
                }
            }

        }
        return ret;
    }

    public Vector<String> GetAllBetween() {
        Vector<String> ret = new Vector<String>();
        for (int i = 0; i < LeftOrRight.size(); i++) {
            if (MyText.charAt(LeftOrRight.get(i)) == '>' && i + 1 <= LeftOrRight.size() - 1) {
                if (MyText.charAt(LeftOrRight.get(i + 1)) == '<') {
                    ret.add(MyText.substring(LeftOrRight.get(i) + 1, LeftOrRight.get(i + 1)));
                }
            }
        }
        return ret;
    }

    public static String translate(Character input) {
        switch (input) {
            case '<':
                return "&lt;";
            case '>':
                return "&gt;";
            case '\"':
                return "&quot;";
            case '\'':
                return "&apos;";
            case '&':
                return "&amp;";
            case ' ':
                return "&nbsp;";
            default:
                return (input.toString());
        }
    }

    public static void InsertToStringBuffer(StringBuffer buf, String Txt, Vector<Character> defR, boolean translateRadical) {
        StringBuffer ret=new StringBuffer();
        for (int i = 0; i < Txt.length(); i++) {
            if (translateRadical) {
                if (defR.contains(Txt.charAt(i))) {
                    ret.append(translate(Txt.charAt(i)));
                } else {
                    ret.append(Txt.charAt(i));
                }

            } else {
                buf.append(Txt.charAt(i));
            }
        }
        buf.append(ret.toString().trim());
    }

    public String toCompactString(boolean translateRadical, boolean Finishing) {
        StringBuffer ret = new StringBuffer();
        if (LeftOrRight.size() > 0) {
            String startTxt = MyText.substring(0, LeftOrRight.get(0));
            InsertToStringBuffer(ret, startTxt, defRadical, translateRadical);
        }
        Vector<String> Tag = GetAllTags();
        Vector<String> Between = GetAllBetween();
        Stack<String> stack=new Stack();
        String that;
        if (Tag.size() - Between.size() == 1) {
            for (int i = 0; i < Tag.size(); i++) {
                that = Tag.get(i);
                ret.append(ToCompactOneTag(that));
                if (Finishing) {
                    if (!that.endsWith(">")) {
                        String append;
                        if (that.startsWith("<!--")) {
                            append = "-->";
                        } else if (that.startsWith("<%")) {
                            append = "%>";
                        } else {
                            append = "/>";
                        }
                        ret.append(append);
                    }
                }
                if (that.startsWith("<script") || that.startsWith("<pre") || that.startsWith("<style")) {
                    stack.push(that);
                }else if (stack.size()>0 && that.startsWith("</")) {
                    stack.pop();
                }
                if (i <= Between.size() - 1) {
                    that = Between.get(i);                    
                    if (stack.empty()) {
                        InsertToStringBuffer(ret, that.trim(), defRadical, translateRadical);                        
                    }else {
                        InsertToStringBuffer(ret, that.trim(), defRadical, false);
                    }
                }
            }
        }
        int LastBranket = LeftOrRight.get(LeftOrRight.size() - 1);
        if (LastBranket < MyText.length()) {
            if (MyText.charAt(LastBranket) == '<') {
                //do nothing;
            } else if (MyText.charAt(LastBranket) == '>') {
                InsertToStringBuffer(ret, MyText.substring(LastBranket + 1, MyText.length()), defRadical, translateRadical);
            }
        }

        return ret.toString();

    }
    public static String ToCompactOneTag(String Tag) {
        if (Tag.startsWith("<!--") || Tag.startsWith("<%") ) {
            return Tag;
        }
        StringBuffer orig=new StringBuffer(Tag);
        Vector<Pair> localDQ=new Vector<Pair>();
        Vector<Pair> localSQ=new Vector<Pair>();
        JspStatic3.Build_DQ_Area(orig, localDQ);
        JspStatic3.Build_SQ_Area(orig, localDQ, localSQ);        
        Stack<String> stack=new Stack<String>();
        StringBuffer ret=new StringBuffer();
        for (int i=0; i<orig.length(); i++) {
            int sq=Main.Exist(i, localSQ);
            if (sq>=0)  {
                ret.append(Main.ToSTR(localSQ.get(sq), orig));
                i=localSQ.get(sq).getEnd();
                continue;
            }            
            int dq=Main.Exist(i, localDQ);
            if (dq>=0) {
                ret.append(Main.ToSTR(localDQ.get(dq), orig));
                i=localDQ.get(dq).getEnd();
                continue;
            }
            switch(orig.charAt(i)) {
                case '\'':  
                    if (stack.empty())
                        stack.push("SQ"); 
                    else
                        stack.pop();
                    break;
                case '\"':   
                    if (stack.empty())
                        stack.push("DQ"); 
                    else
                        stack.pop();
                    break;
            }
            if (HTML.White.contains(""+orig.charAt(i))) {
                while(i<orig.length() && HTML.White.contains(""+orig.charAt(i))) {
                    if (orig.charAt(i)=='\n' && !stack.empty()) {
                        ret.append("\n");  stack.clear();
                    }
                    i++;
                }
                ret.append(' ');
            }
            if (i<orig.length())
                ret.append(orig.charAt(i));            
        }
        int idx1=ret.lastIndexOf(">");
        if (idx1>=0 && ret.charAt(idx1-1)==' ') {
            ret.deleteCharAt(idx1-1);
            return ret.toString();
        }
        int idx2=ret.lastIndexOf("/>");
        if (idx2>=0 && ret.charAt(idx2-1)==' ') {
            ret.deleteCharAt(idx2-1);
            return ret.toString();
        }        
        return ret.toString();
    }

}
