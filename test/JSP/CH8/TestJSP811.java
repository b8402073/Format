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
public class TestJSP811 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<HTML>\n" +
"<HEAD><TITLE>查詢book2資料表的內容(MySQL)</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<h2>查詢book2資料表的內容(MySQL)</h2>\n" +
"<center>\n" +
"<%\n" +
"  int i = 0;\n" +
"  // String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  // String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strUrl = \"jdbc:mysql://127.0.0.1:3306/test?user=root\";\n" +
"  String JDBCDriver = \"com.mysql.jdbc.Driver\";\n" +
"\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  // 4.透過Statement物件執行SQL敘述\n" +
"  // 5.取得執行後的ResultSet物件，或是被異動的資料筆數:\n" +
"  String sql = \"SELECT * FROM book2 order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.進行資料的處理\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
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
"  out.println(\"</table>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  stmt.close();\n" +
"  // 8.關閉Connection物件\n" +
"  con.close();\n" +
"%>\n" +
"</center>\n" +
"</BODY>\n" +
"</HTML>";
    public StringBuffer buf811;        
    public TestJSP811() {    
        buf811=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf811);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }      
}
