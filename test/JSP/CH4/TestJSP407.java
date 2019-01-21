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
public class TestJSP407 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"final double cntPI = 3.14159;\n" +
"double dblArea;\n" +
"void my_Main(String strR)\n" +
"{\n" +
"  double dblR;\n" +
"  dblR = Double.parseDouble(strR);\n" +
"  cal_Area(dblR);   //呼叫函數，並帶入參數值\n" +
"}\n" +
"\n" +
"void cal_Area(double dblR) {\n" +
"  dblArea = 0.5 * cntPI * (dblR * dblR);  //0.5 * Pi * R2\n" +
"}\n" +
"%>\n" +
"\n" +
"<html>\n" +
"<head><title>求取圓面積(使用函數--無傳回值): 4-07.jsp</title>\n" +
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
"     document.forms[0].elements[0].focus();\n" +
"  } else {\n" +
"     document.frm1.submit();\n" +
"  }\n" +
"}\n" +
"-->\n" +
"</script>\n" +
"</head>\n" +
"<body>\n" +
"<h2>求取圓面積(使用函數--無傳回值): 4-07.jsp</h2>\n" +
"<!-- 將表單的名稱取為\"frm1\"  -->\n" +
"<form action=\"4-07.jsp\" method=\"post\" name=\"frm1\">\n" +
"<img src=\"../images/BALL1.GIF\">\n" +
"請輸入半徑：\n" +
"<input name=\"R\" maxlength=6 size=6 value='<%= request.getParameter(\"R\") %>'>\n" +
"<br><hr>\n" +
"<!-- 按下「計算」鈕後，會將表單欄位傳送到後端  -->\n" +
"<input type=\"button\" value=\"計算\" onClick=\"check_Data()\">\n" +
"<input type=\"reset\" value=\"清除\">\n" +
"</form>\n" +
"<%\n" +
"  String strR;\n" +
"  strR = request.getParameter(\"R\");\n" +
"  my_Main(strR);  //呼叫函數\n" +
"  out.println(\"圓面積是 \" + dblArea + \" !\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf407;
    public TestJSP407() {
        buf407=new StringBuffer(jsp);
    }
    @Test
    public void test407() {
        HTML that=new HTML(buf407);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
    
}
