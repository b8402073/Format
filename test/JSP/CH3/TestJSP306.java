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
"<h2>使用及展示陣列</h2>\n" +
"<%\n" +
"int i;\n" +
"String aryName[] = new String[3];  //共三個陣列元素\n" +
"aryName[0] = \"Alvin\";\n" +
"aryName[1] = \"Liao\";\n" +
"aryName[2] = \" -- Author\";\n" +
"\n" +
"//以length屬性取得陣列元素的的長度\n" +
"for (i = 0; i < aryName.length; i++)\n" +
"{\n" +
"  out.println(\"第 \" + i + \" 個陣列元素：\" + aryName[i] + \"<br>\");\n" +
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
