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
public class TestJSP904 {
     public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>取得/設定ResultSet相關屬性</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>取得/設定ResultSet相關屬性</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable;\n" +
"  int intDir, intType, intCon;\n" +
"  strTable = \"book\";\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4, 5.執行SQL敘述、建立ResultSet物件\n" +
"  sql = \"select * from \" + strTable;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.設定或取出相關資料\n" +
"  intDir = rs.getFetchDirection();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"FETCH_FORWARD(1000), FETCH_REVERSE(1001), FETCH_UNKNOWN(1002)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前FetchDirection為：\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = ResultSet.FETCH_REVERSE;\n" +
"  rs.setFetchDirection(intDir);\n" +
"  out.println(\"設定FetchDirection為：\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = rs.getFetchDirection();\n" +
"  out.println(\"改變後的FetchDirection為：\" + intDir + \"<br><hr>\");\n" +
"  //\n" +
"  intType = rs.getType();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"TYPE_FORWARD_ONLY(1003), TYPE_SCROLL_INSENSITIVE(1004), TYPE_SCROLL_SENSITIVE(1005)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前ResultSet Type為：\" + intType + \"<br><hr>\");\n" +
"  //\n" +
"  intCon = rs.getConcurrency();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"CONCUR_READ_ONLY(1007), CONCUR_UPDATABLE(1008)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前ResultSet Concurrency為：\" + intCon + \"<br><hr>\");\n" +
"  //\n" +
"  rs.last();  //移到最後一筆\n" +
"  intCon = rs.getRow();  //取得列號，即總筆數\n" +
"  out.println(strTable + \" 資料表的記錄共有：<b>\" + intCon + \"</b> 筆<br><hr>\");\n" +
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
     public StringBuffer buf904;
    public TestJSP904() {
        buf904=new StringBuffer(jsp);
    }
    @Test
    public void test904() {
        HTML that=new HTML(buf904);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
