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
"<title>作者簡介 (2-01.htm)</title>\n" +
"</head>\n" +
"<body>\n" +
"<p><img src=\"../images/ME1.GIF\" align=\"right\" hspace=\"0\"> </p>\n" +
"<ul>\n" +
"<p><li>\n" +
"<font size=\"4\">生日: Big secret, I can not tell you... ^_^</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">出生地: 台灣省台中市</font>\n" +
"</li>\n" +
"<p><li>\n" +
"<font size=\"4\">求學歷程: </li>\n" +
"  <dd>- 台中市農會托兒所</dd>\n" +
"  <dd>- 台中市西屯國小</dd>\n" +
"  <dd>- 台中市西苑國中</dd>\n" +
"  <dd>- 台中一中</li>\n" +
"  <dd>- <a href=\"http://www.nctu.edu.tw\">交通大學</a>管理科學系</dd>\n" +
"　<dd>- 交通大學資訊管理所</dd>\n" +
"</font>\n" +
"<p><li>\n" +
"<font size=\"4\">Java證照: </dd>\n" +
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
