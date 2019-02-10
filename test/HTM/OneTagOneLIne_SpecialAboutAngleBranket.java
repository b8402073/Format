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
public class OneTagOneLIne_SpecialAboutAngleBranket {
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
    public String w21="<html>A A B B<script><!-- if (1+1==2) \n var a=3; --> GGYY</script></html>";
    
    
    public OneTagOneLIne_SpecialAboutAngleBranket() {        
    }
    @Test
    public void testJ1() {
//    public String jsp1="<html><body> < </body></html>";  //遇到游離子要單獨對待            
        StringBuffer buf=new StringBuffer(jsp1);
        HTML that=new HTML(buf);
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE  removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(true, true,false,"\n"));
        System.out.println("TranslateRadical=TRUE, Finishing=false removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(true, false,false,"\n"));
        System.out.println("TranslateRadical=false, Finishing=TRUE removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(false, true,false,"\n"));
        System.out.println("TranslateRadical=false, Finishing=false removeHTMLcomment=false :");
        System.out.println(that.toOneTagOneLineString(false, false,false,"\n"));        
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE  removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(true, true,true,"\n"));
        System.out.println("TranslateRadical=TRUE, Finishing=false removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(true, false,true,"\n"));
        System.out.println("TranslateRadical=false, Finishing=TRUE removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(false, true,true,"\n"));
        System.out.println("TranslateRadical=false, Finishing=false removeHTMLcomment=true :");
        System.out.println(that.toOneTagOneLineString(false, false,true,"\n"));       
        String result1="<html>\n" +"<body>\n" +"&lt;\n" +"</body>\n" +"</html>";
        String result2="<html>\n" +"<body>\n" +"<\n" +"</body>\n" +"</html>";

        assertTrue(result2.trim().equals(that.toOneTagOneLineString(false,false,false,"\n").trim()));
        assertTrue(result2.trim().equals(that.toOneTagOneLineString(false,false,true,"\n").trim()));
        assertTrue(result2.trim().equals(that.toOneTagOneLineString(false,true,false,"\n").trim()));
        assertTrue(result2.trim().equals(that.toOneTagOneLineString(false,true,true,"\n").trim()));
        
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,false,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,false,true,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,true,false,"\n").trim()));
        assertTrue(result1.trim().equals(that.toOneTagOneLineString(true,true,true,"\n").trim()));
        
        
        
    }
            
    
}
