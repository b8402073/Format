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
public class TestJSP401 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import = \"java.util.*\" %>\n" +
"<%!\n" +
"private String say_Hello()\n" +
"{\n" +
"  String strMsg;\n" +
"  Date myDate = new Date();\n" +
"  int datHour = myDate.getHours();  //取得小時(0~23)\n" +
"  //\n" +
"  if (datHour <= 8) {\n" +
"     strMsg = \"快準備去上班了！\";\n" +
"  } else if (datHour <= 18) {\n" +
"     strMsg = \"大白天，別打瞌睡了！\";\n" +
"  } else if (datHour >= 20) {\n" +
"     strMsg = \"別撐了，快回家吧！\";\n" +
"  } else {\n" +
"     strMsg = \"身體要顧，收拾行李準備回家吧！\";\n" +
"  }\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>if…else if…else敘述 -- 4-01.jsp</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>流程控制 -- if…else if…else</h2>\n" +
"<h3>每日一句：</h3>\n" +
"<%= say_Hello() %>\n" +
"<hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf401;
    public TestJSP401() {
        buf401=new StringBuffer(jsp);
    }
    @Test
    public void test401() {
        HTML that=new HTML(buf401);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }  
}
