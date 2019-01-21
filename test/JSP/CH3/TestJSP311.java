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
public class TestJSP311 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>遞增、遞減運算子的使用</h2>\n" +
"<%\n" +
"int x = 10;\n" +
"int y = x++;  //y = 10, x = 11\n" +
"out.println(\"x = \" + x + \", y = \" + y + \"<p>\");\n" +
"//\n" +
"x = 20;\n" +
"y = x--;  //y = 20, x = 19\n" +
"out.println(\"x = \" + x + \", y = \" + y + \"<p>\");\n" +
"//\n" +
"x = 10;\n" +
"y = ++x;  //y = 11, x = 11\n" +
"out.println(\"x = \" + x + \", y = \" + y + \"<p>\");\n" +
"//\n" +
"x = 20;\n" +
"y = --x;  //y = 19, x = 19\n" +
"out.println(\"x = \" + x + \", y = \" + y + \"<hr>\");\n" +
"%>";
    public StringBuffer buf311;
    public TestJSP311() {
        buf311=new StringBuffer(jsp);
    }
    @Test
    public void test311() {
        HTML that=new HTML(buf311);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
    
    
}
