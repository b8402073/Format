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
"<head><title>�]�w/���o JavaBean �ݩ�</title></head>\n" +
"<body>\n" +
"<h2>�]�w/���o JavaBean �ݩ�</h2>\n" +
"&lt;jsp:useBean&gt;�ʧ@�аO: �ݩʪ��ϥ�<p>\n" +
"<jsp:useBean id=\"beanUser\" class=\"bean.accessUser\" scope=\"page\" />\n" +
"  <jsp:setProperty name=\"beanUser\" property=\"name\" value=\"Klone\" />\n" +
"<%\n" +
"  beanUser.setDept(\"�`�g�z��\");  //�]�i�Hscriptlet�]�wBean dept�ݩ�\n" +
"  String strName = beanUser.getName();  //�]�i�Hscriptlet���oBean name�ݩ�\n" +
"  out.println(\"���u�m�W�G<b>\" + strName + \"</b><p>\");\n" +
"%>\n" +
"���ݳ����G<b><jsp:getProperty name=\"beanUser\" property=\"dept\" />\n" +
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
