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
public class TestJSP318 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<html>\n" +
"<head><title>求取圖周長--3-18.jsp</title>\n" +
"<script language=\"JavaScript\">\n" +
"<!--\n" +
"function check_Data()\n" +
"{\n" +
"  var R;\n" +
"  R = document.frm1.R.value;\n" +
"\n" +
"  if ((R.length == 0) || isNaN(R)) {\n" +
"     window.alert(\"請輸入數值!\");\n" +
"     document.frm1.R.value = \"\";\n" +
"  } else {\n" +
"     document.frm1.submit();\n" +
"  }\n" +
"}\n" +
"-->\n" +
"</script>\n" +
"</head>\n" +
"<body>\n" +
"<h3>求取圓周率</h3>\n" +
"<!-- 將表單的名稱取為\"frm1\"  -->\n" +
"<form action=\"3-18.jsp\" method=\"post\" name=\"frm1\">\n" +
"<img src=\"../images/BALL1.GIF\">\n" +
"請輸入半徑：<input name=\"R\" maxlength=6 size=6><br>\n" +
"<hr>\n" +
"<!-- 按下「計算」鈕後，會將表單欄位傳送到後端  -->\n" +
"<input type=\"button\" value=\"計算\" onClick=\"check_Data()\">\n" +
"<input type=\"reset\" value=\"清除\">\n" +
"</form>\n" +
"<%\n" +
"  final double cntPI = 3.14159;\n" +
"\n" +
"  double dblCircus, dblR;\n" +
"  String strMsg, strR;\n" +
"\n" +
"  strR = request.getParameter(\"R\");\n" +
"  // strR = \"22\";\n" +
"\n" +
"  dblR = Double.parseDouble(strR);\n" +
"  dblCircus = 2 * cntPI * dblR;  //2Pi * R\n" +
"  strMsg = \"圓周長是 \" + dblCircus + \" !\";\n" +
"\n" +
"  out.println(strMsg);\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf318;
    public TestJSP318() {
        buf318=new StringBuffer(jsp);
    }
    @Test
    public void test318() {
        HTML that=new HTML(buf318);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
    
}
