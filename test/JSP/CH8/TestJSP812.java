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
public class TestJSP812 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>addBatch�BexecuteBatch�BclearBatch��k</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>addBatch�BexecuteBatch�BclearBatch��k</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql;\n" +
"  // String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  // String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strUrl = \"jdbc:mysql://127.0.0.1:3306/test?user=root&characterEncoding=big5\";\n" +
"  String JDBCDriver = \"com.mysql.jdbc.Driver\";\n" +
"\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"�[�J�T��SQL�ԭz�ܧ妸�M��:<br>\");\n" +
"  sql = \"insert into book values('NE20991','Alvin','JSP 2.0������s')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"1. \" + sql + \"<br>\");\n" +
"  sql = \"insert into book values('NE20992','Alvin','Java 5.0��¦����')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"2. \" + sql + \"<br>\");\n" +
"  sql = \"insert into book values('NE20993','���H��','ASP.NET 2.0')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"3. \" + sql + \"<br><hr>\");\n" +
"  //\n" +
"\n" +
"  try {\n" +
"     int intCount[] = stmt.executeBatch();\n" +
"     if (intCount.length > 0) {\n" +
"        for (i = 0; i < intCount.length; i++) {\n" +
"            switch (intCount[i]) {\n" +
"               case Statement.SUCCESS_NO_INFO:\n" +
"                 out.println(\"�� \" + (i+1) + \" �����榨�\�A���L�Ǧ^�ȡI<br>\");\n" +
"                 break;\n" +
"               case Statement.EXECUTE_FAILED:\n" +
"                 out.println(\"�� \" + (i+1) + \" �����楢�ѡI<br>\");\n" +
"                 break;\n" +
"               default:\n" +
"                 out.println(\"�� \" + (i+1) + \" �����榨�\�A��s \" + intCount[i] + \" ���O���I<br>\");\n" +
"            }\n" +
"        }  // end of for\n" +
"        out.println(\"<hr>\");\n" +
"     }  // end of if\n" +
"  } catch (SQLException se) {\n" +
"     out.println(\"SQL Exception�G<br><font color='red'>\" + se.toString() + \"</font><hr>\");\n" +
"  }\n" +
"\n" +
"  sql = \"SELECT * FROM book where bookno like 'NE2099%'\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  i =0;\n" +
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
"  out.println(\"�M��SQL�妸�M��P�s�W���O��...<p>\");\n" +
"  stmt.clearBatch();\n" +
"\n" +
"  sql = \"delete from book where bookno like 'NE2099%'\";\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 ��ܧR�����\\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"�R�� \" + intNo + \" ���O�����\�I<br>\");\n" +
"  }\n" +
"  out.println(\"Ok...<br><hr>\");\n" +
"\n" +
"  // 7.����Statement����\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf812;        
    public TestJSP812() {
        buf812=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf812);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
