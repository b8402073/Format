/*
  TestJSP933�O�����q�ҥ�����COPY�X�Ӫ��r��
  �ҥH���ª��@�k����{��CH9��9-33.jsp�O�����X�k��(JSP/HTML)
  �ҥH�b�o�̥θ��l�гy�ܦh�ܷ��ݪ����p
  �M��t�X(IE/Chrome)�����浲�G�Ӯե��ڭ̪�HTML���O��@

  ��M�]�\���i��ξ������ͧ󧹾㪺���p�|��n!!!
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
    //                0123456789012345678901234567
    public String f0="<html><body><p </body></html>";  //unfinished tag
    //                0123456789012345678901234567
    public String f1="<html><body>< p </body></html>"; //�����l<,  �S��tag
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
    public SpecialAboutAngleBranketSymbol() {
    }
    
    @Test
    public void testA01() {
    //public String jsp1="<html><body> < </body></html>";  //�J������l�n��W���            
        StringBuffer buf=new StringBuffer(jsp1);
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
//    public String jsp2="<html><body> > </body></html>";  //�J������l�n��W���        
        StringBuffer buf=new StringBuffer(jsp2);
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
        StringBuffer buf=new StringBuffer(jsp3);
//    public String jsp3="<html><body> <p  ></body></html>"; //�o�O�@��<p> tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
        StringBuffer buf=new StringBuffer(jsp4);
    // public String jsp4="<html><body> />   </body></html>"; //�o�O�����l
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
//    public String jsp5="<html><body> < p ></body></html>"; //�o�O��Ӵ����l        
        StringBuffer buf=new StringBuffer(jsp5);
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
    //public String jsp6="<html><body> < p id='>'  > </body></html>"; //�o�O��Ӵ����l        
        StringBuffer buf=new StringBuffer(jsp6);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
//    public String jsp7="<html><body> < p id='<'  > </body></html>"; //�o�O��Ӵ����l        
        StringBuffer buf=new StringBuffer(jsp7);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
        StringBuffer buf=new StringBuffer(jsp8);
//    public String jsp8="<html><body> <p id='>'  > </body></html>"; //�o�O�@��<p> tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
    //public String jsp9="<html><body> <p id='<'  > </body></html>"; //�o�O<p> tag        
        StringBuffer buf=new StringBuffer(jsp9);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
//    public String jsp10="<html><body> <p id='>' /> </body></html>"; //�o�O<p> tag        
        StringBuffer buf=new StringBuffer(jsp10);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
        
        StringBuffer buf=new StringBuffer(jsp11);
    //public String jsp11="<html><body> <p id='<'  /> </body></html>"; //�o�O<p> tag            
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
//    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,4�Ӵ����l        
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
        
        StringBuffer buf=new StringBuffer(jsp13);
//    public String jsp13="<html><body> <p id='na>me1\n"+"'></body></html>"; //�o�̨S��SQArea,1��tag,2�Ӵ����l        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
        StringBuffer buf=new StringBuffer(jsp14);      
//    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,�@��Tag        
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
        StringBuffer buf=new StringBuffer(jsp15);
//    public String jsp15="<html><body>< p id='name1 \n"+"'/></body></html>"; //�o�̨S��SQArea,4�Ӵ����l        
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
        //under construction
        StringBuffer buf=new StringBuffer(jsp16);
//    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //�@��<p> tag,�S�������l
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
    public void testA17() {
        StringBuffer buf=new StringBuffer(jsp17);        assertTrue(false);
    }    
    @Test
    public void testA18() {
        StringBuffer buf=new StringBuffer(jsp18);        assertTrue(false);
    }      
    @Test
    public void testA19() {
        StringBuffer buf=new StringBuffer(jsp19);        assertTrue(false);
    }      
    @Test
    public void testA20() {
        StringBuffer buf=new StringBuffer(jsp20);        assertTrue(false);
    }      

    @Test
    public void testA21() {
        StringBuffer buf=new StringBuffer(jsp21);        assertTrue(false);
    }      
    @Test
    public void testA22() {
        StringBuffer buf=new StringBuffer(jsp22);        assertTrue(false);
    }      
    @Test
    public void testA23() {
        StringBuffer buf=new StringBuffer(jsp23);        assertTrue(false);
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
        //public String f1="<html><body>< p </body></html>"; //�����l<,  �S��tag        
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
        //public String f2="<html><body><p \n </body></html>"; //unfinished tag
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
    //public String f3="<html><body><p name='GGYY'  </body></html>"; //unfinished tag        
        StringBuffer buf=new StringBuffer(f3);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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
//    public String f4="<html><body><p name=\"GGYY\"   </body></html>"; //unfinished tag        
        StringBuffer buf=new StringBuffer(f4);
        HTML that=new HTML(buf);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        
        System.out.println("Radical="+that.Radical.toString());
        System.out.println("UnFinished="+that.UnFinished.toString());
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

    
    
}
