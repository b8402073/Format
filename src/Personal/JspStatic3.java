/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;

/**
 *
 * @author easterday
 */
public class JspStatic3 extends JspStatic {
    public static LineType ClassType=LineType.NEXT_LINE;
    public static LineType FuncType=LineType.AFTER_LINE;
    public static LineType OtherType=LineType.AFTER_LINE;
        
    
    public JspStatic3(StringBuffer Text) {
        super(Text);
        sHead="#####";
        sLv="   ";
    }
    public StringBuffer Make3() {
        Stack<TextLevel> Complex=new Stack<TextLevel>();
        StringBuffer ret=new StringBuffer();
        int Level=0;
        int i=0;
        try {
            
        }catch(Exception ex) {
            
        }
        
        
        return ret;
    }
    
}
