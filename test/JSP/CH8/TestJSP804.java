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
public class TestJSP804 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>設定/取得Statement介面的屬性</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>設定/取得Statement介面的屬性</h2>\n" +
"<%\n" +
"  int intDir, intRows, intSecs, iRs;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  //, ResultSet.CLOSE_CURSORS_AT_COMMIT\n" +
"  //\n" +
"  intDir = stmt.getFetchDirection();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"FETCH_FORWARD(1000), FETCH_REVERSE(1001), FETCH_UNKNOWN(1002)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前FetchDirection為：\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = ResultSet.FETCH_REVERSE;\n" +
"  stmt.setFetchDirection(intDir);\n" +
"  out.println(\"設定FetchDirection為：\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = stmt.getFetchDirection();\n" +
"  out.println(\"改變後的FetchDirection為：\" + intDir + \"<br><hr>\");\n" +
"  //\n" +
"  intRows = stmt.getMaxRows();\n" +
"  out.println(\"目前Max Rows為(0表示沒有限制)：\" + intRows + \"<p>\");\n" +
"\n" +
"  intRows = 100;\n" +
"  stmt.setMaxRows(intRows);\n" +
"  out.println(\"設定Max Rows為：\" + intRows + \"<p>\");\n" +
"\n" +
"  intRows = stmt.getMaxRows();\n" +
"  out.println(\"改變後的Max Rows為：\" + intRows + \"<br><hr>\");\n" +
"  //\n" +
"  iRs = stmt.getResultSetType();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"TYPE_FORWARD_ONLY(1003), TYPE_SCROLL_INSENSITIVE(1004), TYPE_SCROLL_SENSITIVE(1005)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前ResultSet Type為：\" + iRs + \"<br><hr>\");\n" +
"  //\n" +
"  iRs = stmt.getResultSetConcurrency();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"CONCUR_READ_ONLY(1007), CONCUR_UPDATABLE(1008)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"目前ResultSet Concurrency為：\" + iRs + \"<br><hr>\");\n" +
"\n" +
"  //Access不支援下述指令\n" +
"  //iRs = stmt.getResultSetHoldability();\n" +
"  //out.println(\"<font color='blue'><b>\");\n" +
"  //out.println(\"HOLD_CURSORS_OVER_COMMIT(1), CLOSE_CURSORS_AT_COMMIT(2)\");\n" +
"  //out.println(\"</b></font><p>\");\n" +
"  //out.println(\"目前ResultSet Holdability為：\" + iRs + \"<br><hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf804;        
    public TestJSP804() {
        buf804=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf804);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
