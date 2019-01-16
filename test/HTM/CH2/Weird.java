/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.CH2;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * E:/WEBAPPS/JSP_2/CH02/2-07.jsp 跟 2-06.jsp一樣
 * 所以不做重複的測試
 * 這裡測一些比較特別的東西
 * @author easterday
 */
public class Weird {
    String str="<%        char oldChar='\\'';\n" +
"         char newChar='\"';\n" +
"         StringBuffer exp=new StringBuffer(str.replace(oldChar,newChar));\n" +
"         System.out.println(\"GGYY\");  %>";
    
    public Weird() {
        System.out.println(str);
    }

    // TODO add test methods here. 
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         HTML that=new HTML(new StringBuffer(str));
         that.go();
         that.PrintIssues();
         TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"GGYY"};
        String[] txtSQ={"'\''","'\"'"};
        String S="<%        char oldChar='\\'';\n" +"         char newChar='\"';\n" +
"         StringBuffer exp=new StringBuffer(str.replace(oldChar,newChar));\n" +"         System.out.println(\"GGYY\");  %>";        
        String[] txtTag={S};
        ///////////////////////////////////////////////////////
        TestHTM1.assertDQ(that,txtDQ,false); 
     }
}
