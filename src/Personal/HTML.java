/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Collections;
import java.util.Vector;

/**
 * �W���M��Main class�̭��g�F�@�j�藍���Ҥ����F�誺�ڥ���]�O�]�� ���HTML tag���B�z���@�I���T�w�ҥH�N....�üg�@�q
 * �o���ڨM�w��Tag���������: Container / Not Container Container tag:
 * �����ˤ@�w�n�Y�ơF�p�G�����e�N���C�X�ӴN�n Not Container: �N�C�X�ӴN�n ����٦�<Script></Script>�o�ثܳ·Ъ�tag;
 * ���O�ڭ̥��ܳ�ª��u��o��tag�C�X�ӴN�n
 *
 * @author easterday
 */
public class HTML {

    //Ū�i�Ӫ��@���ɮ�
    public final StringBuffer MyText;
    //�ܥi��OHTML�̭���Attribute�άOJavaScript���r��
    public Vector<Pair> DQArea;
    //�ܥi��OHTML�̭���Attribute�άOJavascript���r��
    public Vector<Pair> SQArea;
    //�ܥi��OJavascript�̭�������
    public Vector<Pair> CommentArea;
    //�ܥi��O�����������A��
    public Vector<Integer> Left;
    //�ܥi��O�������k���A��
    public Vector<Integer> Right;
    //�ܥi��O������
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
