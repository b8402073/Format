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
public class TestJSP422 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>���N�����r��</h2>\n" +
"<%\n" +
"   String strT1 = \"�ڦ��@�ӳ�޸� '�A\";\n" +
"   String strT2 = \"�Υt�@�Ӵ���Ÿ� !\\n\";\n" +
"   //\n" +
"   out.println(\"strT1 = \" + strT1 + \"<br>\");\n" +
"   out.println(\"strT2 = \" + strT2 + \"<hr>\");\n" +
"   //���N�S�w�r��\n" +
"   String strT11 = strT1.replace(\"'\", \"''\");\n" +
"   out.println(\"strT1 ������ӳ�޸� -> \" + strT11 + \"<hr>\");\n" +
"   //���N�S�w�r��\n" +
"   String strT21 = strT2.replace(\"\\n\", \"<br>\");\n" +
"   out.println(\"strT2 ����HTML����Ÿ� -> \" + strT21);\n" +
"\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf422;
    public TestJSP422() {
        buf422=new StringBuffer(jsp);
    }
    @Test
    public void test422() {
        HTML that=new HTML(buf422);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
