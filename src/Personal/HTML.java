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
public class HTML {
    public final StringBuffer MyText;
    public Vector<Pair> DQArea;
    public Vector<Pair> SQArea;
    public Vector<Pair> CommentArea;
    public Vector<Integer> Left;
    public Vector<Integer> Right;
    public Vector<Integer> LeftOrRight;
    
    
    
    
    public HTML(StringBuffer inn) {
        MyText=inn;
        Main.refineStringBuffer(MyText);                
    }
    public void go() {
        
    }
    
}
