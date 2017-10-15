/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Vector;

/**
 * �bJspStatic�̭��p��Y�Ӧa��i���i�H��Funcion���e��;
 * ��k���I����,���O��������z��
 * �{�b�g�L��}�i�H�P��������GetClassBase�MGetFuncBase
 * 
 * @author easterday
 */
public class ComplexStack {
    /***
     * ��W�����
     */
    private  Stack<TextLevel>  Hand;
    /***
     * �غc�l
     * �p�G���@�ӪŪ�JspStatic����,�h�إߤ@�Ӥ@�}�l�N�i�H��Function������
     */
    public ComplexStack(boolean addMother) {
        Hand=new Stack<TextLevel>();
        if (addMother)
            Hand.push(new TextLevel("Class",FocusPair.MotherFocusPair,0));
    }
    /***
     * �J�쥪�A��,�N��{�����C�@�Ӱ��|����W�@��0
     * (���s�aclass�����A���n�S�O�B�z)
     */
    public void meetLeft(TextLevel newTL) {
            Hand.push(newTL);        
    }
    /***
     * �J��k�A��,�p�G�̫�@�Ӱ��|���ūh�R��
     * �M��N�n��{�����C�@�Ӱ��|��Pop�@��0
     * �S���ҥ~
     */
    public void meetRight() {
        if (Hand.get(Hand.size()-1).isEmpty()) {
            Hand.removeElementAt(Hand.size()-1);
        }
        for (int i=0; i<Hand.size(); i++) {
            Hand.get(i).pop();
        }
    }
    /***
     * �J��a��Class�����A��,�n����{�����|��Push�@��0
     * �M��A�h�@�ӪŰ��|(�o�ˤ~��j���{�b���a��i�H��JFunction)
     */
    public void meetClassAndLeft(TextLevel newTL) {
        Hand.add(new Stack<TextLevel>());
        meetLeft(newTL);
    }
    /***
     * �p�G�̫᪺���|����,�h�i�H�[�JFunction,�Ǧ^true
     * �_�h�Ǧ^false
     * @return      true or false
     */
    public boolean OK_for_NewFunctionHeader() {
        for (int i=Hand.size()-1; i>=0; i--) {
            if (Hand.get(i).size()==1);
                return true;
        }
        return false;
    }
    /***
     * ��CompoundStack�r���
     * @return      ��ܦU�Ӥp���|��0���Ӽ�
     */
    public String toString() {
        StringBuffer ret=new StringBuffer("[");
        for (int i=0; i<Hand.size(); i++) {
            ret.append(Hand.get(i).size());
            ret.append(' ');
        }
        ret.append(']');
        return ret.toString();
    }
    
    
}
