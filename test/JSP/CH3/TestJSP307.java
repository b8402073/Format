/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH3;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP307 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"int intNum = 10;   //Page Level變數\n" +
"\n" +
"private String mySub1() \n" +
"{\n" +
"  String strMsg;\n" +
"  strMsg = \"intNum in mySub1 = \" + intNum + \"<br>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub2() \n" +
"{\n" +
"  String strMsg;\n" +
"  intNum = 20;   //intNum 被 mySub2函數改變\n" +
"  strMsg = \"intNum in mySub2 = \" + intNum + \"<br>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"\n" +
"private String mySub3() \n" +
"{\n" +
"  String strMsg;\n" +
"  int intNum;  //定義私有變數\n" +
"  intNum = 30;\n" +
"  strMsg = \"intNum in mySub3 = \" + intNum + \"<hr>\";\n" +
"  return (strMsg);\n" +
"}\n" +
"%>\n" +
"<h2>變數的有效範圍</h2>\n" +
"<%\n" +
"// int intNum = 121;\n" +
"// out.println(\"intNum in the page = \" + intNum + \"<br>\");\n" +
"\n" +
"out.println(mySub1());  //顯示intNum的初始值: 10\n" +
"out.println(mySub2());  //intNum將被改變成20\n" +
"out.println(mySub3());  //擁有自己的intNum變數: 30\n" +
"\n" +
"//猜猜看intNum變數值最後為何？\n" +
"out.println(\"intNum in the page = \" + intNum + \"<br>\");\n" +
"%>";
    public StringBuffer buf307;
    
    public TestJSP307() {
        buf307=new StringBuffer(jsp);
    }
    @Test
    public void test307() {
        HTML that=new HTML(buf307);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
    
}
