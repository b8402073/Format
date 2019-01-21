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
public class TestJSP303 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>使用三種方式表示字元</h2>\n" +
"<%\n" +
"char chrA = 'A';\n" +
"out.println(\"使用單引號：chrA = \" + chrA + \"<p>\");\n" +
"char unicodeA = 65;\n" +
"out.println(\"使用Unicode數值(65)：unicodeA = \" + unicodeA + \"<p>\");\n" +
"char hexA = '\\u0041';\n" +
"out.println(\"使用16進位值(\\u0041)：hexA = \" + hexA + \"<hr>\");\n" +
"%>";
    public StringBuffer buf303;
    public TestJSP303() {
        buf303=new StringBuffer(jsp);
    }
    @Test
    public void testJSP303() {
        HTML that=new HTML(buf303);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
    
}
