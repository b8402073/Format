/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH9;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP902 {
     public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>getMetaData方法--取得Table相關資訊</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>getMetaData方法--取得Table相關資訊</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql;\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strName = request.getParameter(\"name\").trim();\n" +
"  //if (strName.length() == 0) strName = \"book\";\n" +
"\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  sql = \"select * from \" + strName;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  i = rsmd.getColumnCount();  //取得欄位總數\n" +
"\n" +
"  out.println(\"<h3>Table name: \" + rsmd.getTableName(1) + \"</hr>\");\n" +
"  //out.println(\"Catalog name: \" + rsmd.getCatalogName(1) + \"</hr>\");\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"\n" +
"  out.println(\"<tr bgcolor='yellow'>\");\n" +
"  out.println(\"<td><b>欄位名稱</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td><b>\" + rsmd.getColumnName(intNo) + \"</b></td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>資料型態</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnTypeName(intNo) + \"(\");\n" +
"      out.println(rsmd.getColumnType(intNo) + \")</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>欄位長度</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnDisplaySize(intNo) + \"</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>欄位類別名稱</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnClassName(intNo) + \"</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"</table><br><hr>\");\n" +
"\n" +
"  // 7.關閉ResultSet與Statement物件\n" +
"  if (rs != null) rs.close();\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";   
     public StringBuffer buf902;
    public TestJSP902() {
        buf902=new StringBuffer(jsp);
    }
    @Test
    public void test902() {
        HTML that=new HTML(buf902);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
