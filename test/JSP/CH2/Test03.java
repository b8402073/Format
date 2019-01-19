/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH2;

import HTM.TestHTM1;
import Personal.HTML;
import Personal.Main;
import Personal.Pair;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * E:/WEBAPPS/JSP_2/CH02/2-03.HTM
 * @author easterday
 */
public class Test03 {
    String str="<html>\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=big5\">\n" +
"<title>�n�d�з~�s�D</title>\n" +
"</head>\n" +
"<body topmargin=\"10\" leftmargin=\"0\">\n" +
"<center>\n" +
"<div align='center'><center>\n" +
"<table border=0 width=565>\n" +
"<tr>\n" +
"<td width=220>�@ <font color='#FF0000'>13</font> ����ơE\n" +
"Page <font color='#0000FF'>1</font> of <font color='#FF0000'>3</font>\n" +
"</td>\n" +
"</tr>\n" +
"</table></center></div>\n" +
"<div align='center'><center>\n" +
"<table border=1 cellpadding=1 cellspacing=0 width=560>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#A20051'>\n" +
"<p align='center'><font color='#FFFFFF'>\n" +
"�s�@�D�@�D�@�D</font></td>\n" +
"<td width=180 bgcolor='#A20051' align='center'>\n" +
"<font color='#FFFFFF'>���@���@�ӡ@��</font></td>\n" +
"<td width=90 bgcolor='#A20051' align='center'>\n" +
"<font color='#FFFFFF'>��@��</font></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFFFFF'>\n" +
"<a href='pb4/pb4-a013.htm'>�x�_�ӻȧY�N�}��C�жU��</a></td>\n" +
"<td width=180 bgcolor='#FFFFFF'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFFFFF'>\n" +
"89/2/24\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFD9EC'>\n" +
"<a href='pb4/pb4-a012.htm'>�p������~�|�B�@�_�����s�d�w</a></td>\n" +
"<td width=180 bgcolor='#FFD9EC'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFD9EC'>\n" +
"89/2/24\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFFFFF'>\n" +
"<a href='pb4/pb4-a011.htm'>�x������ǥ�����R����</a></td>\n" +
"<td width=180 bgcolor='#FFFFFF'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFFFFF'>\n" +
"89/2/18\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFD9EC'>\n" +
"<a href='pb4/pb4-a010.htm'>�[�����з~�U�ڦ��޹D  �ۮ��Ȧ�~��9�M��10�M</a></td>\n" +
"<td width=180 bgcolor='#FFD9EC'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFD9EC'>\n" +
"89/2/18\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFFFFF'>\n" +
"<a href='pb4/pb4-a009.htm'>�C�з|�@��U�з~��i�@�B</a></td>\n" +
"<td width=180 bgcolor='#FFFFFF'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFFFFF'>\n" +
"89/2/18\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td width=290 bgcolor='#FFD9EC'>\n" +
"<a href='pb4/pb4-a008.htm'>���`��: �F������ﵦ���i����ޤH�~</a></td>\n" +
"<td width=180 bgcolor='#FFD9EC'>\n" +
"���Z�T</td>\n" +
"<td width=90 align='center' bgcolor='#FFD9EC'>\n" +
"89/2/16\n" +
"</td>\n" +
"</tr>\n" +
"</table></center></div>\n" +
"</form>\n" +
"</body></html>";
        String[] txtDQ={"Content-Type","text/html; charset=big5","10","0"};
        String[] txtSQ={"'center'" ,"'#FF0000'" ,"'#0000FF'" ,"'#FF0000'" ,"'center'" ,
            "'#A20051'" ,"'center'" ,"'#FFFFFF'" ,"'#A20051'" ,"'center'" ,"'#FFFFFF'" ,
            "'#A20051'" ,"'center'" ,"'#FFFFFF'" ,"'#FFFFFF'" ,"'pb4/pb4-a013.htm'" ,
            "'#FFFFFF'" ,"'center'" ,"'#FFFFFF'" ,"'#FFD9EC'" ,"'pb4/pb4-a012.htm'" ,
            "'#FFD9EC'" ,"'center'" ,"'#FFD9EC'" ,"'#FFFFFF'" ,"'pb4/pb4-a011.htm'" ,
            "'#FFFFFF'" ,"'center'" ,"'#FFFFFF'" ,"'#FFD9EC'" ,"'pb4/pb4-a010.htm'" ,
            "'#FFD9EC'" ,"'center'" ,"'#FFD9EC'" ,"'#FFFFFF'" ,"'pb4/pb4-a009.htm'" ,
            "'#FFFFFF'" ,"'center'" ,"'#FFFFFF'" ,"'#FFD9EC'" ,"'pb4/pb4-a008.htm'" ,
            "'#FFD9EC'" ,"'center'" ,"'#FFD9EC'"};
        String[] txtTag={"<html>" ,"<head>" ,"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=big5\">" ,
"<title>" ,"</title>" ,"</head>" ,"<body topmargin=\"10\" leftmargin=\"0\">" ,"<center>" ,
"<div align='center'>" ,"<center>" ,"<table border=0 width=565>" ,"<tr>" ,"<td width=220>" ,
"<font color='#FF0000'>" ,"</font>" ,"<font color='#0000FF'>" ,"</font>" ,"<font color='#FF0000'>" ,
"</font>" ,"</td>" ,"</tr>" ,"</table>" ,"</center>" ,"</div>" ,"<div align='center'>" ,"<center>" ,
"<table border=1 cellpadding=1 cellspacing=0 width=560>" ,"<tr>" ,"<td width=290 bgcolor='#A20051'>" ,
"<p align='center'>" ,"<font color='#FFFFFF'>" ,"</font>" ,"</td>" ,"<td width=180 bgcolor='#A20051' align='center'>" ,
"<font color='#FFFFFF'>" ,"</font>" ,"</td>" ,"<td width=90 bgcolor='#A20051' align='center'>" ,"<font color='#FFFFFF'>" ,
"</font>" ,"</td>" ,"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFFFFF'>" ,"<a href='pb4/pb4-a013.htm'>" ,"</a>" ,
"</td>" ,"<td width=180 bgcolor='#FFFFFF'>" ,"</td>" ,"<td width=90 align='center' bgcolor='#FFFFFF'>" ,"</td>" ,
"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFD9EC'>" ,"<a href='pb4/pb4-a012.htm'>" ,"</a>" ,"</td>" ,"<td width=180 bgcolor='#FFD9EC'>" ,
"</td>" ,"<td width=90 align='center' bgcolor='#FFD9EC'>" ,"</td>" ,"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFFFFF'>" ,
"<a href='pb4/pb4-a011.htm'>" ,"</a>" ,"</td>" ,"<td width=180 bgcolor='#FFFFFF'>" ,"</td>" ,"<td width=90 align='center' bgcolor='#FFFFFF'>" ,
"</td>" ,"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFD9EC'>" ,"<a href='pb4/pb4-a010.htm'>" ,"</a>" ,"</td>" ,"<td width=180 bgcolor='#FFD9EC'>" ,
"</td>" ,"<td width=90 align='center' bgcolor='#FFD9EC'>" ,"</td>" ,"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFFFFF'>" ,
"<a href='pb4/pb4-a009.htm'>" ,"</a>" ,"</td>" ,"<td width=180 bgcolor='#FFFFFF'>" ,"</td>" ,"<td width=90 align='center' bgcolor='#FFFFFF'>" ,
"</td>" ,"</tr>" ,"<tr>" ,"<td width=290 bgcolor='#FFD9EC'>" ,"<a href='pb4/pb4-a008.htm'>" ,"</a>" ,
"</td>" ,"<td width=180 bgcolor='#FFD9EC'>" ,"</td>" ,"<td width=90 align='center' bgcolor='#FFD9EC'>" ,"</td>" ,
"</tr>" ,"</table>" ,"</center>" ,"</div>" ,"</form>" ,"</body>" ,"</html>"};
    
