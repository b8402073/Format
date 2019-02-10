/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH1;

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
 * E:/WEBAPPS/JSP_2/CH01/1-02.HTM
 *
 * @author easterday
 */
public class TestJSP3 {

    String sJSP3 = "<html>\n"
            + "<head>\n"
            + "<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n"
            + "<title>問候語--HTML版 (1-02.htm)</title>\n"
            + "<script Language=\"JavaScript\">\n"
            + "<!--\n"
            + "function checkNow()\n"
            + "{\n"
            + "  myDate = new Date();\n"
            + "  h = myDate.getHours();\n"
            + "  var strMsg;\n"
            + "  if ((h > 12) && (h < 18)) {\n"
            + "     strMsg = \"<h2>午安\";\n"
            + "  } else {\n"
            + "     strMsg = \"<h2>您好\";\n"
            + "  }\n"
            + "  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleTimeString() + \"</h2><hr>\";\n"
            + "  document.write(strMsg);\n"
            + "}\n"
            + "// -->\n"
            + "</script>\n"
            + "</head>\n"
            + "<body onLoad=\"checkNow()\">\n"
            + "</body>\n"
            + "</html>";
    StringBuffer BufJSP3;

    public TestJSP3() {
        BufJSP3 = new StringBuffer(sJSP3);
        for (int x = 0; x < BufJSP3.length(); x++) {
            System.out.println("x=" + x + "   :" + BufJSP3.codePointAt(x));
        }
    }


    @Test
    public void Test3() {
        HTML that = new HTML(BufJSP3);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);   
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"Content-Type",
"text/html; charset=big5",
"JavaScript",
"<h2>午安",
"<h2>您好",
"，歡迎光臨！<p>現在時刻：",
"</h2><hr>",
"checkNow()" };
        String[] txtTag={"<html>" ,
"<head>" ,
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">" ,
"<title>" ,
"</title>" ,
"<script Language=\"JavaScript\">",
"<!--\n" +
"function checkNow()\n" +
"{\n" +
"  myDate = new Date();\n" +
"  h = myDate.getHours();\n" +
"  var strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleTimeString() + \"</h2><hr>\";\n" +
"  document.write(strMsg);\n" +
"}\n" +
"// -->",
"</script>" ,
"</head>" ,
"<body onLoad=\"checkNow()\">" ,
"</body>" ,
"</html>"        
        };
        
        ///////////////////////////////////////////////////////
        TestHTM1.assertDQ(that,  txtDQ, false);
        TestHTM1.assertTAG(that, txtTag, false);
        
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch (j) {
                case 3:
                    assertTrue("問候語--HTML版 (1-02.htm)".equals(tmp));
                    break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        
        
    }
    @Test 
    public void TestCompactString1() {
        HTML that = new HTML(BufJSP3);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result="<html><head><meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\"><title>問候語--HTML版 (1-02.htm)</title><script Language=\"JavaScript\"><!--\n" +
"function checkNow()\n" +
"{\n" +
"  myDate = new Date();\n" +
"  h = myDate.getHours();\n" +
"  var strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleTimeString() + \"</h2><hr>\";\n" +
"  document.write(strMsg);\n" +
"}\n" +
"// --></script></head><body onLoad=\"checkNow()\"></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true,false)));
        assertTrue(result.equals(that.toCompactString(true, false,false)));
        assertTrue(result.equals(that.toCompactString(false, true,false)));
        assertTrue(result.equals(that.toCompactString(false, false,false)));
        
    }    
    public String modifiedJSP3 = "<html>\n"
            + "<head>\n"
            + "<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n"
            + "<title>問候語--HTML版 (1-02.htm)</title>\n"
            + "<script Language=\"JavaScript\">\n"
//            + "<!--\n"  去除註解號
            + "function checkNow()\n"
            + "{\n"
            + "  myDate = new Date();\n"
            + "  h = myDate.getHours();\n"
            + "  var strMsg;\n"
            + "  if ((h > 12) && (h < 18)) {\n"
            + "     strMsg = \"<h2>午安\";\n"
            + "  } else {\n"
            + "     strMsg = \"<h2>您好\";\n"
            + "  }\n"
            + "  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleTimeString() + \"</h2><hr>\";\n"
            + "  document.write(strMsg);\n"
            + "}\n"
 //           + "// -->\n"  去除註解號
            + "</script>\n"
            + "</head>\n"
            + "<body onLoad=\"checkNow()\">\n"
            + "</body>\n"
            + "</html>";
    @Test 
    public void TestCompactString2() {
        HTML that = new HTML(new StringBuffer(modifiedJSP3));        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result="<html><head><meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\"><title>問候語--HTML版 (1-02.htm)</title><script Language=\"JavaScript\">function checkNow()\n" +
"{\n" +
"  myDate = new Date();\n" +
"  h = myDate.getHours();\n" +
"  var strMsg;\n" +
"  if ((h > 12) && (h < 18)) {\n" +
"     strMsg = \"<h2>午安\";\n" +
"  } else {\n" +
"     strMsg = \"<h2>您好\";\n" +
"  }\n" +
"  strMsg += \"，歡迎光臨！<p>現在時刻：\" + myDate.toLocaleTimeString() + \"</h2><hr>\";\n" +
"  document.write(strMsg);\n" +
"}</script></head><body onLoad=\"checkNow()\"></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true,false)));
        assertTrue(result.equals(that.toCompactString(true, false,false)));
        assertTrue(result.equals(that.toCompactString(false, true,false)));
        assertTrue(result.equals(that.toCompactString(false, false,false)));
        
    }    
    @Test
    public void testOneTagOneLine() {
        HTML that = new HTML(BufJSP3);        
        that.go();
   
        
        String result1="<html>\n" +
"<head>\n" +
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n" +
"<title>\n" +
"問候語--HTML版 (1-02.htm)\n" +
"</title>\n" +
"<script Language=\"JavaScript\">\n" +
"</script>\n" +
"</head>\n" +
"<body onLoad=\"checkNow()\">\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"TranslateRadical=false, Finishing=false removeHTMLcomment=true :\n" +
"\n" +
"<html>\n" +
"<head>\n" +
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n" +
"<title>\n" +
"問候語--HTML版 (1-02.htm)\n" +
"</title>\n" +
"<script Language=\"JavaScript\">\n" +
"</script>\n" +
"</head>\n" +
"<body onLoad=\"checkNow()\">\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"";
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE  removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(true, true,false,"\n"));
        System.out.println("TranslateRadical=TRUE, Finishing=false removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(true, false,false,"\n"));
        System.out.println("TranslateRadical=false, Finishing=TRUE removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(false, true,false,"\n"));
        System.out.println("TranslateRadical=false, Finishing=false removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(false, false,false,"\n"));        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE  removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(true, true,true,"\n"));
        System.out.println("TranslateRadical=TRUE, Finishing=false removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(true, false,true,"\n"));
        System.out.println("TranslateRadical=false, Finishing=TRUE removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(false, true,true,"\n"));
        System.out.println("TranslateRadical=false, Finishing=false removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(false, false,true,"\n"));       
        
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(false,false,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(false,false,true,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(false,true,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(false,true,true,"\n").trim()));
        
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,false,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,false,true,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,true,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,true,true,"\n").trim()));
        
    }     
}
