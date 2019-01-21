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
public class TestJSP413 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import=\"java.util.*, java.text.*\" %>\n" +
"<h2>Date, DateFormat Class</h2>\n" +
"<%\n" +
"   Date datToday = new Date();\n" +
"   DateFormat dfT = DateFormat.getDateTimeInstance();\n" +
"   DateFormat dfT2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);\n" +
"   DateFormat dfT3 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);\n" +
"\n" +
"   out.println(\"Now (Date類別) is \" + datToday + \"<p>\");\n" +
"   out.println(\"Now (DateFormat 原始格式) is \" + dfT.format(datToday) + \"<p>\");\n" +
"   out.println(\"Now (DateFormat LONG格式) is \" + dfT2.format(datToday) + \"<p>\");\n" +
"   out.println(\"Now (DateFormat SHORT格式) is \" + dfT3.format(datToday) + \"<br>\");\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf413;
    public TestJSP413() {
        buf413=new StringBuffer(jsp);
    }
    @Test
    public void test401() {
        HTML that=new HTML(buf413);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
