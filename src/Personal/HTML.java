/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * �W���M��Main class�̭��g�F�@�j�藍���Ҥ����F�誺�ڥ���]�O�]�� ���HTML tag���B�z���@�I���T�w�ҥH�N....�üg�@�q
 * �o���ڨM�w��Tag���������: Container / Not Container Container tag:
 * �����ˤ@�w�n�Y�ơF�p�G�����e�N���C�X�ӴN�n Not Container: �N�C�X�ӴN�n ����٦�<Script></Script>�o�ثܳ·Ъ�tag;
 * ���O�ڭ̥��ܳ�ª��u��o��tag�C�X�ӴN�n
 *
 * @author easterday
 */
public class HTML {
    public static class TagPair {
        public final String MyText;
        public final Integer start;
        public final Integer end;
        public int  Level=(-1);
        public boolean isContainer=false;
        public TagPair(String txt,int s,int e) {
            MyText=txt;start=s; end=e;
        }
        public static String MirrorTag(String input) {
            if (input.charAt(0)=='<' && input.charAt(1)!='/') {  //normal tag
                return("</"+input.substring(1));
            }else if (input.startsWith("</")) {
                return("<"+input.substring(2));
            }else {
                assert(false);
            }
            return "@@?";
        }
        public static boolean isStartTag(String inn) {
            if (inn.charAt(0)=='<' && inn.charAt(1)!='/') {
                return true;
            }
            return false;
        }
        public static boolean isEndTag(String inn) {
            if (inn.charAt(0)=='<' && inn.charAt(1)=='/') {
                return true;
            }
            return false;
        }
        public boolean equals(Object that) {
            if (that instanceof TagPair) {
                TagPair obj=(TagPair) that;
                return (start==obj.start && end==obj.end);
            }
            return false;
        }
        public String toString() {
            return new String("[start="+start+", end="+end+"]");
        }
        public boolean Inner(TagPair Child) {
            if (this.start< Child.start && this.end> Child.end) {
                return true;
            }
            return false;
        }
    }

