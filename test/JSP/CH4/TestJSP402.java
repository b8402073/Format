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
"  int intDay = myDate.getDay();  //���o�P���X(0~6)\n" +
"  //\n" +
"  switch (intDay) {\n" +
"    case 1 :\n" +
"      strMsg = \"�P���@�A�U�l��s��I\";\n" +
"      break;\n" +
"    case 2 :\n" +
"      strMsg = \"�P���G�A�U�l�{�l�j�I\";\n" +
"      break;\n" +
"    case 3 :\n" +
"      strMsg = \"�P���T�A�U�l�h���s�I\";\n" +
"      break;\n" +
"    case 4 :\n" +
"      strMsg = \"�P���|�A�U�l�h�ҸաI\";\n" +
"      break;\n" +
"    case 5 :\n" +
"      strMsg = \"�P�����A�U�l�h���R�I\";\n" +
"      break;\n" +
"    case 6 :\n" +
"      strMsg = \"�P�����A�U�l�h�椻�I\";\n" +
"      break;\n" +
"    default :\n" +
"      strMsg = \"�P����A�n�n�𮧧a�I\";\n" +
"  }\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>switch�Kcase�ԭz -- 4-02.jsp</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>�y�{���� -- switch�Kcase</h2>\n" +
"<h3>�C��@�y(switch��)�G</h3>\n" +
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
