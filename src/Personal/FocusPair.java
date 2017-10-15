/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Optional;
import java.util.Vector;

/**
 * FocusPair�N�O����Focus����m��b�@�_
 * @author easterday
 */
public final class FocusPair {
    /***
     * �}�l��m/������m
     */
    public final Integer i_start,i_end;
    /***
     * �غc�l
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
     * �r���{��
     * @param focus     ������Focus��C
     * @return          ��r��H�ťզ걵��_�� ex. "int","A","=","5",";" --> "int A = 5 ;"
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
     * �M�Ω�catch����r���r��B�z
     * @param focus     �������r���C
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
    public final static FocusPair MotherFocusPair=new FocusPair(0,-1);   //��̮ܳڥ����@�ӽd��
    public boolean isMother() {
        if (this==MotherFocusPair) {
            return true;
        }
        return false;
    }
    
}
