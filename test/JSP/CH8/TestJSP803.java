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
"<head><title>使用Connection介面</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>Connection介面的應用二</h2>\n" +
"<%\n" +
"  PreparedStatement pstmt = null;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  // 4.透過Statement物件執行SQL敘述\n" +
"  // 5.取得執行後的ResultSet物件，或是被異動的資料筆數:\n" +
"  String sql = \"insert into book2 values('NE20999','Alvin','JSP 2.0')\";\n" +
"  int intNo = stmt.executeUpdate(sql);  // > 0 表示成功新增\n" +
"  // 6.進行資料的處理\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"新增一筆記錄：<br>\");\n" +
"     out.println(\"'NE20999','Alvin','JSP 2.0'<hr>\");\n" +
"     sql = \"update book2 set bookname = ? where bookno = ?\";\n" +
"     pstmt = con.prepareStatement(sql);\n" +
"     pstmt.setString(1, \"JSP 2.0徹底研究\");\n" +
"     pstmt.setString(2, \"NE20999\");\n" +
"     intNo = pstmt.executeUpdate();  // > 0 表示更新成功\n" +
"     if (intNo > 0) {\n" +
"        out.println(\"更新一筆記錄：<br>\");\n" +
"        out.println(\"'NE20999','Alvin','JSP 2.0徹底研究'<hr>\");        \n" +
"     }\n" +
"  }\n" +
"  sql = \"delete from book2 where bookno = 'NE20999'\";\n" +
"  //Statement stmt2 = con.createStatement();\n" +
"\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 表示刪除新增\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"刪除一筆記錄：<br>\");\n" +
"     out.println(\"'NE20999','Alvin','JSP 2.0徹底研究'<hr>\");        \n" +
"  }\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"  if (pstmt != null) pstmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
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
