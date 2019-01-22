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
"<head><title>���o/�]�wResultSet�����ݩ�</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>���o/�]�wResultSet�����ݩ�</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable;\n" +
"  int intDir, intType, intCon;\n" +
"  strTable = \"book\";\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4, 5.����SQL�ԭz�B�إ�ResultSet����\n" +
"  sql = \"select * from \" + strTable;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.�]�w�Ψ��X�������\n" +
"  intDir = rs.getFetchDirection();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"FETCH_FORWARD(1000), FETCH_REVERSE(1001), FETCH_UNKNOWN(1002)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeFetchDirection���G\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = ResultSet.FETCH_REVERSE;\n" +
"  rs.setFetchDirection(intDir);\n" +
"  out.println(\"�]�wFetchDirection���G\" + intDir + \"<p>\");\n" +
"\n" +
"  intDir = rs.getFetchDirection();\n" +
"  out.println(\"���ܫ᪺FetchDirection���G\" + intDir + \"<br><hr>\");\n" +
"  //\n" +
"  intType = rs.getType();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"TYPE_FORWARD_ONLY(1003), TYPE_SCROLL_INSENSITIVE(1004), TYPE_SCROLL_SENSITIVE(1005)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeResultSet Type���G\" + intType + \"<br><hr>\");\n" +
"  //\n" +
"  intCon = rs.getConcurrency();\n" +
"  out.println(\"<font color='blue'><b>\");\n" +
"  out.println(\"CONCUR_READ_ONLY(1007), CONCUR_UPDATABLE(1008)\");\n" +
"  out.println(\"</b></font><p>\");\n" +
"  out.println(\"�ثeResultSet Concurrency���G\" + intCon + \"<br><hr>\");\n" +
"  //\n" +
"  rs.last();  //����̫�@��\n" +
"  intCon = rs.getRow();  //���o�C���A�Y�`����\n" +
"  out.println(strTable + \" ��ƪ��O���@���G<b>\" + intCon + \"</b> ��<br><hr>\");\n" +
"\n" +
"  // 7.����ResultSet�PStatement����\n" +
"  if (rs != null) rs.close();\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
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
