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
 *E:/WEBAPPS/JSP_2/CH01/1-13.JSP
 * @author easterday
 */
public class TestJSP5 {
    String sJSP5="<%@ page import = \"java.util.Date\" contentType = \"text/html; charset=BIG5\" %>\n" +
"<%!\n" +
"private String checkNow()\n" +
"{\n" +
"  Date myDate = new Date();\n" +
"  int h = myDate.getHours();\n" +
"  String strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg = strMsg + \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleString() + \"</h2><hr>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>問候語--JSP版 (1-13.jsp)</title>\n" +
"</head>\n" +
"<body>\n" +
"<%= checkNow() %>\n" +
"</body>\n" +
"</html>";
    StringBuffer BufJSP5;
    public TestJSP5() {
        BufJSP5=new StringBuffer(sJSP5);
        for (int x=0; x<BufJSP5.length(); x++) {
            System.out.println ("x="+x+"   :"+BufJSP5.codePointAt(x));
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
    public void test5() {
        HTML that=new HTML(BufJSP5);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size()==that.Right.size());
        assertTrue(that.LeftOrRight.size()==that.Right.size()*2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"java.util.Date","text/html; charset=BIG5","<h2>午安","<h2>您好","，歡迎光臨！<p>現在時刻：","</h2><hr>"};
        String S1="<%@ page import = \"java.util.Date\" contentType = \"text/html; charset=BIG5\" %>";
        String S2="<%!\n" +
"private String checkNow()\n" +
"{\n" +
"  Date myDate = new Date();\n" +
"  int h = myDate.getHours();\n" +
"  String strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg = strMsg + \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleString() + \"</h2><hr>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>";
        String[] txtTag={S1,S2,"<html>" ,"<head>" ,"<title>" ,
"</title>" ,"</head>" ,"<body>" ,"<%= checkNow() %>" ,"</body>" ,"</html>"};
        
        ///////////////////////////////////////////////////////
        TestHTM1.assertDQ(that,  txtDQ,false);
        TestHTM1.assertTAG(that, txtTag,false);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch(j) {
                case 4:
                    assertTrue("問候語--JSP版 (1-13.jsp)".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp) );
            }      
    }



        
    }
}
