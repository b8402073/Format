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
public class TestJSP905 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>�ק�O��--absolute�Brelative�BupdateRow</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>�ק�O��--absolute�Brelative�BupdateRow</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable, strValue;\n" +
"  int j;\n" +
"  strTable = \"book2\";\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(JDBCDriver);\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(strUrl);\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,\n" +
"         ResultSet.CONCUR_UPDATABLE);\n" +
"  // 4, 5.����SQL�ԭz�B�إ�ResultSet����\n" +
"  sql = \"select * from \" + strTable + \" order by bookno\";\n" +
"  ResultSet rs = stmt.executeQuery(sql);\n" +
"  // 6.�B�z���\n" +
"  // ResultSetMetaData rsmd = rs.getMetaData();\n" +
"  // intCols = rsmd.getColumnCount();  //���o����`��\n" +
"  rs.absolute(14);  //�����14���O��\n" +
"  //rs.updateString(1, \"NE20126\");\n" +
"  // �G�N�ϥγ�޸�\n" +
"  rs.updateString(\"bookname\", \"'05 ASP���Τj��--ASP�i���ޥ�\");\n" +
"  rs.updateRow();\n" +
"  //�Ϯ��ɧ�ΤU�@�D���O����\n" +
"  //rs.cancelRowUpdates();\n" +
"  //\n" +
"  rs.relative(-10);  //�����4���O��\n" +
"  // rs.updateString(1, \"DB20086\");\n" +
"  rs.updateString(2, \"���H��\");\n" +
"  rs.updateString(\"bookname\", \"Access 2002���媩�зǱЧ�\");\n" +
"  rs.updateRow();\n" +
"  //\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  rs.beforeFirst();\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>����</b></td>\");\n" +
"        out.println(\"<td><b>�Ѹ�</b></td>\");\n" +
"        out.println(\"<td><b>�@��</b></td>\");\n" +
"        out.println(\"<td><b>�ѦW</b></td></tr>\");\n" +
"     }\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + (j + 1) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookno\") + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");  //\n" +
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
    public StringBuffer buf905;
    public TestJSP905() {
        buf905=new StringBuffer(jsp);
    }
    @Test
    public void test905() {
        HTML that=new HTML(buf905);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
    
}
