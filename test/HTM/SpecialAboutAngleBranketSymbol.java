/*
  TestJSP933是直接從課本光碟COPY出來的字串
  所以用舊的作法不能認為CH9的9-33.jsp是完全合法的(JSP/HTML)
  所以在這裡用腦子創造很多很極端的狀況
  然後配合(IE/Chrome)的執行結果來校正我們的HTML類別實作

  當然也許有可能用機器產生更完整的狀況會更好!!!
 */
package HTM;

import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import java.util.Vector;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author easterday
 */
public class SpecialAboutAngleBranketSymbol {
    public String[] jsp=new String[100];
    public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待    
    public String jsp2="<html><body> > </body></html>";  //遇到游離子要單獨對待
    public String jsp3="<html><body> <p  ></body></html>"; //這是一個<p> tag
    public String jsp4="<html><body> />   </body></html>"; //這是游離子
    public String jsp5="<html><body> < p ></body></html>"; //這是兩個游離子
    public String jsp6="<html><body> < p id='>'  > </body></html>"; //這是兩個游離子
    public String jsp7="<html><body> < p id='<'  > </body></html>"; //這是兩個游離子
    public String jsp8="<html><body> <p id='>'  > </body></html>"; //這是一個<p> tag
    public String jsp9="<html><body> <p id='<'  > </body></html>"; //這是<p> tag
    public String jsp10="<html><body> <p id='>' /> </body></html>"; //這是<p> tag
    public String jsp11="<html><body> <p id='<'  /> </body></html>"; //這是<p> tag    
    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,4個游離子
    //                   012345678901234567890123456    78
    public String jsp13="<html><body> <p id='na>me1\n"+"'></body></html>"; //這裡沒有SQArea,1個tag,2個游離子
    //                   012345678901234567890123456    78
    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,一個Tag
    //                   012345678901234567890123456    789
    public String jsp15="<html><body>< p id='name1 \n"+"'/></body></html>"; //這裡沒有SQArea,4個游離子
    //                   
    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //一個<p> tag,沒有游離子
    public String jsp17="<html><body> <p  <!-- GGYY --> > </body></html>"; //一個<p> tag,一個游離子>
    public String jsp18="<html><body> <p  <!-- GGYY    /></body></html>"; //一個<p> tag
    public String jsp19="<html><body> <p  <!-- GGYY\n -->   </body></html>"; //一個<p> tag,沒有游離子
    public String jsp20="<html><body> <p  <!-- GGYY\n --> > </body></html>"; //一個<p> tag,一個游離子>
    public String jsp21="<html><body> <p  <!-- GGYY\n --> /></body></html>"; //一個<p> tag,一個游離子/>
    public String jsp22="<html><body><p name=\"GG \n > \" </body></html>";   //一個<p> tag 
    public String jsp23="<html><body><p name='GG \n > ' </body></html>";   //一個<p> tag 
    //                0123456789012345678901234567
    public String f0="<html><body><p </body></html>";  //unfinished tag
    //                0123456789012345678901234567
    public String f1="<html><body>< p </body></html>"; //游離子<,  沒有tag
    public String f2="<html><body><p \n </body></html>"; //unfinished tag
    //                01234567890123456789012345678901234567890
    public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag
    public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag
                
    public SpecialAboutAngleBranketSymbol() {
    }
    
    @Test
    public void testA01() {
        StringBuffer buf=new StringBuffer(jsp1);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("<".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);        
    }
    
