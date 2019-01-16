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
 * E:\WEBAPPS\JSP_2\CH02\2-06.JSP
 *
 * @author easterday
 */
public class J06 {

    String sJ06 = "<h2>\n"
            + "<%= request.getParameter(\"name\") %>你好！<br>\n"
            + "你的E-mail帳號是：<%= request.getParameter(\"e_mail\") %>\n"
            + "</h2>";
    StringBuffer bufJ06;

    public J06() {
        bufJ06 = new StringBuffer(sJ06);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        HTML that = new HTML(bufJ06);
        that.go();
        //that.PrintIssues();
        //TestHTM1.ReportInTest(that, that.MyText);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] txtDQ={"name","e_mail"};
        String[] txtTag={"<h2>" ,"<%= request.getParameter(\"name\") %>" ,"<br>" ,
"<%= request.getParameter(\"e_mail\") %>" ,"</h2>"};
        
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
                case 1:
                    assertTrue("你好！".equals(tmp));
                    break;
                case 2:
                    assertTrue("你的E-mail帳號是：".equals(tmp));
                    break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        
    }
}
