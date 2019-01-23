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
public class TestJSP1003 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>載入Java applet</title></head>\n" +
"<body>\n" +
"<h2>載入Java applet</h2>\n" +
"&lt;jsp:plugin&gt;動作標記: 顯示作者姓名<p>\n" +
"<jsp:plugin type=\"applet\" code=\"showMsg.class\" height=\"100\" width=\"400\" >\n" +
"  <jsp:params>\n" +
"    <jsp:param name=\"ename\" value=\"HY Liao\" />\n" +
"    <jsp:param name=\"author\" value=\"Alvin Liao\" />\n" +
"    <jsp:param name=\"color\" value=\"red\" />\n" +
"  </jsp:params>\n" +
"  <jsp:fallback>無法載入Applet!</jsp:fallback>\n" +
"</jsp:plugin>\n" +
"<br>\n" +
"<applet code=\"showMsg.class\" height=\"100\" width=\"400\" >\n" +
"    <param name=\"ename\" value=\"YC Liao\">\n" +
"    <param name=\"author\" value=\"Cindy Liao\">\n" +
"    <param name=\"color\" value=\"blue\">\n" +
"</applet>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1003;    
    public TestJSP1003() {
        buf1003=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf1003);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
