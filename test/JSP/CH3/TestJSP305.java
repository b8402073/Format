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
public class TestJSP305 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>強迫型別轉換</h2>\n" +
"<%\n" +
"int x = 127;\n" +
"int y = 2;\n" +
"out.println(\"x = \" + x + \", y = \" + y + \"<p>\");\n" +
"out.println(\"x/y = \" + x/y + \"<p>\");\n" +
"out.println(\"(float) x/y = \" + (float) x/y + \"<hr>\");\n" +
"%>";
    public StringBuffer buf305;
    public TestJSP305() {
        buf305=new StringBuffer(jsp);
    }
    @Test
    public void testJSP305() {
        HTML that=new HTML(buf305);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
