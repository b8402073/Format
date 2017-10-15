/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.JspStatic;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author easterday
 */
public class Test_JspStatic {
    
    public Test_JspStatic() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void do_while_test_1() {
        StringBuffer S=new StringBuffer("<%! public int a() { int i=0; do {System.out.println(i); ++i; }while(i<100); return i; } %>");
        JspStatic obj=new JspStatic(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        
        System.out.println(obj.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj.Make0(JspStatic.LineType.AFTER_LINE));        

    }
    
    @Test
    public void if_test_1() {
        StringBuffer S=new StringBuffer("<%! public int a() { int i=0; if (i<100) System.out.println(i); } %>");
        JspStatic obj=new JspStatic(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        
        System.out.println(obj.Make0(JspStatic.LineType.NEXT_LINE));         
        String NextLine="#####public int a ( )\n" +"#####{\n" +"#####   int i = 0 ;\n" +"#####   if ( i < 100 )\n" +"#####      System . out . println ( i ) ;\n" +"#####}";

        assertTrue(obj.Make0(JspStatic.LineType.NEXT_LINE).toString().equals(NextLine+"\n"));
        String AfterLine="#####public int a ( ) {\n" +"#####   int i = 0 ;\n" +"#####   if ( i < 100 )\n" +"#####      System . out . println ( i ) ;\n" +"#####}";        
        String after=obj.Make0(JspStatic.LineType.AFTER_LINE).toString();
        
        System.out.println("AfterLine.length="+AfterLine.length());
        System.out.println("after.length="+after.length());
        
        assertTrue(obj.Make0(JspStatic.LineType.AFTER_LINE).toString().equals(AfterLine+"\n"));
        
        S=new StringBuffer("<%! public int a(){ int a[]={1,2,3}; if (a[0]<100) { a[1]+=1; a[2]++; } } %>");
        JspStatic obj2=new JspStatic(S);
        assertTrue(obj2.warning().equals(""));
        obj2.go();
        
        
        String after2=obj2.Make0(JspStatic.LineType.AFTER_LINE).toString();
        String AfterLine2="#####public int a ( ) {\n" +"#####   int a [ ] = { 1 , 2 , 3 } ;\n" +"#####   if ( a [ 0 ] < 100 ) {\n" +"#####      a [ 1 ] += 1 ;\n" +"#####      a [ 2 ] ++ ;\n" +"#####   }\n" +"#####}";
        String next2 =obj2.Make0(JspStatic.LineType.NEXT_LINE).toString();
        String NextLine2="#####public int a ( )\n" +"#####{\n" +"#####   int a [ ] = { 1 , 2 , 3 } ;\n" +"#####   if ( a [ 0 ] < 100 )\n" +"#####   {\n" +"#####      a [ 1 ] += 1 ;\n" +"#####      a [ 2 ] ++ ;\n" +"#####   }\n" +"#####}";
        assertTrue(after2.trim().equals(AfterLine2.trim()));
        assertTrue(next2.trim().equals(NextLine2.trim()));
        
        
        System.out.println(obj2.Make0(JspStatic.LineType.NEXT_LINE));
        System.out.println(obj2.Make0(JspStatic.LineType.AFTER_LINE));
        
    }
    
    //TODO: 要加入兩種變化
    @Test
    public void while_test_1() {
        StringBuffer S=new StringBuffer("<%! public int a(){ int i=100; while(i>0){ i--;} } %>");
        JspStatic obj=new JspStatic(S);
        assertTrue(obj.warning().equals(""));
        obj.go();  
        
        System.out.println(obj.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj.Make0(JspStatic.LineType.AFTER_LINE));
        
        String next="#####public int a ( )\n" +"#####{\n" +"#####   int i = 100 ;\n" +"#####   while ( i > 0 )\n" +"#####   {\n" +"#####      i -- ;\n" +"#####   }\n" +"#####}";
        String after="#####public int a ( ) {\n" +"#####   int i = 100 ;\n" +"#####   while ( i > 0 ) {\n" +"#####      i -- ;\n" +"#####   }\n" +"#####}";
        assertTrue(obj.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next.trim()));
        assertTrue(obj.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after.trim()));
        
        }
}
