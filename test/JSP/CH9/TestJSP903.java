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
public class TestJSP903 {
       public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>使用afterLast、beforeFirst方法</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>使用afterLast、beforeFirst方法</h2>\n" +
"<%\n" +
"  int intCols = 0, i = 0;\n" +
"  String sql, strValue;\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String strName = request.getParameter(\"name\").trim();\n" +
"\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"                   ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4, 5.執行SQL敘述、建立ResultSet物件\n" +
"  sql = \"select * from \" + strName;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.處理或取出相關資料\n" +
"  ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  intCols = rsmd.getColumnCount();  //取得欄位總數\n" +
"\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  int j = 0;\n" +
"  rs.afterLast();  //移到最後一筆記錄之後\n" +
"  while (rs.previous()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>項次</b></td>\");\n" +
"        for (i = 1; i <= intCols; i++) {\n" +
"            out.println(\"<td><b>\" + rsmd.getColumnName(i) + \"</b></td>\");\n" +
"        }\n" +
"        out.println(\"</tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     for (i = 1; i <= intCols; i++) {\n" +
"         strValue = rs.getString(i);\n" +
"         out.println(\"<td>\" + strValue + \"</td>\");\n" +
"     }\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"  //\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  j = 0;\n" +
"  rs.beforeFirst();  //移到第一筆記錄之前\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='lightblue'>\");\n" +
"        out.println(\"<td><b>項次</b></td>\");\n" +
"        for (i = 1; i <= intCols; i++) {\n" +
"            out.println(\"<td><b>\" + rsmd.getColumnName(i) + \"</b></td>\");\n" +
"        }\n" +
"        out.println(\"</tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     for (i = 1; i <= intCols; i++) {\n" +
"         strValue = rs.getString(i);\n" +
"         out.println(\"<td>\" + strValue + \"</td>\");\n" +
"     }\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");  \n" +
"  // 7.關閉ResultSet與Statement物件\n" +
"  if (rs != null) rs.close();\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>"; 
       public StringBuffer buf903;
    public TestJSP903() {
        buf903=new StringBuffer(jsp);
    }
    @Test
    public void test903() {
        HTML that=new HTML(buf903);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
