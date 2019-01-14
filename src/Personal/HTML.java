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
    //很可能是Javascript裡面的註解
    public Vector<Pair> CommentArea;
    //很可能是全部的左角括號
    public Vector<Integer> Left;
    //很可能是全部的右角括號
    public Vector<Integer> Right;
    //很可能是全部的
    public Vector<Integer> LeftOrRight;
    
    public void PrintIssues() {
        System.out.println("DQArea="+DQArea.toString());
        System.out.println("SQArea="+SQArea.toString());
        System.out.println("CommentArea="+CommentArea.toString());
        System.out.println("Left="+Left.toString());
        System.out.println("Right="+Right.toString());
        System.out.println("LeftOrRight="+LeftOrRight.toString());
    }
    public HTML(StringBuffer inn) {
        MyText = inn;
        Main.refineStringBuffer(MyText);
    }

    public void go() {
        DQArea = new Vector<Pair>();
        SQArea = new Vector<Pair>();
        CommentArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(MyText, DQArea);
        JspStatic3.Build_SQ_Area(MyText, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_in_CommentArea();
        Left = new Vector<Integer>();
        Right = new Vector<Integer>();
        LeftOrRight = new Vector<Integer>();
        Build_Left_and_Right(MyText);
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

    public void Build_Left_and_Right(StringBuffer inn) {
        final int StringLength = inn.length();
        boolean flag_in_js = false;
        boolean flag_in_jsp = false;
        boolean flag_in_htmlComment=false;
        for (int i = 0; i < StringLength; i++) {
            if (Main.In(i, DQArea) || Main.In(i, SQArea) || Main.In(i, CommentArea)) {
                continue;
            }
            if (inn.substring(i).startsWith("<%")) {
                flag_in_jsp = true;
                Left.add(i);
            } else if (inn.substring(i).startsWith("%>")) {
                flag_in_jsp = false; 
                Right.add(i+1);
                i+=1;   
                continue;
            }
            if (inn.substring(i).startsWith("<!--")) {
                flag_in_htmlComment=true;
                Left.add(i);
            }else if (inn.substring(i).startsWith("-->")) {
                flag_in_htmlComment=false;
                Right.add(i+2);
                i+=2;                
                continue;
            }
            String hand = inn.substring(i).toLowerCase();
            if (hand.startsWith("<script")) {
                flag_in_js = true;
                Left.add(i);
                while(inn.charAt(i)!='>' ) {
                    i++;
                }
                Right.add(i);
            } else if (hand.startsWith("</script")) {
                flag_in_js = false;
                Left.add(i);
                while(inn.charAt(i)!='>') {
                    i++;                    
                }
                Right.add(i);
                continue;
            }
            
            if (!flag_in_js && !flag_in_jsp && !flag_in_htmlComment) {
                if (inn.charAt(i) == '<') {
                    Left.add(i);
                } else if (inn.charAt(i) == '>') {
                    Right.add(i);
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

}
