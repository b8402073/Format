/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH2;

import HTM.TestHTM1;
import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * E:/WEBAPPS/JSP_2/CH02/2-01.HTM
 * @author easterday
 */
public class Test01 {
    String sHTM="<html>\n" +
"<head>\n" +
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n" +
"<title>作者簡介 (2-01.htm)</title>\n" +
"</head>\n" +
"<body>\n" +
"<p><img src=\"../images/ME1.GIF\" align=\"right\" hspace=\"0\"> </p>\n" +
"<ul>\n" +
"<p><li>\n" +
"<font size=\"4\">生日: Big secret, I can not tell you... ^_^</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">出生地: 台灣省台中市</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">求學歷程: </li>\n" +
"  <dd>- 台中市農會托兒所</dd>\n" +
"  <dd>- 台中市西屯國小</dd>\n" +
"  <dd>- 台中市西苑國中</dd>\n" +
"  <dd>- 台中一中</li>\n" +
"  <dd>- <a href=\"http://www.nctu.edu.tw\">交通大學</a>管理科學系</dd>\n" +
"　<dd>- 交通大學資訊管理所</dd>\n" +
"</font>\n" +
"<p><li>\n" +
"<font size=\"4\">Java證照: </dd>\n" +
"  <dd>- SCJP (Sun Certified Java Programmer)</dd>\n" +
"  <dd>- SCWCD (Sun Certified Web Component Developer)</dd>\n" +
"  <dd>- SCBCD (Sun Certified Business Component Developer)</dd>\n" +
"</font>\n" +
"</ul>\n" +
"</body>\n" +
"</html>";
    public StringBuffer bufJSP01;
    public Test01() {
        bufJSP01=new StringBuffer(sHTM);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Test01() {
        HTML that = new HTML(bufJSP01);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"Content-Type","text/html; charset=big5","../images/ME1.GIF",
"right","0","4","4","4","http://www.nctu.edu.tw","4"};
        
        String[] txtTag={"<html>" ,"<head>" ,"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">" ,
"<title>" ,"</title>" ,"</head>" ,"<body>" ,"<p>" ,"<img src=\"../images/ME1.GIF\" align=\"right\" hspace=\"0\">" ,
"</p>" ,"<ul>" ,"<p>" ,"<li>" ,"<font size=\"4\">" ,"</font>" ,"</li>" ,
"<p>" ,"<li>" ,"<font size=\"4\">" ,"</font>" ,"</li>" ,"<p>" ,"<li>" ,"<font size=\"4\">" ,"</li>" ,"<dd>" ,"</dd>" ,"<dd>" ,"</dd>" ,
"<dd>" ,"</dd>" ,"<dd>" ,"</li>" ,"<dd>" ,"<a href=\"http://www.nctu.edu.tw\">" ,"</a>" ,
"</dd>" ,"<dd>" ,"</dd>" ,"</font>" ,"<p>" ,"<li>" ,"<font size=\"4\">" ,"</dd>" ,
"<dd>" ,"</dd>" ,"<dd>" ,"</dd>" ,"<dd>" ,"</dd>" ,"</font>" ,"</ul>" ,"</body>" ,"</html>"};
        
        ///////////////////////////////////////////////////////

        TestHTM1.assertDQ(that,  txtDQ, false);
        TestHTM1.assertTAG(that,  txtTag, false);
        
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch (j) {
                case 3:
                    assertTrue("作者簡介 (2-01.htm)".equals(tmp));
                    break;
                case 13:
                    assertTrue("生日: Big secret, I can not tell you... ^_^".equals(tmp));
                    break;
                case 18:
                    assertTrue("出生地: 台灣省台中市".equals(tmp)); break;
                case 23:
                    assertTrue("求學歷程:".equals(tmp));  break;
                case 25:
                    assertTrue("- 台中市農會托兒所".equals(tmp));  break;
                case 27:
                    assertTrue("- 台中市西屯國小".equals(tmp));  break;
                case 29 :
                    assertTrue("- 台中市西苑國中".equals(tmp));  break;    
                case 31 :
                    assertTrue("- 台中一中".equals(tmp));  break;    
                case 33 :
                    assertTrue("-".equals(tmp));  break;    
                case 34 :
                    assertTrue("交通大學".equals(tmp));  break;    
                case 35 :
                    assertTrue("管理科學系".equals(tmp));  break;    
                case 37 :
                    assertTrue("- 交通大學資訊管理所".equals(tmp));  break;    
                case 42:
                    assertTrue("Java證照:".equals(tmp));  break;    
                case 44 :
                    assertTrue("- SCJP (Sun Certified Java Programmer)".equals(tmp));  break;    
                case 46 :
                    assertTrue("- SCWCD (Sun Certified Web Component Developer)".equals(tmp));  break;    
                case 48 :
                    assertTrue("- SCBCD (Sun Certified Business Component Developer)".equals(tmp));  break;    
                    
                default:
                    assertTrue("".equals(tmp));
            }
        }
        
         
     }
}
