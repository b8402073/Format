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
public class TestJSP405 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>�ϥ�break�ԭz (4-05.jsp)</h2>\n" +
"<%\n" +
"int i = 1;  //�]�wi�����\n" +
"while (i <= 10) {     //�j��|�i��4��, ��5����\n" +
"  if (i % 5 == 0)  //�P�_�O�_��5������\n" +
"    break;\n" +
"  out.println(\"i = \" + i + \"<br>\");\n" +
"  i++;\n" +
"}\n" +
"out.println(\"<br>�ܼ� i �̫ᰱ��b�ƭ� -> \" + i + \"<hr>\");  //i = 5\n" +
"%>";
    public StringBuffer buf405;
    public TestJSP405() {
        buf405=new StringBuffer(jsp);
    }
    @Test
    public void test405() {
        HTML that=new HTML(buf405);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
