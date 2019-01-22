/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH8;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP801 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*, java.util.*\" %>\n" +
"<html>\n" +
"<head><title>使用DriverManager類別</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>使用DriverManager類別</h2>\n" +
"<%\n" +
"  int i = DriverManager.getLoginTimeout();\n" +
"  out.println(\"目前Login Timeout：\" + i + \" 秒<p>\");\n" +
"\n" +
"  int intSec = 30;   //30 seconds\n" +
"  out.println(\"設定Login Timeout為：\" + intSec + \" 秒<p>\");\n" +
"  DriverManager.setLoginTimeout(intSec);\n" +
"\n" +
"  intSec = DriverManager.getLoginTimeout();\n" +
"  out.println(\"改變後的Login Timeout：\" + intSec + \" 秒<br><hr>\");\n" +
"  //設回原來的Timeout時間\n" +
"  DriverManager.setLoginTimeout(i);\n" +
"\n" +
"  out.println(\"目前載入的JDBC驅動程式：<p>\");\n" +
"  Enumeration enuDriver = DriverManager.getDrivers();\n" +
"  String strName;\n" +
"  while (enuDriver.hasMoreElements()) {\n" +
"     strName = enuDriver.nextElement().getClass().getName();\n" +
"     out.println(\"<b>\" + strName + \"</b>, \");\n" +
"  }\n" +
"  out.println(\"<hr>\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf801;    
    public TestJSP801() {
        buf801=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf801);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }         
}
