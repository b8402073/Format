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
public class TestJSP307 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"int intNum = 10;   //Page Level�ܼ�\n" +
"\n" +
"private String mySub1() \n" +
"{\n" +
"  String strMsg;\n" +
"  strMsg = \"intNum in mySub1 = \" + intNum + \"<br>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub2() \n" +
"{\n" +
"  String strMsg;\n" +
"  intNum = 20;   //intNum �Q mySub2��Ƨ���\n" +
"  strMsg = \"intNum in mySub2 = \" + intNum + \"<br>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub3() \n" +
"{\n" +
"  String strMsg;\n" +
"  int intNum;  //�w�q�p���ܼ�\n" +
"  intNum = 30;\n" +
"  strMsg = \"intNum in mySub3 = \" + intNum + \"<hr>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<h2>�ܼƪ����Ľd��</h2>\n" +
"<%\n" +
"// int intNum = 121;\n" +
"// out.println(\"intNum in the page = \" + intNum + \"<br>\");\n" +
"\n" +
"out.println(mySub1());  //���intNum����l��: 10\n" +
"out.println(mySub2());  //intNum�N�Q���ܦ�20\n" +
"out.println(mySub3());  //�֦��ۤv��intNum�ܼ�: 30\n" +
"\n" +
"//�q�q��intNum�ܼƭȳ̫ᬰ��H\n" +
"out.println(\"intNum in the page = \" + intNum + \"<br>\");\n" +
"%>";
    public StringBuffer buf307;
    
    public TestJSP307() {
        buf307=new StringBuffer(jsp);
    }
    @Test
    public void test307() {
        HTML that=new HTML(buf307);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
    
}
