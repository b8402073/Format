/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH4;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP412 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>���o�G���}�C�j�p</h2>\n" +
"<%\n" +
"   int i, j;\n" +
"   //�����b�ŧi�ɫK���w���: 4 x 3���G���}�C\n" +
"   int aryQty[][] = {{600,800,1000}, {100, 260, 350}, {120,360,300}, {15, 20, 30}};\n" +
"   String aryName[] = {\"DRAM\", \"SRAM\", \"MP3 Player\", \"LCD\"};\n" +
"   //���o�����C��\n" +
"   for (i = 0; i < aryQty.length; i++) {\n" +
"       out.println(\"\\\"\" + aryName[i] + \"\\\" �P��q(7,8,9��) -> \");\n" +
"       for (j = 0; j < aryQty[i].length; j++) {  //���o�U�C�������ӯ�\n" +
"          out.println(aryQty[i][j] + \" \");\n" +
"       }\n" +
"       out.println(\"<p>\");\n" +
"   }\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf412;
    public TestJSP412() {
        buf412=new StringBuffer(jsp);
    }
    @Test
    public void test401() {
        HTML that=new HTML(buf412);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
