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
        
        //System.out.println(obj.Make0(JspStatic.LineType.NEXT_LINE)); 
        //System.out.println(obj.Make0(JspStatic.LineType.AFTER_LINE));
        String next="#####public int a ( )\n" +"#####{\n" +"#####   int i = 0 ;\n" +"#####   do \n" +"#####   {\n" +"#####      System . out . println ( i ) ;\n" +"#####      ++ i ;\n" +"#####   } while( i < 100 );\n" +"#####   return i ;\n" +"#####}";
        String after="#####public int a ( ) {\n" +"#####   int i = 0 ;\n" +"#####   do  {\n" +"#####      System . out . println ( i ) ;\n" +"#####      ++ i ;\n" +"#####   } while( i < 100 );\n" +"#####   return i ;\n" +"#####}";
        assertTrue(obj.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next));
        assertTrue(obj.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after));
        

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
        
        S=new StringBuffer("<%! public int a() { int i=100; while(i>=0) i--; } %>");
        JspStatic obj2=new JspStatic(S);
        assertTrue(obj.warning().equals(""));
        obj2.go();
        System.out.println(obj2.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj2.Make0(JspStatic.LineType.AFTER_LINE));
        String next2="#####public int a ( )\n" +"#####{\n" +"#####   int i = 100 ;\n" +"#####   while ( i >= 0 )\n" +"#####      i -- ;\n" +"#####}";
        String after2="#####public int a ( ) {\n" +"#####   int i = 100 ;\n" +"#####   while ( i >= 0 )\n" +"#####      i -- ;\n" +"#####}";
        assertTrue(obj2.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next2.trim()));
        assertTrue(obj2.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after2.trim()));
        
        S=new StringBuffer("<%! public int() { int i=100; while(--i>0);  }%>");
        JspStatic obj3=new JspStatic(S);
        assertTrue(obj.warning().equals(""));
        obj3.go();
        System.out.println(obj3.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj3.Make0(JspStatic.LineType.AFTER_LINE));
        String next3="#####public int ( )\n" +"#####{\n" +"#####   int i = 100 ;\n" +"#####   while ( -- i > 0 );\n" +"#####}";
        String after3="#####public int ( ) {\n" +"#####   int i = 100 ;\n" +"#####   while ( -- i > 0 );\n" +"#####}";
        
        assertTrue(obj3.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next3.trim()));
        assertTrue(obj3.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after3.trim()));
    }
    
    @Test
    public void else_if_test1() {
        StringBuffer S=new StringBuffer("<%! public void a(){ int a=10; if (a>=1) a--; else if (a==0) a++; else return; }%>");
        
        JspStatic obj1=new JspStatic(S);
        assertTrue(obj1.warning().equals(""));
        obj1.go();
        System.out.println(obj1.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj1.Make0(JspStatic.LineType.AFTER_LINE));
        String next1="#####public void a ( )\n" +"#####{\n" +"#####   int a = 10 ;\n" +"#####   if ( a >= 1 )\n" +"#####      a -- ;\n" +"#####   else if ( a == 0 )\n" +"#####      a ++ ;\n" +"#####   else \n" +"#####      return ;\n" +"#####}";
        String after1="#####public void a ( ) {\n" +"#####   int a = 10 ;\n" +"#####   if ( a >= 1 )\n" +"#####      a -- ;\n" +"#####   else if ( a == 0 )\n" +"#####      a ++ ;\n" +"#####   else \n" +"#####      return ;\n" +"#####}";
        assertTrue(obj1.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next1.trim()));
        assertTrue(obj1.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after1.trim()));
        
        S=new StringBuffer("<%! public void a(){ int a=10; if (a>=1) {a--;a++;} else if (a==0) { ++a; --a;} else { a+=3; return;} } %>");
        JspStatic obj2=new JspStatic(S);
        assertTrue(obj2.warning().equals(""));
        obj2.go();
        System.out.println(obj2.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj2.Make0(JspStatic.LineType.AFTER_LINE));
        String next2="#####public void a ( )\n" +"#####{\n" +"#####   int a = 10 ;\n" +"#####   if ( a >= 1 )\n" +"#####   {\n" +"#####      a -- ;\n" +"#####      a ++ ;\n" +"#####   }\n" +"#####   else if ( a == 0 )\n" +"#####   {\n" +"#####      ++ a ;\n" +"#####      -- a ;\n" +"#####   }\n" +"#####   else \n" +"#####   {\n" +"#####      a += 3 ;\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        String after2="#####public void a ( ) {\n" +"#####   int a = 10 ;\n" +"#####   if ( a >= 1 ) {\n" +"#####      a -- ;\n" +"#####      a ++ ;\n" +"#####   }\n" +"#####   else if ( a == 0 ) {\n" +"#####      ++ a ;\n" +"#####      -- a ;\n" +"#####   }\n" +"#####   else  {\n" +"#####      a += 3 ;\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        String nx=obj2.Make0(JspStatic.LineType.NEXT_LINE).toString();
        String af=obj2.Make0(JspStatic.LineType.AFTER_LINE).toString();
        assertTrue(obj2.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next2.trim()));
        assertTrue(obj2.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after2.trim()));       
                
    }
    @Test
    public void try_catch_finally_test() {
        StringBuffer S=new StringBuffer("<%! public int a(){ int t=0; try { t/=2; } catch(Exception ex) {out.println(ex);} catch(Throwable t) {out.println(t);} finally { return t; } } %>");
        JspStatic obj1=new JspStatic(S);
        assertTrue(obj1.warning().equals(""));
        obj1.go();
        String next1="#####public int a ( )\n" +"#####{\n" +"#####   int t = 0 ;\n" +"#####   try \n" +"#####   {\n" +"#####      t /= 2 ;\n" +"#####   }\n" +"#####    catch (Exception ex)\n" +"#####   {\n" +"#####      out . println ( ex ) ;\n" +"#####   }\n" +"#####    catch (Throwable t)\n" +"#####   {\n" +"#####      out . println ( t ) ;\n" +"#####   }\n" +"#####    finally \n" +"#####   {\n" +"#####      return t ;\n" +"#####   }\n" +"#####}";
        String after1="#####public int a ( ) {\n" +"#####   int t = 0 ;\n" +"#####   try  {\n" +"#####      t /= 2 ;\n" +"#####   }\n" +"#####    catch (Exception ex) {\n" +"#####      out . println ( ex ) ;\n" +"#####   }\n" +"#####    catch (Throwable t) {\n" +"#####      out . println ( t ) ;\n" +"#####   }\n" +"#####    finally  {\n" +"#####      return t ;\n" +"#####   }\n" +"#####}";
        System.out.println(obj1.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj1.Make0(JspStatic.LineType.AFTER_LINE));
        assertTrue(obj1.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next1.trim()));
        assertTrue(obj1.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after1.trim()));        
    }
    @Test 
    public void warning_Test1() {
        StringBuffer S=new StringBuffer("<%! // \"abc  \n %>");
        JspStatic obj1=new JspStatic(S);
        String what1="SQ_DQ_不對稱:[1,10]=// \"abc  ";
        assertTrue(what1.trim().equals(obj1.warning().trim()));
        S=new StringBuffer("<%! // \'abc  \n %>");
        JspStatic obj2=new JspStatic(S);
        String what2="SQ_DQ_不對稱:[1,10]=// \'abc  ";
        assertTrue(what2.trim().equals(obj2.warning().trim()));
        S=new StringBuffer("<%! // \"abc\"  \n %>");
        JspStatic obj3=new JspStatic(S);
        String what3="";
        assertTrue(what3.trim().equals(obj3.warning().trim()));
        S=new StringBuffer("<%! // \"abc'\"  \n %>");
        JspStatic obj4=new JspStatic(S);
        String what4="SQ_DQ_不對稱:[1,12]=// \"abc'\"  ";
        System.out.println(obj4.warning());
        assertTrue(what4.trim().equals(obj4.warning().trim()));        
        
    }
    @Test
    public void for_test_1() {
        StringBuffer S=new StringBuffer("<%! public void a(){ int a=0; for (int i=0; i<10; i++) a++;  } %>");
        JspStatic obj1=new JspStatic(S);
        assertTrue(obj1.warning().equals(""));
        obj1.go();
        System.out.println(obj1.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj1.Make0(JspStatic.LineType.AFTER_LINE)); 
        String next1="#####public void a ( )\n" +"#####{\n" +"#####   int a = 0 ;\n" +"#####   for ( int i = 0 ; i < 10 ; i ++ )\n" +"#####      a ++ ;\n" +"#####}";
        String after1="#####public void a ( ) {\n" +"#####   int a = 0 ;\n" +"#####   for ( int i = 0 ; i < 10 ; i ++ )\n" +"#####      a ++ ;\n" +"#####}";
        assertTrue(obj1.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next1.trim()));
        assertTrue(obj1.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after1.trim())); 

        S=new StringBuffer("<%! public void a(){ int a=0; for(int i=0; i<10; i++){a++;b++;} }%>");
        JspStatic obj2=new JspStatic(S);
        assertTrue(obj2.warning().equals(""));
        obj2.go();
        System.out.println(obj2.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj2.Make0(JspStatic.LineType.AFTER_LINE));  
        String next2="#####public void a ( )\n" +"#####{\n" +"#####   int a = 0 ;\n" +"#####   for ( int i = 0 ; i < 10 ; i ++ )\n" +"#####   {\n" +"#####      a ++ ;\n" +"#####      b ++ ;\n" +"#####   }\n" +"#####}";
        String after2="#####public void a ( ) {\n" +"#####   int a = 0 ;\n" +"#####   for ( int i = 0 ; i < 10 ; i ++ ) {\n" +"#####      a ++ ;\n" +"#####      b ++ ;\n" +"#####   }\n" +"#####}";
        assertTrue(obj2.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next2.trim()));
        assertTrue(obj2.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after2.trim())); 
        
        S=new StringBuffer("<%! public void a(){ int a=10; for (;a>=0; a--); } %>");
        JspStatic obj3=new JspStatic(S);
        assertTrue(obj3.warning().equals(""));
        obj3.go();
        System.out.println(obj3.Make0(JspStatic.LineType.NEXT_LINE)); 
        System.out.println(obj3.Make0(JspStatic.LineType.AFTER_LINE)); 
        String next3="#####public void a ( )\n" +"#####{\n" +"#####   int a = 10 ;\n" +"#####   for ( ; a >= 0 ; a -- );\n" +"#####}";
        String after3="#####public void a ( ) {\n" +"#####   int a = 10 ;\n" +"#####   for ( ; a >= 0 ; a -- );\n" +"#####}";
        assertTrue(obj3.Make0(JspStatic.LineType.NEXT_LINE).toString().trim().equals(next3.trim()));
        assertTrue(obj3.Make0(JspStatic.LineType.AFTER_LINE).toString().trim().equals(after3.trim()));        
        
    }
}
