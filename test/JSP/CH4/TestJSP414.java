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
public class TestJSP414 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import=\"java.util.*\" %>\n" +
"<h2>GregorianCalendar Class--get day and hour</h2>\n" +
"<%\n" +
"   Date datToday = new Date();\n" +
"   Calendar calC1 = new GregorianCalendar();\n" +
"   int year = calC1.get(calC1.YEAR);\n" +
"   int month = calC1.get(calC1.MONTH) + 1;  // 0~11\n" +
"   int dofm = calC1.get(calC1.DAY_OF_MONTH);\n" +
"   int dofw = calC1.get(calC1.DAY_OF_WEEK);\n" +
"   int wofm = calC1.get(calC1.WEEK_OF_MONTH);\n" +
"   int hofd = calC1.get(calC1.HOUR_OF_DAY);\n" +
"   int hour = calC1.get(calC1.HOUR);\n" +
"   int am_pm = calC1.get(calC1.AM_PM);\n" +
"\n" +
"   String strAm_Pm = (am_pm == 0) ? \" am\" : \" pm\";\n" +
"\n" +
"   out.println(\"�{�b�O <b>\" + datToday + \"</b><p>\");\n" +
"   out.println(\"���~�O <b>\" + year + \" �~</b>�A\");\n" +
"   out.println(\"���묰 <b>\" + month + \" ��</b>�A\");\n" +
"   out.println(\"���ѬO <b>\" + dofm + \" ��</b><p>\");\n" +
"   out.println(\"���ѬO���P�� <b>\" + dofw + \" ��</b><p>\");\n" +
"   out.println(\"�o�@�P�O����� <b>\" + wofm + \" �P</b><p>\");\n" +
"   out.println(\"�{�b�ɨ�O <b>\" + hofd + \" �I</b>�A\");\n" +
"   out.println(\"�t�@�ت�ܪk�O <b>\" + hour + strAm_Pm + \"</b><br>\");\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf414;
    public TestJSP414() {
        buf414=new StringBuffer(jsp);
    }
    @Test
    public void test414() {
        HTML that=new HTML(buf414);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
