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
public class TestJSP308 {
    //����VBScript����
    String jsp="<html>\n" +
"<head>\n" +
"<meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=big5\">\n" +
"<title>�D���ϩP��--3-08.htm</title>\n" +
"<script Language=\"VBScript\">\n" +
"<!--\n" +
"Const cntPI = 3.14159\n" +
"Sub Cal_circus()\n" +
"  Dim sngCircus, sngR\n" +
"\n" +
"  If Not IsNumeric(document.frm1.R.Value) Then\n" +
"     MsgBox \"�п�J�ƭ�!\", 16, \"Oh, no!\"\n" +
"     document.frm1.R.Value = \"\"\n" +
"     Exit Sub\n" +
"  End If\n" +
"  sngR = CSng(document.frm1.R.Value)\n" +
"  sngCircus = 2 * cntPI * sngR  '2Pi * R\n" +
"  MsgBox \"��P���O \" & sngCircus & \" !\"\n" +
"End Sub\n" +
"-->\n" +
"</script>\n" +
"</head>\n" +
"<body>\n" +
"<h3>�D����P��</h3>\n" +
"<!-- �N��檺�W�٨���\"frm1\"  -->\n" +
"<form method=\"post\" name=\"frm1\">\n" +
"<img src=\"../images/BALL1.GIF\">\n" +
"�п�J�b�|�G<input name=\"R\" maxlength=6 size=6><br>\n" +
"<hr>\n" +
"<!-- ���U�u�p��v�s��A�N����Cal_circus�Ƶ{��  -->\n" +
"<input type=\"button\" value=\"�p��\" onclick=\"cal_Circus\">\n" +
"<input type=\"reset\" value=\"�M��\">\n" +
"</form>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf308;
    public TestJSP308() {
        buf308=new StringBuffer(jsp);
    }
    @Test
    public void test308() {
        HTML that=new HTML(buf308);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }    
}
