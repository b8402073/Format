/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *  �t�XGetOneToken����Ƶ��c
 *  
 * @author easterday
 */
public class Focus {
    /***
     * �۹��奻���}�l��m
     */
    public final int    StartPos;
    /***
     * �{���X���r��
     */
    public final String RetString;
    /***
     * �U�@��Token(�κ�Focus)���ө����@�Ӧ�m�j�M
     */
    public final int    NextCharPos;
    /***
     * �غc��
     * @param s
     * @param start
     * @param pos 
     */
    public Focus(String s,int start,int pos) {
        RetString=s;
        StartPos=start;
        NextCharPos=pos;
    }
    /***
     * �r���{��
     * @return 
     */
    public String toString() {
        String ret=String.format("RetString=#%s#  S=%d NextCharPos=%d", RetString,StartPos,NextCharPos);
        return ret;
    }
    /****
     * ���oRetString
     * @return 
     */
    public String getString() {        return RetString;    }
}
