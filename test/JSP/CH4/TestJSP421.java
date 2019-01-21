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
public class TestJSP421 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>搜尋字串</h2>\n" +
"<%\n" +
"   String strT1 = \"今天->風雨交加!\";\n" +
"   String strT2 = \"希望@明天 是個好天氣!\";\n" +
"   //\n" +
"   out.println(\"strT1 = \" + strT1 + \"<br>\");\n" +
"   out.println(\"strT2 = \" + strT2 + \"<hr>\");\n" +
"   //搜尋特定字元\n" +
"   int intPos = strT2.indexOf(\"@\", 0);\n" +
"   if (intPos == -1)   //not found\n" +
"     out.println(\"strT2 不包含 '@' 字元!<hr>\");\n" +
"   else\n" +
"     out.println(\"strT2 內含 '@' 字元!<hr>\");\n" +
"   //\n" +
"   intPos = strT1.indexOf(\"->\");\n" +
"   out.println(\"-> 是從 strT1 的第 \" + (intPos + 1) + \"個字元 (\");\n" +
"   out.println(\"索引值是 \" + intPos + \") 算起 !<br>\");\n" +
"\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf421;
    public TestJSP421() {
        buf421=new StringBuffer(jsp);
    }
    @Test
    public void test421() {
        HTML that=new HTML(buf421);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
