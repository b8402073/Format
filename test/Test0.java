/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.Focus;
import Personal.JspStatic;
import Personal.Pair;
import java.util.Vector;
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
public class Test0 {
    final static StringBuffer str0=new StringBuffer("public final static class AAA    //this is class AAA\n" +
                                                /////01234567890123456789012345678901234567890
"	{\n" +
"		class temp {\n" +
"			public	int X=0;\n" +
"			public  int Y=0;\n" +
"		}\n" +
"		static int B=FFF.init();	\n" +
"		static int A;   \n" +
"		double B;        \n" +
"		public int add(int CCC)  \n" +
"		{\n" +
"			int D=A+1;\n" +
"			return A+CCC+D;\n" +
"		}\n" +
"		int D=A;		\n" +
"		public class BBB\n" +
"		{\n" +
"			int X;\n" +
"			public static void clear()\n" +
"			{\n" +
"				AAA.A++;\n" +
"			}\n" +
"		}		\n" +
"	}\n" +
"	//REM5\n" +
"	public void BBB()\n" +
"	{\n" +
"		AAA.A=1;\n" +
"		try {\n" +
"		   b=null;\n" +
"		} catch(Exception ex) {\n" +
"                   System.out.println(\"ok¤pª¯\");\n" +
"		}	\n" +
"	}  ");
    Vector<Pair> DQArea=new Vector<Pair>();
    Vector<Pair> SQArea=new Vector<Pair>();
    Vector<Pair> CommentArea=new Vector<Pair>();
    Vector<Pair> ArrayArea=new Vector<Pair>();
    public Test0() {
        JspStatic.Build_DQ_Area(str0,DQArea);
        JspStatic.Build_SQ_Area(str0,DQArea,SQArea);
        JspStatic.Build_Comment_Area(str0,DQArea,SQArea,CommentArea);
        //JspStatic.Build_Array_Area(str0,ArrayArea);
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
    public void Test1() {
        //assertTrue(true==true);
        Focus aaa=JspStatic.GetOneToken(str0, 0, CommentArea, ArrayArea, DQArea, SQArea);
        assertTrue(aaa.RetString.equals("public"));
        assertTrue(aaa.NextCharPos==6);
        aaa=JspStatic.GetOneToken(str0, 1, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ublic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 2, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("blic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 3, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("lic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 4, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ic"));
        assertTrue(aaa.NextCharPos==6);
  
        aaa=JspStatic.GetOneToken(str0, 5, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("c"));
        assertTrue(aaa.NextCharPos==6);
        
        aaa=JspStatic.GetOneToken(str0, 6, CommentArea, ArrayArea, DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("final"));
        assertTrue(aaa.NextCharPos==12);
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,ArrayArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("static"));
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,ArrayArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("class"));
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,ArrayArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("AAA")); 
        
        while(aaa!=null) {
            aaa=JspStatic.GetOneToken(str0, aaa.NextCharPos, CommentArea, ArrayArea, DQArea, SQArea);
            System.out.println(aaa.toString());
        }
  
         /*
        aaa=JspStatic.GetOneToken(str0, 29, CommentArea, ArrayArea, DQArea, SQArea);
        System.out.println(aaa.RetString);
        assertTrue(aaa.RetString.equals("{"));
        assertTrue(aaa.NextCharPos==12);      
        */
        
    }
}
