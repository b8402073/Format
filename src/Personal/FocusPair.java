/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Vector;

/**
 *
 * @author easterday
 */
public final class FocusPair {
    public final Integer i_start,i_end;
    public FocusPair(Integer start,Integer end) {
        i_start=start; i_end=end;
    }
    public Integer getStart() {
        return i_start;
    }
    public Integer getend() {
        return i_end;
    }
    public String toString(Vector<Focus> focus) {
        StringBuffer ret=new StringBuffer();
        for (int i=i_start; i<=i_end-1; i++) {
            ret.append(focus.get(i).getString()+" ");
        }
        ret.append(focus.get(i_end).getString());
        return ret.toString();
    }
    
}