    //Ū�i�Ӫ��@���ɮ�
    public final StringBuffer MyText;
    //�ܥi��OHTML�̭���Attribute�άOJavaScript���r��
    public Vector<Pair> DQArea;
    //�ܥi��OHTML�̭���Attribute�άOJavascript���r��
    public Vector<Pair> SQArea;
    //�ܥi��OJavascript�̭�������,�άOJSP�̭���// or /**/����....
    //�o�̦��I��������ٵL�k�x��
    public Vector<Pair> CommentArea;
    //�ܥi��O�����������A��
    public Vector<Integer> Left;
    //�ܥi��O�������k���A��
    public Vector<Integer> Right;
    //�ܥi��O������
    public Vector<Integer> LeftOrRight;
    //�����l(�Ҧp�b���e���ݨ쪺<,>,".'����)
    public Vector<Integer> Radical;
    //��������Tag:[�Ҧp<p     ](�S���k�A��)
    public Vector<Integer> UnFinished;
    //�]�w�ǳƭn½Ķ���S��Ÿ�  
    public Vector<Character> defRadical;
    //�����ťժ��Ÿ����X
    public static final String White = " |\t|\r|\n|\000";
    //�w�q���e����html tags
    public Vector<String> defContainer;
    //
    public DefaultTreeModel MyTree;

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
        setDefContainer("html,head,body,div,table,thead.tbody,tr,form");
    }
    public void setDefContainer(String input) {
        defContainer=new Vector<String>();
        String[] arr=input.split(",");
        for (String a:arr) {
            defContainer.add(a);
        }
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
        //�Τ@��stack�ӥN���|����flag...
        Stack<Focus> stack = new Stack<Focus>();  // Stack for "HTML Comment like <!-- -->"
        for (int i = 0; i < StringLength; i++) {
            int e = (-1);   //���ӬO�������k������m            
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
                        //�o�@�y�i�H�b����<script />���᪺��r
                          ����"���O�b<script></script>"����
                          ���O�o�ئ欰���OChrome���欰...
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
                            //���i��O�o��HTML�����D,�]��<script> </script>������
                            //���O�o���O�ڭ̤u�@�����I...�ҥH���z��
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
                            //���i��O�o��HTML�����D,�]��<style> </stlye>������
                            //���O�o���O�ڭ̤u�@�����I...�ҥH���z��
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
                            //���i��O�o��HTML�����D,�]��<pre> </pre>������
                            //���O�o���O�ڭ̤u�@�����I...�ҥH���z��
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
                            //�]��o�̨����ӬO�����o�˪����� <p  <!-- comment --> >
                            Right.add(i + 2);
                            i = i + 2;
                        }
                    }
                    //i=i+2;    //�]�\�[�o�@�y�|�������٩ʪ����G�A���OIE�MChrome���O�o�˸ѪRHTML��...
                    continue;
                }
            } else if (MyText.charAt(i) == '%') {
                if (i + 2 < StringLength && "%>".equals(MyText.substring(i, i + 2).toLowerCase())) {
                    //���`�ӻ����Ӥ��|�]��o�̨ӡF���ӬO�b�o�{��"<%"�ɴN�B�̱��F
                    //�o�@�q�X�u�O��b�o�̦��ƵL�w....
                    if (stack.size() > 0 && stack.peek().RetString.equals("<%")) {
                        stack.pop();
                        Right.add(i + 1);
                    } else {
                        //���i��O�o��HTML�����D,�]��<%        %>������
                        //���O�o�O�ڭ̤u�@�����I....�ҥH��X���~
                        throw new RuntimeException("unpaired!");
                    }
                }
            } else if (MyText.charAt(i) == '>') {  //�p�G�O��L�����qTag
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
                } else if (UnFinished.contains(Start)) {  //��b������UnFinished...
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
        StringBuffer ret = new StringBuffer();
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

    public int CorrectNumBecauseOfUnFinished() {
        int ret = 0;
        int Last = LeftOrRight.get(LeftOrRight.size() - 1);
        if (MyText.charAt(Last) == '<') {
            if (UnFinished.contains(Last)) {
                ret = 1;
            }
        }
        return ret;
    }

    public String toCompactString(boolean translateRadical, boolean Finishing, boolean RemoveHTMLComment) {
        StringBuffer ret = new StringBuffer();
        if (LeftOrRight.size() > 0) {
            String startTxt = MyText.substring(0, LeftOrRight.get(0));
            InsertToStringBuffer(ret, startTxt, defRadical, translateRadical);
        }
        Vector<String> Tag = GetAllTags();
        Vector<String> Between = GetAllBetween();
        Stack<String> stack = new Stack<String>();
        String that;
        int Count = CorrectNumBecauseOfUnFinished();

        if (Tag.size() - UnFinished.size() - Between.size() + Count == 1) {
            for (int i = 0; i < Tag.size(); i++) {
                that = Tag.get(i);
                if (Finishing && this.CheckWhetherThisTagIsUnFinished(i)) {

                    if (that.startsWith("<!--")) {
                        that += "-->";
                    } else if (that.startsWith("<%")) {
                        that += "%>";
                    } else {
                        that += "/>";
                    }

                }
                if (!RemoveHTMLComment || !that.startsWith("<!--") || !stack.empty()) {
                    if (that.startsWith("<!--")) {
                        ret.append(that);
                    } else {
                        ret.append(ToCompactOneTag(that));
                    }
                }
                if (stack.empty() && that.startsWith("<script") && that.endsWith("/>")) {  
                    //�p�G�J��<script src='GGYY.js' /> var i=123; </script>�o�زզX�٬O�n�⤤����Between text����javascript                    
                    if (i+1<Tag.size() ) {
                        String next= Tag.get(i+1);
                        if (next.startsWith("</") || next.startsWith("<script")) {
                            stack.push(that);
                        }
                    }else if (i==Tag.size()-1) {
                        stack.push(that);
                    }
                }else if (stack.empty() &&(that.startsWith("<script") || that.startsWith("<pre") || that.startsWith("<style"))) {
                    stack.push(that);
                } else if (stack.size() > 0 && that.startsWith("</")) {
                    stack.pop();
                }
                if (i <= Between.size() - 1) {
                    that = Between.get(i);
                    if (stack.empty()) {
                        InsertToStringBuffer(ret, that.trim(), defRadical, translateRadical);
                    } else {
                        InsertToStringBuffer(ret, that.trim(), defRadical, false);
                    }
                }
            }
        } else {
            assert (false);
        }
        int LastBranket = LeftOrRight.get(LeftOrRight.size() - 1);
        if (LastBranket < MyText.length()) {
            if (MyText.charAt(LastBranket) == '<') {
                //do nothing; //�]���o�̪����e�w�g�[�Jret�F
            } else if (MyText.charAt(LastBranket) == '>') {
                if (stack.empty()) {
                    InsertToStringBuffer(ret, MyText.substring(LastBranket + 1, MyText.length()), defRadical, translateRadical);
                } else {
                    InsertToStringBuffer(ret, MyText.substring(LastBranket + 1, MyText.length()), defRadical, false);
                }
            }
        }

        return ret.toString();

    }

    public static String ToCompactOneTag(String Tag) {
        if (Tag.startsWith("<!--") || Tag.startsWith("<%")) {
            return Tag;
        }
        StringBuffer orig = new StringBuffer(Tag);
        Vector<Pair> localDQ = new Vector<Pair>();
        Vector<Pair> localSQ = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(orig, localDQ);
        JspStatic3.Build_SQ_Area(orig, localDQ, localSQ);
        Stack<String> stack = new Stack<String>();
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < orig.length(); i++) {
            int sq = Main.Exist(i, localSQ);
            if (sq >= 0) {
                ret.append(Main.ToSTR(localSQ.get(sq), orig));
                i = localSQ.get(sq).getEnd();
                continue;
            }
            int dq = Main.Exist(i, localDQ);
            if (dq >= 0) {
                ret.append(Main.ToSTR(localDQ.get(dq), orig));
                i = localDQ.get(dq).getEnd();
                continue;
            }
            switch (orig.charAt(i)) {
                case '\'':
                    if (stack.empty()) {
                        stack.push("SQ");
                    } else {
                        stack.pop();
                    }
                    break;
                case '\"':
                    if (stack.empty()) {
                        stack.push("DQ");
                    } else {
                        stack.pop();
                    }
                    break;
            }
            if (HTML.White.contains("" + orig.charAt(i))) {
                while (i < orig.length() && HTML.White.contains("" + orig.charAt(i))) {
                    if (orig.charAt(i) == '\n' && !stack.empty()) {
                        ret.append("\n");
                        stack.clear();
                    }
                    i++;
                }
                ret.append(' ');
            }
            if (i < orig.length()) {
                ret.append(orig.charAt(i));
            }
        }
        int idx1 = ret.lastIndexOf(">");
        if (idx1 >= 0 && ret.charAt(idx1 - 1) == ' ') {
            ret.deleteCharAt(idx1 - 1);
            return ret.toString();
        }
        int idx2 = ret.lastIndexOf("/>");
        if (idx2 >= 0 && ret.charAt(idx2 - 1) == ' ') {
            ret.deleteCharAt(idx2 - 1);
            return ret.toString();
        }
        return ret.toString();
    }

    public boolean CheckWhetherThisTagIsUnFinished(int TagNumber) {
        int i, j, k;
        i = 0;
        j = 1;
        int idx = 0;
        while (idx <= TagNumber && i < LeftOrRight.size()) {
            char L = MyText.charAt(LeftOrRight.get(i));
            char R = '@';
            if (j < LeftOrRight.size()) {
                R = MyText.charAt(LeftOrRight.get(j));
            } else if (j + 1 >= LeftOrRight.size()) {
                if (L == '<') {
                    return true;
                }
            } else {
                break;
            }
            if (L == '<' && R == '>') {
                if (TagNumber == idx) {
                    return false;
                }
                idx += 1;
                i += 2;
                j += 2;
            } else if (L == '<' && R == '<') {
                if (TagNumber == idx) {
                    return true;
                }
                i++;
                j++;
                idx++;
            }
        }
        return false;
    }

    public String toOneTagOneLineString(boolean translateRadical, boolean Finishing, boolean RemoveHTMLComment, String changeLine) {
        StringBuffer ret = new StringBuffer();
        if (LeftOrRight.size() > 0) {
            String startTxt = MyText.substring(0, LeftOrRight.get(0));
            String[] lines = startTxt.split("\n");
            for (String str : lines) {
                InsertToStringBuffer(ret, str + changeLine, defRadical, translateRadical);
            }
        }
        Vector<String> Tag = GetAllTags();
        Vector<String> Between = GetAllBetween();
        Stack<String> stack = new Stack<String>();
        String that;
        int Count = CorrectNumBecauseOfUnFinished();
        if (Tag.size() - UnFinished.size() - Between.size() + Count == 1) {
            for (int i = 0; i < Tag.size(); i++) {
                that = Tag.get(i);
                if (Finishing && this.CheckWhetherThisTagIsUnFinished(i)) {
                    if (that.startsWith("<!--")) {
                        that += "-->";
                    } else if (that.startsWith("<%")) {
                        that += "%>";
                    } else {
                        that += "/>";
                    }                                        
                }
                if (!RemoveHTMLComment || !that.startsWith("<!--") || !stack.empty()) {
                    if (that.startsWith("<!--")) {
                        ret.append(that+changeLine);
                    }else {
                        ret.append(ToCompactOneTag(that)+changeLine);
                    }
                }
                boolean pop_after_next_between_txt=false;
                if (stack.empty() && that.startsWith("<script") && that.endsWith("/>")) {  
                    //�򥻤W�o�̬O�B��<script src='GGYY.js' />�o��tag
                    //�p�G�J��<script src='GGYY.js' /> var i=123; </script>�o�زզX�٬O�n�⤤����Between text����javascript                    
                    if (i+1<Tag.size()) {
                        String next= Tag.get(i+1);
                        if (next.startsWith("</") || next.startsWith("<script")) {
                            stack.push(that);
                        }
                    }else if (i==Tag.size()-1) {
                        //�Ҧp<html><script src='ggyy.js' /> </html>
                        //�o�˷|�� </html>����javascript�Ӥ�½Ķ
                        stack.push(that);
                    }
                    pop_after_next_between_txt=true;
                }else if (stack.empty() &&(that.startsWith("<script") || that.startsWith("<pre") || that.startsWith("<style"))) {
                    stack.push(that);
                }else if (stack.size()>0 && that.startsWith("</")) {
                    String top=stack.peek();
                    if ((top.startsWith("<script") && that.startsWith("</script")) || 
                         (top.startsWith("<pre") && that.startsWith("</pre"))      ||
                         (top.startsWith("<style") && that.startsWith("</style")) )
                        stack.pop();
                }
                if (i<= Between.size()-1) {
                    that=Between.get(i).trim();
                    if (that.length()>0) {
                        if (stack.empty()) {
                            InsertToStringBuffer(ret,that.trim(), defRadical,translateRadical);
                        }else {
                            InsertToStringBuffer(ret,that.trim(), defRadical,false);
                        }
                        ret.append(changeLine);
                    }
                    if (pop_after_next_between_txt)
                        stack.pop();
                }
            }
        }else {
            assert(false);
        }
        int LastBranket=LeftOrRight.get(LeftOrRight.size()-1);
        if (LastBranket< MyText.length()) {
            if (MyText.charAt(LastBranket)=='>') {
                if (stack.empty()) {
                    InsertToStringBuffer(ret,MyText.substring(LastBranket+1,MyText.length()).trim(),defRadical,translateRadical);
                }else {
                    InsertToStringBuffer(ret,MyText.substring(LastBranket+1,MyText.length()).trim(),defRadical,false);
                }
            }                
        }
        return ret.toString();
    }
    private static boolean isSingleTag(String TagTxt) {
        if (TagTxt.startsWith("<") && TagTxt.endsWith("/>"))
            return true;
        return false;
    }
    public Vector<TagPair> collectTagPairs(Vector<String>Tags) {  
//�Ъ`�N�U��nested tag������... ex <div id='A'> <div id='b'> </div> </div>
        Vector<TagPair> ret=new Vector<TagPair>();

        for (int i=0; i<Tags.size(); i++) {
            String that=Tags.get(i);
            if (isSingleTag(that)) {
                ret.add(new TagPair(that,i,i));
            }else if (TagPair.isStartTag(that)) {
                Stack<String> stack=new Stack<String>();
                stack.push(that);
                for (int j=i+1; j<Tags.size(); j++) {
                    String hand=Tags.get(j);
                    String thatMirror=TagPair.MirrorTag(that);
                    if (stack.size()==1 && hand.startsWith(thatMirror)) {
                        TagPair newPair=new TagPair(that,i,j);
                        for (String s:defContainer) {
                            String cmp="<"+s;
                            if (that.startsWith(cmp)) {
                                newPair.isContainer=true;
                                break;
                            }                                
                        }
                        ret.add(newPair);
                        break;
                    }else if (TagPair.isStartTag(hand)) {
                        stack.push(hand);
                    }else if (hand.startsWith(TagPair.MirrorTag(stack.peek()))) {
                        stack.pop();
                    }
                }
            }
        }
        return ret;        
    }
    private void adjustContainers(Vector<TagPair> all) {
        for (int i=0; i<all.size(); i++) {
            TagPair hand=all.get(i);
            if (!hand.isContainer)
                continue;                            
            Vector<TagPair> parents=GetAllParents(all,hand);
            for (TagPair p: parents) {
                p.isContainer=true;
            }
        }
    }
    private Vector<TagPair> GetAllParents(Vector<TagPair> ALL,TagPair that) {
        Vector<TagPair> ret=new Vector<TagPair>();
        for (int i=0; i<ALL.size(); i++) {
            if (ALL.get(i).Inner(that)) {
                ret.add(ALL.get(i));
            }
        }
        return ret;
    }
    public String toStairString(String strLevel,String strChangeLine) {
        Vector<String> Tag = GetAllTags();
        Vector<String> Between = GetAllBetween();        
        Vector<TagPair> All_TagPairs=collectTagPairs(Tag);        
        adjustContainers(All_TagPairs);
        BuildTree(All_TagPairs);
        StringBuffer ret=new StringBuffer();
        MakeStairString(ret,strLevel,strChangeLine,MyTree.getRoot(),Tag,Between,0);
        return ret.toString();
    }
    public static void MakeStairString(StringBuffer buf,String strLevel,String strChangeLine,Object rooot,Vector<String> Tags,Vector<String> Betweens,int level) {
        DefaultMutableTreeNode root=(DefaultMutableTreeNode) rooot;
        for (int i=0; i<level; i++) {
            buf.append(strLevel);
        }
        TagPair that=(TagPair) root.getUserObject();
        if (that==null) {
            for (int i=0; i< root.getChildCount(); i++) {
                MakeStairString(buf,strLevel,strChangeLine,root.getChildAt(i),Tags,Betweens,0);
            }
        }else if (that.isContainer) {
            buf.append(Tags.get(that.start));
            buf.append(strChangeLine);
            for (int i=0; i<level+1; i++) {
                buf.append(strLevel);
            }
            buf.append(Betweens.get(that.start));
            buf.append(strChangeLine);
            for (int i=0; i< root.getChildCount(); i++) {
                MakeStairString(buf,strLevel,strChangeLine,root.getChildAt(i),Tags,Betweens,level+1);
            }
            for (int i=0; i<level; i++) {
                buf.append(strLevel);
            }            
            buf.append(Tags.get(that.end));
            buf.append(strChangeLine);
        }else {
            if (that.start==that.end) {
                //this is a singular tag... like <p/>
                for (int i=0; i<level; i++) buf.append(strLevel);
                buf.append(Tags.get(that.start)+strChangeLine);
                if (Betweens.get(that.start).length()>0) {
                    for (int i=0; i<level; i++) buf.append(strLevel);
                    buf.append(Betweens.get(that.start).trim()+strChangeLine);
                }
            }else {
                //this is a non-container tag... like <title>abc</title>
                for (int i=0; i<level; i++)  buf.append(strLevel);
                for (int j=that.start; j<=that.end; j++) {
                    buf.append(Tags.get(j)+ (Betweens.get(j).trim()));
                }
                buf.append(strChangeLine);                
            }
        }
    }
    
    public void BuildTree(Vector<TagPair> all) {        
        Vector<TagPair> Hand=new Vector<TagPair>();  
        for (TagPair t:all) { Hand.add(t); }   //��All_TagPairsCopy��Hand
        DefaultMutableTreeNode root=new DefaultMutableTreeNode(); 
        MyTree=new DefaultTreeModel(root,false);
        TagPair first=Hand.get(0);
        Hand.remove(0);
        DefaultMutableTreeNode newNode=new DefaultMutableTreeNode(first);
        root.add(newNode);
        while(Hand.size()>0) {
            TagPair that=Hand.get(0);
            Hand.remove(0);
            DefaultMutableTreeNode ins_pos=Deepest_Search(root,that);
            ins_pos.add(new DefaultMutableTreeNode(that));
        }                                       
    }
    private DefaultMutableTreeNode Deepest_Search(DefaultMutableTreeNode root,TagPair newTP) {
        if (root.getChildCount()==0)
            return root;
         for (int i=0; i<root.getChildCount(); i++) {
             DefaultMutableTreeNode node =(DefaultMutableTreeNode) root.getChildAt(i);
             TagPair t=(TagPair) node.getUserObject();
             if (t.start< newTP.start && t.end>newTP.end ) {
                 return Deepest_Search( node, newTP);
             }
         }
         return root;
    }
    
}
