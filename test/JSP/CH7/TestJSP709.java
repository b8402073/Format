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
"<HEAD><TITLE>刪除一筆記錄</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<h2>刪除一筆記錄</h2>\n" +
"<%\n" +
"  int i = 0;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  // 4.透過Statement物件執行SQL敘述\n" +
"  // 5.取得執行後的ResultSet物件，或是被異動的資料筆數:\n" +
"  String sql = \"delete from book2 where bookno='NE20999'\";\n" +
"  i = stmt.executeUpdate(sql);\n" +
"  // 6.進行資料的處理\n" +
"  if (i > 0) {\n" +
"     out.println(\"已刪除書號: NE20999!<br>\");\n" +
"  }\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  stmt.close();\n" +
"  // 8.關閉Connection物件\n" +
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
