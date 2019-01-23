/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH10;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP1001B {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<h2>動態含括(有參數)--called page</h2>\n" +
"2nd JSP文件 (called page)<p>\n" +
"<% \n" +
"  String strName = request.getParameter(\"strName\");\n" +
"  out.println(\"哈囉！我知道您是 <b>\" + strName + \"</b><p>\");\n" +
"  out.println(\"2nd JSP文件結束<hr>\");\n" +
"%>";
    public StringBuffer buf1001B;    
    public TestJSP1001B() {
        buf1001B=new StringBuffer(jsp);
    }
    @Test
    public void test1001B() {
        HTML that=new HTML(buf1001B);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
