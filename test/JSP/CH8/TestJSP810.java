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
public class TestJSP810 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head>\n" +
"<title>execute�BgetResultSet�BgetUpdateCount�BgetMoreResults��k</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>execute�BgetResultSet�BgetUpdateCount�BgetMoreResults��k</h2>\n" +
"<%\n" +
"  int i = 1, intNo;\n" +
"  String sql;\n" +
"  boolean bolYes = true;\n" +
"  ResultSet rs = null;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"�]�p�@��������SQL�ԭz:<p>\");\n" +
"  /* sql = \"insert into book2 values('NE20991','Alvin','JSP 2.0') \\n\" + \n" +
"        \"select * from book2 where bookno='NE20991' \\n\" +\n" +
"        \"delete from book2 where bookno='NE20991';\"; */\n" +
"  sql = \"select * from book2 where bookno like 'NE20%';\";\n" +
"  boolean bolRs = stmt.execute(sql);\n" +
"  out.println(sql + \"<br><hr>\");\n" +
"  \n" +
"  while (bolYes) {\n" +
"     if (bolRs) {  //ResultSet\n" +
"        rs = stmt.getResultSet();\n" +
"        out.println(\"�� \" + i + \" �����G�OResultSet����I<br>\");\n" +
"     } else {\n" +
"        intNo = stmt.getUpdateCount();\n" +
"        out.println(\"�� \" + i + \" ��SQL�ԭz��s�F \" + intNo + \" ���O���I<br>\");\n" +
"     }\n" +
"     bolRs = stmt.getMoreResults();\n" +
"     if ((bolRs == false) && (stmt.getUpdateCount() == -1)) {\n" +
"        bolYes = false;  //���X�j��\n" +
"     }\n" +
"     i++;\n" +
"  }\n" +
"  out.println(\"<hr>\");\n" +
"\n" +
"  // 7.����Statement����\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf810;     
    public TestJSP810() {
        buf810=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf810);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }       
}
