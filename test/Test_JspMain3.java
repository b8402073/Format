/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.JspMain3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        StringBuffer S = new StringBuffer("<%  int i=0; do {System.out.println(i); ++i; }while(i<100);  %>");
        StringBuffer[] arrS=new StringBuffer[1];
        arrS[0]=S;
        JspMain3 obj = new JspMain3(arrS);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.MainMake3();
        System.out.println(obj.MyOutput[0].toString());
        /*
        String AfterLine=obj.setCatchType(JspMain3.LineType.NEXT_LINE).setOtherType(JspMain3.LineType.AFTER_LINE).Make3().toString().trim(); 
        String NextLine= obj.setCatchType(JspMain3.LineType.NEXT_LINE).setOtherType(JspMain3.LineType.NEXT_LINE).Make3().toString().trim();
        System.out.println("AfterLine:\n"+AfterLine);
        System.out.println("NExtLine:\n"+NextLine);
        String after="#####public int a ( ) {\n" +
"#####   int i=0;\n" +
"#####   do {\n" +
"#####      System.out.println(i);\n" +
"#####      ++i;\n" +
"#####   } while( i < 100 );\n" +
"#####   return i;\n" +
"#####}";
        String next="#####public int a ( ) {\n" +
"#####   int i=0;\n" +
"#####   do\n" +
"#####   {\n" +
"#####      System.out.println(i);\n" +
"#####      ++i;\n" +
"#####   } while( i < 100 );\n" +
"#####   return i;\n" +
"#####}";
        assertTrue(AfterLine.trim().equals(after.trim()));
        assertTrue(NextLine.trim().equals(next.trim()));
        
        AfterLine=obj.setCatchType(JspMain3.LineType.AFTER_LINE).setOtherType(JspMain3.LineType.AFTER_LINE).Make3().toString().trim(); 
        NextLine= obj.setCatchType(JspMain3.LineType.AFTER_LINE).setOtherType(JspMain3.LineType.NEXT_LINE).Make3().toString().trim();
        assertTrue(AfterLine.trim().equals(after.trim()));
        assertTrue(NextLine.trim().equals(next.trim()));
        
        S = new StringBuffer("<%! public int a(int i) { do {System.out.println(i); ++i; }while(i<100); return i; } %>");
        obj = new JspMain3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.Make3();
        String AfterLine2=obj.setCatchType(JspMain3.LineType.NEXT_LINE).setOtherType(JspMain3.LineType.AFTER_LINE).Make3().toString().trim(); 
        String NextLine2= obj.setCatchType(JspMain3.LineType.NEXT_LINE).setOtherType(JspMain3.LineType.NEXT_LINE).Make3().toString().trim();
        System.out.println("AfterLine2:\n"+AfterLine2);
        System.out.println("NExtLine2:\n"+NextLine2);
        String next2="#####public int a ( int i ) {\n" +
"#####   do\n" +
"#####   {\n" +
"#####      System.out.println(i);\n" +
"#####      ++i;\n" +
"#####   } while( i < 100 );\n" +
"#####   return i;\n" +
"#####}";
        String after2="#####public int a ( int i ) {\n" +
"#####   do {\n" +
"#####      System.out.println(i);\n" +
"#####      ++i;\n" +
"#####   } while( i < 100 );\n" +
"#####   return i;\n" +
"#####}";
        assertTrue(AfterLine2.trim().equals(after2.trim()));
        assertTrue(NextLine2.trim().equals(next2.trim()));        
        */      
    }
    
}
