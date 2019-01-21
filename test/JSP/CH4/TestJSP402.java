/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH4;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP402 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import = \"java.util.*\" %>\n" +
"<%!\n" +
"private String say_Hello2()\n" +
"{\n" +
"  String strMsg;\n" +
"  Date myDate = new Date();\n" +
"  int intDay = myDate.getDay();  //取得星期幾(0~6)\n" +
"  //\n" +
"  switch (intDay) {\n" +
"    case 1 :\n" +
"      strMsg = \"星期一，猴子穿新衣！\";\n" +
"      break;\n" +
"    case 2 :\n" +
"      strMsg = \"星期二，猴子肚子餓！\";\n" +
"      break;\n" +
"    case 3 :\n" +
"      strMsg = \"星期三，猴子去爬山！\";\n" +
"      break;\n" +
"    case 4 :\n" +
"      strMsg = \"星期四，猴子去考試！\";\n" +
"      break;\n" +
"    case 5 :\n" +
"      strMsg = \"星期五，猴子去跳舞！\";\n" +
"      break;\n" +
"    case 6 :\n" +
"      strMsg = \"星期六，猴子去斗六！\";\n" +
"      break;\n" +
"    default :\n" +
"      strMsg = \"星期日，好好休息吧！\";\n" +
"  }\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>switch…case敘述 -- 4-02.jsp</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>流程控制 -- switch…case</h2>\n" +
"<h3>每日一句(switch版)：</h3>\n" +
"<%= say_Hello2() %>\n" +
"<hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf402;
    public TestJSP402() {
        buf402=new StringBuffer(jsp);
    }
    @Test
    public void test402() {
        HTML that=new HTML(buf402);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
