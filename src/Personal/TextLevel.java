/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 * 紀錄某個位置的Level應該重設為多少,在JspStatic.Make()裡面使用
 * @author easterday
 */
public class TextLevel {
    public final String     Type;
    public final FocusPair  StartToEnd;
    public final int Level;
    public TextLevel(String type,FocusPair that,int level) {
        Type=type;StartToEnd=that; Level=level;
    }
    public String toString() {
        String ret=Type+"# Level="+Level+StartToEnd.toString();
        return ret;
    }
}
