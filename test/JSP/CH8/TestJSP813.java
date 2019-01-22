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
public class TestJSP813 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>Read Access, then insert into MySQL</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>Read Access, then insert into MySQL</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql;\n" +
"  String strUrl1 = \"jdbc:odbc:JSPAll\";\n" +
"  String JDBCDriver1 = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strUrl = \"jdbc:mysql://127.0.0.1:3306/test?user=root&characterEncoding=big5\";\n" +
"  String JDBCDriver = \"com.mysql.jdbc.Driver\";\n" +
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
"  sql = \"delete from book2\";\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 表示刪除成功\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"刪除 MySQL book2 \" + intNo + \" 筆記錄成功！<br><hr>\");\n" +
"  }\n" +
"  //\n" +
"  sql = \"SELECT * FROM book2 order by bookno\";\n" +
"  ResultSet rs1 = stmt1.executeQuery(sql);\n" +
"\n" +
"  while (rs1.next()) {\n" +
"     i++;\n" +
"     sql = \"insert into book2 values('\" + rs1.getString(1) + \"','\" + rs1.getString(2) + \"','\" + rs1.getString(3) + \"')\" ;\n" +
"     out.println(i + \": \" + sql + \"<br>\");\n" +
"\n" +
"     try {\n" +
"         stmt.executeUpdate(sql); \n" +
"     } catch (SQLException se) {\n" +
"         out.println(i + \": SQL Exception：<br><font color='red'>\" + se.toString() + \"</font>\");\n" +
"     }\n" +
"\n" +
"  }\n" +
"  out.println(\"<p>讀取Access book2 \" + i + \" 筆記錄成功！<br><hr>\");\n" +
"  //\n" +
"\n" +
"  sql = \"SELECT * FROM book2 order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  i = 0;\n" +
"  while (rs.next()) {\n" +
"     if (i == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>Book No</b></td>\");\n" +
"        out.println(\"<td><b>Author</b></td>\");\n" +
"        out.println(\"<td><b>Book Name</b></td></tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookno\") + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"\n" +
"     i++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf813;        
    public TestJSP813() {
        buf813=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf813);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
