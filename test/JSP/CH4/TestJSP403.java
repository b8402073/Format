/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH4;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP403 {
    public String jsp="<h2>for loop -- 4-03.jsp</h2>\n" +
"<%\n" +
"final String cntMsg = \"Hello, JSP world!\";\n" +
"int i;\n" +
"String strMsg;\n" +
"//迴圈會進行7次 (2~8)\n" +
"for (i = 2; i < 9; i++) {\n" +
"  strMsg = \"<font size=\" + i + \">\" + cntMsg + \"</font><br>\";\n" +
"  out.println(strMsg);\n" +
"}\n" +
"%>\n" +
"<hr>";
    public StringBuffer buf403;
    public TestJSP403() {
        buf403=new StringBuffer(jsp);
    }
    @Test
    public void test403() {
        HTML that=new HTML(buf403);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
