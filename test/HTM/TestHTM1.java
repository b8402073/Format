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
import java.util.Vector;
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
        for (int i=0; i< inn.LeftOrRight.size(); i++) {
            int Start = inn.LeftOrRight.get(i);
            int End=(-1);
            if (i+1< inn.LeftOrRight.size())
                End = inn.LeftOrRight.get(i + 1);
            if (End>=0) {
                if (buf.charAt(Start)=='<') {
                    if (buf.charAt(End)=='>') {
                        String tmp = Main.ToSTR(new Pair(Start, End), buf);
                        System.out.println(tmp);                    
                    }else if  (buf.charAt(End)=='<') {
                        String tmp= Main.ToSTR(new Pair(Start,End-1), buf);
                        System.out.println(tmp);
                    }else {
                        assertTrue(false);
                    }
                }                
            }else {
                String tmp=(Main.ToSTR(new Pair(Start,buf.length()-1), buf));
                System.out.println(tmp);
            }
            
        }
    }
    @Deprecated
    public static void PrintBetween(HTML that, StringBuffer buf) {
        for (int i=0;i<that.LeftOrRight.size(); i++) {
            if (buf.charAt(that.LeftOrRight.get(i))=='>'  && i+1<=that.LeftOrRight.size()-1) {
                if (buf.charAt(that.LeftOrRight.get(i+1))=='<') {
                    System.out.println(""+i+":"+ buf.substring(that.LeftOrRight.get(i)+1,  that.LeftOrRight.get(i+1) )  );
                }else {
                    System.out.println(""+i+":");
                }
            }
        }
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
    public static void assertVecWithArr(Vector<Integer> vec, Integer[] arr,boolean debug) {
        assertTrue(vec.size()==arr.length);
        for (int i=0; i<arr.length; i++) {
            if (debug) {
                System.out.println("i="+i+"   "+vec.get(i)+"   "+arr[i]);
            }
            assertTrue(vec.get(i)==arr[i]);
        }
    }
    public static void assertTAG(HTML that,  String[] txtTag, boolean debug) {
        Vector<String> hand=that.GetAllTags();
        assertTrue(hand.size()==txtTag.length);
        for(int i=0; i<hand.size(); i++) {
            assertTrue(txtTag[i].equals(hand.get(i)));
        }
    }
    public static void assertRadical(HTML that,Integer[] arrRad,boolean debug) {
        assertTrue(that.Radical.size()== arrRad.length);
        int length=that.Radical.size();
        for (int i=0; i< length; i++) {
            if (debug) {
                System.out.println("i="+i);
                System.out.println("arr[i]="+arrRad[i]);
                System.out.println("that.Radical.get(i)="+that.Radical.get(i));
            }
            assertTrue(arrRad[i]==that.Radical.get(i));
        }
    }
    public static void assertUnFinished(HTML that,Integer[] arrUnFinished,boolean debug) {
        assertTrue(that.UnFinished.size()==arrUnFinished.length);
        int len=that.UnFinished.size();
        for (int i=0; i<len; i++) {
            if (debug) {
                System.out.println("i="+i);
                System.out.println("arr[i]="+arrUnFinished[i]);
                System.out.println("that.UnFinished.get(i)="+that.UnFinished.get(i));
            }
            assertTrue(arrUnFinished[i]==that.UnFinished.get(i));
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
        assertTAG(that, txtTags,true);
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
    @Test
    public void TestCompactString1() {
        HTML that = new HTML(BufHTM1);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result="<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>scriptº–≈“</title><script async type=\"text/javascript\" src=\"./js/01.js\"></script><script async type=\"text/javascript\" src=\"./js/02.js\"></script></head><body><!-- content --><script type=\"text/javascript\" src=\"./js/03.js\"></script></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true)));
        assertTrue(result.equals(that.toCompactString(true, false)));
        assertTrue(result.equals(that.toCompactString(false, true)));
        assertTrue(result.equals(that.toCompactString(false, false)));
        
    }

}
