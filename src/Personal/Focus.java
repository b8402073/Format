/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *  �t�XGetOneToken����Ƶ��c
 * @author easterday
 */
public class Focus {
    public String RetString;
    public int    NextCharPos;
    public Focus(String s,int pos) {
        RetString=s;NextCharPos=pos;
    }
    public String toString() {
        String ret=String.format("RetString=#%s#  NextCharPos=%d", RetString,NextCharPos);
        return ret;
    }
}
