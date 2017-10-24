/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.JspElement;
import Personal.JspMain3;
import Personal.JspStatic3;
import Personal.Main;
import static Personal.Main.AssembleElement;
import static Personal.Main.Build_Comment_Area;
import static Personal.Main.Build_DQ_Area;
import static Personal.Main.Build_Left_and_Right;
import static Personal.Main.Build_SQ_Area;
import static Personal.Main.Fix_if_LeftRight_in_DQArea;
import static Personal.Main.Fix_if_SQDQ_in_CommentArea;
import static Personal.Main.JSPFileString;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author easterday
 */
public class Test_JspMain3 {
    
    public Test_JspMain3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void do_while_test_1() {
        StringBuffer S = new StringBuffer("<%  int i=0; do {System.out.println(i);%> <% ++i; }while(i<100);  %>");
        Main.refineStringBuffer(S); 
        Main.Build_Left_and_Right(S);
        Build_DQ_Area(S);
        Build_SQ_Area(S);
        Build_Comment_Area(S);
        Fix_if_SQDQ_in_CommentArea(S);
        Fix_if_LeftRight_in_DQArea(S);
        //Build_JavaScript_Area(buf);
        Vector<JspElement> ret = JSPFileString(S);
        Vector<StringBuffer> jspmain=new Vector<StringBuffer>();
        for (JspElement X: ret) {
            switch(X.Type) {
                case"jsp_main":
                    jspmain.add(X.Txt); break;
                default:
            }
        }
        // JspMain3 MyMain=new JspMain3((StringBuffer[]) jspmain.toArray());  //這樣寫不能動
        JspMain3 MyMain=new JspMain3(jspmain);
        System.out.println(MyMain.warning());
        MyMain.go();
        MyMain.setOtherType(JspStatic3.LineType.AFTER_LINE);
        MyMain.MainMake3();
        int main_index=0;
        for (int i=0; i<ret.size(); i++) {
            JspElement that=ret.get(i);
            String line;
            switch(that.Type) {
                case"jsp_static":
                    JspStatic3 obj=new JspStatic3(that.Txt);
                    System.out.println(obj.warning());
                    obj.go();
                    obj.setOtherType(JspStatic3.LineType.AFTER_LINE);
                    line=AssembleElement("<%!","%>",obj.Make3().toString());
                    System.out.println(line);
                    break;
                case"jsp_main":
                    line=AssembleElement("<%","%>",MyMain.MyOutput[main_index++].toString());
                    System.out.println(line);
                    break;
                case"html":
                    line=AssembleElement("<",">",that.Txt.toString());
                    System.out.println(line);
                    break;
                case"jsp_import":
                    line=AssembleElement("<%@","%>",that.Txt.toString());
                    System.out.println(line);
                    break;
                case"html_comment":
                    line=AssembleElement("<!--","-->",that.Txt.toString());
                    System.out.println(line);
                    break;
                case"jsp_comment":
                    line=AssembleElement("<%--","--%>",that.Txt.toString());
                    System.out.println(line);
                    break;
                case"jsp_value":
                    line=AssembleElement("<%=","%>",that.Txt.toString());
                    System.out.println(line);
                    break;
                case"single_html":
                    line=AssembleElement("<"," />",that.Txt.toString());
                    System.out.println(line);
                    break;                            
            } 
        }
    }
    
}
