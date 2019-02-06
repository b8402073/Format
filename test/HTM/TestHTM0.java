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
            String tmp = Main.ToSTR(that.DQArea.get(i), that.MyText);
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
            String tmp=Main.ToSTR(new Pair(Start,End), that.MyText);
            //System.out.println(tmp);
            //System.out.println(txtTag[j]);
            assertTrue(txtTag[j].equals(tmp));
        }
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
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
    
    @Test 
    public void TestCompactString1() {
        HTML that = new HTML(BufHTM0);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result="<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>Dom</title></head><body><div>hello,javascript</div></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true)));
        assertTrue(result.equals(that.toCompactString(true, false)));
        assertTrue(result.equals(that.toCompactString(false, true)));
        assertTrue(result.equals(that.toCompactString(false, false)));
        
    }
    @Test
    public void TestCompactString2() {  
        //用預設的RadicalTranslation
        StringBuffer copy=new StringBuffer();
        copy.append("A B C ");
        copy.append(BufHTM0);
        copy.append("SQ'DQ\"AMP&");
        HTML that=new HTML(copy);
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result1="A B C<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>Dom</title></head><body><div>hello,javascript</div></body></html>SQ&apos;DQ&quot;AMP&amp;";
        String result2="A B C <!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>Dom</title></head><body><div>hello,javascript</div></body></html>SQ'DQ\"AMP&";
        assertTrue(result1.equals(that.toCompactString(true,true)));
        assertTrue(result1.equals(that.toCompactString(true,false)));
        assertTrue(result2.equals(that.toCompactString(false,true)));
        assertTrue(result2.equals(that.toCompactString(false,false)));
                
    }
    @Test
    public void TestCompactString3() {  
        //把空格也要求翻譯
        StringBuffer copy=new StringBuffer();
        copy.append("A B C ");
        copy.append(BufHTM0);
        copy.append("SQ'DQ\"AMP&");
        HTML that=new HTML(copy);
        that.defRadical.add(' ');
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        
        String result1="A&nbsp;B&nbsp;C&nbsp;<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>Dom</title></head><body><div>hello,javascript</div></body></html>SQ&apos;DQ&quot;AMP&amp;";
        String result2="A B C <!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>Dom</title></head><body><div>hello,javascript</div></body></html>SQ'DQ\"AMP&";
        
        assertTrue(result1.equals(that.toCompactString(true,true)));
        assertTrue(result1.equals(that.toCompactString(true,false)));
        assertTrue(result2.equals(that.toCompactString(false,true)));
        assertTrue(result2.equals(that.toCompactString(false,false)));
          
        
    }    

}
