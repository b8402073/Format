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
public class TestJSP415 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\"\n" +
"    import = \"java.util.*\" %>\n" +
"<%!\n" +
"private String say_Hello()\n" +
"{\n" +
"  String strMsg;\n" +
"  Calendar calC1 = new GregorianCalendar();\n" +
"  int datHour = calC1.get(calC1.HOUR_OF_DAY);  //���o�p��(0~23)\n" +
"  //\n" +
"  if (datHour <= 8) {\n" +
"     strMsg = \"�ַǳƥh�W�Z�F�I\";\n" +
"  } else if (datHour <= 18) {\n" +
"     strMsg = \"�j�դѡA�O���O�ΤF�I\";\n" +
"  } else if (datHour >= 20) {\n" +
"     strMsg = \"�O���F�A�֦^�a�a�I\";\n" +
"  } else {\n" +
"     strMsg = \"����n�U�A���B����ǳƦ^�a�a�I\";\n" +
"  }\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>if�Kelse if�Kelse�ԭz + GregorianCalendar Class</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>if�Kelse if�Kelse + GregorianCalendar Class</h2>\n" +
"<h3>�C��@�y�G</h3>\n" +
"<%= say_Hello() %>\n" +
"<hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf415;
    public TestJSP415() {
        buf415=new StringBuffer(jsp);
    }
    @Test
    public void test415() {
        HTML that=new HTML(buf415);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
