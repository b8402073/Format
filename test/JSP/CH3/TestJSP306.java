/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH3;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP306 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>�ϥΤήi�ܰ}�C</h2>\n" +
"<%\n" +
"int i;\n" +
"String aryName[] = new String[3];  //�@�T�Ӱ}�C����\n" +
"aryName[0] = \"Alvin\";\n" +
"aryName[1] = \"Liao\";\n" +
"aryName[2] = \" -- Author\";\n" +
"\n" +
"//�Hlength�ݩʨ��o�}�C������������\n" +
"for (i = 0; i < aryName.length; i++)\n" +
"{\n" +
"  out.println(\"�� \" + i + \" �Ӱ}�C�����G\" + aryName[i] + \"<br>\");\n" +
"}\n" +
"out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf306;
    public TestJSP306() {
        buf306=new StringBuffer(jsp);
    }
    @Test
    public void test306() {
        HTML that=new HTML(buf306);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
