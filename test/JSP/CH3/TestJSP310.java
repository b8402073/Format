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
public class TestJSP310 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>+ 運算子的使用</h2>\n" +
"<%\n" +
"int intX, intY, intZ;\n" +
"String strX, strY, strZ;\n" +
"intX = 123;\n" +
"intY = 456;\n" +
"intZ = intX + intY;\n" +
"strX = \"123\";\n" +
"strY = \"456\";\n" +
"strZ = strX + strY;\n" +
"out.println(\"X = \" + intX + \", Y = \" + intY + \"<br>\");\n" +
"out.println(\"X + Y = \" + intZ + \"<p>\");\n" +
"out.println(\"String X = \" + strX + \", String Y = \" + strY + \"<br>\");\n" +
"out.println(\"String X + String Y = \" + strZ + \"<p>\");\n" +
"//猜猜看下一行會有什麼結果？\n" +
"out.println(\"Mixed int X + String Y = \" + (intX + strY) + \"<hr>\");\n" +
"%>";
    public StringBuffer buf310;
    public TestJSP310() {
        buf310=new StringBuffer(jsp);
    }
    @Test
    public void test310() {
        HTML that=new HTML(buf310);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }    
}
