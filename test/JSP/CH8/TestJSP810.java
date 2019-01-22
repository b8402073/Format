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
"<title>execute、getResultSet、getUpdateCount、getMoreResults方法</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>execute、getResultSet、getUpdateCount、getMoreResults方法</h2>\n" +
"<%\n" +
"  int i = 1, intNo;\n" +
"  String sql;\n" +
"  boolean bolYes = true;\n" +
"  ResultSet rs = null;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"設計一筆複雜的SQL敘述:<p>\");\n" +
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
"        out.println(\"第 \" + i + \" 筆結果是ResultSet物件！<br>\");\n" +
"     } else {\n" +
"        intNo = stmt.getUpdateCount();\n" +
"        out.println(\"第 \" + i + \" 筆SQL敘述更新了 \" + intNo + \" 筆記錄！<br>\");\n" +
"     }\n" +
"     bolRs = stmt.getMoreResults();\n" +
"     if ((bolRs == false) && (stmt.getUpdateCount() == -1)) {\n" +
"        bolYes = false;  //跳出迴圈\n" +
"     }\n" +
"     i++;\n" +
"  }\n" +
"  out.println(\"<hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
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
