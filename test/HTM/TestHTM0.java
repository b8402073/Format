/*

 */
package HTM;

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
 * 個人認為這個網站的資料很適合測試
 * http://github.com/KuangPF/Professional-Javascript-for-Web-Developer/
 * @author easterday
 */
public class TestHTM0 {
    //https://github.com/KuangPF/Professional-JavaScript-for-Web-Developer/blob/master/src/chapter01/01.html
    String HTM0 = "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n"
            + "  <title>Dom</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div>hello,javascript</div>\n"
            + "</body>\n"
            + "</html>";
    StringBuffer BufHTM0;
    
    public TestHTM0() {
        BufHTM0 = new StringBuffer(HTM0);
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

    @Test
    public void Test0() {
        HTML that = new HTML(BufHTM0);
        that.go();
        that.PrintIssues();
        assertTrue(that.DQArea.size() == 6);
        assertTrue(that.SQArea.size() == 0);
        assertTrue(that.CommentArea.size() == 0);
        assertTrue(that.Left.size() == that.Right.size());
        String[] txtDQ = {"en", "UTF-8", "viewport", "width=device-width, initial-scale=1.0",
            "X-UA-Compatible", "ie=edge"};
        for (int i = 0; i < that.DQArea.size(); i++) {
            String tmp = Main.ToSTR(that.DQArea.get(i), BufHTM0);
            //System.out.println("tmp=" + tmp);
            //System.out.println("txtDQ[i]=" + txtDQ[i]);
            assertTrue(tmp.equals(Main.DQ(txtDQ[i])));
        }

        String[] txtTag = {
            "<!DOCTYPE html>",
            "<html lang=\"en\">", 
            "<head>",
            "<meta charset=\"UTF-8\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            "<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">",
            "<title>","</title>",
            "</head>",
            "<body>",
            "<div>","</div>",
            "</body>",
            "</html>"};
        for (int i=0,j=0; i< that.LeftOrRight.size(); i+=2,j++) {
            int Start= that.LeftOrRight.get(i);
            int End= that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start,End), BufHTM0);
            //System.out.println(tmp);
            //System.out.println(txtTag[j]);
            assertTrue(txtTag[j].equals(tmp));
        }
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), BufHTM0).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 6:
                    assertTrue("Dom".equals(tmp)); break;
                case 10:
                    assertTrue("hello,javascript".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }

        }

    }

}
