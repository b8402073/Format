/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Optional;
import java.util.Vector;

/**
 * FocusPair就是把兩個Focus的位置放在一起
 * @author easterday
 */
public final class FocusPair {
    /***
     * 開始位置/結束位置
     */
    public final Integer i_start,i_end;
    /***
     * 建構子
     * @param start
     * @param end 
     */
    public FocusPair(Integer start,Integer end) {
        i_start=start; i_end=end;
    }
    public Integer getStart() {
        return i_start;
    }
    public Integer getEnd() {
        return i_end;
    }
    /****
     * 字串表現式
     * @param focus     全部的Focus串列
     * @return          把字串以空白串接串起來 ex. "int","A","=","5",";" --> "int A = 5 ;"
     */
    public String toString(Vector<Focus> focus) {
        StringBuffer ret=new StringBuffer();
        int StartPos,EndPos;
        if (!isMother())  {
            StartPos=i_start; EndPos=i_end;
        }else {
            StartPos=0; EndPos=focus.size()-1;
        }        
        for (int i=StartPos; i<=EndPos; i++) {
            ret.append(focus.get(i).getString()+" ");
        }
        ret.append(focus.get(i_end).getString());
        return ret.toString();
    }
    /***
     * 專用於catch關鍵字的字串處理
     * @param focus     全部的字串串列
     * @return          "("+Element1+" "+Element2+")"
     */
    public Optional<String> toCatchString(Vector<Focus> focus) {
        if (i_end- i_start==3) {
            if ("(".equals(focus.get(i_start).getString())  &&
                ")".equals(focus.get(i_end).getString()) ) {
                String Element1=focus.get(i_start+1).getString();
                String Element2=focus.get(i_start+2).getString();
                return Optional.of("("+Element1+" "+Element2+")");
            }            
        }
        return Optional.empty();
    }
    public final static FocusPair MotherFocusPair=new FocusPair(0,-1);   //表示最根本的一個範圍
    public boolean isMother() {
        if (this==MotherFocusPair) {
            return true;
        }
        return false;
    }
    
}
