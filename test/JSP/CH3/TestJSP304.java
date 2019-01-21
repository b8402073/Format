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
public class TestJSP304 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>自動型別轉換</h2>\n" +
"<%\n" +
"byte bytNo = 127;\n" +
"short shtNo = 130;\n" +
"int intNo = 131;\n" +
"out.println(bytNo + \" + \" + shtNo + \" + \" + intNo + \" = \");\n" +
"out.println((bytNo + shtNo + intNo) + \"<hr>\");\n" +
"%>";
    public StringBuffer buf304;
    public TestJSP304() {
        buf304=new StringBuffer(jsp);
    }
    @Test
    public void test304() {
        HTML that=new HTML(buf304);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
    
}
