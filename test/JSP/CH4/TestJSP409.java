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
public class TestJSP409 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"String strName[] = {\"Alvin\"};   //Page Level�}�C�ܼ�\n" +
"//\n" +
"private String mySub1() \n" +
"{\n" +
"  String strMsg;\n" +
"  strMsg = \"��l�� strName[0] : \" + strName[0] + \"<p>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub2(String[] aryName)\n" +
"{\n" +
"  String strMsg;\n" +
"  //�ǤJ���}�C�Ѽ� aryName �Q mySub2��Ƨ���\n" +
"  aryName[0] += \" Liao is me.\";\n" +
"  strMsg = \"mySub2()���� strName[0] : \" + aryName[0] + \"<p>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<h2>�ǧ}�I�s--pass by reference (4-09.jsp)</h2>\n" +
"<%\n" +
"out.println(mySub1());  //���strName����l��: Alvin\n" +
"out.println(mySub2(strName));  //�ǧ}�I�s (strName[])\n" +
"\n" +
"//�q�q��strName�ܼƭȳ̫ᬰ��H\n" +
"out.println(\"�̫� strName[0] = \" + strName[0] + \" (�w�ܧ�)<hr>\");\n" +
"%>";
    public StringBuffer buf409;
    public TestJSP409() {
        buf409=new StringBuffer(jsp);
    }
    @Test
    public void test409() {
        HTML that=new HTML(buf409);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
