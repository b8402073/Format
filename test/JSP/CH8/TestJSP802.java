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
public class TestJSP802 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>使用Connection介面</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>Connection介面的應用一</h2>\n" +
"<%\n" +
"  boolean bolAuto, bolRO, bolClosed;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"\n" +
"  bolAuto = con.getAutoCommit();\n" +
"  out.println(\"目前auto-commit模式：\" + bolAuto + \"<p>\");\n" +
"\n" +
"  bolAuto = false;\n" +
"  out.println(\"設定auto-commit模式為：\" + bolAuto + \"<p>\");\n" +
"  con.setAutoCommit(bolAuto);\n" +
"\n" +
"  bolAuto = con.getAutoCommit();\n" +
"  out.println(\"改變後的auto-commit模式：\" + bolAuto + \"<br><hr>\");\n" +
"  //\n" +
"  bolRO = con.isReadOnly();\n" +
"  out.println(\"目前Read Only模式：\" + bolRO + \"<p>\");\n" +
"\n" +
"  bolRO = true;\n" +
"  out.println(\"設定Read Only模式為：\" + bolRO + \"<p>\");\n" +
"  con.setReadOnly(bolRO);\n" +
"\n" +
"  bolRO = con.isReadOnly();\n" +
"  out.println(\"改變後的Read Only模式：\" + bolRO + \"<br><hr>\");\n" +
"  //  \n" +
"  bolClosed = con.isClosed();\n" +
"  out.println(\"目前Connection是否被close：\" + bolClosed + \"<p>\");\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  out.println(\"關閉Connection...<p>\");\n" +
"  con.close();\n" +
"\n" +
"  bolClosed = con.isClosed();\n" +
"  out.println(\"目前Connection是否被close：\" + bolClosed + \"<hr>\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
   public StringBuffer buf802;        
    public TestJSP802() {
        buf802=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf802);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
