/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH10;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP1006 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>�ϥ�Java Bean�s�����</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>�ϥ�Java Bean�s�����</h2>\n" +
"<jsp:useBean id=\"beanAccess\" class=\"bean.accessDB\" scope=\"request\" />\n" +
"<%\n" +
"  String sql, strTable, strValue=\"\";\n" +
"  int j;\n" +
"  strTable = \"book2\";\n" +
"  // 2.�z�LBean���oConnection����\n" +
"  beanAccess.setConnection(\"access\");\n" +
"  Connection con = beanAccess.getConnection();\n" +
"  // 3.Statement�����Bean����\n" +
"  // 4, 5.�ǳơB����SQL�ԭz\n" +
"  sql = \"insert into \" + strTable + \" values('NE20999', '���H��', '''05 JSP 2.0 Pro�ڤ]�|')\";\n" +
"  j = beanAccess.getUpdate(sql);\n" +
"  if (j > 0) {\n" +
"     out.println(\"sql = \" + sql + \"<p>\");\n" +
"     out.println(\"���\�s�W <font color='red'>\" + j + \"</font> ���O��!<hr>\");\n" +
"  }\n" +
"  // 6.�B�z��ơA���^ResultSet����\n" +
"  sql = \"select * from \" + strTable + \" where bookno='NE20999'\";\n" +
"  ResultSet rs = beanAccess.getResultSet(sql);\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {  //������W��\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>�Ѹ�</b></td>\");\n" +
"        out.println(\"<td><b>�@��</b></td>\");\n" +
"        out.println(\"<td><b>�ѦW</b></td></tr>\");\n" +
"     }\n" +
"     strValue = rs.getString(\"bookno\");\n" +
"     out.println(\"<tr>\");\n" +
"     out.println(\"<td>\" + strValue + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(2) + \"</td>\");\n" +
"     out.println(\"<td>\" + rs.getString(\"bookname\") + \"</td>\");\n" +
"     out.println(\"</tr>\");\n" +
"     j++;\n" +
"  }\n" +
"  out.println(\"</table><hr>\");\n" +
"  //�R���O��\n" +
"  // strValue = \"NE20999\";\n" +
"  sql = \"delete from \" + strTable + \" where bookno = '\" + strValue + \"'\";\n" +
"  j = beanAccess.getUpdate(sql);\n" +
"  if (j > 0) {\n" +
"     out.println(\"sql = \" + sql + \"<p>\");\n" +
"     //out.println(\"<font color='red'>���\�R�� \" + strValue + \" !</font><hr>\");\n" +
"     out.println(\"���\�R�� <font color='red'>\" + j + \"</font> ���O��!<hr>\");\n" +
"  }\n" +
"  // 7.����ResultSet�PStatement����\n" +
"  if (rs != null) rs.close();\n" +
"  //if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1006;    
    public TestJSP1006() {
        buf1006=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf1006);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
