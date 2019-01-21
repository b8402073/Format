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
public class TestJSP422 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>场﹃</h2>\n" +
"<%\n" +
"   String strT1 = \"иΤ虫ま腹 '\";\n" +
"   String strT2 = \"の传︽才腹 !\\n\";\n" +
"   //\n" +
"   out.println(\"strT1 = \" + strT1 + \"<br>\");\n" +
"   out.println(\"strT2 = \" + strT2 + \"<hr>\");\n" +
"   //疭﹚じ\n" +
"   String strT11 = strT1.replace(\"'\", \"''\");\n" +
"   out.println(\"strT1 传Θㄢ虫ま腹 -> \" + strT11 + \"<hr>\");\n" +
"   //疭﹚じ\n" +
"   String strT21 = strT2.replace(\"\\n\", \"<br>\");\n" +
"   out.println(\"strT2 传ΘHTML传︽才腹 -> \" + strT21);\n" +
"\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf422;
    public TestJSP422() {
        buf422=new StringBuffer(jsp);
    }
    @Test
    public void test422() {
        HTML that=new HTML(buf422);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
