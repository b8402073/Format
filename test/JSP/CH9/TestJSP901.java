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
public class TestJSP901 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>getMetaData��k--�۰ʨ��o���W�ٻP���e</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>getMetaData��k--�۰ʨ��o���W�ٻP���e</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql, strValue;\n" +
"  boolean bolNull = false;\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  //String strName = request.getParameter(\"name\").trim();\n" +
"\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  sql = \"select * from book\"; // + strName;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  i = rsmd.getColumnCount();  //���o����`��\n" +
"\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"  int j = 0;\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>����</b></td>\");\n" +
"        for (intNo = 1; intNo <= i; intNo++) {\n" +
"            out.println(\"<td><b>\" + rsmd.getColumnName(intNo) + \"</b></td>\");\n" +
"        }\n" +
"        out.println(\"</tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     for (intNo = 1; intNo <= i; intNo++) {\n" +
"         strValue = rs.getString(intNo);\n" +
"         bolNull = rs.wasNull();\n" +
"         if (!bolNull)\n" +
"             out.println(\"<td>\" + strValue + \"</td>\");\n" +
"         else\n" +
"             out.println(\"<td>Empty</td>\");\n" +
"     }\n" +
"     out.println(\"</tr>\");\n" +
"\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"\n" +
"  // 7.����Statement����\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf901;
    public TestJSP901() {
        buf901=new StringBuffer(jsp);
    }
    @Test
    public void test901() {
        HTML that=new HTML(buf901);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
    
}