    public StringBuffer bufStr;
    public Test03() {
        bufStr=new StringBuffer(str);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void hello() {
        HTML that = new HTML(bufStr);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////

        TestHTM1.assertDQ(that,  txtDQ, false);
        TestHTM1.assertTAG(that, txtTag, false);
        TestHTM1.assertSQ(that, txtSQ,true);
        //�o�Ӯרҫ᭱���Q��F,,,�ӳ·�
        
        /*
        for (int j = 0, i = 1; i < that.LeftOrRight.size() - 1; i += 2, j++) {
            int Start = that.LeftOrRight.get(i);
            int End = that.LeftOrRight.get(i + 1);
            String tmp = Main.ToSTR(new Pair(Start + 1, End - 1), that.MyText).trim();
            //System.out.println(Main.ToSTR(new Pair(Start+1,End-1), that.MyText));
            //System.out.println("j="+j+" :"+tmp);
            switch (j) {
                case 3:
                    assertTrue("�@��²�� (2-01.htm)".equals(tmp));
                    break;
                case 13:
                    assertTrue("�ͤ�: Big secret, I can not tell you... ^_^".equals(tmp));
                    break;
                case 18:
                    assertTrue("�X�ͦa: �x�W�٥x����".equals(tmp)); break;
                case 23:
                    assertTrue("�D�Ǿ��{:".equals(tmp));  break;
                case 25:
                    assertTrue("- �x�����A�|�����".equals(tmp));  break;
                case 27:
                    assertTrue("- �x������ٰ�p".equals(tmp));  break;
                case 29 :
                    assertTrue("- �x������b�ꤤ".equals(tmp));  break;    
                case 31 :
                    assertTrue("- �x���@��".equals(tmp));  break;    
                case 33 :
                    assertTrue("-".equals(tmp));  break;    
                case 34 :
                    assertTrue("��q�j��".equals(tmp));  break;    
                case 35 :
                    assertTrue("�޲z��Ǩt".equals(tmp));  break;    
                case 37 :
                    assertTrue("- ��q�j�Ǹ�T�޲z��".equals(tmp));  break;    
                case 42:
                    assertTrue("Java�ҷ�:".equals(tmp));  break;    
                case 44 :
                    assertTrue("- SCJP (Sun Certified Java Programmer)".equals(tmp));  break;    
                case 46 :
                    assertTrue("- SCWCD (Sun Certified Web Component Developer)".equals(tmp));  break;    
                case 48 :
                    assertTrue("- SCBCD (Sun Certified Business Component Developer)".equals(tmp));  break;    
                    
                default:
                    assertTrue("".equals(tmp));
            }
        } 
        */
     }
     @Test
     public void hello2() {
         char oldSQChar='\'';
         char NChar='!';
         char oldDQChar='"';
         StringBuffer exp=new StringBuffer(str.replace(oldSQChar,NChar));
         exp=new StringBuffer(exp.toString().replace(oldDQChar, oldSQChar));
         exp=new StringBuffer(exp.toString().replace(NChar, oldDQChar));
        HTML that = new HTML(exp);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        ///////////////////////////////////////////////////////
        String[] arrDQ=new String[txtSQ.length]; int i=0;
        String[] arrSQ=new String[txtDQ.length]; int j=0;
        for (String x: txtSQ) {
            String dest= x.replace("'","");
            arrDQ[i]=new String(dest); i++;
        }
        TestHTM1.assertDQ(that,  arrDQ, true);
        
        for (String x: txtDQ) {
            String dest=x.replace("\"","");
            arrSQ[j]=new String(dest); j++;
        }  
        ///////////////////////////////////////////////////////
        
        arrSQ=TestHTM1.SQ(arrSQ);
        TestHTM1.assertSQ(that, arrSQ,true);         
        ///////////////////////////////////////////////////////
         
     }
}
