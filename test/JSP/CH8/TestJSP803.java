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
public class TestJSP803 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>�ϥ�Connection����</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>Connection���������ΤG</h2>\n" +
"<%\n" +
"  PreparedStatement pstmt = null;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.�z�LConnection����إ�Statement����\n" +
"  Statement stmt = con.createStatement();\n" +
"  // 4.�z�LStatement�������SQL�ԭz\n" +
"  // 5.���o����᪺ResultSet����A�άO�Q���ʪ���Ƶ���:\n" +
"  String sql = \"insert into book2 values('NE20999','Alvin','JSP 2.0')\";\n" +
"  int intNo = stmt.executeUpdate(sql);  // > 0 ��ܦ��\�s�W\n" +
"  // 6.�i���ƪ��B�z\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"�s�W�@���O���G<br>\");\n" +
"     out.println(\"'NE20999','Alvin','JSP 2.0'<hr>\");\n" +
"     sql = \"update book2 set bookname = ? where bookno = ?\";\n" +
"     pstmt = con.prepareStatement(sql);\n" +
"     pstmt.setString(1, \"JSP 2.0������s\");\n" +
"     pstmt.setString(2, \"NE20999\");\n" +
"     intNo = pstmt.executeUpdate();  // > 0 ��ܧ�s���\\n" +
"     if (intNo > 0) {\n" +
"        out.println(\"��s�@���O���G<br>\");\n" +
"        out.println(\"'NE20999','Alvin','JSP 2.0������s'<hr>\");        \n" +
"     }\n" +
"  }\n" +
"  sql = \"delete from book2 where bookno = 'NE20999'\";\n" +
"  //Statement stmt2 = con.createStatement();\n" +
"\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 ��ܧR���s�W\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"�R���@���O���G<br>\");\n" +
"     out.println(\"'NE20999','Alvin','JSP 2.0������s'<hr>\");        \n" +
"  }\n" +
"\n" +
"  // 7.����Statement����\n" +
"  if (stmt != null) stmt.close();\n" +
"  if (pstmt != null) pstmt.close();\n" +
"\n" +
"  // 8.����Connection����\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf803;        
    
    public TestJSP803() {
    
        buf803=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf803);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }   
}
