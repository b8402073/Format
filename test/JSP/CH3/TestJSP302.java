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
public class TestJSP302 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>ㄏノ疊翴计</h2>\n" +
"<%\n" +
"double dblNo;\n" +
"dblNo = 3;\n" +
"out.println(\"纗俱计计dblNo = \" + dblNo + \"<p>\");\n" +
"dblNo = 3.1416;\n" +
"out.println(\"纗疊翴计dblNo = \" + dblNo + \"<hr>\");\n" +
"%>";
    public StringBuffer buf302;
    public TestJSP302() {
        buf302=new StringBuffer(jsp);
    }
    @Test
    public void testJSP302() {
        HTML that=new HTML(buf302);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
    
    
}