    @Test
    public void testA02() {
        StringBuffer buf=new StringBuffer(jsp2);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);   
        
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue(">".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);        
        
        
    }
    
    @Test 
    public void testA03() {
        StringBuffer buf=new StringBuffer(jsp3);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>" ,"<p  >","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);          
    }
    
    @Test
    public void testA04() {
        StringBuffer buf=new StringBuffer(jsp4);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("/>".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={14};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);        
        
    }
    
    @Test
    public void testA05() {
        StringBuffer buf=new StringBuffer(jsp5);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("<".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13,17};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);        
        
    }
    
    @Test
    public void testA06() {
        StringBuffer buf=new StringBuffer(jsp6);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={">"};
        TestHTM1.assertSQ(that, TestHTM1.SQ(txtSQ), true);
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("< p id='>'  >".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13,25};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA07() {
        StringBuffer buf=new StringBuffer(jsp7);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={"<"};
        TestHTM1.assertSQ(that, TestHTM1.SQ(txtSQ), true);
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("< p id='<'  >".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13,25};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA08() {
        StringBuffer buf=new StringBuffer(jsp8);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={">"};
        String[] txtTag={"<html>" ,"<body>" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("< p id='<'  >".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13,25};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }   

    @Test
    public void testA09() {
        StringBuffer buf=new StringBuffer(jsp9);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={"<"};
        TestHTM1.assertSQ(that, TestHTM1.SQ(txtSQ), true);
        String[] txtTag={"<html>" ,"<body>","<p id='<'  >" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA10() {
        StringBuffer buf=new StringBuffer(jsp10);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={">"};
        TestHTM1.assertSQ(that, TestHTM1.SQ(txtSQ), true);
        String[] txtTag={"<html>" ,"<body>","<p id='>' />" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA11() {
        StringBuffer buf=new StringBuffer(jsp11);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);
        String[] txtSQ={"<"};
        TestHTM1.assertSQ(that, TestHTM1.SQ(txtSQ), true);
        String[] txtTag={"<html>" ,"<body>","<p id='<'  />" ,"</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }

    @Test
    public void testA12() {
        StringBuffer buf=new StringBuffer(jsp12);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue(("< p id='name1 \n"+"'>").equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={13,20,28,29};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA13() {
        System.out.println(jsp12.equals(jsp13));
        StringBuffer buf=new StringBuffer(jsp13);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p id='na>","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                    assertTrue(("me1\n'>").equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={27,28};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }
    @Test
    public void testA14() {
        StringBuffer buf=new StringBuffer(jsp14);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p id='name1 \n'>","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }   
    @Test
    public void testA15() {
        StringBuffer buf=new StringBuffer(jsp15);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                    assertTrue("< p id='name1 \n'/>".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={12,19,27,29};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }    
    @Test
    public void testA16() {
        StringBuffer buf=new StringBuffer(jsp16);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY -->","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 1:
                     break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }    
    @Test
    public void testA17() {
        StringBuffer buf=new StringBuffer(jsp17);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY -->","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                     assertTrue(">".equals(tmp));break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={31};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }    
    @Test
    public void testA18() {
        StringBuffer buf=new StringBuffer(jsp18);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY    />","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                     break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testA19() {
        StringBuffer buf=new StringBuffer(jsp19);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n" +" -->","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                     break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testA20() {
        StringBuffer buf=new StringBuffer(jsp20);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n" +" -->","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                    assertTrue(">".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={32};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      

    @Test
    public void testA21() {
        StringBuffer buf=new StringBuffer(jsp21);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n"+" -->","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                    assertTrue("/>".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={33};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testA22() {
        StringBuffer buf=new StringBuffer(jsp22);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name=\"GG \n"+" >","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                    assertTrue("\"".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={28};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testA23() {
        StringBuffer buf=new StringBuffer(jsp23);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name='GG \n"+" >","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                case 2:
                    assertTrue("'".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={28};
        Integer[] arrUN=new Integer[0];
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testAF0() {
        StringBuffer buf=new StringBuffer(f0);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p ","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i)));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testAF1() {
        //public String f1="<html><body>< p </body></html>"; //游離子<,  沒有tag        
        StringBuffer buf=new StringBuffer(f1);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("< p".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={12};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      

    @Test
    public void testAF2() {
        StringBuffer buf=new StringBuffer(f2);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p \n ","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testAF3() {
        StringBuffer buf=new StringBuffer(f3);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name='GGYY'  ","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      
    @Test
    public void testAF4() {
        StringBuffer buf=new StringBuffer(f4);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name=\"GGYY\"   ","</body>" ,"</html>" };
        TestHTM1.assertTAG(that, txtTag, true);
        for (int j=0,i=1; i<that.LeftOrRight.size()-1; i+=2, j++) {
            int Start= that.LeftOrRight.get(i);
            int End=that.LeftOrRight.get(i+1);
            String tmp=Main.ToSTR(new Pair(Start+1,End-1), that.MyText).trim();
            //System.out.println("j="+j+" :"+tmp);            
            switch(j) {
                default:
                    assertTrue("".equals(tmp));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);                
    }      

    
    
}
