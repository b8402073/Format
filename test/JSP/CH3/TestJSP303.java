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
"<h2>�ϥΤT�ؤ覡��ܦr��</h2>\n" +
"<%\n" +
"char chrA = 'A';\n" +
"out.println(\"�ϥγ�޸��GchrA = \" + chrA + \"<p>\");\n" +
"char unicodeA = 65;\n" +
"out.println(\"�ϥ�Unicode�ƭ�(65)�GunicodeA = \" + unicodeA + \"<p>\");\n" +
"char hexA = '\\u0041';\n" +
"out.println(\"�ϥ�16�i���(\\u0041)�GhexA = \" + hexA + \"<hr>\");\n" +
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
