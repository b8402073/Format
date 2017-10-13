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
    public final int FocusPos;          
    public final int Level;
    public TextLevel(int focus_pos,int level) {
        FocusPos=focus_pos; Level=level;
    }
}
