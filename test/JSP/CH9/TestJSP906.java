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
public class TestJSP906 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>�s�W�P�R���O��--insertRow�BdeleteRow</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>�s�W�P�R���O��--insertRow�BdeleteRow</h2>\n" +
"<%\n" +
"  String JDBCDriver = \"sun.jdbc.odbc.JdbcOdbcDriver\";\n" +
"  String strUrl = \"jdbc:odbc:JSPAll\";\n" +
"  String sql, strTable, strValue=\"\";\n" +
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
"  rs.moveToInsertRow();  //������Цܷs�W�O���W\n" +
"  rs.updateString(1, \"NE20999\");\n" +
"  rs.updateString(2, \"���H��\");\n" +
"  // �G�N�ϥγ�޸�\n" +
"  rs.updateString(3, \"'05 JSP 2.0 Pro�ڤ]�|\");\n" +
"  rs.insertRow();\n" +
"  //rs.moveToCurrentRow();\n" +
"  rs.close();\n" +
"  //\n" +
"  sql = \"select * from \" + strTable + \" where bookno='NE20999'\";\n" +
"  rs = stmt.executeQuery(sql);\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {  //������W��\n" +
"        out.println(\"<tr bgcolor='lightblue'>\");\n" +
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
"  //rs.close();\n" +
"  rs.first();  //����ŦX���󪺲Ĥ@���O��\n" +
"  //\n" +
"  //rs = stmt.executeQuery(sql);\n" +
"  //while (rs.next()) {\n" +
"     rs.deleteRow();  //�R���ӵ��O��\n" +
"     out.println(\"<font color='red'>���\�R�� \" + strValue + \" !</font><hr>\");\n" +
"  //}\n" +
"  //\n" +
"  // 7.����ResultSet�PStatement����\n" +
"  if (rs != null) rs.close();\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";    
    public StringBuffer buf906;
    public TestJSP906() {
        buf906=new StringBuffer(jsp);
    }
    @Test
    public void test906() {
        HTML that=new HTML(buf906);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
   
}
