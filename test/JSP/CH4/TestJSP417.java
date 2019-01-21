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
public class TestJSP417 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>String類別</h2>\n" +
"<%\n" +
"   String strSaying1 = \"Time is never enough!\";\n" +
"   String strSaying2 = \"NEVER GIVE UP!\";\n" +
"   double dblPi = 3.14159;\n" +
"   String strPi;\n" +
"   long i;\n" +
"   String strI = \"999999999\";\n" +
"\n" +
"   strPi = String.valueOf(dblPi);\n" +
"   i = Long.parseLong(strI);\n" +
"\n" +
"   out.println(\"strSaying1原始字串: <b>\" + strSaying1 + \"</b><br>\");\n" +
"   out.println(\"toUpperCase(strSaying1): <b>\" + strSaying1.toUpperCase() + \"</b><p>\");\n" +
"   out.println(\"strSaying2原始字串: <b>\" + strSaying2 + \"</b><br>\");\n" +
"   out.println(\"toLowerCase(strSaying2): <b>\" + strSaying2.toLowerCase() + \"</b><p>\");\n" +
"   //\n" +
"   out.println(\"strPi = <b>\" + strPi + \"</b><p>\");\n" +
"   out.println(\"long i = <b>\" + i + \"</b><br>\");\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf417;
    public TestJSP417() {
        buf417=new StringBuffer(jsp);
    }
    @Test
    public void test417() {
        HTML that=new HTML(buf417);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
