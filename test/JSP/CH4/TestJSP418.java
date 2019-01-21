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
public class TestJSP418 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import=\"java.util.*\" %>\n" +
"<h2>字串相連-- 連結(+)運算子</h2>\n" +
"<%\n" +
"   Date datToday = new Date();\n" +
"   Calendar calC1 = new GregorianCalendar();\n" +
"   int year = calC1.get(calC1.YEAR);\n" +
"   int month = calC1.get(calC1.MONTH) + 1;  // 0~11\n" +
"   int dofm = calC1.get(calC1.DAY_OF_MONTH);\n" +
"\n" +
"   String strT1, strT2, strT;\n" +
"   //連結文字、Date類別及int，通通都轉成字串\n" +
"   strT1 = \"現在是 <b>\" + datToday + \"</b><br>\" + \"其實就是 <b>\" + year + \" </b>年\";\n" +
"   strT2 = \" <b>\" + month + \" </b>月 <b>\" + dofm + \" </b>號<p>\";\n" +
"   strT = strT1 + strT2;\n" +
"\n" +
"   out.println(strT);\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf418;
    public TestJSP418() {
        buf418=new StringBuffer(jsp);
    }
    @Test
    public void test418() {
        HTML that=new HTML(buf418);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
