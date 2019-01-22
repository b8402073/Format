/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH7;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP708 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<HTML>\n" +
"<HEAD><TITLE>修改一筆記錄</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<h2>修改一筆記錄</h2>\n" +
"<center>\n" +
"<%\n" +
"  int i = 0;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4.透過Statement物件執行SQL敘述\n" +
"  // 5.取得執行後的ResultSet物件，或是被異動的資料筆數:\n" +
"  String sql = \"select * from book2 where bookno='NE20999'\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.進行資料的處理\n" +
"  if (rs.next()) {\n" +
"     rs.updateString(2, \"Alvin Liao\");\n" +
"     rs.updateString(3, \"Never Learn JSP 2.0 in 21 Days\");\n" +
"     rs.updateRow();\n" +
"  }\n" +
"  rs.close();\n" +
"\n" +
"  sql = \"select * from book2 where bookno='NE20999'\";\n" +
"  rs = stmt.executeQuery(sql);\n" +
"\n" +
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
    public StringBuffer buf708;    
    public TestJSP708() {
            buf708=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf708);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
}
