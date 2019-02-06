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
    public String jsp1="<html><body> < </body></html>";  //�J������l�n��W���    
    public String jsp2="<html><body> > </body></html>";  //�J������l�n��W���
    public String jsp3="<html><body> <p  ></body></html>"; //�o�O�@��<p> tag
    public String jsp4="<html><body> />   </body></html>"; //�o�O�����l
    public String jsp5="<html><body> < p ></body></html>"; //�o�O��Ӵ����l
    public String jsp6="<html><body> < p id='>'  > </body></html>"; //�o�O��Ӵ����l
    public String jsp7="<html><body> < p id='<'  > </body></html>"; //�o�O��Ӵ����l
    public String jsp8="<html><body> <p id='>'  > </body></html>"; //�o�O�@��<p> tag
    public String jsp9="<html><body> <p id='<'  > </body></html>"; //�o�O<p> tag
    public String jsp10="<html><body> <p id='>' /> </body></html>"; //�o�O<p> tag
    public String jsp11="<html><body> <p id='<'  /> </body></html>"; //�o�O<p> tag    
    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,4�Ӵ����l
    //                   012345678901234567890123456    78
    public String jsp13="<html><body> <p id='na>me1\n"+"'></body></html>"; //�o�̨S��SQArea,1��tag,2�Ӵ����l
    //                   012345678901234567890123456    78
    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,�@��Tag
    //                   012345678901234567890123456    789
    public String jsp15="<html><body>< p id='name1 \n"+"'/></body></html>"; //�o�̨S��SQArea,4�Ӵ����l
    //                   
    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //�@��<p> tag,�S�������l
    public String jsp17="<html><body> <p  <!-- GGYY --> > </body></html>"; //�@��<p> tag,�@�Ӵ����l>
    public String jsp18="<html><body> <p  <!-- GGYY    /></body></html>"; //�@��<p> tag
    public String jsp19="<html><body> <p  <!-- GGYY\n -->   </body></html>"; //�@��<p> tag,�S�������l
    public String jsp20="<html><body> <p  <!-- GGYY\n --> > </body></html>"; //�@��<p> tag,�@�Ӵ����l>
    public String jsp21="<html><body> <p  <!-- GGYY\n --> /></body></html>"; //�@��<p> tag,�@�Ӵ����l/>
    public String jsp22="<html><body><p name=\"GG \n > \" </body></html>";   //�@��<p> tag 
    public String jsp23="<html><body><p name='GG \n > ' </body></html>";   //�@��<p> tag 
    public String jsp24="<html><script> if (a<3) a=4; </script></html>";
    public String jsp25="<html><pre> 1--<>3 </pre> </html>";
    public String jsp26="<html><style> 1--<>3 </style></html>";
    public String jsp27="<html><script src='java.js' /> GG>YY </html>";
    public String jsp28="<html><script src='java.js' /> GG<YY </html>";
    
    
    //                0123456789012345678901234567
    public String f0="<html><body><p </body></html>";  //unfinished tag
    //                0123456789012345678901234567
    public String f1="<html><body>< p </body></html>"; //�����l<,  �S��tag
    public String f2="<html><body><p \n </body></html>"; //unfinished tag
    //                01234567890123456789012345678901234567890
    public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag
    public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag

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
//    public String jsp1="<html><body> < </body></html>";  //�J������l�n��W���    
      StringBuffer buf=new StringBuffer(jsp1);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result1="<html><body>&lt;</body></html>";
        String result2="<html><body><</body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true)));
        assertTrue(result1.equals(that.toCompactString(true, false)));
        assertTrue(result2.equals(that.toCompactString(false, true)));
        assertTrue(result2.equals(that.toCompactString(false, false)));             
    }
    @Test
    public void TestJ2() {
//    public String jsp2="<html><body> > </body></html>";  //�J������l�n��W���
      StringBuffer buf=new StringBuffer(jsp2);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result1="<html><body>&gt;</body></html>";
        String result2="<html><body>></body></html>";
        assertTrue(result1.equals(that.toCompactString(true, true)));
        assertTrue(result1.equals(that.toCompactString(true, false)));
        assertTrue(result2.equals(that.toCompactString(false, true)));
        assertTrue(result2.equals(that.toCompactString(false, false)));              
    }
    @Test
    public void TestJ3() {
//    public String jsp3="<html><body> <p  ></body></html>"; //�o�O�@��<p> tag      
      StringBuffer buf=new StringBuffer(jsp3);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result="<html><body><p></body></html>";
        assertTrue(result.equals(that.toCompactString(true, true)));
        assertTrue(result.equals(that.toCompactString(true, false)));
        assertTrue(result.equals(that.toCompactString(false, true)));
        assertTrue(result.equals(that.toCompactString(false, false)));              
    }
    @Test
    public void TestJ4() {
//    public String jsp4="<html><body> />   </body></html>"; //�o�O�����l
      StringBuffer buf=new StringBuffer(jsp4);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result1="<html><body>/></body></html>";
        String result2="<html><body>/&gt;</body></html>";
        assertTrue(result2.equals(that.toCompactString(true, true)));
        assertTrue(result2.equals(that.toCompactString(true, false)));
        assertTrue(result1.equals(that.toCompactString(false, true)));
        assertTrue(result1.equals(that.toCompactString(false, false)));              
    }    
    @Test
    public void TestJ5() {
        assertTrue(false);
    //public String jsp5="<html><body> < p ></body></html>"; //�o�O��Ӵ����l
      StringBuffer buf=new StringBuffer(jsp5);
        HTML that = new HTML(buf);        
        that.go();
        System.out.println("TranslateRadical=TRUE, Finishing=TRUE:");
        System.out.println(that.toCompactString(true, true));
        System.out.println("TranslateRadical=TRUE, Finishing=false:");
        System.out.println(that.toCompactString(true, false));
        System.out.println("TranslateRadical=false, Finishing=TRUE:");
        System.out.println(that.toCompactString(false, true));
        System.out.println("TranslateRadical=false, Finishing=false:");
        System.out.println(that.toCompactString(false, false));
        String result1="<html><body>/></body></html>";
        String result2="<html><body>/&gt;</body></html>";
        assertTrue(result2.equals(that.toCompactString(true, true)));
        assertTrue(result2.equals(that.toCompactString(true, false)));
        assertTrue(result1.equals(that.toCompactString(false, true)));
        assertTrue(result1.equals(that.toCompactString(false, false)));              
    }        
    
}