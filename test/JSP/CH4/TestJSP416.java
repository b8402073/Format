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
public class TestJSP416 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" \n" +
"    import=\"java.util.*\" %>\n" +
"<%!\n" +
"private String say_Hello2()\n" +
"{\n" +
"  String strMsg;\n" +
"  Calendar calC1 = new GregorianCalendar();\n" +
"  //取得星期幾(1~7)，減一，變成0~6\n" +
"  int intDay = calC1.get(calC1.DAY_OF_WEEK) - 1;\n" +
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
"<head><title>switch…case敘述 + GregorianCalendar Class</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>switch…case敘述 + GregorianCalendar Class</h2>\n" +
"<h3>每日一句(改用GregorianCalendar Class取得星期幾)：</h3>\n" +
"<%= say_Hello2() %>\n" +
"<hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf416;
    public TestJSP416() {
        buf416=new StringBuffer(jsp);
    }
    @Test
    public void test416() {
        HTML that=new HTML(buf416);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
