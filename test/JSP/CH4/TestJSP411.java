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
public class TestJSP411 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<h2>取得陣列大小</h2>\n" +
"<%\n" +
"   int i;\n" +
"   int arySize[] = new int[4];\n" +
"   arySize[0] = 20;\n" +
"   arySize[1] = 30;\n" +
"   arySize[2] = 36;\n" +
"   arySize[3] = 42;\n" +
"   // 或直接在宣告時便指定其值\n" +
"   int arySize2[] = {17, 19, 24, 32, 42};\n" +
"\n" +
"   out.println(\"第一個陣列的電視尺寸 -> \");\n" +
"   for (i = 0; i < arySize.length; i++) {\n" +
"       out.println(arySize[i] + \" \");\n" +
"   }\n" +
"   out.println(\"<p>\");\n" +
"   out.println(\"第二個陣列的電視尺寸 -> \");\n" +
"   // 2nd array\n" +
"   for (i = 0; i < arySize2.length; i++) {\n" +
"       out.println(arySize2[i] + \" \");\n" +
"   }\n" +
"   out.println(\"<hr>\");\n" +
"%>";
    public StringBuffer buf411;
    public TestJSP411() {
        buf411=new StringBuffer(jsp);
    }
    @Test
    public void test411() {
        HTML that=new HTML(buf411);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
    
}
