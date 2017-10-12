/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *  配合GetOneToken的資料結構
 *  
 * @author easterday
 */
public class Focus {
    /***
     * 相對於文本的開始位置
     */
    public final int    StartPos;
    /***
     * 程式碼的字串
     */
    public final String RetString;
    /***
     * 下一個Token(或稱Focus)應該往哪一個位置搜尋
     */
    public final int    NextCharPos;
    /***
     * 建構式
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
     * 字串表現式
     * @return 
     */
    public String toString() {
        String ret=String.format("RetString=#%s#  S=%d NextCharPos=%d", RetString,StartPos,NextCharPos);
        return ret;
    }
    /****
     * 取得RetString
     * @return 
     */
    public String getString() {        return RetString;    }
}
