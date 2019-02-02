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

    public String w1="<html><body> <!-- 123 >  -->  </body></html>"; 
    public String w2="<html><body> <!-- 123 >56  -->  </body></html>"; 
    public String w3="<html><body> <!-- <p>  -->  </body></html>";
    public String w4="<html><body> <!-- <p>123</p>  -->  </body></html>";
    public String w5="<html><body> <script name='<'>  if (3<4) var i=1;  </script name='<' ></body></html>";
    public String w6="<html><body> <script name='>'>  if (3>4) var i=1;  </script name='>' ></body></html>";    
    public String w7="<html><body> <p   <!-- GGYY -->  ></body></html>";
    public String w8="<html><body> <!--  <!--  comment --> --> </body></html>";
    public String w9="<html><body> <p <!-- GGYY <!-- AABB --></body></html>";
    public String w10="<html><body> <!-- </body> </html>";
    public String w11="<html><body> --> </body></html>";
    public String w12="<html><style> < </style></html>";
    public String w13="<html><style> > </style></html>";
    public String w14="<html><style> <  </html>";
    public String w15="<html><style> >  </html>";
    
    public String w16="<html><%      > %></html>";
    public String w17="<html><%      < %></html>";
    public String w18="<html><pre>   > </pre></html>";
    public String w19="<html><pre>   > </html>";
    
    public SpecialAboutAngleBranketSymbol() {
    }
    
    @Test
    public void testA01() {
        System.out.println("A01:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        
        Integer[] arrL={0,6,15,22};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,21,28};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,15,21,22,28};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
        
        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("<".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
    }
    
    @Test
    public void testA02() {
        System.out.println("A02:");        
//    public String jsp2="<html><body> > </body></html>";  //遇到游離子要單獨對待        
        StringBuffer buf=new StringBuffer(jsp2);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        
        Integer[] arrL={0,6,15,22};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,21,28};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,15,21,22,28};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue(">".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }
    
    @Test 
    public void testA03() {
        System.out.println("A03:");
        StringBuffer buf=new StringBuffer(jsp3);
//    public String jsp3="<html><body> <p  ></body></html>"; //這是一個<p> tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,18,25};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,17,24,31};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,13,17,18,24,25,31};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  >","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    //assertTrue(">".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    

    }
    
    @Test
    public void testA04() {
        System.out.println("A04:");        
        StringBuffer buf=new StringBuffer(jsp4);
    // public String jsp4="<html><body> />   </body></html>"; //這是游離子
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,18,25};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,24,31};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,18,24,25,31};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("/>".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={14};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);         
    }
    
    @Test
    public void testA05() {
        System.out.println("A05:");        
//    public String jsp5="<html><body> < p ></body></html>"; //這是兩個游離子        
        StringBuffer buf=new StringBuffer(jsp5);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,18,25};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,24,31};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,18,24,25,31};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("< p >".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13,17};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);           
    }
    
    @Test
    public void testA06() {
                System.out.println("A06:");
    //public String jsp6="<html><body> < p id='>'  > </body></html>"; //這是兩個游離子        
        StringBuffer buf=new StringBuffer(jsp6);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
                Integer[] arrL={0,6,27,34};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,33,40};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,27,33,34,40};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("< p id='>'  >".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13,25};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);             
    }
    @Test
    public void testA07() {
                System.out.println("A07:");
//    public String jsp7="<html><body> < p id='<'  > </body></html>"; //這是兩個游離子        
        StringBuffer buf=new StringBuffer(jsp7);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,27,34};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,33,40};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,27,33,34,40};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue("< p id='<'  >".equals(between.get(i).trim()));  break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13,25};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);           
    }
    @Test
    public void testA08() {
                System.out.println("A08:");
        StringBuffer buf=new StringBuffer(jsp8);
//    public String jsp8="<html><body> <p id='>'  > </body></html>"; //這是一個<p> tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,26,33};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,24,32,39};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,13,24,26,32,33,39};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","<p id='>'  >","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);           
    }   

    @Test
    public void testA09() {
                System.out.println("A09:");
    //public String jsp9="<html><body> <p id='<'  > </body></html>"; //這是<p> tag        
        StringBuffer buf=new StringBuffer(jsp9);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,26,33};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,24,32,39};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0,5,6,11,13,24,26,32,33,39};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","<p id='<'  >","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);          
    }
    @Test
    public void testA10() {
                System.out.println("A10:");
//    public String jsp10="<html><body> <p id='>' /> </body></html>"; //這是<p> tag        
        StringBuffer buf=new StringBuffer(jsp10);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,26,33};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,24,32,39};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13, 24, 26, 32, 33, 39};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);
                
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","<p id='>' />","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);          
        
    }
    @Test
    public void testA11() {
         System.out.println("A11:");       
        StringBuffer buf=new StringBuffer(jsp11);
    //public String jsp11="<html><body> <p id='<'  /> </body></html>"; //這是<p> tag            
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,27,34};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,25,33,40};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13, 25,27,33,34,40};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","<p id='<'  />","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);          
    }

    @Test
    public void testA12() {
                System.out.println("A12:");
//    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,4個游離子        
        StringBuffer buf=new StringBuffer(jsp12);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,30,37};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,36,43};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,30,36,37,43};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue(("< p id='name1 \n"+"'>").equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={13,20,28,29};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
    }
    @Test
    public void testA13() {
         System.out.println("A13:");       
        StringBuffer buf=new StringBuffer(jsp13);
//                         01234567890123456789012345678901234567890        
//    public String jsp13="<html><body> <p id='na>me1\n"+"'></body></html>"; //這裡沒有SQArea,1個tag,2個游離子        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,29,36};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,22,35,42};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13, 22, 29, 35, 36, 42};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p id='na>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 2:
                    assertTrue(("me1\n'>").equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={27,28};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }
    @Test
    public void testA14() {
        System.out.println("A14:");        
        StringBuffer buf=new StringBuffer(jsp14);      
//    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,一個Tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,29,36};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,28,35,42};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13, 28, 29, 35, 36, 42};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p id='name1 \n'>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
                
    }   
    @Test
    public void testA15() {
            System.out.println("A15:");    
        StringBuffer buf=new StringBuffer(jsp15);
//    public String jsp15="<html><body>< p id='name1 \n"+"'/></body></html>"; //這裡沒有SQArea,4個游離子        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,30,37};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,36,43};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 30,36,37,43};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 1:
                    assertTrue(("< p id='name1 \n"+"'/>").equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={12,19,27,29};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
             
    }    
    @Test
    public void testA16() {
        System.out.println("A16:");        
        //under construction
        StringBuffer buf=new StringBuffer(jsp16);
//                         01234567890123456789012345678901234567890123456
//    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //一個<p> tag,沒有游離子
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,33,40};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,29,39,46};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13, 29, 33,39, 40,46};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY -->","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    

    }    
    @Test
    public void testA17() {
//                       0123456789012345678901234567890123456789012345        
 // public String jsp17="<html><body> <p  <!-- GGYY --> > </body></html>"; //一個<p> tag,一個游離子>
         System.out.println("A17:");
        StringBuffer buf=new StringBuffer(jsp17);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,33,40};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,29,39,46};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13,29,  33, 39,40,46};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY -->","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                case 2:
                    assertTrue((">").equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={31};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }    
    @Test
    public void testA18() {
        //              0123456789012345678901234567890123456789012345
        //String jsp18="<html><body> <p  <!-- GGYY    /></body></html>"; //一個<p> tag        
        StringBuffer buf=new StringBuffer(jsp18);        
        System.out.println("A18:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,32,39};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,31,38,45};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13,31,32,38,39,45};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY    />","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {               
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }      
    @Test
    public void testA19() {
//         012345678901234567890123456 7890123456789012345678        
//  jsp19="<html><body> <p  <!-- GGYY\n -->   </body></html>"; //一個<p> tag,沒有游離子 
    
        StringBuffer buf=new StringBuffer(jsp19);        
        System.out.println("A19:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,34,41};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,30,40,47};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13,30,34,40,41,47};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n -->","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {               
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }      
    @Test
    public void testA20() {
 //          012345678901234567890123456 7890123456789012345678
    //jsp20="<html><body> <p  <!-- GGYY\n --> > </body></html>"; //一個<p> tag,一個游離子>        
        StringBuffer buf=new StringBuffer(jsp20); 
        System.out.println("A20:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,34,41};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,30,40,47};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13,30,34,40,41,47};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n -->","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) { 
                case 2:
                    assertTrue(">".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={32};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
           
    }      

    @Test
    public void testA21() {
//       012345678901234567890123456 7890123456789012345678        
//jsp21="<html><body> <p  <!-- GGYY\n --> /></body></html>"; //一個<p> tag,一個游離子/>        
        StringBuffer buf=new StringBuffer(jsp21); 
        System.out.println("A21:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,13,34,41};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,30,40,47};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 13,30,34,40,41,47};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p  <!-- GGYY\n -->","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) { 
                case 2:
                    assertTrue("/>".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={33};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
           
        
    }      
    @Test
    public void testA22() {
//       01234567890123456789 0123 4567 8901234567890123
//jsp22="<html><body><p name=\"GG \n > \" </body></html>";   //一個<p> tag         
        StringBuffer buf=new StringBuffer(jsp22);     
        System.out.println("A22:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,30,37};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,26,36,43};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 12, 26, 30, 36, 37, 43};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name=\"GG \n >","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) { 
                case 2:
                    //System.out.println("\\\"");
                    //System.out.println(between.get(i));
                    assertTrue("\"".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={28};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
           
                
    }      
    @Test
    public void testA23() {
    //              012345678901234567890123 456789012345678901234
    //String jsp23="<html><body><p name='GG \n > ' </body></html>";   //一個<p> tag         
        StringBuffer buf=new StringBuffer(jsp23);     
        System.out.println("A23:");
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,30,37};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,26,36,43};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11, 12, 26, 30, 36, 37, 43};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name='GG \n >","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) { 
                case 2:
                    //System.out.println("\\\"");
                    //System.out.println(between.get(i));
                    assertTrue("\'".equals(between.get(i).trim())); break;
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={28};
        Integer[] arrUN={};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
        
    }      
    @Test
    public void testAF0() {
        System.out.println("AF0:");        
        StringBuffer buf=new StringBuffer(f0);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,15,22};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,21,28};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,12,15,21,22,28};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);        
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
        System.out.println("AF1:");        
        //public String f1="<html><body>< p </body></html>"; //游離子<,  沒有tag        
        StringBuffer buf=new StringBuffer(f1);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,16,23};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,22,29};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,16,22,23,29};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);  
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
        System.out.println("AF2:");        
        //public String f2="<html><body><p \n </body></html>"; //unfinished tag
        StringBuffer buf=new StringBuffer(f2);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,17,24};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,23,30};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,12,17,23,24,30};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);          
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p \n ","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    

    }      
    @Test
    public void testAF3() {
        System.out.println("AF3:");        
    //public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag        
        StringBuffer buf=new StringBuffer(f3);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,28,35};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,34,41};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,12,28,34,35,41};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);          
        assertTrue(that.DQArea.size()==0);
        assertTrue(that.SQArea.size()==1);        
        String[] txtTag={"<html>" ,"<body>","<p name='GGYY'  ","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    

    }      
    @Test
    public void testAF4() {
        System.out.println("AF4:");        
//    public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag        
        StringBuffer buf=new StringBuffer(f4);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());       
        System.out.println("UnFinished="+that.UnFinished.toString());
        Integer[] arrL={0,6,12,29,36};
        TestHTM1.assertVecWithArr(that.Left, arrL,true);
        Integer[] arrR={5,11,35,42};
        TestHTM1.assertVecWithArr(that.Right,arrR,true);
        Integer[] arrLR={0, 5, 6, 11,12,29,35,36,42};
        TestHTM1.assertVecWithArr(that.LeftOrRight,arrLR,true);          
        assertTrue(that.DQArea.size()==1);
        assertTrue(that.SQArea.size()==0);        
        String[] txtTag={"<html>" ,"<body>","<p name=\"GGYY\"   ","</body>" ,"</html>" };
        System.out.println(that.GetAllTags());
        TestHTM1.assertTAG(that, txtTag, true);
        Vector<String> between=that.GetAllBetween();
        for (int i=0; i<between.size(); i++) {            
            switch(i) {
                default:
                    assertTrue("".equals(between.get(i).trim()));
            }
        }
        Integer[] arrRad={};
        Integer[] arrUN={12};
        TestHTM1.assertRadical(that, arrRad, true);
        TestHTM1.assertUnFinished(that, arrUN, true);    
    }      
    @Test
    public void testW1() {
        System.out.println("W01:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false);
        
    }
    @Test
    public void testW2() {
        System.out.println("W02:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false);
                
    }
    @Test
    public void testW3() {
        System.out.println("W03:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false);
        
    }
    @Test
    public void testW4() {
        System.out.println("W04:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false)''
    }
    @Test
    public void testW5() {
        System.out.println("W05:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false)''
        
    }
    @Test
    public void testW6(){
        System.out.println("W06:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false)''
        
    }
    @Test
    public void testW7() {
        System.out.println("W07:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false)''
        
    }
    @Test
    public void testW8() {
        System.out.println("W08:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);  assertTrue(false);
        
    }
    @Test
    public void testW9() {
        System.out.println("W09:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);assertTrue(false);
        
    }
    @Test
    public void testW10() {
        System.out.println("W10:");
    //public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);assertTrue(false);
        
    }
    
    
    
}
