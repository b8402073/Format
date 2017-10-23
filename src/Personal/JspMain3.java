/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;


/**
 *
 * @author easterday
 */
public class JspMain3 extends JspStatic3{
    public JspMain3(StringBuffer Text) {  
        super();
        MyText = GetMyText(Text);
        init();
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea);
        
        sHead="#####";
        sLv="   ";        
    }
    
    
}
