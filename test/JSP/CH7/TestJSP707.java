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
public class TestJSP707 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<HTML>\n" +
"<HEAD><TITLE>�s�W�@���O��</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<h2>�s�W�@���O��</h2>\n" +
"<center>\n" +
"<%\n" +
"  int i = 0;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4.�z�LStatement�������SQL�ԭz\n" +
"  // 5.���o����᪺ResultSet����A�άO�Q���ʪ���Ƶ���:\n" +
"  String sql = \"select * from book2\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.�i���ƪ��B�z\n" +
"  rs.moveToInsertRow(); // moves cursor to the insert row\n" +
"  // updates the first column of the insert row\n" +
"  rs.updateString(1, \"NE20999\");\n" +
"  rs.updateString(2, \"���H��\");\n" +
"  rs.updateString(3, \"JSP 2.0 Pro�ڤ]�|\");\n" +
"  rs.insertRow();\n" +
"  // rs.moveToCurrentRow();\n" +
"  rs.close();\n" +
"\n" +
"  sql = \"select * from book2 where bookno='NE20999'\";\n" +
"  rs = stmt.executeQuery(sql);\n" +
"\n" +
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
"\n" +
"     i++;\n" +
"  }\n" +
"  out.println(\"</table>\");\n" +
"\n" +
"  // 7.����Statement����\n" +
"  stmt.close();\n" +
"  // 8.����Connection����\n" +
"  con.close();\n" +
"%>\n" +
"</center>\n" +
"</BODY>\n" +
"</HTML>";
    public StringBuffer buf707;    
    public TestJSP707() {
        buf707=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf707);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
}
