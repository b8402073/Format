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
"<head><title>�]�w/���oStatement�������ݩ�</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>�]�w/���oStatement�������ݩ�</h2>\n" +
"<%\n" +
"  int intDir, intRows, intSecs, iRs;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  //, ResultSet.CLOSE_CURSORS_AT_COMMIT\n" +
"  //\n" +
"  intDir = stmt.getFetchDirection();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"FETCH_FORWARD(1000), FETCH_REVERSE(1001), FETCH_UNKNOWN(1002)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeFetchDirection���G\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = ResultSet.FETCH_REVERSE;\n" +
"  stmt.setFetchDirection(intDir);\n" +
"  out.println(\"�]�wFetchDirection���G\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = stmt.getFetchDirection();\n" +
"  out.println(\"���ܫ᪺FetchDirection���G\" + intDir + \"<br><hr>\");\n" +
"  //\n" +
"  intRows = stmt.getMaxRows();\n" +
"  out.println(\"�ثeMax Rows��(0��ܨS������)�G\" + intRows + \"<p>\");\n" +
"\n" +
"  intRows = 100;\n" +
"  stmt.setMaxRows(intRows);\n" +
"  out.println(\"�]�wMax Rows���G\" + intRows + \"<p>\");\n" +
"\n" +
"  intRows = stmt.getMaxRows();\n" +
"  out.println(\"���ܫ᪺Max Rows���G\" + intRows + \"<br><hr>\");\n" +
"  //\n" +
"  iRs = stmt.getResultSetType();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"TYPE_FORWARD_ONLY(1003), TYPE_SCROLL_INSENSITIVE(1004), TYPE_SCROLL_SENSITIVE(1005)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeResultSet Type���G\" + iRs + \"<br><hr>\");\n" +
"  //\n" +
"  iRs = stmt.getResultSetConcurrency();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"CONCUR_READ_ONLY(1007), CONCUR_UPDATABLE(1008)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeResultSet Concurrency���G\" + iRs + \"<br><hr>\");\n" +
"\n" +
"  //Access���䴩�U�z���O\n" +
"  //iRs = stmt.getResultSetHoldability();\n" +
"  //out.println(\"<font color='blue'><b>\");\n" +
"  //out.println(\"HOLD_CURSORS_OVER_COMMIT(1), CLOSE_CURSORS_AT_COMMIT(2)\");\n" +
"  //out.println(\"</b></font><p>\");\n" +
"  //out.println(\"�ثeResultSet Holdability���G\" + iRs + \"<br><hr>\");\n" +
"\n" +
"  // 7.����Statement����\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
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
