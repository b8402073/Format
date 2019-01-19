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
"<title>�@��²�� (2-01.htm)</title>\n" +
"</head>\n" +
"<body>\n" +
"<p><img src=\"../images/ME1.GIF\" align=\"right\" hspace=\"0\"> </p>\n" +
"<ul>\n" +
"<p><li>\n" +
"<font size=\"4\">�ͤ�: Big secret, I can not tell you... ^_^</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">�X�ͦa: �x�W�٥x����</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">�D�Ǿ��{: </li>\n" +
"  <dd>- �x�����A�|�����</dd>\n" +
"  <dd>- �x������ٰ�p</dd>\n" +
"  <dd>- �x������b�ꤤ</dd>\n" +
"  <dd>- �x���@��</li>\n" +
"  <dd>- <a href=\"http://www.nctu.edu.tw\">��q�j��</a>�޲z��Ǩt</dd>\n" +
"�@<dd>- ��q�j�Ǹ�T�޲z��</dd>\n" +
"</font>\n" +
"<p><li>\n" +
"<font size=\"4\">Java�ҷ�: </dd>\n" +
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
                    assertTrue("�@��²�� (2-01.htm)".equals(tmp));
                    break;
                case 13:
                    assertTrue("�ͤ�: Big secret, I can not tell you... ^_^".equals(tmp));
                    break;
                case 18:
                    assertTrue("�X�ͦa: �x�W�٥x����".equals(tmp)); break;
                case 23:
                    assertTrue("�D�Ǿ��{:".equals(tmp));  break;
                case 25:
                    assertTrue("- �x�����A�|�����".equals(tmp));  break;
                case 27:
                    assertTrue("- �x������ٰ�p".equals(tmp));  break;
                case 29 :
                    assertTrue("- �x������b�ꤤ".equals(tmp));  break;    
                case 31 :
                    assertTrue("- �x���@��".equals(tmp));  break;    
                case 33 :
                    assertTrue("-".equals(tmp));  break;    
                case 34 :
                    assertTrue("��q�j��".equals(tmp));  break;    
                case 35 :
                    assertTrue("�޲z��Ǩt".equals(tmp));  break;    
                case 37 :
                    assertTrue("- ��q�j�Ǹ�T�޲z��".equals(tmp));  break;    
                case 42:
                    assertTrue("Java�ҷ�:".equals(tmp));  break;    
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
