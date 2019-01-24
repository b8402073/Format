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
    public String jsp12="<html><body> < p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,��Ӵ����l
    public String jsp13="<html><body> < p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,��Ӵ����l
    public String jsp14="<html><body> <p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,�@��Tag
    public String jsp15="<html><body> <p id='name1 \n"+"'></body></html>"; //�o�̨S��SQArea,�@��Tag
    public String jsp16="<html><body> <p  <!-- GGYY -->   </body></html>"; //�@��<p> tag,�S�������l
    public String jsp17="<html><body> <p  <!-- GGYY --> > </body></html>"; //�@��<p> tag,�@�Ӵ����l>
    public String jsp18="<html><body> <p  <!-- GGYY --> /></body></html>"; //�@��<p> tag,�@�Ӵ����l/>
    public String jsp19="<html><body> <p  <!-- GGYY\n -->   </body></html>"; //�@��<p> tag,�S�������l
    public String jsp20="<html><body> <p  <!-- GGYY\n --> > </body></html>"; //�@��<p> tag,�@�Ӵ����l>
    public String jsp21="<html><body> <p  <!-- GGYY\n --> /></body></html>"; //�@��<p> tag,�@�Ӵ����l/>
    public String jsp22="<html><body><p name=\"GG \n > \" </body></html>";   //�@��<p> tag 
    public String jsp23="<html><body><p name='GG \n > ' </body></html>";   //�@��<p> tag 
    
    public String f0="<html><body><p </body></html>";  //unfinished tag
    public String f1="<html><body>< p </body></html>"; //�����l<,  �S��tag
    public String f2="<html><body><p \n </body></html>"; //unfinished tag
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
                case 1:
                    assertTrue("<".equals(tmp)); break;
                default:
                    assertTrue("".equals(tmp));
            }
        }        
    }
    
}
