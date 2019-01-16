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
 * E:/WEBAPPS/JSP_2/CH01/1-03.JSP
 * @author easterday
 */
public class TestJSP4 {
    String sJSP4="<%@ page import = \"java.util.Date\"\n" +
"    contentType = \"text/html; charset=BIG5\" %>\n" +
"<html>\n" +
"<head><title>問候語--JSP版 (1-03.jsp)</title>\n" +
"</head>\n" +
"<body>\n" +
"<%\n" +
"  Date myDate = new Date();\n" +
"  int h = myDate.getHours();\n" +
"  String strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleString() + \"</h2><hr>\";\n" +
"  out.println(strMsg);\n" +
"%>\n" +
"</body>\n" +
"</html>";
    StringBuffer BufJSP4;
    public TestJSP4() {
        BufJSP4=new StringBuffer(sJSP4);
        for (int x=0; x<BufJSP4.length(); x++) {
            System.out.println ("x="+x+"   :"+BufJSP4.codePointAt(x));
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
    public void test4() {
        HTML that=new HTML(BufJSP4);
        that.go();
        //that.PrintIssues();
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size()==that.Right.size());
        assertTrue(that.LeftOrRight.size()==that.Right.size()*2);
        ///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////
        TestHTM1.assertDQ(that, that.MyText, txtDQ,false);
        TestHTM1.assertTAG(that, that.MyText, txtTag,false);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch(j) {
                case 3:
                    assertTrue("基本觀念的建立".equals(tmp)); break;
                case 8:
                    assertTrue("Ch01 -- 基本觀念的建立".equals(tmp)); break;
                case 16:
                    assertTrue("歡迎光臨".equals(tmp)); break;
                case 21:
                    assertTrue("歡迎光臨--JavaScript版".equals(tmp)); break; 
                case 28:
                    assertTrue("問候語--JSP版".equals(tmp)); break;     
                default:
                    assertTrue("".equals(tmp) );
            }      
    }        
    }
}
