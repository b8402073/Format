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
"<head><title>addBatch、executeBatch、clearBatch方法</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>addBatch、executeBatch、clearBatch方法</h2>\n" +
"<%\n" +
"  int i, intNo;\n" +
"  String sql;\n" +
"  // 1.載入JDBC驅動程式\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.透過DriverManager類別建立Connection物件\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"  // 3.透過Connection物件建立Statement物件\n" +
"  Statement stmt = con.createStatement();\n" +
"  //\n" +
"  out.println(\"加入三筆SQL敘述至批次清單:<br>\");\n" +
"  sql = \"insert into book2 values('NE20991','Alvin','JSP 2.0')\";\n" +
"  stmt.addBatch(sql);\n" +
"  out.println(\"1. \" + sql + \"<br>\");\n" +
"  sql = \"insert into book2 values('NE20992','Alvin','Java 5.0基礎應用')\";\n" +
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
"                 out.println(\"第 \" + (i+1) + \" 筆執行成功，但無傳回值！<br>\");\n" +
"                 break;\n" +
"               case Statement.EXECUTE_FAILED:\n" +
"                 out.println(\"第 \" + (i+1) + \" 筆執行失敗！<br>\");\n" +
"                 break;\n" +
"               default:\n" +
"                 out.println(\"第 \" + (i+1) + \" 筆執行成功，更新 \" + intCount[i] + \" 筆記錄！<br>\");\n" +
"            }\n" +
"        }  // end of for\n" +
"        out.println(\"<hr>\");\n" +
"     }  // end of if\n" +
"  } catch (SQLException se) {\n" +
"     out.println(\"SQL Exception：<br><font color='red'>\" + se.toString() + \"</font><hr>\");\n" +
"  }\n" +
"\n" +
"  out.println(\"清除SQL批次清單與新增的記錄...<p>\");\n" +
"  stmt.clearBatch();\n" +
"\n" +
"  sql = \"delete from book2 where bookno like 'NE2099%'\";\n" +
"  intNo = stmt.executeUpdate(sql);  // > 0 表示刪除成功\n" +
"  if (intNo > 0) {\n" +
"     out.println(\"刪除 \" + intNo + \" 筆記錄成功！<br>\");\n" +
"  }\n" +
"  out.println(\"Ok...<br><hr>\");\n" +
"\n" +
"  // 7.關閉Statement物件\n" +
"  if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
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
