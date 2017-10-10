/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *  配合GetOneToken的資料結構
 * @author easterday
 */
public class Focus {
    public final int    StartPos;
    public final String RetString;
    public final int    NextCharPos;
    public Focus(String s,int start,int pos) {
        RetString=s;
        StartPos=start;
        NextCharPos=pos;
    }
    public String toString() {
        String ret=String.format("RetString=#%s#  S=%d NextCharPos=%d", RetString,StartPos,NextCharPos);
        return ret;
    }
    public String getString() {        return RetString;    }
}
