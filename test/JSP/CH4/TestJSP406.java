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
public class TestJSP406 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>�ϥ�continue�ԭz (4-06.jsp)</h2>\n" +
"<%\n" +
"int i = 0;  //�]�wi�����\n" +
"while (i < 200) {     //�j��|�i��200��\n" +
"  i++;\n" +
"  //�P�_�O�_��2�B5��7��������\n" +
"  if ((i % 5 == 0) && (i % 7 == 0) && (i % 2 == 0)) {\n" +
"     out.println(\"Skip 2, 5, 7��������-> \" + i + \"<p>\");\n" +
"     continue;\n" +
"  } else if ((i % 5 == 0) && (i % 7 == 0)) {\n" +
"     out.println(\"5, 7��������-> \" + i + \"<br>\");\n" +
"  }\n" +
"}\n" +
"out.println(\"<br>�ܼ� i �̫ᰱ��b�ƭ� -> \" + i + \"<hr>\");  //i = 200\n" +
"%>";
    public StringBuffer buf406;
    public TestJSP406() {
        buf406=new StringBuffer(jsp);
    }
    @Test
    public void test406() {
        HTML that=new HTML(buf406);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
