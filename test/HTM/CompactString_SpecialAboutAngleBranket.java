/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM;

import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class CompactString_SpecialAboutAngleBranket {
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
    public String jsp24="<html><script> if (a<3) a=4; </script></html>";
    public String jsp25="<html><pre> 1--<>3 </pre> </html>";
    public String jsp26="<html><style> 1--<>3 </style></html>";
    public String jsp27="<html><script src='java.js' /> GG>YY </html>";
    public String jsp28="<html><script src='java.js' /> GG<YY </html>";
    
    
    //                0123456789012345678901234567
    public String f0="<html><body><p </body></html>";  //unfinished tag
    //                0123456789012345678901234567
    public String f1="<html><body>< p </body></html>"; //游離子<,  沒有tag
    public String f2="<html><body><p \n </body></html>"; //unfinished tag
    //                01234567890123456789012345678901234567890
    public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag
    public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag
    public String f5="<html><body><script name=\"GGYY\"   </body></html>";
    

    public String w0="<html> <!-- content --> </html>";
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
    public String w14="<html><style> <p>  </html>";
    public String w15="<html><style> < p>  </html>";    
    public String w16="<html><%  <p>   %></html>";
    public String w17="<html><%  < p>  %></html>";
    public String w18="<html><pre>   <p> </pre></html>";
    public String w19="<html><pre>   <p> </html>";
    public String w20="<html><%   </html>";
    
    public CompactString_SpecialAboutAngleBranket() {
    }
    @Test
    public void TestJ1() {
//    public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待    
      StringBuffer buf=new StringBuffer(jsp1);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt;</body></html>";
        String result2="<html><body><</body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));   
        
        assertTrue(result1.equals(that.toCompactString(true, true, true)));
        assertTrue(result1.equals(that.toCompactString(true, false, true)));
        assertTrue(result2.equals(that.toCompactString(false, true, true)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));
    }
    @Test
    public void TestJ2() {
//    public String jsp2="<html><body> > </body></html>";  //遇到游離子要單獨對待
      StringBuffer buf=new StringBuffer(jsp2);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&gt;</body></html>";
        String result2="<html><body>></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));
        
    }
    @Test
    public void TestJ3() {        
//    public String jsp3="<html><body> <p  ></body></html>"; //這是一個<p> tag      
      StringBuffer buf=new StringBuffer(jsp3);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result="<html><body><p></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true,false)));
        assertTrue(result.equals(that.toCompactString(true, false,false)));
        assertTrue(result.equals(that.toCompactString(false, true,false)));
        assertTrue(result.equals(that.toCompactString(false, false,false)));              
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));
        assertTrue(result.equals(that.toCompactString(true, true,true)));
        assertTrue(result.equals(that.toCompactString(true, false,true)));
        assertTrue(result.equals(that.toCompactString(false, true,true)));
        assertTrue(result.equals(that.toCompactString(false,false,true)));        
    }
    @Test
    public void TestJ4() {
//    public String jsp4="<html><body> />   </body></html>"; //這是游離子
      StringBuffer buf=new StringBuffer(jsp4);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>/></body></html>";
        String result2="<html><body>/&gt;</body></html>";
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));
        assertTrue(result2.equals(that.toCompactString(true, true,true)));
        assertTrue(result2.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));
                
    }    
    @Test
    public void TestJ5() {        
    //public String jsp5="<html><body> < p ></body></html>"; //這是兩個游離子
      StringBuffer buf=new StringBuffer(jsp5);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p &gt;</body></html>";
        String result2="<html><body>< p ></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false))); 
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));
        
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p&nbsp;&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result3.equals(alt.toCompactString(true, true,true)));
        assertTrue(result3.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));        
        
    }        
    @Test
    public void TestJ6() {        
//    public String jsp6="<html><body> < p id='>'  > </body></html>"; //這是兩個游離子
      StringBuffer buf=new StringBuffer(jsp6);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p id=&apos;&gt;&apos;  &gt;</body></html>";
        String result2="<html><body>< p id='>'  ></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));           
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));          
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p&nbsp;id=&apos;&gt;&apos;&nbsp;&nbsp;&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result3.equals(alt.toCompactString(true, true,true)));
        assertTrue(result3.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));                 
    }  
    @Test
    public void TestJ7() {        
    //public String jsp7="<html><body> < p id='<'  > </body></html>"; //這是兩個游離子
      StringBuffer buf=new StringBuffer(jsp7);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p id=&apos;&lt;&apos;  &gt;</body></html>";
        String result2="<html><body>< p id='<'  ></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));            
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));                 
        
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p&nbsp;id=&apos;&lt;&apos;&nbsp;&nbsp;&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result3.equals(alt.toCompactString(true, true,true)));
        assertTrue(result3.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));                 
        
    }  
    @Test
    public void TestJ8() {        
//    public String jsp8="<html><body> <p id='>'  > </body></html>"; //這是一個<p> tag    
      StringBuffer buf=new StringBuffer(jsp8);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='>'></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
        
    }  
    @Test
    public void TestJ9() {        
//    public String jsp9="<html><body> <p id='<'  > </body></html>"; //這是<p> tag
      StringBuffer buf=new StringBuffer(jsp9);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='<'></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
        
    }  

     @Test
    public void TestJ10() {        
//public String jsp10="<html><body> <p id='>' /> </body></html>"; //這是<p> tag
      StringBuffer buf=new StringBuffer(jsp10);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='>'/></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
    }  
     @Test
    public void TestJ11() {        
    //public String jsp11="<html><body> <p id='<'  /> </body></html>"; //這是<p> tag    
      StringBuffer buf=new StringBuffer(jsp11);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='<'/></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
    }  
     @Test
    public void TestJ12() {        
//    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,4個游離子
      StringBuffer buf=new StringBuffer(jsp12);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p id=&apos;name1 \n" +"&apos;&gt;</body></html>";
        String result2="<html><body>< p id='name1 \n" +"'></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));                 
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p&nbsp;id=&apos;name1&nbsp;\n" +"&apos;&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result3.equals(alt.toCompactString(true, true,true)));
        assertTrue(result3.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));                 
    }  
     @Test
    public void TestJ13() {        
//    public String jsp13="<html><body> <p id='na>me1\n"+"'></body></html>"; //這裡沒有SQArea,1個tag,2個游離子
      StringBuffer buf=new StringBuffer(jsp13);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='na>me1\n" +"&apos;&gt;</body></html>";
        String result2="<html><body><p id='na>me1\n" +"'></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));         
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body><p id='na>me1\n" +"&apos;&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result1.equals(alt.toCompactString(true, true,true)));
        assertTrue(result1.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));                 
        
    }  
     @Test
    public void TestJ14() {        
//    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //這裡沒有SQArea,一個Tag
      StringBuffer buf=new StringBuffer(jsp14);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p id='name1\n" +" '></body></html>";
        
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));         
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="";
        //String result2="<html><body>< p ></body></html>";
        
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result1.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result1.equals(alt.toCompactString(false, false,false))); 
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,true));

        assertTrue(result1.equals(alt.toCompactString(true, true,true)));
        assertTrue(result1.equals(alt.toCompactString(true, false,true)));
        assertTrue(result1.equals(alt.toCompactString(false, true,true)));
        assertTrue(result1.equals(alt.toCompactString(false,false,true)));              
    }  
    
     @Test
    public void TestJ15() {        
//    public String jsp15="<html><body>< p id='name1 \n"+"'/></body></html>"; //這裡沒有SQArea,4個游離子
      StringBuffer buf=new StringBuffer(jsp15);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p id=&apos;name1 \n" +"&apos;/&gt;</body></html>";
        String result2="<html><body>< p id='name1 \n" +"'/></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));  
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));                 
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p&nbsp;id=&apos;name1&nbsp;\n" +"&apos;/&gt;</body></html>";
        //String result2="<html><body>< p ></body></html>";
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result3.equals(alt.toCompactString(true, true,true)));
        assertTrue(result3.equals(alt.toCompactString(true, false,true)));
        assertTrue(result2.equals(alt.toCompactString(false, true,true)));
        assertTrue(result2.equals(alt.toCompactString(false,false,true)));                 
        
    }  
        
     @Test
    public void TestJ16() {        
//    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //一個<p> tag,沒有游離子
      StringBuffer buf=new StringBuffer(jsp16);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY --></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
                
    }   
        
     @Test
    public void TestJ17() {        
//public String jsp17="<html><body> <p  <!-- GGYY --> > </body></html>"; //一個<p> tag,一個游離子>
        StringBuffer buf=new StringBuffer(jsp17);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY -->&gt;</body></html>";
        String result2="<html><body><p <!-- GGYY -->></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false,false,true)));                 
                
        
    }     
       
     @Test
    public void TestJ18() {        
//    public String jsp18="<html><body> <p  <!-- GGYY    /></body></html>"; //一個<p> tag
        StringBuffer buf=new StringBuffer(jsp18);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY/></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              
        

        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,true));

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false,false,true)));                 
                
        
    }   
     @Test
    public void TestJ19() {        
//    public String jsp19="<html><body> <p  <!-- GGYY\n -->   </body></html>"; //一個<p> tag,沒有游離子
        StringBuffer buf=new StringBuffer(jsp19);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY --></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              
        assertTrue(false);        
        
    }      
     @Test
    public void TestJ20() {        
//    public String jsp20="<html><body> <p  <!-- GGYY\n --> > </body></html>"; //一個<p> tag,一個游離子>
        StringBuffer buf=new StringBuffer(jsp20);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY -->&gt;</body></html>";
        String result2="<html><body><p <!-- GGYY -->></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        assertTrue(false);        
        
    }      
     @Test
    public void TestJ21() {        
//    public String jsp21="<html><body> <p  <!-- GGYY\n --> /></body></html>"; //一個<p> tag,一個游離子/>
        StringBuffer buf=new StringBuffer(jsp21);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p <!-- GGYY -->/&gt;</body></html>";
        String result2="<html><body><p <!-- GGYY -->/></body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        assertTrue(false);        
    }   
    @Test
    public void TestJ22() {        
//    public String jsp22="<html><body><p name=\"GG \n > \" </body></html>";   //一個<p> tag 
        StringBuffer buf=new StringBuffer(jsp22);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p name=\"GG\n" +">&quot;</body></html>";
        String result2="<html><body><p name=\"GG\n" +">\"</body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body><p name=\"GG\n" +
">&quot;</body></html>";     //不確定對不對，但是我們的行為就是這樣...
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 
        assertTrue(false);        
        
    }  
    @Test
    public void TestJ23() {        
//    public String jsp23="<html><body><p name='GG \n > ' </body></html>";   //一個<p> tag 
        StringBuffer buf=new StringBuffer(jsp23);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p name='GG\n" +">&apos;</body></html>";
        String result2="<html><body><p name='GG\n" +">'</body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 
        assertTrue(false);        
        
    }  
    @Test
    public void TestJ24() {        
//    public String jsp24="<html><script> if (a<3) a=4; </script></html>";
        StringBuffer buf=new StringBuffer(jsp24);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><script>if (a<3) a=4;</script></html>";
        String result2=result1;
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 
        assertTrue(false);        
        
    }     
    @Test
    public void TestJ25() {        
    //public String jsp25="<html><pre> 1--<>3 </pre> </html>";
        StringBuffer buf=new StringBuffer(jsp25);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><pre>1--<>3</pre></html>";
        String result2=result1;
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 
        assertTrue(false);        
        
    }   
    @Test
    public void TestJ26() {        
//    public String jsp26="<html><style> 1--<>3 </style></html>";    
        StringBuffer buf=new StringBuffer(jsp26);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><style>1--<>3</style></html>";
        String result2=result1;
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false))); 
                assertTrue(false);
        
    } 
    
    @Test
    public void TestJ27() {        
//    public String jsp27="<html><script src='java.js' /> GG>YY </html>";
        StringBuffer buf=new StringBuffer(jsp27);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><script src='java.js'/> GG>YY </html>";
        String result2=result1;
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
        assertTrue(false);        
    }    
    @Test
    public void TestJ28() {        
//    public String jsp28="<html><script src='java.js' /> GG<YY </html>";
        StringBuffer buf=new StringBuffer(jsp28);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><script src='java.js'/> GG<YY </html>";
        String result2=result1;
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3=result1;
        
        
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));        
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
        assertTrue(false);        
    }        
    @Test
    public void TestF0() {        
//    public String f0="<html><body><p </body></html>";  //unfinished tag
        StringBuffer buf=new StringBuffer(f0);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p/></body></html>";
        String result2="<html><body><p </body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
                
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result2.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
        assertTrue(false);        
    }    
    @Test
    public void TestF1() {        
//    public String f1="<html><body>< p </body></html>"; //游離子<,  沒有tag
        StringBuffer buf=new StringBuffer(f1);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body>&lt; p</body></html>";
        String result2="<html><body>< p</body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        String result3="<html><body>&lt;&nbsp;p</body></html>";
                
        assertTrue(result3.equals(alt.toCompactString(true, true,false)));
        assertTrue(result3.equals(alt.toCompactString(true, false,false)));
        assertTrue(result2.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
    }    
    @Test
    public void TestF2() {        
//    public String f2="<html><body><p \n </body></html>"; //unfinished tag
        StringBuffer buf=new StringBuffer(f2);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p/></body></html>";
        String result2="<html><body><p </body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        
                
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result2.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
    } 
    @Test
    public void TestF3() {        
//    public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag
        StringBuffer buf=new StringBuffer(f3);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p name='GGYY'/></body></html>";
        String result2="<html><body><p name='GGYY' </body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        
                
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result2.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
    }      
    @Test
    public void TestF4() {        
//public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag
        StringBuffer buf=new StringBuffer(f4);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><p name=\"GGYY\"/></body></html>";
        String result2="<html><body><p name=\"GGYY\" </body></html>";
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        
                
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result2.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result2.equals(alt.toCompactString(false, false,false)));                 
    }      
    @Test
    public void TestF5() {        
//    public String f5="<html><body><script name=\"GGYY\"   </body></html>";  
//視為                              <script name="GGYY" </body    >

        StringBuffer buf=new StringBuffer(f5);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false,false));
        String result1="<html><body><script name=\"GGYY\" </body></html>";
        
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));              
        
        System.out.println("ALT:");
        HTML alt=new HTML(buf);
        alt.defRadical.add(' ');
        alt.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(alt.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(alt.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(alt.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(alt.toCompactString(false, false,false));
        
                
        assertTrue(result1.equals(alt.toCompactString(true, true,false)));
        assertTrue(result1.equals(alt.toCompactString(true, false,false)));
        assertTrue(result1.equals(alt.toCompactString(false, true,false)));
        assertTrue(result1.equals(alt.toCompactString(false, false,false)));                 
    }      
    @Test
    public void TestW0() {
//    public String w0="<html> <!-- content --> </html>";
      StringBuffer buf=new StringBuffer(w0);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><!-- content --></html>";
        String result2="<html></html>";
        assertTrue(result2.equals(that.toCompactString(true, true,true)));
        assertTrue(result2.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false, false,true)));             
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }
    @Test
    public void TestW1() {
//    public String w1="<html><body> <!-- 123 >  -->  </body></html>"; 
      StringBuffer buf=new StringBuffer(w1);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body></body></html>";
        String result2="<html><body><!-- 123 >  --></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }
    @Test
    public void TestW2() {
//    public String w2="<html><body> <!-- 123 >56  -->  </body></html>"; 
      StringBuffer buf=new StringBuffer(w2);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body></body></html>";
        String result2="<html><body><!-- 123 >56  --></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }
    @Test
    public void TestW3() {
//public String w3="<html><body> <!-- <p>  -->  </body></html>";
      StringBuffer buf=new StringBuffer(w3);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body></body></html>";
        String result2="<html><body><!-- <p>  --></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }    
    @Test
    public void TestW4() {
//    public String w4="<html><body> <!-- <p>123</p>  -->  </body></html>";
      StringBuffer buf=new StringBuffer(w4);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body></body></html>";
        String result2="<html><body><!-- <p>123</p>  --></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }        
    @Test
    public void TestW5() {
//    public String w5="<html><body> <script name='<'>  if (3<4) var i=1;  </script name='<' ></body></html>";
      StringBuffer buf=new StringBuffer(w5);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body><script name='<'>if (3<4) var i=1;</script name='<'></body></html>";
        String result2=result1;
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }        
    @Test
    public void TestW6() {
//    public String w6="<html><body> <script name='>'>  if (3>4) var i=1;  </script name='>' ></body></html>";    
      StringBuffer buf=new StringBuffer(w6);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body><script name='>'>if (3>4) var i=1;</script name='>'></body></html>";
        String result2=result1;
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }     
    @Test
    public void TestW7() {
//    public String w7="<html><body> <p   <!-- GGYY -->  ></body></html>";
      StringBuffer buf=new StringBuffer(w7);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body><p <!-- GGYY -->&gt;</body></html>";
        String result2="<html><body><p <!-- GGYY -->></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false, false,true)));             
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }     
    @Test
    public void TestW8() {
//    public String w8="<html><body> <!--  <!--  comment --> --> </body></html>";
      StringBuffer buf=new StringBuffer(w8);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body>--&gt;</body></html>";
        String result2="<html><body>--></body></html>";
        String result3="<html><body><!--  <!--  comment -->--&gt;</body></html>";
        String result4="<html><body><!--  <!--  comment -->--></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result3.equals(that.toCompactString(true, true,false)));
        assertTrue(result3.equals(that.toCompactString(true, false,false)));
        assertTrue(result4.equals(that.toCompactString(false, true,false)));
        assertTrue(result4.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW9() {
//    public String w9="<html><body> <p <!-- GGYY <!-- AABB --></body></html>";
      StringBuffer buf=new StringBuffer(w9);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body><p <!-- GGYY <!-- AABB --></body></html>";
        String result2="";
        String result3="";
        String result4="";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW10() {
//    public String w10="<html><body> <!-- </body> </html>";
      StringBuffer buf=new StringBuffer(w10);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println(that.CheckWhetherThisTagIsUnFinished(2));
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body>";
        String result2="<html><body><!-- </body> </html>-->";
        String result3="<html><body><!-- </body> </html>";
        String result4="";
        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result2.equals(that.toCompactString(true, true,false)));
        assertTrue(result3.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result3.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW11() {

//    public String w11="<html><body> --> </body></html>";        
      StringBuffer buf=new StringBuffer(w11);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><body>--&gt;</body></html>";
        String result2="<html><body>--></body></html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result2.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result2.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW12() {
//public String w12="<html><style> < </style></html>";
      StringBuffer buf=new StringBuffer(w12);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><style><</style></html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW13() {
//    public String w13="<html><style> > </style></html>";
      StringBuffer buf=new StringBuffer(w13);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><style>></style></html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW14() {
//    public String w14="<html><style> <p>  </html>";
      StringBuffer buf=new StringBuffer(w14);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><style> <p>  </html>"; //<style>之後視為css碼，不壓縮
        //(至少在HTML這層不處裡<pre>, <style> , <script>這些指令碼
        //即使以後要處理也會把程式碼寫在HTML的子類別裡面

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW15() {
//    public String w15="<html><style> < p>  </html>";    
      StringBuffer buf=new StringBuffer(w15);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><style> < p>  </html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW16() {
//    public String w16="<html><%  <p>   %></html>";
      StringBuffer buf=new StringBuffer(w16);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><%  <p>   %></html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW17() {
//    public String w17="<html><%  < p>  %></html>";
      StringBuffer buf=new StringBuffer(w17);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><%  < p>  %></html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW18() {
//    public String w18="<html><pre>   <p> </pre></html>";
      StringBuffer buf=new StringBuffer(w18);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><pre><p></pre></html>"; //在<pre>裡面只會trim()一次

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }       
    @Test
    public void TestW19() {
//    public String w19="<html><pre>   <p> </html>";
      StringBuffer buf=new StringBuffer(w19);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><pre>   <p> </html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result1.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result1.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result1.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result1.equals(that.toCompactString(false, false,false)));             
        
    }               
    @Test
    public void TestW20() {
//    public String w20="<html><%   </html>";
      StringBuffer buf=new StringBuffer(w20);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, true,true));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=TRUE:");
        System.out.println(that.toCompactString(true, false,true));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, true,true));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=TRUE:");
        System.out.println(that.toCompactString(false, false,true));
        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(true, true,false));
        System.out.println("TranslateRadical=TRUE, Finishing=false,  RemoveComment=false:");
        System.out.println(that.toCompactString(true, false,false));
        System.out.println("TranslateRadical=false, Finishing=TRUE, RemoveComment=false:");
        System.out.println(that.toCompactString(false, true,false));
        System.out.println("TranslateRadical=false, Finishing=false, RemoveComment=false:");
        System.out.println(that.toCompactString(false, false,false));
        
        String result1="<html><%   </html>%>";
        String result2="<html><%   </html>";

        assertTrue(result1.equals(that.toCompactString(true, true,true)));
        assertTrue(result2.equals(that.toCompactString(true, false,true)));
        assertTrue(result1.equals(that.toCompactString(false, true,true)));
        assertTrue(result2.equals(that.toCompactString(false, false,true)));             
        
        assertTrue(result1.equals(that.toCompactString(true, true,false)));
        assertTrue(result2.equals(that.toCompactString(true, false,false)));
        assertTrue(result1.equals(that.toCompactString(false, true,false)));
        assertTrue(result2.equals(that.toCompactString(false, false,false)));             
        
    }               
    
}
