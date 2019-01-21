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
public class TestJSP420 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>部份字串的取得</h2>\n" +
"<%\n" +
"   String strT1 = \"Happy summer vacation!\";\n" +
"   String strT2 = \"Well, I really miss it.\";\n" +
"   //\n" +
"   out.println(\"strT1 = \" + strT1 + \"<br>\");\n" +
"   out.println(\"strT2 = \" + strT2 + \"<hr>\");\n" +
"   //取得特定字元\n" +
"   char chrA = strT1.charAt(7);\n" +
"   out.println(\"strT1 索引值 7 的字元是 -> \" + chrA + \"<hr>\");\n" +
"   //\n" +
"   String strSub1 = strT1.substring(6);\n" +
"   out.println(\"strT1 索引值 6 之後的字串是 -> \" + strSub1 + \"<p>\");\n" +
"   //\n" +
"   int intL = strT2.length() - 1;\n" +
"   String strSub2 = strT2.substring(6, intL);\n" +
"   out.println(\"strT2 索引值 6 到 \" + intL);\n" +
"   out.println(\" 之間的字串是 -> \" + strSub2 + \"<br>\");\n" +
"\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf420;
    public TestJSP420() {
        buf420=new StringBuffer(jsp);
    }
    @Test
    public void test420() {
        HTML that=new HTML(buf420);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
