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
public class TestJSP806 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>executeUpdate、executeQuery方法</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>executeUpdate、executeQuery方法</h2>\n" +
"<%\n" +
"  int i = 0, intNo;\n" +
"  String sql;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"新增兩筆記錄:<br>\");\n" +
"  sql = \"insert into book2 values('NE20991','Alvin Liao','JSP 2.0')\";\n" +
"  stmt.executeUpdate(sql);\n" +
"  out.println(\"1. \" + sql + \"<br>\");\n" +
"\n" +
"  sql = \"insert into book2 values('NE20992','Alvin','Java 5.0基礎應用')\";\n" +
"  stmt.executeUpdate(sql);\n" +
"  out.println(\"2. \" + sql + \"<br><hr>\");\n" +
"  //\n" +
"  // 5.取得執行後的ResultSet物件，或是被異動的資料筆數:\n" +
"  sql = \"select * from book2 where bookno like 'NE2099%' order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.進行資料的處理\n" +
"  out.println(\"顯示新增的兩筆記錄:<br>\");\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  while (rs.next()) {\n" +
"     if (i == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>書號</b></td>\");\n" +
"        out.println(\"<td><b>作者</b></td>\");\n" +
"        out.println(\"<td><b>書名</b></td></tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookno\") + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"     i++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"\n" +
"  out.println(\"刪除新增的記錄...<p>\");\n" +
"  sql = \"delete from book2 where bookno like 'NE2099%'\";\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 表示刪除成功\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"刪除 \" + intNo + \" 筆記錄成功！<br>\");\n" +
"  }\n" +
"  out.println(\"Ok...<br><hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf806;        
    public TestJSP806() {   
        buf806=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf806);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
