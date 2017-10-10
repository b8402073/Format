/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author easterday
 */
public class CompoundStack {
    private Vector< Stack<Integer> > Hand;
    public CompoundStack() {
        Stack<Integer> first=new Stack<Integer>();
        Hand.add(first);
    }
    public void meetLeft() {
        for (int i=0; i<Hand.size(); i++) {
            Stack<Integer> that=Hand.get(i);
            that.push(0);
        }
    }
    public void meetRight() {
        for (int i=0; i<Hand.size(); i++) {
            Stack<Integer> that=Hand.get(i);
            that.pop();
        }
        for (int i=Hand.size()-1; i>0; i--) {
            if (Hand.get(i).isEmpty()) {
                Hand.removeElementAt(i);
                break;
            }
        }
    }
    public void meetClassAndLeft() {
        meetLeft();
        Hand.add(new Stack<Integer>());
    }
    public boolean OK_for_FunctionHeader() {
        for (int i=Hand.size()-1; i>=0; i--) {
            if (Hand.get(i).isEmpty())
                return true;
        }
        return false;
    }
    
    
    
}
