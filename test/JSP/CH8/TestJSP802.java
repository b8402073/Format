/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP.CH8;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class TestJSP802 {
    public String jsp="<%@ page contentType=\"text/html; charset=big5\"\n" +
"    import=\"java.sql.*\" %>\n" +
"<html>\n" +
"<head><title>�ϥ�Connection����</title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>Connection���������Τ@</h2>\n" +
"<%\n" +
"  boolean bolAuto, bolRO, bolClosed;\n" +
"  // 1.���JJDBC�X�ʵ{��\n" +
"  Class.forName(\"sun.jdbc.odbc.JdbcOdbcDriver\");\n" +
"  // 2.�z�LDriverManager���O�إ�Connection����\n" +
"  Connection con = DriverManager.getConnection(\"jdbc:odbc:JSPAll\");\n" +
"\n" +
"  bolAuto = con.getAutoCommit();\n" +
"  out.println(\"�ثeauto-commit�Ҧ��G\" + bolAuto + \"<p>\");\n" +
"\n" +
"  bolAuto = false;\n" +
"  out.println(\"�]�wauto-commit�Ҧ����G\" + bolAuto + \"<p>\");\n" +
"  con.setAutoCommit(bolAuto);\n" +
"\n" +
"  bolAuto = con.getAutoCommit();\n" +
"  out.println(\"���ܫ᪺auto-commit�Ҧ��G\" + bolAuto + \"<br><hr>\");\n" +
"  //\n" +
"  bolRO = con.isReadOnly();\n" +
"  out.println(\"�ثeRead Only�Ҧ��G\" + bolRO + \"<p>\");\n" +
"\n" +
"  bolRO = true;\n" +
"  out.println(\"�]�wRead Only�Ҧ����G\" + bolRO + \"<p>\");\n" +
"  con.setReadOnly(bolRO);\n" +
"\n" +
"  bolRO = con.isReadOnly();\n" +
"  out.println(\"���ܫ᪺Read Only�Ҧ��G\" + bolRO + \"<br><hr>\");\n" +
"  //  \n" +
"  bolClosed = con.isClosed();\n" +
"  out.println(\"�ثeConnection�O�_�Qclose�G\" + bolClosed + \"<p>\");\n" +
"\n" +
"  // 8.����Connection����\n" +
"  out.println(\"����Connection...<p>\");\n" +
"  con.close();\n" +
"\n" +
"  bolClosed = con.isClosed();\n" +
"  out.println(\"�ثeConnection�O�_�Qclose�G\" + bolClosed + \"<hr>\");\n" +
"%>\n" +
"</body>\n" +
"</html>";
   public StringBuffer buf802;        
    public TestJSP802() {
        buf802=new StringBuffer(jsp);
    }
    @Test
    public void testHello() {
        HTML that=new HTML(buf802);
        that.go();
        that.PrintIssues();
        TestHTM1.ReportInTest(that);
        assertTrue(that.Left.size() == that.Right.size());
        assertTrue(that.LeftOrRight.size() == that.Right.size() * 2);
        
    }
}
