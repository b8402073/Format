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
public class TestJSP1002B {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>�ʺA��e(���Ѽ�)--called page</title></head>\n" +
"<body>\n" +
"<h2>�ʺA��e(���Ѽ�)--called page</h2>\n" +
"2nd JSP��� (called page)<p>\n" +
"<% \n" +
"  String strName = request.getParameter(\"strName\");\n" +
"  out.println(\"���o�I�S�O�z�G<b>\" + strName + \"</b><p>\");\n" +
"  out.println(\"2nd JSP��󵲧�<hr>\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1002B;    
    public TestJSP1002B() {
        buf1002B=new StringBuffer(jsp);
    }
    @Test
    public void test1002B() {
        HTML that=new HTML(buf1002B);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
