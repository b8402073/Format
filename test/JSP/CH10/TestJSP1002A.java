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
public class TestJSP1002A {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>�ʺA��e(���Ѽ�)--caller</title></head>\n" +
"<body>\n" +
"<h2>�ʺA��e(���Ѽ�)--caller</h2>\n" +
"1st JSP��� (caller)<p>\n" +
"<% \n" +
"  String strName = \"Alvin Liao\";\n" +
"  out.println(\"���w�Ѽ�(strName) = \" + strName + \"<hr>\");\n" +
"%>\n" +
"<jsp:forward page=\"10-02_02.jsp\" >\n" +
"  <jsp:param name=\"strName\" value=\"<%= strName %>\" />\n" +
"</jsp:forward>\n" +
"<%\n" +
"  // out.println(\"caller�o�@�椣�|�Q����I<br><hr>\"); \n" +
"%>";
    public StringBuffer buf1002A;    
    public TestJSP1002A() {
        buf1002A=new StringBuffer(jsp);
    }
    @Test
    public void test1002A() {
        HTML that=new HTML(buf1002A);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
