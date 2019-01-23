/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH10;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP1006 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\" import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>使用Java Bean存取資料</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>使用Java Bean存取資料</h2>\n" +
"<jsp:useBean id=\"beanAccess\" class=\"bean.accessDB\" scope=\"request\" />\n" +
"<%\n" +
"  String sql, strTable, strValue=\"\";\n" +
"  int j;\n" +
"  strTable = \"book2\";\n" +
"  // 2.透過Bean取得Connection物件\n" +
"  beanAccess.setConnection(\"access\");\n" +
"  Connection con = beanAccess.getConnection();\n" +
"  // 3.Statement物件由Bean產生\n" +
"  // 4, 5.準備、執行SQL敘述\n" +
"  sql = \"insert into \" + strTable + \" values('NE20999', '廖信彥', '''05 JSP 2.0 Pro我也會')\";\n" +
"  j = beanAccess.getUpdate(sql);\n" +
"  if (j > 0) {\n" +
"     out.println(\"sql = \" + sql + \"<p>\");\n" +
"     out.println(\"成功新增 <font color='red'>\" + j + \"</font> 筆記錄!<hr>\");\n" +
"  }\n" +
"  // 6.處理資料，取回ResultSet物件\n" +
"  sql = \"select * from \" + strTable + \" where bookno='NE20999'\";\n" +
"  ResultSet rs = beanAccess.getResultSet(sql);\n" +
"  out.println(\"<table width='96%' border=1>\");\n" +
"  j = 0;\n" +
"  while (rs.next()) {\n" +
"     if (j == 0) {  //顯示欄位名稱\n" +
"        out.println(\"<tr bgcolor='yellow'>\");\n" +
"        out.println(\"<td><b>書號</b></td>\");\n" +
"        out.println(\"<td><b>作者</b></td>\");\n" +
"        out.println(\"<td><b>書名</b></td></tr>\");\n" +
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
"  //刪除記錄\n" +
"  // strValue = \"NE20999\";\n" +
"  sql = \"delete from \" + strTable + \" where bookno = '\" + strValue + \"'\";\n" +
"  j = beanAccess.getUpdate(sql);\n" +
"  if (j > 0) {\n" +
"     out.println(\"sql = \" + sql + \"<p>\");\n" +
"     //out.println(\"<font color='red'>成功刪除 \" + strValue + \" !</font><hr>\");\n" +
"     out.println(\"成功刪除 <font color='red'>\" + j + \"</font> 筆記錄!<hr>\");\n" +
"  }\n" +
"  // 7.關閉ResultSet與Statement物件\n" +
"  if (rs != null) rs.close();\n" +
"  //if (stmt != null) stmt.close();\n" +
"\n" +
"  // 8.關閉Connection物件\n" +
"  if (con != null) con.close();\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf1006;    
    public TestJSP1006() {
        buf1006=new StringBuffer(jsp);
    }
    @Test
    public void test933() {
        HTML that=new HTML(buf1006);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }     
        
}
