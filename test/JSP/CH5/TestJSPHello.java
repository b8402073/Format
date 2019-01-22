/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH5;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSPHello {
    public String jsp="<%! final String strHello = \"Hello, JSP!\"; %>\n" +
"<html>\n" +
"<head><title><%= strHello %></title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>File name: hello.jsp</h2>\n" +
"<h3>\n" +
"<%= strHello %>\n" +
"</h3><hr>\n" +
"</body>\n" +
"</html>";
    public StringBuffer bufHello;
    public TestJSPHello() {
        bufHello=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(bufHello);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    } 
    
}
