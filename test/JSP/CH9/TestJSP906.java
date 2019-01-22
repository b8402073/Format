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
public class TestJSP906 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>新增與刪除記錄--insertRow、deleteRow</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>新增與刪除記錄--insertRow、deleteRow</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable, strValue=\"\";\n" +
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
"  rs.moveToInsertRow();  //移到指標至新增記錄上\n" +
"  rs.updateString(1, \"NE20999\");\n" +
"  rs.updateString(2, \"廖信彥\");\n" +
"  // 故意使用單引號\n" +
"  rs.updateString(3, \"'05 JSP 2.0 Pro我也會\");\n" +
"  rs.insertRow();\n" +
"  //rs.moveToCurrentRow();\n" +
"  rs.close();\n" +
"  //\n" +
"  sql = \"select * from \" + strTable + \" where bookno='NE20999'\";\n" +
"  rs = stmt.executeQuery(sql);\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {  //顯示欄位名稱\n" +
"        out.println(\"<tr bgcolor='lightblue'>\");\n" +
"        out.println(\"<td><b>書號</b></td>\");\n" +
"        out.println(\"<td><b>作者</b></td>\");\n" +
"        out.println(\"<td><b>書名</b></td></tr>\");\n" +
"     }\n" +
"     strValue = rs.getString(\"bookno\");\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + strValue + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"  //rs.close();\n" +
"  rs.first();  //移到符合條件的第一筆記錄\n" +
"  //\n" +
"  //rs = stmt.executeQuery(sql);\n" +
"  //while (rs.next()) {\n" +
"     rs.deleteRow();  //刪除該筆記錄\n" +
"     out.println(\"<font color='red'>成功刪除 \" + strValue + \" !</font><hr>\");\n" +
"  //}\n" +
"  //\n" +
"  // 7.關閉ResultSet與Statement物件\n" +
"  if (rs != null) rs.close();\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";    
    public StringBuffer buf906;
    public TestJSP906() {
        buf906=new StringBuffer(jsp);
    }
    @Test
    public void test906() {
        HTML that=new HTML(buf906);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
   
}
