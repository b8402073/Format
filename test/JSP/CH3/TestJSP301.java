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
public class TestJSP301 {
    public String jsp="<%\n" +
"short shtNo = 131;\n" +
"int intNo = 130;\n" +
"long lngNo = 129;\n" +
"byte bytNo = 128;  //error: out of bound\n" +
"out.println(\"bytNo = \" + bytNo);\n" +
"%>";
    public StringBuffer buf301;
    public TestJSP301() {
        buf301=new StringBuffer(jsp);        
    }
    @Test
    public void testJSP301()    {
        HTML that=new HTML(buf301);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
