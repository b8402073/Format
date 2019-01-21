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
public class TestJSP404 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>九九乘法表 (4-04.jsp)</h2>\n" +
"<%\n" +
"final int cntMax = 9;\n" +
"int i, j;\n" +
"//\n" +
"out.println(\"<table boder=1 width='90%'>\");\n" +
"out.println(\"<tr align='center' bgcolor='lightblue'>\");\n" +
"out.println(\"<td>　</td>\");\n" +
"for (i = 2; i <= cntMax; i++) {\n" +
"  out.println(\"<td>\" + i + \"</td>\");\n" +
"}\n" +
"out.println(\"</tr>\");\n" +
"\n" +
"i = 1;   //改變i之內容值\n" +
"do {     //迴圈會進行9次\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td align='center' bgcolor='lightblue'>\");\n" +
"  out.println(i + \"</td>\");\n" +
"  for (j = 2; j <= cntMax; j++) {\n" +
"    out.println(\"<td align='center'>\" + i * j + \"</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  i++;\n" +
"} while (i <= cntMax);\n" +
"//\n" +
"out.println(\"</table>\");\n" +
"%>";
    public StringBuffer buf404;
    public TestJSP404() {
        buf404=new StringBuffer(jsp);
    }
    @Test
    public void test404() {
        HTML that=new HTML(buf404);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
    
}
