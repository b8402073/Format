/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Vector;

/**
 * �W���M��Main class�̭��g�F�@�j�藍���Ҥ����F�誺�ڥ���]�O�]��
 * ���HTML tag���B�z���@�I���T�w�ҥH�N....�üg�@�q
 * �o���ڨM�w��Tag���������: Container / Not Container
 * Container tag: �����ˤ@�w�n�Y�ơF�p�G�����e�N���C�X�ӴN�n
 * Not Container: �N�C�X�ӴN�n
 * ����٦�<Script></Script>�o�ثܳ·Ъ�tag;  
 * ���O�ڭ̥��ܳ�ª��u��o��tag�C�X�ӴN�n
 * @author easterday
 */
public class HTML {

    public final StringBuffer MyText;
    public Vector<Pair> DQArea;
    public Vector<Pair> SQArea;
    public Vector<Pair> CommentArea;
    public Vector<Integer> Left;
    public Vector<Integer> Right;
    public Vector<Integer> LeftOrRight;

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

    
}
