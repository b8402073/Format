/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH3;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP309 {
    String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>除法運算</h2>\n" +
"<%\n" +
"int intWidth = 5;\n" +
"int intLength = 10;\n" +
"int intArea = intWidth * intLength;  //50\n" +
"out.println(\"長 = \" + intLength + \", 寬 = \" + intWidth + \", \");\n" +
"out.println(\"面積 = \" + intArea + \"<p>\");\n" +
"int intHeight = 170;\n" +
"double dblWeight = (intHeight - 110) * 9 / 11;\n" +
"out.println(\"身高 = \" + intHeight + \", 建議體重為 -> \" + dblWeight + \"<hr>\");\n" +
"%>";
    public StringBuffer buf309;
    public TestJSP309() {
        buf309=new StringBuffer(jsp);
    }
    
    @Test
    public void test309() {
        HTML that=new HTML(buf309);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
