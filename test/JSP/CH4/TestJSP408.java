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
public class TestJSP408 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"String strName = \"Alvin\";   //Page Level�ܼ�\n" +
"//\n" +
"private String mySub1() \n" +
"{\n" +
"  String strMsg;\n" +
"  strMsg = \"��l�� strName : \" + strName + \"<p>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub2(String strName)\n" +
"{\n" +
"  String strMsg;\n" +
"  //�ǤJ���Ѽ� strName �Q mySub2��Ƨ���\n" +
"  strName += \" is me.\";\n" +
"  strMsg = \"mySub2()���� strName : \" + strName + \"<p>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<h2>�ǭȩI�s--pass by value (4-08.jsp)</h2>\n" +
"<%\n" +
"out.println(mySub1());  //���strName����l��: Alvin\n" +
"out.println(mySub2(strName));  //�ǭȩI�s (strName)\n" +
"\n" +
"//�q�q��strName�ܼƭȳ̫ᬰ��H\n" +
"out.println(\"�̫� strName = \" + strName + \" (�O�d���)<hr>\");\n" +
"%>";
    public StringBuffer buf408;
    public TestJSP408() {
        buf408=new StringBuffer(jsp);
    }
    @Test
    public void test408() {
        HTML that=new HTML(buf408);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
    
}
