/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.CH2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * E:/WEBAPPS/JSP_2/CH02/2-01.HTM
 * @author easterday
 */
public class Test01 {
    String sJSP01="<html>\n" +
"<head>\n" +
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n" +
"<title>�@��²�� (2-01.htm)</title>\n" +
"</head>\n" +
"<body>\n" +
"<p><img src=\"../images/ME1.GIF\" align=\"right\" hspace=\"0\"> </p>\n" +
"<ul>\n" +
"<p><li>\n" +
"<font size=\"4\">�ͤ�: Big secret, I can not tell you... ^_^</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">�X�ͦa: �x�W�٥x����</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">�D�Ǿ��{: </li>\n" +
"  <dd>- �x�����A�|�����</dd>\n" +
"  <dd>- �x������ٰ�p</dd>\n" +
"  <dd>- �x������b�ꤤ</dd>\n" +
"  <dd>- �x���@��</li>\n" +
"  <dd>- <a href=\"http://www.nctu.edu.tw\">��q�j��</a>�޲z��Ǩt</dd>\n" +
"�@<dd>- ��q�j�Ǹ�T�޲z��</dd>\n" +
"</font>\n" +
"<p><li>\n" +
"<font size=\"4\">Java�ҷ�: </dd>\n" +
"  <dd>- SCJP (Sun Certified Java Programmer)</dd>\n" +
"  <dd>- SCWCD (Sun Certified Web Component Developer)</dd>\n" +
"  <dd>- SCBCD (Sun Certified Business Component Developer)</dd>\n" +
"</font>\n" +
"</ul>\n" +
"</body>\n" +
"</html>";
    public StringBuffer bufJSP01;
    public Test01() {
        bufJSP01=new StringBuffer(sJSP01);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Test01() {
     }
}
