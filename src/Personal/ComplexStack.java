/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Vector;

/**
 * 在JspStatic裡面計算某個地方可不可以放Funcion的容器;
 * 算法有點複雜,但是不算太難理解
 * 現在經過改良可以同時幫忙算GetClassBase和GetFuncBase
 * 
 * @author easterday
 */
public class ComplexStack {
    /***
     * 手上的資料
     */
    private  Stack<TextLevel>  Hand;
    /***
     * 建構子
     * 如果有一個空的JspStatic物件,則建立一個一開始就可以放Function的環境
     */
    public ComplexStack(boolean addMother) {
        Hand=new Stack<TextLevel>();
        if (addMother)
            Hand.push(new TextLevel("Class",FocusPair.MotherFocusPair,0));
    }
    /***
     * 遇到左括號,就把現有的每一個堆疊都堆上一個0
     * (有連帶class的左括號要特別處理)
     */
    public void meetLeft(TextLevel newTL) {
            Hand.push(newTL);        
    }
    /***
     * 遇到右括號,如果最後一個堆疊為空則刪除
     * 然後就要把現有的每一個堆疊都Pop一個0
     * 沒有例外
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
     * 遇到帶有Class的左括號,要先把現有堆疊都Push一個0
     * 然後再多一個空堆疊(這樣才能強迫現在的地方可以放入Function)
     */
    public void meetClassAndLeft(TextLevel newTL) {
        Hand.add(new Stack<TextLevel>());
        meetLeft(newTL);
    }
    /***
     * 如果最後的堆疊為空,則可以加入Function,傳回true
     * 否則傳回false
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
     * 把CompoundStack字串化
     * @return      顯示各個小堆疊的0的個數
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
