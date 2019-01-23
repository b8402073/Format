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
public class TestJSP1017 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>使用第一個JavaBean</title></head>\n" +
"<body>\n" +
"<h2>使用第一個JavaBean</h2>\n" +
"&lt;jsp:useBean&gt;動作標記: show Hi<p>\n" +
"<jsp:useBean id=\"beanHi\" class=\"bean.showHi\" scope=\"page\" />\n" +
"<%\n" +
"  String strMsg = beanHi.showHi(\"Alvin Liao\");\n" +
"  out.println(\"<b>\" + strMsg + \"</b><p>\");\n" +
"  strMsg = beanHi.showHi(\"廖信彥\");\n" +
"  out.println(\"<b>\" + strMsg + \"</b><br><hr>\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1017;    
    public TestJSP1017() {
        buf1017=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf1017);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
