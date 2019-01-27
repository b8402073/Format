/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Collections;
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
    
    public void PrintIssues() {
        System.out.println("DQArea="+DQArea.toString());
        System.out.println("SQArea="+SQArea.toString());
        System.out.println("CommentArea="+CommentArea.toString());
        System.out.println("Left="+Left.toString());
        System.out.println("Right="+Right.toString());
        System.out.println("LeftOrRight="+LeftOrRight.toString());
        System.out.println("Radical="+Radical.toString());
        System.out.println("UnFinished="+UnFinished.toString());        
    }
    public HTML(StringBuffer inn) {
        MyText = inn;
        Main.refineStringBuffer(MyText);
    }

    public void go() {
        DQArea = new Vector<Pair>();
        SQArea = new Vector<Pair>();
        CommentArea = new Vector<Pair>();
        Radical=new Vector<Integer>();
        UnFinished=new Vector<Integer>();
        JspStatic3.Build_DQ_Area(MyText, DQArea);
        JspStatic3.Build_SQ_Area(MyText, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_in_CommentArea();
        Left = new Vector<Integer>();
        Right = new Vector<Integer>();
        LeftOrRight = new Vector<Integer>();
        Build_Left_and_Right_Radical_UnFinished(MyText);
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

    public void Build_Left_and_Right_Radical_UnFinished(StringBuffer inn) {
        final int StringLength = inn.length();
        boolean flag_in_js = false;
        boolean flag_in_jsp = false;
        boolean flag_in_htmlComment=false;
        boolean flag_in_pre=false;
        boolean flag_in_style=false;
        for (int i = 0; i < StringLength; i++) {
            if (inn.substring(i).startsWith("<!--")) {
                flag_in_htmlComment=true;
                if (Right.size()<Left.size())
                    UnFinished.add(Left.get(Left.size()-1));
                Left.add(i);
            }else if (inn.substring(i).startsWith("-->")) {
                if (Left.size()==Right.size()) {
                    //這個東西是游離子
                    Radical.add(i+2); i+=2;
                }else if (Right.size()<Left.size()) {
                    flag_in_htmlComment=false;                    
                    Right.add(i+2);   i+=2;
                }                    
                continue;
            }
            
            if (Main.In(i, DQArea) || Main.In(i, SQArea) || Main.In(i, CommentArea)) {
                continue;
            }
            if (inn.substring(i).startsWith("<%")) {
                flag_in_jsp = true;
                if (Right.size()<Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }
                Left.add(i);
            } else if (inn.substring(i).startsWith("%>")) {
                if (Left.size()==Right.size()) {
                    //這個東西是游離子
                    Radical.add(i+1);  i+=1;
                }else if (Right.size()<Left.size()) {
                    flag_in_jsp = false; 
                    Right.add(i+1);    i+=1;                       
                }
                continue;
            }
            String hand = inn.substring(i).toLowerCase();
            if (hand.startsWith("<script")) {
                flag_in_js = true;
                if (Right.size()<Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }                
                Left.add(i);
                while(inn.charAt(i)!='>' || Main.In(i, DQArea) || Main.In(i, DQArea) ) {
                    i++;
                }
                Right.add(i);
            } else if (hand.startsWith("</script")) {
                flag_in_js = false;
                if (Right.size()<Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }
                Left.add(i);
                while(inn.charAt(i)!='>' || Main.In(i, DQArea) || Main.In(i, SQArea)) {
                    i++;                    
                }
                Right.add(i);
                continue;
            }else if (hand.startsWith("<pre")) {
                flag_in_pre=true;
                if (Right.size()<Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }
                Left.add(i);
                while(inn.charAt(i)!='>' || Main.In(i, DQArea) || Main.In(i, SQArea)) {
                    i++;
                }
                Right.add(i); continue;
            }else if (hand.startsWith("</pre")) {
                flag_in_pre=false;
                if (Right.size()< Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }
                Left.add(i);
                while(inn.charAt(i)!='>'  || Main.In(i, DQArea) || Main.In(i, SQArea)) {
                    i++;
                }
                Right.add(i); continue;
            }else if (hand.startsWith("<style")) {
                flag_in_style=true;
                if (Right.size()< Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }                
                Left.add(i);
                while(inn.charAt(i)!='>' || Main.In(i, DQArea) || Main.In(i, SQArea) ) {
                    i++;
                }
                Right.add(i); continue;
            }else if ((hand.startsWith("</style"))) {
                flag_in_style=false;
                if (Right.size()< Left.size()) {
                    UnFinished.add(Left.get(Left.size()-1));
                }                 
                Left.add(i);
                while(inn.charAt(i)!='>' || Main.In(i, DQArea) || Main.In(i, SQArea)) {
                    i++;
                }
                Right.add(i); continue;
            }
            
            if (!flag_in_js && !flag_in_jsp && !flag_in_htmlComment 
                    && !flag_in_pre && !flag_in_style) {
                if (inn.charAt(i) == '<') {
                    if (i+1<StringLength && !Character.isWhitespace(inn.charAt(i+1)) ) {
                        Left.add(i); 
                        for (i+=1; i<StringLength;i++) {
                            if (i+1<StringLength && inn.charAt(i)=='<'  && 
                                    !Character.isWhitespace(inn.charAt(i+1)) &&
                                    !Main.In(i,DQArea) &&
                                    !Main.In(i, SQArea)) {
                                if (Right.size()< Left.size()) {
                                    UnFinished.add(Left.get(Left.size()-1));
                                }
                                Left.add(i);
                            }                                                       
                            if (inn.charAt(i)=='>' && !Main.In(i, DQArea) && !Main.In(i, SQArea)) {
                                Right.add(i);break;
                            }
                        }
                    }else {
                        Radical.add(i); //紀錄游離子
                    }
                } else if (inn.charAt(i) == '>') { //紀錄游離子
                    Radical.add(i);
                } else if (inn.charAt(i)=='\"') {//紀錄游離子
                    Radical.add(i);
                } else if (inn.charAt(i)=='\'')  {//紀錄游離子
                    Radical.add(i);
                }
            
            }
        }
        for (Integer e:Left) {
            LeftOrRight.add(e);
        }
        for (Integer e:Right) {
            LeftOrRight.add(e);
        }
        Collections.sort(LeftOrRight);
    }
    public Vector<String> GetAllTags() {
        Vector<String> ret=new Vector<String>();
        for (int i=0; i<LeftOrRight.size(); i++) {
            int Start= LeftOrRight.get(i);
            int End=(-1);
            if (i+1<= LeftOrRight.size()-1 )
                End=LeftOrRight.get(i+1);
            if (MyText.charAt(Start)=='<') {
                if (MyText.charAt(End)=='>') {
                    ret.add(Main.ToSTR(new Pair(Start,End), MyText));
                }else if (MyText.charAt(End)=='<') {
                    ret.add(Main.ToSTR(new Pair(Start,End-1), MyText));
                }else {
                    assert(false);
                }
            }
        }
        return ret;
    }
    public Vector<String> GetAllBetween() {
        Vector<String> ret=new Vector<String>();
        for (int i=0; i<LeftOrRight.size(); i++) {
            if (MyText.charAt(LeftOrRight.get(i))=='>' && i+1<=LeftOrRight.size()-1) {
                if (MyText.charAt(LeftOrRight.get(i+1))=='<') {
                    ret.add(MyText.substring(LeftOrRight.get(i)+1, LeftOrRight.get(i+1)));
                }
            }
        }
        return ret;
    }
}
