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
"<head><title>executeUpdate�BexecuteQuery��k</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>executeUpdate�BexecuteQuery��k</h2>\n" +
"<%\n" +
"  int i = 0, intNo;\n" +
"  String sql;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"�s�W�ⵧ�O��:<br>\");\n" +
"  sql = \"insert into book2 values('NE20991','Alvin Liao','JSP 2.0')\";\n" +
"  stmt.executeUpdate(sql);\n" +
"  out.println(\"1. \" + sql + \"<br>\");\n" +
"\n" +
"  sql = \"insert into book2 values('NE20992','Alvin','Java 5.0��¦����')\";\n" +
"  stmt.executeUpdate(sql);\n" +
"  out.println(\"2. \" + sql + \"<br><hr>\");\n" +
"  //\n" +
"  // 5.���o����᪺ResultSet����A�άO�Q���ʪ���Ƶ���:\n" +
"  sql = \"select * from book2 where bookno like 'NE2099%' order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.�i���ƪ��B�z\n" +
"  out.println(\"��ܷs�W���ⵧ�O��:<br>\");\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  while (rs.next()) {\n" +
"     if (i == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>�Ѹ�</b></td>\");\n" +
"        out.println(\"<td><b>�@��</b></td>\");\n" +
"        out.println(\"<td><b>�ѦW</b></td></tr>\");\n" +
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
"  out.println(\"�R���s�W���O��...<p>\");\n" +
"  sql = \"delete from book2 where bookno like 'NE2099%'\";\n" +
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
