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
public class TestJSP419 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>�r�ꪺ���</h2>\n" +
"<%\n" +
"   String strT1 = \"No news is good news.\";\n" +
"   String strT2 = \"NO NEWS IS GOOD NEWS.\";\n" +
"   String strT3 = strT1;\n" +
"   String msg1, msg2, msg3;\n" +
"\n" +
"   //������e�O�_�۵�\n" +
"   out.println(\"strT1 = \" + strT1 + \"<br>\");\n" +
"   out.println(\"strT2 = \" + strT2 + \"<br>\");\n" +
"   out.println(\"strT3 = strT1<hr>\");\n" +
"\n" +
"   if (strT1.equals(strT2))\n" +
"      msg1 = \"strT1�����e�MstrT2�ۦP!<p>\";\n" +
"   else\n" +
"      msg1 = \"strT1�����e�MstrT2���P!<p>\";\n" +
"   out.println(msg1);\n" +
"   //\n" +
"   out.println(\"�b���Ϥ��j�p�g�����p�U�G\");\n" +
"   if (strT1.equalsIgnoreCase(strT2))\n" +
"      msg1 = \"strT1�����e�MstrT2�ۦP!<hr>\";\n" +
"   else\n" +
"      msg1 = \"strT1�����e�MstrT2���P!<hr>\";\n" +
"   out.println(msg1);\n" +
"   //����r��j�p\n" +
"   if (strT1.compareTo(strT2) > 0)\n" +
"      msg2 = \"strT1 �j�� strT2!<p>\";\n" +
"   else if (strT1.compareTo(strT2) < 0)\n" +
"      msg2 = \"strT1 �p�� strT2!<p>\";\n" +
"   else\n" +
"      msg2 = \"strT1 ���� strT2!<p>\";\n" +
"   out.println(msg2);\n" +
"   //\n" +
"   out.println(\"�b���Ϥ��j�p�g�����p�U�G\");\n" +
"   if (strT1.compareToIgnoreCase(strT2) > 0)\n" +
"      msg2 = \"strT1 �j�� strT2!<p>\";\n" +
"   else if (strT1.compareToIgnoreCase(strT2) < 0)\n" +
"      msg2 = \"strT1 �p�� strT2!<hr>\";\n" +
"   else\n" +
"      msg2 = \"strT1 ���� strT2!<hr>\";\n" +
"   out.println(msg2);\n" +
"   //����O�_���V�P�@��}\n" +
"   if (strT1 == strT2)\n" +
"      msg3 = \"strT1 �M strT2 ���V�P�@�Ӧr�ꪫ��!<p>\";\n" +
"   else\n" +
"      msg3 = \"strT1 �M strT2 ���V���P���r�ꪫ��!<p>\";\n" +
"   out.println(msg3);\n" +
"   if (strT1 == strT3)\n" +
"      msg3 = \"strT1 �M strT3 ���V�P�@�Ӧr�ꪫ��!<br>\";\n" +
"   else\n" +
"      msg3 = \"strT1 �M strT3 ���V���P���r�ꪫ��!<br>\";\n" +
"   out.println(msg3);\n" +
"\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf419;
    public TestJSP419() {
        buf419=new StringBuffer(jsp);
    }
    @Test
    public void test419() {
        HTML that=new HTML(buf419);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
