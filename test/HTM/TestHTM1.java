/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM;

import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestHTM1 {

    //https://github.com/KuangPF/Professional-JavaScript-for-Web-Developer/blob/master/src/chapter02/01.html
    String HTM1 = "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n"
            + "  <title>scriptº–≈“</title>\n"
            + "  <script async type=\"text/javascript\" src=\"./js/01.js\"></script>\n"
            + "  <script async type=\"text/javascript\" src=\"./js/02.js\"></script>\n"
            + "</head>\n"
            + "\n"
            + "<body>\n"
            + "  <!-- content -->\n"
            + "  <script type=\"text/javascript\" src=\"./js/03.js\"></script>\n"
            + "</body>\n"
            + "\n"
            + "</html>";
    StringBuffer BufHTM1;

    public TestHTM1() {
        BufHTM1 = new StringBuffer(HTM1);
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
    
    public static void PrintDQS(HTML that) {
        PrintDQS(that,that.MyText);        
    }
    public static void PrintTags(HTML that) {
        PrintTags(that,that.MyText);
    }
    public static void PrintBetween(HTML that) {
        PrintBetween(that,that.MyText);
    }
    public static void PrintSQ(HTML that) {
        for (int i=0; i<that.SQArea.size(); i++) {
            String tmp=Main.ToSTR(that.SQArea.get(i), that.MyText);
            System.out.println(tmp);         
        }
    }
    @Deprecated
    public static void PrintDQS(HTML that, StringBuffer buf) {
        for (int i = 0; i < that.DQArea.size(); i++) {
            String tmp = Main.ToSTR(that.DQArea.get(i), buf);
            System.out.println(tmp);
        }
    }
    @Deprecated
    public static void PrintTags(HTML inn, StringBuffer buf) {
        for (int i = 0, j = 0; i < inn.LeftOrRight.size(); i += 2, j++) {
            int Start = inn.LeftOrRight.get(i);
            int End = inn.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start, End), buf);
            System.out.println(tmp);
        }
    }
    @Deprecated
    public static void PrintBetween(HTML that, StringBuffer buf) {
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), buf).trim();
            System.out.println("j=" + j + " :" + tmp);
        }
    }
    
    @Deprecated
    public static void ReportInTest(HTML that, StringBuffer buf) {
        System.out.println("DQS:");
        PrintDQS(that, buf);
        System.out.println("SQS:");
        PrintSQ(that);
        System.out.println("TAG:");
        PrintTags(that, buf);
        System.out.println("BETWEEN:");
        PrintBetween(that, buf);

    }
    public static void ReportInTest(HTML that) {
        System.out.println("DQS:");
        PrintDQS(that);
        System.out.println("SQS:");
        PrintSQ(that);
        System.out.println("TAG:");
        PrintTags(that);
        System.out.println("BETWEEN:");
        PrintBetween(that);        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    public static void assertDQ(HTML that,  String[] txtDQ, boolean debug) {
        for (int i = 0; i < that.DQArea.size(); i++) {
            String tmp = Main.ToSTR(that.DQArea.get(i), that.MyText);
            if (debug) {
                System.out.println("i=" + i);
                System.out.println("tmp=" + tmp);
                System.out.println("other=" + Main.DQ(txtDQ[i]));
            }
            assertTrue(tmp.equals(Main.DQ(txtDQ[i])));
        }
    }
    public static void assertSQ(HTML that,String[] txtSQ,boolean debug) {
        for (int i=0; i<that.SQArea.size(); i++) {
            String tmp=Main.ToSTR(that.SQArea.get(i), that.MyText);
            if (debug) {
                System.out.println("i=" + i);
                System.out.println("tmp=" + tmp);
                System.out.println("other=" + txtSQ[i]); 
            }
            assertTrue(tmp.equals(txtSQ[i]));
        }
    }
    public static void assertTAG(HTML that,  String[] txtTag, boolean debug) {
        for (int i = 0, j = 0; i < that.LeftOrRight.size(); i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start, End), that.MyText);
            if (debug) {
                System.out.println("i=" + i);
                System.out.println(tmp);
                System.out.println(txtTag[j]);                
            }
            assertTrue(txtTag[j].equals(tmp));
        }
    }
    public static String[] SQ(String[] inn) {
        if (inn.length>0) {
            String[] ret=new String[inn.length];
            for (int i=0; i<inn.length; i++) {
                ret[i]=Main.SQ(inn[i]);
            }
            return ret;
        }        
        return new String[0];
    }
    @Test
    public void testSQ() {
        String[] inn={"A","B","CCC"};
        String[] oout=SQ(inn);
        assertTrue(oout[0].equals(Main.SQ(inn[0])));
                
    }
            

    @Test
    public void Test1() {
        HTML that = new HTML(BufHTM1);
        that.go();
        //that.PrintIssues();
        //ReportInTest(that, BufHTM1);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Left.size() * 2);
        String[] txtDQS = {"en", "UTF-8", "viewport", "width=device-width, initial-scale=1.0",
            "X-UA-Compatible", "ie=edge", "text/javascript", "./js/01.js",
            "text/javascript", "./js/02.js", "text/javascript", "./js/03.js"};
        String[] txtTags = {"<!DOCTYPE html>",
            "<html lang=\"en\">",
            "<head>",
            "<meta charset=\"UTF-8\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            "<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">",
            "<title>",
            "</title>",
            "<script async type=\"text/javascript\" src=\"./js/01.js\">",
            "</script>",
            "<script async type=\"text/javascript\" src=\"./js/02.js\">",
            "</script>",
            "</head>",
            "<body>",
            "<!-- content -->",
            "<script type=\"text/javascript\" src=\"./js/03.js\">",
            "</script>",
            "</body>",
            "</html>"};
        assertDQ(that, txtDQS,false);
        assertTAG(that, txtTags,false);
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch (j) {
                case 6:
                    assertTrue("scriptº–≈“".equals(tmp));
                    break;
                default:
                    assertTrue("".equals(tmp));
            }

        }
    }

}
