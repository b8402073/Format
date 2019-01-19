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
 * E:\WEBAPPS\JSP_2\CH01\CH01.JSP
 * @author easterday
 */
public class TestJSP1 {        
    String sJSP1="<%@ page contentType=\"text/html; charset=big5\" %>�@" + //�o�̪��̫�@�Ӧr�������Ÿ�(12288)
"<html>" +
"<head>" +
"<title>���[�����إ�</title>" +
"</head>" +
"<body bgcolor=\"white\">" +
"<jsp:include page=\"/public/header.inc\" />" +
"" +
"<h2 align=\"center\">Ch01 -- ���[�����إ�</h2>" +
"<div align=\"center\"><center>" +
"" +
"<table border=\"1\">" +
"  <tr bgcolor=\"lightblue\" align=\"center\">" +
"    <td height=\"16\" width=\"357\"><p align=\"left\">" +
"      <a href=\"1-01.jsp\">�w����{</a></td>" +
"    <td height=\"16\" width=\"357\"><p align=\"left\">" +
"      <a href=\"1-02.htm\">�w����{--JavaScript��</a></td>" +
"  </tr>" +
"  <tr align=\"center\">" +
"    <td height=\"16\" width=\"357\"><p align=\"left\">" +
"      <a href=\"1-03.jsp\">�ݭԻy--JSP��</a></td>" +
"    <td height=\"16\" width=\"357\"><p align=\"left\"></a></td>" +
"</tr>" +
"</table>" +
"</center></div>" +
"" +
"<jsp:include page=\"/public/footer.inc\" />" +
"</body>" +
"</html>";
    StringBuffer BufJSP1;
    public TestJSP1() {
        BufJSP1=new StringBuffer(sJSP1);       
        for (int x=0; x<BufJSP1.length(); x++) {
            System.out.println ("x="+x+"   :"+BufJSP1.codePointAt(x));
        }
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
    public void Test1() {
        HTML that=new HTML(BufJSP1);
        that.go();
        //that.PrintIssues();
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size()==that.Right.size());
        assertTrue(that.LeftOrRight.size()==that.Right.size()*2);
        String[] txtDQ={
"text/html; charset=big5",
"white",
"/public/header.inc",
"center",
"center",
"1",
"lightblue",
"center",
"16",
"357",
"left",
"1-01.jsp",
"16",
"357",
"left",
"1-02.htm",
"center",
"16",
"357",
"left",
"1-03.jsp",
"16",
"357",
"left",
"/public/footer.inc"   };
        String[] txtTag={"<%@ page contentType=\"text/html; charset=big5\" %>" ,
"<html>" ,
"<head>" ,
"<title>" ,
"</title>" ,
"</head>" ,
"<body bgcolor=\"white\">" ,
"<jsp:include page=\"/public/header.inc\" />" ,
"<h2 align=\"center\">" ,
"</h2>" ,
"<div align=\"center\">" ,
"<center>" ,
"<table border=\"1\">" ,
"<tr bgcolor=\"lightblue\" align=\"center\">" ,
"<td height=\"16\" width=\"357\">" ,
"<p align=\"left\">" ,
"<a href=\"1-01.jsp\">" ,
"</a>" ,
"</td>" ,
"<td height=\"16\" width=\"357\">" ,
"<p align=\"left\">" ,
"<a href=\"1-02.htm\">" ,
"</a>" ,
"</td>" ,
"</tr>" ,
"<tr align=\"center\">" ,
"<td height=\"16\" width=\"357\">" ,
"<p align=\"left\">" ,
"<a href=\"1-03.jsp\">" ,
"</a>" ,
"</td>" ,
"<td height=\"16\" width=\"357\">" ,
"<p align=\"left\">" ,
"</a>" ,
"</td>" ,
"</tr>" ,
"</table>" ,
"</center>" ,
"</div>" ,
"<jsp:include page=\"/public/footer.inc\" />" ,
"</body>" ,
"</html>"};
        TestHTM1.assertDQ(that,  txtDQ,false);
        TestHTM1.assertTAG(that, txtTag,false);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch(j) {
                case 3:
                    assertTrue("���[�����إ�".equals(tmp)); break;
                case 8:
                    assertTrue("Ch01 -- ���[�����إ�".equals(tmp)); break;
                case 16:
                    assertTrue("�w����{".equals(tmp)); break;
                case 21:
                    assertTrue("�w����{--JavaScript��".equals(tmp)); break; 
                case 28:
                    assertTrue("�ݭԻy--JSP��".equals(tmp)); break;     
                default:
                    assertTrue("".equals(tmp) );
            }

        }         
    }
}
