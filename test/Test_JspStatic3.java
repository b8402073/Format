/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Personal.JspStatic3;
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
public class Test_JspStatic3 {

    public Test_JspStatic3() {
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

    //Confirmed!
    @Test
    public void do_while_test_1() {
        StringBuffer S = new StringBuffer("<%! public int a() { int i=0; do {System.out.println(i); ++i; }while(i<100); return i; } %>");
        JspStatic3 obj = new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.Make3();
        String AfterLine=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim(); 
        String NextLine= obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
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
        
        AfterLine=obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim(); 
        NextLine= obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        assertTrue(AfterLine.trim().equals(after.trim()));
        assertTrue(NextLine.trim().equals(next.trim()));
        
        S = new StringBuffer("<%! public int a(int i) { do {System.out.println(i); ++i; }while(i<100); return i; } %>");
        obj = new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.Make3();
        String AfterLine2=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim(); 
        String NextLine2= obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
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
              
    }
    //Confirmed
    @Test
    public void if_test_1() {
        StringBuffer S = new StringBuffer("<%! public int a() { int i=0; if (i<100) System.out.println(i); } %>");
        JspStatic3 obj = new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();

        JspStatic3.OtherType = JspStatic3.LineType.NEXT_LINE;
        //System.out.println(obj.Make3());
        String NextLine_eq_AfterLine="#####public int a ( ) {\n" +
"#####   int i=0;\n" +
"#####   if ( i < 100 )\n" +
"#####      System.out.println(i);\n" +
"#####}";
        //System.out.println("eq:\n"+NextLine_eq_AfterLine);
        
        //System.out.println("NextLine:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(NextLine_eq_AfterLine.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(NextLine_eq_AfterLine.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(NextLine_eq_AfterLine.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(NextLine_eq_AfterLine.trim()));
        

        S = new StringBuffer("<%! public int a(){ int a[]={1,2,3}; if (a[0]<100) { a[1]+=1; a[2]++; } } %>");
        obj = new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();        
        String AfterLine2 = "#####public int a ( ) {\n" +
"#####   int a[]={ 1,2,3 };\n" +
"#####   if ( a [ 0 ] < 100 ) {\n" +
"#####      a[1]+=1;\n" +
"#####      a[2]++;\n" +
"#####   }\n" +
"#####}";
        String NextLine2 = "#####public int a ( ) {\n" +
"#####   int a[]={ 1,2,3 };\n" +
"#####   if ( a [ 0 ] < 100 )\n" +
"#####   {\n" +
"#####      a[1]+=1;\n" +
"#####      a[2]++;\n" +
"#####   }\n" +
"#####}";
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(NextLine2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(AfterLine2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(NextLine2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(AfterLine2.trim()));
    }
    //Confirmed
    @Test
    public void while_test_1() {
        StringBuffer S=new StringBuffer("<%! public int a(){ int i=100; while(i>0){ i--;} } %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();  
        
        JspStatic3.OtherType=JspStatic3.LineType.NEXT_LINE;
        String NextLine=obj.Make3().toString().trim();
        JspStatic3.OtherType=JspStatic3.LineType.AFTER_LINE;
        String AfterLine=obj.Make3().toString().trim();
        System.out.println("Next:\n"+NextLine);
        System.out.println("After:\n"+AfterLine);
        String next="#####public int a ( ) {\n" +"#####   int i=100;\n" +"#####   while( i > 0 )\n" +"#####   {\n" +"#####      i--;\n" +"#####   }\n" +"#####}";
        String after="#####public int a ( ) {\n" +"#####   int i=100;\n" +"#####   while( i > 0 ) {\n" +"#####      i--;\n" +"#####   }\n" +"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after.trim()));

        
        S=new StringBuffer("<%! public int a() { int i=100; while(i>=0) i--; } %>");
        obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        JspStatic3.OtherType=JspStatic3.LineType.NEXT_LINE;
        String NextLine2=obj.Make3().toString();
        JspStatic3.OtherType=JspStatic3.LineType.AFTER_LINE;
        String AfterLine2=obj.Make3().toString();
        System.out.println("Next2:\n"+NextLine2);
        System.out.println("After2:\n"+AfterLine2);
        String next2_eq_after2="#####public int a ( ) {\n" +"#####   int i=100;\n" +"#####   while( i >= 0 )\n" +"#####      i--;\n" +"#####}";
        
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next2_eq_after2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(next2_eq_after2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next2_eq_after2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals( next2_eq_after2.trim()));
        
        S=new StringBuffer("<%! public int() { int i=100; while(--i>0);  }%>");
        obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        JspStatic3.OtherType=JspStatic3.LineType.NEXT_LINE;
        String nextline3=obj.Make3().toString(); 
        JspStatic3.OtherType=JspStatic3.LineType.AFTER_LINE;
        String afterline3=obj.Make3().toString();
        System.out.println("Next3:\n"+nextline3);
        System.out.println("After3:\n"+afterline3);
        String next3_eq_after3="#####public int ( ) {\n" +"#####   int i=100;\n" +"#####   while( -- i > 0 );\n" +"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next3_eq_after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(next3_eq_after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next3_eq_after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals( next3_eq_after3.trim()));
                
    }
    //Confirmed
    @Test
    public void else_if_test1() {
        StringBuffer S=new StringBuffer("<%! public void a(){ int a=10; if (a>=1) a--; else if (a==0) a++; else return; }%>");
        
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        String NextLine1=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine1=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();
        System.out.println("Next1:\n"+NextLine1);
        System.out.println("After1:\n"+AfterLine1);        
        String next1_eq_after1="#####public void a ( ) {\n" +"#####   int a=10;\n" +"#####   if ( a >= 1 )\n" +"#####      a--;\n" +"#####   else if ( a == 0 )\n" +"#####      a++;\n" +"#####   else\n" +"#####      return ;\n" +"#####}";
        assertTrue(NextLine1.trim().equals(next1_eq_after1.trim()));
        assertTrue(AfterLine1.trim().equals(next1_eq_after1.trim()));   
        
        String NextLine11=obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine11=obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();        
        assertTrue(NextLine11.trim().equals(next1_eq_after1.trim()));
        assertTrue(AfterLine11.trim().equals(next1_eq_after1.trim()));         
        
        
        S=new StringBuffer("<%! public void a(){ int a=10; if (a>=1) {a--;a++;} else if (a==0) { ++a; --a;} else { a+=3; return;} } %>");
        obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        String NextLine2=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine2=obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();        
        String next2="#####public void a ( ) {\n" +"#####   int a=10;\n" +"#####   if ( a >= 1 )\n" +"#####   {\n" +"#####      a--;\n" +"#####      a++;\n" +"#####   }\n" +"#####   else if ( a == 0 )\n" +"#####   {\n" +"#####      ++a;\n" +"#####      --a;\n" +"#####   }\n" +"#####   else\n" +"#####   {\n" +"#####      a+=3;\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        String after2="#####public void a ( ) {\n" +"#####   int a=10;\n" +"#####   if ( a >= 1 ) {\n" +"#####      a--;\n" +"#####      a++;\n" +"#####   }\n" +"#####   else if ( a == 0 ) {\n" +"#####      ++a;\n" +"#####      --a;\n" +"#####   }\n" +"#####   else {\n" +"#####      a+=3;\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        //System.out.println("Next2:\n"+NextLine2);
        //System.out.println("After2:\n"+AfterLine2);        
        assertTrue(NextLine2.trim().equals(next2.trim()));
        assertTrue(AfterLine2.trim().equals(after2.trim())); 
        String NextLine22=obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine22=obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim(); 
        assertTrue(NextLine22.trim().equals(next2.trim()));
        assertTrue(AfterLine22.trim().equals(after2.trim()));
    }  
    //Confirmed
    @Test
    public void try_catch_finally_test() {
        StringBuffer S=new StringBuffer("<%! public int a(){ int t=0; try { t/=2; } catch(Exception ex) {out.println(ex);} catch(Throwable t) {out.println(t);} finally { return t; } } %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.setCatchType(JspStatic3.LineType.AFTER_LINE);
        String NextLine1=obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine1=obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();        

        obj.setCatchType(JspStatic3.LineType.NEXT_LINE);
        String NextLine2=obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String AfterLine2=obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();        


        String CAfter_ONext="#####public int a ( ) {\n" +
"#####   int t=0;\n" +
"#####   try\n" +
"#####   {\n" +
"#####      t/=2;\n" +
"#####   }catch(Exception ex)\n" +
"#####   {\n" +
"#####      out.println(ex);\n" +
"#####   }catch(Throwable t)\n" +
"#####   {\n" +
"#####      out.println(t);\n" +
"#####   }finally \n" +
"#####   {\n" +
"#####      return t;\n" +
"#####   }\n" +
"#####}";
        String CAfter_OAfter="#####public int a ( ) {\n" +
"#####   int t=0;\n" +
"#####   try {\n" +
"#####      t/=2;\n" +
"#####   }catch(Exception ex) {\n" +
"#####      out.println(ex);\n" +
"#####   }catch(Throwable t) {\n" +
"#####      out.println(t);\n" +
"#####   }finally  {\n" +
"#####      return t;\n" +
"#####   }\n" +
"#####}";
        String CNext_ONext="#####public int a ( ) {\n" +
"#####   int t=0;\n" +
"#####   try\n" +
"#####   {\n" +
"#####      t/=2;\n" +
"#####   }\n" +
"#####   catch(Exception ex)\n" +
"#####   {\n" +
"#####      out.println(ex);\n" +
"#####   }\n" +
"#####   catch(Throwable t)\n" +
"#####   {\n" +
"#####      out.println(t);\n" +
"#####   }\n" +
"#####   finally \n" +
"#####   {\n" +
"#####      return t;\n" +
"#####   }\n" +
"#####}";
        String CNext_OAfter="#####public int a ( ) {\n" +
"#####   int t=0;\n" +
"#####   try {\n" +
"#####      t/=2;\n" +
"#####   }\n" +
"#####   catch(Exception ex) {\n" +
"#####      out.println(ex);\n" +
"#####   }\n" +
"#####   catch(Throwable t) {\n" +
"#####      out.println(t);\n" +
"#####   }\n" +
"#####   finally  {\n" +
"#####      return t;\n" +
"#####   }\n" +
"#####}\n" +
"";
                
        
        System.out.println("C=After, O=Next:\n"+NextLine1); 
        System.out.println("C=After, O=After:\n"+AfterLine1);
        System.out.println("C=Next, O=Next:\n"+NextLine2); 
        System.out.println("C=Next, O=After:\n"+AfterLine2);
        
        assertTrue(NextLine1.trim().equals(CAfter_ONext.trim()));
        assertTrue(AfterLine1.trim().equals(CAfter_OAfter.trim()));        
        assertTrue(NextLine2.trim().equals(CNext_ONext.trim()));
        assertTrue(AfterLine2.trim().equals(CNext_OAfter.trim()));        
        
    }
    //Confirmed!
    @Test
    public void for_test_1() {
        StringBuffer S=new StringBuffer("<%! public void a(){ int a=0; for (int i=0; i<10; i++) a++;  } %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();                
        String eq="#####public void a ( ) {\n" +"#####   int a=0;\n" +"#####   for( int i = 0 ; i < 10 ; i ++ )\n" +"#####      a++;\n" +"#####}";
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(eq.trim()));

        S=new StringBuffer("<%! public void a(){ int a=0; for(int i=0; i<10; i++){a++;b++;} }%>");
        obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();

        String next2="#####public void a ( ) {\n" +
"#####   int a=0;\n" +
"#####   for( int i = 0 ; i < 10 ; i ++ )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####   }\n" +
"#####}";
        String after2="#####public void a ( ) {\n" +
"#####   int a=0;\n" +
"#####   for( int i = 0 ; i < 10 ; i ++ ) {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####   }\n" +
"#####}";
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());

        
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after2.trim()));
        
        S=new StringBuffer("<%! public void a(){ int a=10; for (;a>=0; a--); } %>");
        JspStatic3 obj3=new JspStatic3(S);
        assertTrue(obj3.warning().equals(""));
        obj3.go();
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        
        
        String next3="#####public void a ( ) {\n" +
"#####   int a=0;\n" +
"#####   for( int i = 0 ; i < 10 ; i ++ )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####   }\n" +
"#####}";
        String after3="#####public void a ( ) {\n" +
"#####   int a=0;\n" +
"#####   for( int i = 0 ; i < 10 ; i ++ ) {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####   }\n" +
"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        
    }
    
    @Test
    public void switch_test_1() {
        StringBuffer S=new StringBuffer("<%!void a(){ int a=3; switch(a) { case 1: a++; case 2: --a; case 3: return; } }  %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go(); 
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        String next3="#####void a ( ) {\n" +"#####   int a=3;\n" +"#####   switch( a )\n" +"#####   {\n" +"#####   case 1:\n" +"#####      a++;\n" +"#####   case 2:\n" +"#####      --a;\n" +"#####   case 3:\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        String after3="#####void a ( ) {\n" +"#####   int a=3;\n" +"#####   switch( a ) {\n" +"#####   case 1:\n" +"#####      a++;\n" +"#####   case 2:\n" +"#####      --a;\n" +"#####   case 3:\n" +"#####      return ;\n" +"#####   }\n" +"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        
        S=new StringBuffer("<%! \n" +"int a()  \n" +"{\n" +"	int a=3;\n" +"	switch(a)\n" +"	{\n" +"	case 1:\n" +"		a++; break;\n" +"	default:\n" +"		return 1;	\n" +"	}\n" +"	\n" +"	int b=10;\n" +"	switch(a)\n" +"	{\n" +"	case 4:\n" +"	default:\n" +"		switch(b)\n" +"		{\n" +"		case 10:\n" +"			a++;\n" +"		default:\n" +"			return 10;	\n" +"		}\n" +"	}\n" +"	return 10;\n" +"}\n" +"\n" +"%>");
        obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go(); 
        System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        //System.out.println("Next:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        //System.out.println("After:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        String after2="#####int a ( ) {\n" +
"#####   int a=3;\n" +
"#####   switch( a ) {\n" +
"#####   case 1:\n" +
"#####      a++;\n" +
"#####      break ;\n" +
"#####   default:\n" +
"#####      return 1;\n" +
"#####   }\n" +
"#####   int b=10;\n" +
"#####   switch( a ) {\n" +
"#####   case 4:\n" +
"#####   default:\n" +
"#####      switch( b ) {\n" +
"#####      case 10:\n" +
"#####         a++;\n" +
"#####      default:\n" +
"#####         return 10;\n" +
"#####      }\n" +
"#####   }\n" +
"#####   return 10;\n" +
"#####}";
        String next2="#####int a ( ) {\n" +
"#####   int a=3;\n" +
"#####   switch( a )\n" +
"#####   {\n" +
"#####   case 1:\n" +
"#####      a++;\n" +
"#####      break ;\n" +
"#####   default:\n" +
"#####      return 1;\n" +
"#####   }\n" +
"#####   int b=10;\n" +
"#####   switch( a )\n" +
"#####   {\n" +
"#####   case 4:\n" +
"#####   default:\n" +
"#####      switch( b )\n" +
"#####      {\n" +
"#####      case 10:\n" +
"#####         a++;\n" +
"#####      default:\n" +
"#####         return 10;\n" +
"#####      }\n" +
"#####   }\n" +
"#####   return 10;\n" +
"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next2.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after2.trim()));
            
    }
    @Test
    public void synchronized_Test_1() {
        StringBuffer S=new StringBuffer("<%! void a(){ int a,b,c; synchronized(obj.ggyy) { a++; b++; c++;} }  %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();        
        
        String next3="#####void a ( ) {\n" +
"#####   int a,b,c;\n" +
"#####   synchronized( obj . ggyy )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####      c++;\n" +
"#####   }\n" +
"#####}\n" +
"";
        String after3="#####void a ( ) {\n" +
"#####   int a,b,c;\n" +
"#####   synchronized( obj . ggyy ) {\n" +
"#####      a++;\n" +
"#####      b++;\n" +
"#####      c++;\n" +
"#####   }\n" +
"#####}\n" +
"";
        //System.out.println("next");
        //System.out.println(obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim());
        //System.out.println("after");
        //System.out.println(obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim());
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next3.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after3.trim()));
        
    }
    
    @Test
    public void mix1() {
        String SS="<%!  void func() {try {\n" +"      b = null ;\n" +"   }catch(Exception ex) {\n" +"      System . out . println ( \"ok\" ) ;\n" +"   }   do {\n" +"      AAA . A ++ ;\n" +"   } while( AAA . A <= 100 );  } %>";
        StringBuffer S=new StringBuffer(SS);
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        System.out.println("CN_ONext:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("CN_OAfter:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        System.out.println("CA_ONext:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("CA_OAfter:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        String CNext_ONext="#####void func ( ) {\n" +
"#####   try\n" +
"#####   {\n" +
"#####      b=null;\n" +
"#####   }\n" +
"#####   catch(Exception ex)\n" +
"#####   {\n" +
"#####      System.out.println(\"ok\");\n" +
"#####   }\n" +
"#####   do\n" +
"#####   {\n" +
"#####      AAA.A++;\n" +
"#####   } while( AAA . A <= 100 );\n" +
"#####}\n" +
"";
        String CNext_OAfter="#####void func ( ) {\n" +
"#####   try {\n" +
"#####      b=null;\n" +
"#####   }\n" +
"#####   catch(Exception ex) {\n" +
"#####      System.out.println(\"ok\");\n" +
"#####   }\n" +
"#####   do {\n" +
"#####      AAA.A++;\n" +
"#####   } while( AAA . A <= 100 );\n" +
"#####}";                
        String CAfter_ONext="#####void func ( ) {\n" +
"#####   try\n" +
"#####   {\n" +
"#####      b=null;\n" +
"#####   }catch(Exception ex)\n" +
"#####   {\n" +
"#####      System.out.println(\"ok\");\n" +
"#####   }\n" +
"#####   do\n" +
"#####   {\n" +
"#####      AAA.A++;\n" +
"#####   } while( AAA . A <= 100 );\n" +
"#####}";
        String CAfter_OAfter="#####void func ( ) {\n" +
"#####   try {\n" +
"#####      b=null;\n" +
"#####   }catch(Exception ex) {\n" +
"#####      System.out.println(\"ok\");\n" +
"#####   }\n" +
"#####   do {\n" +
"#####      AAA.A++;\n" +
"#####   } while( AAA . A <= 100 );\n" +
"#####}";
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( CNext_ONext.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(CNext_OAfter.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(CAfter_ONext.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(CAfter_OAfter.trim()));                
    }
    
    String X1="if (a>3) a++; else a--;";
    String X2="if (a>3) a++; else if (a==3) a=0;";
    String X3="if (a>3) a++; else {a++; a--;}";
    String X4="if (a>3) a++; else if (a==3) {a++; a--;}";
    String X5="if (a>3) {a++; a--;}";
    String X6="if (a>3) a++;";

    String Y1="do{ a++; }while(a>=0);";
    String Y2="while(a>=0) a--;";
    String Y3="while(a>=0) {a++; a--;}";
    String Y4="while(a--);";    
    
    @Test
    public void mix2() {
        StringBuffer S=new StringBuffer("<%!\n");
        S.append("int a() { ");
        //S.append("if (a>100) while(true){ a+=2;}");
        
        String[] X={X1,X2,X3,X4,X5,X6};
        String[] Y={Y1,Y2,Y3,Y4};
        for (String x:X) {
            for (String y:Y) {
                S.append(x+JspStatic3.NexLine);
                S.append(y+JspStatic3.NexLine);
            }
        }
     
        S.append("\n}\n");
        S.append("\n%>");
        System.out.println(S.toString());
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go();
        System.out.println("**********make3_AfterLine***********");
        String AfterLine=obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim();
        System.out.println("**********make3_NextLine***********");
        String NextLine=obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim();
        String after="#####int a ( ) {\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   do {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a >= 0 ) {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a -- );\n" +
"#####}\n" +
"";
        String next="#####int a ( ) {\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####      a--;\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####      a=0;\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   else if ( a == 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   while( a -- );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   do\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####   } while( a >= 0 );\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a >= 0 )\n" +
"#####      a--;\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a >= 0 )\n" +
"#####   {\n" +
"#####      a++;\n" +
"#####      a--;\n" +
"#####   }\n" +
"#####   if ( a > 3 )\n" +
"#####      a++;\n" +
"#####   while( a -- );\n" +
"#####}";
        assertTrue(next.trim().equals(NextLine.trim()));
        assertTrue(after.trim().equals(AfterLine.trim()));
    }
    
    @Test
    public void GetStatementCompact() {
        StringBuffer S=new StringBuffer("<%! void a() { Integer a=GetPair(i,FuncHeaderArea); } %>");
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go(); 
        String eq="#####void a ( ) {\n" +"#####   Integer a=GetPair(i,FuncHeaderArea);\n" +"#####}";
        /*
        System.out.println("CN_ONext:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("CN_OAfter:\n"+obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        System.out.println("CA_ONext:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString());
        System.out.println("CA_OAfter:\n"+obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString());
        */
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals( eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.NEXT_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(eq.trim()));
        assertTrue(obj.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(eq.trim()));                        
    }
    @Test
    public void AboutComment1() {
        StringBuffer S=new StringBuffer("<%!\n" +" \n" +"/*HAHAHA*/\n" +
"public class JspStatic {\n" +
"    public enum  LineType { AFTER_LINE, NEXT_LINE};\n" +
"    public final static PairSort PairSortObj=new PairSort();\n" +
"    public final static String ALPHABET = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"    public final static String EMPTY = \" \\t\\r\\n\\0\";\n" +
"    public final static String NUMBER=\"0123456789\";\n" +
"    /****\n" +
"     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"     * 用在make系列函式的建構line變數\n" +
"     * @param space     要重複的母字串\n" +
"     * @param count     重複的次數\n" +
"     * @return          傳回的字串\n" +
"     */\n" +
"    public static String GetString(String space,int count) {\n" +
"        StringBuffer ret=new StringBuffer();\n" +
"        for (int i=0; i<count; i++) {\n" +
"            ret.append(space);\n" +
"        }\n" +
"        return ret.toString();\n" +
"    }\n" +
"    public static StringBuffer MyText, OutputText;  //Comment3\n" +
"    \n" +
"    //Comment1\n" +
"    //Comment2\n" +
"	\n" +
"}\n" +
"\n" +
"%>");
        
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go(); 
        System.out.println("Next:\n"+obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3());
        String next="#####/*@0@HAHAHA*/\n" +
"#####public class JspStatic\n" +
"#####{\n" +
"#####   public enum LineType { AFTER_LINE,NEXT_LINE };\n" +
"#####   public final static PairSort PairSortObj=new PairSort();\n" +
"#####   public final static String ALPHABET=\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"#####   public final static String EMPTY=\" \\t\\r\\n\\0\";\n" +
"#####   public final static String NUMBER=\"0123456789\";\n" +
"#####   /*@1@***\n" +
"#####   @1@     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"#####   @1@     * 用在make系列函式的建構line變數\n" +
"#####   @1@     * @param space     要重複的母字串\n" +
"#####   @1@     * @param count     重複的次數\n" +
"#####   @1@     * @return          傳回的字串\n" +
"#####   @1@     */\n" +
"#####   public static String GetString ( String space , int count ) {\n" +
"#####      StringBuffer ret=new StringBuffer();\n" +
"#####      for( int i = 0 ; i < count ; i ++ )\n" +
"#####      {\n" +
"#####         ret.append(space);\n" +
"#####      }\n" +
"#####      return ret.toString();\n" +
"#####   }\n" +
"#####   public static StringBuffer MyText,OutputText;\n" +
"#####   //@2@Comment3\n" +
"#####   //@3@Comment1\n" +
"#####   //@4@Comment2\n" +
"#####}";
        System.out.println("After:\n"+obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3()); 
        String after="#####/*@0@HAHAHA*/\n" +
"#####public class JspStatic\n" +
"#####{\n" +
"#####   public enum LineType { AFTER_LINE,NEXT_LINE };\n" +
"#####   public final static PairSort PairSortObj=new PairSort();\n" +
"#####   public final static String ALPHABET=\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"#####   public final static String EMPTY=\" \\t\\r\\n\\0\";\n" +
"#####   public final static String NUMBER=\"0123456789\";\n" +
"#####   /*@1@***\n" +
"#####   @1@     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"#####   @1@     * 用在make系列函式的建構line變數\n" +
"#####   @1@     * @param space     要重複的母字串\n" +
"#####   @1@     * @param count     重複的次數\n" +
"#####   @1@     * @return          傳回的字串\n" +
"#####   @1@     */\n" +
"#####   public static String GetString ( String space , int count ) {\n" +
"#####      StringBuffer ret=new StringBuffer();\n" +
"#####      for( int i = 0 ; i < count ; i ++ ) {\n" +
"#####         ret.append(space);\n" +
"#####      }\n" +
"#####      return ret.toString();\n" +
"#####   }\n" +
"#####   public static StringBuffer MyText,OutputText;\n" +
"#####   //@2@Comment3\n" +
"#####   //@3@Comment1\n" +
"#####   //@4@Comment2\n" +
"#####}\n" +
"";
        assertTrue(obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next.trim()));
        assertTrue(obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after.trim()));
    }
    @Test
    public void AboutComment2() {
        StringBuffer S=new StringBuffer("<%!\n" +" \n" +"/*HAHAHA*/\n" +
"public class JspStatic {\n" +
"    public enum  LineType { AFTER_LINE, NEXT_LINE};\n" +
"    public final static PairSort PairSortObj=new PairSort();\n" +
"    public final static String ALPHABET = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"    public final static String EMPTY = \" \\t\\r\\n\\0\";\n" +
"    public final static String NUMBER=\"0123456789\";\n" +
"    /****\n" +
"     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"     * 用在make系列函式的建構line變數\n" +
"     * @param space     要重複的母字串\n" +
"     * @param count     重複的次數\n" +
"     * @return          傳回的字串\n" +
"     */\n" +
"    public static String GetString(String space,int count) {\n" +
"        StringBuffer ret=new StringBuffer();\n" +
"        for (int i=0; i<count; i++) {\n" +
"            ret.append(space);\n" +
"        }\n" +
"        return ret.toString();\n" +
"    }\n" +
"    public static StringBuffer MyText, OutputText;  //Comment3\n" +
"    \n" +
"    //Comment1\n" +
"    //Comment2\n" +
"	\n" +
"}\n" +
"\n/**CommentAfterText**/" +
"%>");
        
        JspStatic3 obj=new JspStatic3(S);
        assertTrue(obj.warning().equals(""));
        obj.go(); 
        System.out.println("Next:\n"+obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3());
        String next="#####/*@0@HAHAHA*/\n" +
"#####public class JspStatic\n" +
"#####{\n" +
"#####   public enum LineType { AFTER_LINE,NEXT_LINE };\n" +
"#####   public final static PairSort PairSortObj=new PairSort();\n" +
"#####   public final static String ALPHABET=\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"#####   public final static String EMPTY=\" \\t\\r\\n\\0\";\n" +
"#####   public final static String NUMBER=\"0123456789\";\n" +
"#####   /*@1@***\n" +
"#####   @1@     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"#####   @1@     * 用在make系列函式的建構line變數\n" +
"#####   @1@     * @param space     要重複的母字串\n" +
"#####   @1@     * @param count     重複的次數\n" +
"#####   @1@     * @return          傳回的字串\n" +
"#####   @1@     */\n" +
"#####   public static String GetString ( String space , int count ) {\n" +
"#####      StringBuffer ret=new StringBuffer();\n" +
"#####      for( int i = 0 ; i < count ; i ++ )\n" +
"#####      {\n" +
"#####         ret.append(space);\n" +
"#####      }\n" +
"#####      return ret.toString();\n" +
"#####   }\n" +
"#####   public static StringBuffer MyText,OutputText;\n" +
"#####   //@2@Comment3\n" +
"#####   //@3@Comment1\n" +
"#####   //@4@Comment2\n" +
"#####}\n"+
"#####/*@5@*CommentAfterText**/\n";
        
        System.out.println("After:\n"+obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3()); 
        String after="#####/*@0@HAHAHA*/\n" +
"#####public class JspStatic\n" +
"#####{\n" +
"#####   public enum LineType { AFTER_LINE,NEXT_LINE };\n" +
"#####   public final static PairSort PairSortObj=new PairSort();\n" +
"#####   public final static String ALPHABET=\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\";\n" +
"#####   public final static String EMPTY=\" \\t\\r\\n\\0\";\n" +
"#####   public final static String NUMBER=\"0123456789\";\n" +
"#####   /*@1@***\n" +
"#####   @1@     * 傳回一個字串,這個字串是重複字串space重複了count次\n" +
"#####   @1@     * 用在make系列函式的建構line變數\n" +
"#####   @1@     * @param space     要重複的母字串\n" +
"#####   @1@     * @param count     重複的次數\n" +
"#####   @1@     * @return          傳回的字串\n" +
"#####   @1@     */\n" +
"#####   public static String GetString ( String space , int count ) {\n" +
"#####      StringBuffer ret=new StringBuffer();\n" +
"#####      for( int i = 0 ; i < count ; i ++ ) {\n" +
"#####         ret.append(space);\n" +
"#####      }\n" +
"#####      return ret.toString();\n" +
"#####   }\n" +
"#####   public static StringBuffer MyText,OutputText;\n" +
"#####   //@2@Comment3\n" +
"#####   //@3@Comment1\n" +
"#####   //@4@Comment2\n" +
"#####}\n" +
"#####/*@5@*CommentAfterText**/\n";
        assertTrue(obj.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3().toString().trim().equals(next.trim()));
        assertTrue(obj.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3().toString().trim().equals(after.trim()));
    }    
}
