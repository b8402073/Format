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
public class TestJSP902 {
     public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>getMetaData��k--���oTable������T</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>getMetaData��k--���oTable������T</h2>\n" +
"<%\n" +
"  int i = 0, intNo = 0;\n" +
"  String sql;\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  // &useUnicode=true&characterEncoding=big5\n" +
"  String strName = request.getParameter(\"name\").trim();\n" +
"  //if (strName.length() == 0) strName = \"book\";\n" +
"\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  sql = \"select * from \" + strName;\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  i = rsmd.getColumnCount();  //���o����`��\n" +
"\n" +
"  out.println(\"<h3>Table name: \" + rsmd.getTableName(1) + \"</hr>\");\n" +
"  //out.println(\"Catalog name: \" + rsmd.getCatalogName(1) + \"</hr>\");\n" +
"  out.println(\"<table width='90%' border=1>\");\n" +
"\n" +
"  out.println(\"<tr bgcolor='yellow'>\");\n" +
"  out.println(\"<td><b>���W��</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td><b>\" + rsmd.getColumnName(intNo) + \"</b></td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>��ƫ��A</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnTypeName(intNo) + \"(\");\n" +
"      out.println(rsmd.getColumnType(intNo) + \")</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>������</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnDisplaySize(intNo) + \"</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"<tr>\");\n" +
"  out.println(\"<td><b>������O�W��</b></td>\");\n" +
"  for (intNo = 1; intNo <= i; intNo++) {\n" +
"      out.println(\"<td>\" + rsmd.getColumnClassName(intNo) + \"</td>\");\n" +
"  }\n" +
"  out.println(\"</tr>\");\n" +
"  //\n" +
"  out.println(\"</table><br><hr>\");\n" +
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
     public StringBuffer buf902;
    public TestJSP902() {
        buf902=new StringBuffer(jsp);
    }
    @Test
    public void test902() {
        HTML that=new HTML(buf902);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
