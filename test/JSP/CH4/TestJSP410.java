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
public class TestJSP410 {
    public String jsp="<%@ page contentType = \"text/html; charset=big5\" %>\n" +
"<%!\n" +
"final double cntPI = 3.14159;\n" +
"double dblHealth = 0;\n" +
"void my_Main(String strH, String strW)\n" +
"{\n" +
"  double dblH, dblW;\n" +
"  //�N������(height)�নdouble\n" +
"  dblH = Double.parseDouble(strH);\n" +
"  dblW = Double.parseDouble(strW);\n" +
"  //�I�s�ۭq��ơB�a�J�ѼƭȡA�åH�@�ܼƱ�����^�ǭ�\n" +
"  dblHealth = cal_Health(dblH, dblW);\n" +
"}\n" +
"\n" +
"double cal_Health(double dblH, double dblW)\n" +
"{\n" +
"  double dblW2;\n" +
"  dblW2 = (dblH - 100) * 0.9;   //�з��魫\n" +
"  dblW2 = dblW - dblW2;\n" +
"  return dblW2;  //�n�O�o�^�Ǧ���\n" +
"}\n" +
"%>\n" +
"<html>\n" +
"<head><title>�D�����d����: 4-10.jsp</title>\n" +
"<script language=\"JavaScript\">\n" +
"<!--\n" +
"function check_Data()\n" +
"{\n" +
"  var ck=false;\n" +
"  var height, weight;\n" +
"  height = document.frm1.height.value;\n" +
"  weight = document.frm1.weight.value;\n" +
"\n" +
"  if ((height.length == 0) || isNaN(height)) {\n" +
"     window.alert(\"�����ݬ��ƭ�!\");\n" +
"     document.frm1.height.value = \"\";\n" +
"     focusto(0);\n" +
"     ck=true;\n" +
"  } else if ((weight.length == 0) || isNaN(weight)) {\n" +
"     window.alert(\"�魫�ݬ��ƭ�!\");\n" +
"     document.frm1.weight.value = \"\";\n" +
"     focusto(1);\n" +
"     ck=true;\n" +
"  }\n" +
"\n" +
"  if(ck==false) {\n" +
"     document.frm1.submit();\n" +
"  }\n" +
"}\n" +
"\n" +
"function focusto(x)\n" +
"{ \n" +
"  // �N��Щw���Y�Ӫ��(Form)���\n" +
"  document.forms[0].elements[x].focus();\n" +
"}\n" +
"-->\n" +
"</script>\n" +
"</head>\n" +
"<body>\n" +
"<%\n" +
"  String strH, strW;\n" +
"  strH = request.getParameter(\"height\");\n" +
"  strW = request.getParameter(\"weight\");\n" +
"%>\n" +
"<h2>�D�����d����</h2>\n" +
"<!-- �N��檺�W�٨���\"frm1\"  -->\n" +
"<form action=\"4-10.jsp\" method=\"post\" name=\"frm1\">\n" +
"<img src=\"../images/BALL1.GIF\">\n" +
"�п�J�����G<input name=\"height\" maxlength=6 size=6\n" +
" value='<%= strH %>'><br>\n" +
"<img src=\"../images/BALL1.GIF\">\n" +
"�п�J�魫�G<input name=\"weight\" maxlength=6 size=6\n" +
" value='<%= strW %>'><br>\n" +
"<hr>\n" +
"<!-- ���U�u�p��v�s��A�|�N������ǰe����  -->\n" +
"<input type=\"button\" value=\"�p��\" onClick=\"check_Data()\">\n" +
"<input type=\"reset\" value=\"�M��\">\n" +
"</form>\n" +
"<%\n" +
"  my_Main(strH, strW);  //�I�s���\n" +
"  out.println(\"�z�����d���ƬO \" + dblHealth + \" !\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
    public StringBuffer buf410;
    public TestJSP410() {
        buf410=new StringBuffer(jsp);
    }
    @Test
    public void test401() {
        HTML that=new HTML(buf410);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
}
