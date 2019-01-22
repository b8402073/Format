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
public class TestJSP933 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>自動產生資料表(Access -> MySQL)</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>自動產生資料表(Access -> MySQL)</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql, strValue;\n" +
"  boolean bolNull = false;\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strUrl1 = \"jdbc:mysql://127.0.0.1:3306/test?user=root&characterEncoding=big5\";\n" +
"  String JDBCDriver1 = \"com.mysql.jdbc.Driver\";\n" +
"  String strName = request.getParameter(\"name\").trim();\n" +
"\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver1);\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con1 = DriverManager.getConnection(strUrl1);\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt1 = con1.createStatement();\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  sql = \"select * from \" + strName;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  i = rsmd.getColumnCount();\n" +
"  //String strSQL[] = new String[i]; \n" +
"\n" +
"  out.println(\"<h3>Table name: \" + rsmd.getTableName(1) + \"</h3>\");\n" +
"  //\n" +
"  sql = \"DROP TABLE IF EXISTS \" + strName;\n" +
"  intNo = stmt1.executeUpdate(sql);  // > 0 表示刪除成功\n" +
"  out.println(\"sql = \" + sql + \"<p>\");\n" +
"\n" +
"  //if (intNo > 0) {\n" +
"     out.println(\"刪除 MySQL \" + strName + \" 資料表成功！<br><hr>\");\n" +
"  //}\n" +
"\n" +
"  sql = \"CREATE TABLE \" + strName + \" ( \";\n" +
"\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      sql = sql + rsmd.getColumnName(intNo) + \" \" + rsmd.getColumnTypeName(intNo);\n" +
"      if ((rsmd.getColumnTypeName(intNo).indexOf(\"TIME\") != -1) || \n" +
"      	  (rsmd.getColumnTypeName(intNo).indexOf(\"BINARY\") != -1) || \n" +
"      	  (rsmd.getColumnTypeName(intNo).indexOf(\"REAL\") != -1))\n" +
"         sql = sql + \" ,\";\n" +
"      else\n" +
"         sql = sql + \" (\" + rsmd.getColumnDisplaySize(intNo) + \") ,\";  //default NULL\n" +
"  }\n" +
"  sql = sql.substring(0, sql.length() - 1) + \") DEFAULT CHARSET=big5\"; //\n" +
"  out.println(\"sql = \" + sql + \"<p>\");\n" +
"  //\n" +
"  \n" +
"  intNo = stmt1.executeUpdate(sql);  // > 0 表示Create成功\n" +
"  out.println(\"建立 MySQL \" + strName + \" 資料表成功！<br><hr>\");\n" +
"  \n" +
"  //\n" +
"  \n" +
"  int j = 0;\n" +
"  while (rs.next()) {\n" +
"     j++;\n" +
"     sql = \"insert into \" + strName + \" values(\"; \n" +
"     for (intNo = 1; intNo <= i; intNo++) {\n" +
"        if (rsmd.getColumnTypeName(intNo).indexOf(\"CHAR\") != -1)\n" +
"           sql = sql + \"'\" + rs.getString(intNo) + \"',\";\n" +
"        else if (rsmd.getColumnTypeName(intNo).indexOf(\"INT\") != -1)\n" +
"           sql = sql + rs.getInt(intNo) + \",\";        \n" +
"        else if (rsmd.getColumnTypeName(intNo).indexOf(\"REAL\") != -1)\n" +
"           sql = sql + rs.getDouble(intNo) + \",\";        \n" +
"        else if (rsmd.getColumnTypeName(intNo).indexOf(\"BINARY\") != -1)\n" +
"           sql = sql + \",\";        \n" +
"        else if (rsmd.getColumnTypeName(intNo).indexOf(\"TIME\") != -1)\n" +
"           sql = sql + \"'\" + rs.getString(intNo) + \"',\";\n" +
"        else\n" +
"           sql = sql + \"'\" + rs.getString(intNo) + \"',\";\n" +
"     }\n" +
"     sql = sql.substring(0, sql.length() - 1) + \")\";\n" +
"     out.println(j + \": \" + sql + \"<br>\");\n" +
"\n" +
"     try {\n" +
"         stmt1.executeUpdate(sql); \n" +
"     } catch (SQLException se) {\n" +
"         out.println(i + \": SQL Exception：<br><font color='red'>\" + se.toString() + \"</font><br>\");\n" +
"     }\n" +
"  }\n" +
"  out.println(\"<p>讀取Access \" + strName + \" \" + j + \" 筆記錄成功！<br><hr>\");\n" +
"  //\n" +
"\n" +
"  sql = \"SELECT * FROM \" + strName;\n" +
"  ResultSet rs1 = stmt1.executeQuery(sql);\n" +
"  ResultSetMetaData rsmd1 = rs1.getMetaData();\n" +
"  i = rsmd1.getColumnCount();\n" +
"\n" +
"  out.println(\"輸出 MySQL \" + strName + \" 資料表：<br>\");\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  j = 0;\n" +
"  while (rs1.next()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>項次</b></td>\");\n" +
"        for (intNo = 1; intNo <= i; intNo++) {\n" +
"            out.println(\"<td><b>\" + rsmd1.getColumnName(intNo) + \"</b></td>\");\n" +
"        }\n" +
"        out.println(\"</tr>\");\n" +
"     }\n" +
"       \n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     for (intNo = 1; intNo <= i; intNo++) {\n" +
"         strValue = rs1.getString(intNo);\n" +
"         bolNull = rs1.wasNull();\n" +
"         if (!bolNull)\n" +
"             out.println(\"<td>\" + strValue + \"</td>\");\n" +
"         else\n" +
"             out.println(\"<td>Empty</td>\");\n" +
"     }\n" +
"     out.println(\"</tr>\"); \n" +
"	\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"  if (stmt1 != null) stmt1.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"  if (con1 != null) con1.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";    
    public StringBuffer buf933;
    public TestJSP933() {
        buf933=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf933);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
