/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.CH2;

import HTM.TestHTM1;
import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *　E:/WEBAPPS/JSP_2/CH02/2-08.jsp
 * @author easterday
 */
public class J08 {
    String jsp="<%\n" +
"out.println(\"<h2>\");\n" +
"out.println(request.getParameter(\"name\") + \", 你好！<br>\");\n" +
"out.println(\"你的E-mail帳號是：\");\n" +
"out.println(request.getParameter(\"e_mail\"));\n" +
"out.println(\"</h2>\");\n" +
"%>";
    public StringBuffer bufJ08;
    public J08() {
        bufJ08=new StringBuffer(jsp);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        HTML that = new HTML(bufJ08);
        that.go();
        //that.PrintIssues();
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"<h2>","name",", 你好！<br>","你的E-mail帳號是：","e_mail","</h2>"};
        String S1="<%\n" +"out.println(\"<h2>\");\n" +"out.println(request.getParameter(\"name\") + \", 你好！<br>\");\n" +
"out.println(\"你的E-mail帳號是：\");\n" +"out.println(request.getParameter(\"e_mail\"));\n" +
"out.println(\"</h2>\");\n" +"%>";        
        String[] txtTag={S1};
        ///////////////////////////////////////////////////////

       TestHTM1.assertDQ(that, that.MyText, txtDQ, false);
       TestHTM1.assertTAG(that, that.MyText, txtTag, false);
       /*
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch (j) {
                case 3:
                    assertTrue("歡迎光臨 (1-01.jsp)".equals(tmp));
                    break;
                case 7:
                    assertTrue("您好，歡迎光臨！".equals(tmp));
                    break;
                case 9:
                    assertTrue("現在時刻是：".equals(tmp));
                    break;
                case 21:
                    assertTrue("歡迎光臨--JavaScript版".equals(tmp));
                    break;
                case 28:
                    assertTrue("問候語--JSP版".equals(tmp));
                    break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        */
    }
}
