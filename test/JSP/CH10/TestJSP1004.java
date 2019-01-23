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
public class TestJSP1004 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>設定/取得 JavaBean 屬性</title></head>\n" +
"<body>\n" +
"<h2>設定/取得 JavaBean 屬性</h2>\n" +
"&lt;jsp:useBean&gt;動作標記: 屬性的使用<p>\n" +
"<jsp:useBean id=\"beanUser\" class=\"bean.accessUser\" scope=\"page\" />\n" +
"  <jsp:setProperty name=\"beanUser\" property=\"name\" value=\"Klone\" />\n" +
"<%\n" +
"  beanUser.setDept(\"總經理室\");  //也可以scriptlet設定Bean dept屬性\n" +
"  String strName = beanUser.getName();  //也可以scriptlet取得Bean name屬性\n" +
"  out.println(\"員工姓名：<b>\" + strName + \"</b><p>\");\n" +
"%>\n" +
"所屬部門：<b><jsp:getProperty name=\"beanUser\" property=\"dept\" />\n" +
"</b><hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1004;    
    public TestJSP1004() {
        buf1004=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf1004);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
