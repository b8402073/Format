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
public class TestJSP805 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>addBatch�BexecuteBatch�BclearBatch��k</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>addBatch�BexecuteBatch�BclearBatch��k</h2>\n" +
"<%\n" +
"  int i, intNo;\n" +
"  String sql;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"�[�J�T��SQL�ԭz�ܧ妸�M��:<br>\");\n" +
"  sql = \"insert into book2 values('NE20991','Alvin','JSP 2.0')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"1. \" + sql + \"<br>\");\n" +
"  sql = \"insert into book2 values('NE20992','Alvin','Java 5.0��¦����')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"2. \" + sql + \"<br>\");\n" +
"  sql = \"insert into book2 values('NE20993','Alvin Liao','ASP.NET 2.0')\";\n" +
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
"  out.println(\"�M��SQL�妸�M��P�s�W���O��...<p>\");\n" +
"  stmt.clearBatch();\n" +
"\n" +
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
    public StringBuffer buf805;       
    public TestJSP805() {
        buf805=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf805);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
