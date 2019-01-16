/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.CH1;

import HTM.TestHTM1;
import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * //E:\WEBAPPS\JSP_2\CH01\1-01.JSP
 *
 * @author easterday
 */
public class TestJSP2 {

    String sJSP2 = "<%@ page import = \"java.util.Date\"\n"
            + "    contentType = \"text/html; charset=BIG5\" %>\n"
            + "<html>\n"
            + "<head><title>�w����{ (1-01.jsp)</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h2>�z�n�A�w����{�I<p>\n"
            + "<% \n"
            + "   //���o�{�b����B�ɶ�\n"
            + "   Date x = new Date(); \n"
            + "%>\n"
            + "�{�b�ɨ�O�G<%= x.toLocaleString() %>\n"
            + "</h2>\n"
            + "<hr>\n"
            + "</body>\n"
            + "</html>";
    public StringBuffer BufJSP2;

    public TestJSP2() {
        BufJSP2 = new StringBuffer(sJSP2);
        for (int x = 0; x < BufJSP2.length(); x++) {
            System.out.println("x=" + x + "   :" + BufJSP2.codePointAt(x));
        }
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Test2() {
        HTML that = new HTML(BufJSP2);
        that.go();
        //that.PrintIssues();
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"java.util.Date","text/html; charset=BIG5"};
        String[] txtTag={"<%@ page import = \"java.util.Date\"\n"+
"    contentType = \"text/html; charset=BIG5\" %>" ,
"<html>" ,
"<head>" ,
"<title>" ,
"</title>" ,
"</head>" ,
"<body>" ,
"<h2>" ,
"<p>" ,
"<% \n" +
"   //���o�{�b����B�ɶ�\n" +
"   Date x = new Date(); \n" +
"%>" ,
"<%= x.toLocaleString() %>" ,
"</h2>" ,
"<hr>" ,
"</body>" ,
"</html>"};
        ///////////////////////////////////////////////////////

       TestHTM1.assertDQ(that, that.MyText, txtDQ, false);
       TestHTM1.assertTAG(that, that.MyText, txtTag, false);
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch (j) {
                case 3:
                    assertTrue("�w����{ (1-01.jsp)".equals(tmp));
                    break;
                case 7:
                    assertTrue("�z�n�A�w����{�I".equals(tmp));
                    break;
                case 9:
                    assertTrue("�{�b�ɨ�O�G".equals(tmp));
                    break;
                case 21:
                    assertTrue("�w����{--JavaScript��".equals(tmp));
                    break;
                case 28:
                    assertTrue("�ݭԻy--JSP��".equals(tmp));
                    break;
                default:
                    assertTrue("".equals(tmp));
            }
        }

    }
}
