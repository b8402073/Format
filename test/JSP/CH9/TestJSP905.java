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
public class TestJSP905 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>修改記錄--absolute、relative、updateRow</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>修改記錄--absolute、relative、updateRow</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable, strValue;\n" +
"  int j;\n" +
"  strTable = \"book2\";\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4, 5.執行SQL敘述、建立ResultSet物件\n" +
"  sql = \"select * from \" + strTable + \" order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.處理資料\n" +
"  // ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  // intCols = rsmd.getColumnCount();  //取得欄位總數\n" +
"  rs.absolute(14);  //移到第14筆記錄\n" +
"  //rs.updateString(1, \"NE20126\");\n" +
"  // 故意使用單引號\n" +
"  rs.updateString(\"bookname\", \"'05 ASP應用大全--ASP進階技巧\");\n" +
"  rs.updateRow();\n" +
"  //反悔時改用下一道指令取消\n" +
"  //rs.cancelRowUpdates();\n" +
"  //\n" +
"  rs.relative(-10);  //移到第4筆記錄\n" +
"  // rs.updateString(1, \"DB20086\");\n" +
"  rs.updateString(2, \"廖信彥\");\n" +
"  rs.updateString(\"bookname\", \"Access 2002中文版標準教材\");\n" +
"  rs.updateRow();\n" +
"  //\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  rs.beforeFirst();\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>項次</b></td>\");\n" +
"        out.println(\"<td><b>書號</b></td>\");\n" +
"        out.println(\"<td><b>作者</b></td>\");\n" +
"        out.println(\"<td><b>書名</b></td></tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookno\") + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");  //\n" +
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
    public StringBuffer buf905;
    public TestJSP905() {
        buf905=new StringBuffer(jsp);
    }
    @Test
    public void test905() {
        HTML that=new HTML(buf905);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
