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
public class TestJSP709 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<HTML>\n" +
"<HEAD><TITLE>�R���@���O��</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<h2>�R���@���O��</h2>\n" +
"<%\n" +
"  int i = 0;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  // 4.�z�LStatement�������SQL�ԭz\n" +
"  // 5.���o����᪺ResultSet����A�άO�Q���ʪ���Ƶ���:\n" +
"  String sql = \"delete from book2 where bookno='NE20999'\";\n" +
"  i = stmt.executeUpdate(sql);\n" +
"  // 6.�i���ƪ��B�z\n" +
"  if (i > 0) {\n" +
"     out.println(\"�w�R���Ѹ�: NE20999!<br>\");\n" +
"  }\n" +
"\n" +
"  // 7.����Statement����\n" +
"  stmt.close();\n" +
"  // 8.����Connection����\n" +
"  con.close();\n" +
"%>\n" +
"</BODY>\n" +
"</HTML>";
    public StringBuffer buf709;
    public TestJSP709() {
        buf709=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf709);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
}
