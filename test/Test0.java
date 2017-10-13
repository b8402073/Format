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
"               char CH='ª¯'"+            
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
        Focus aaa=JspStatic.GetOneToken(str0, 0, CommentArea,  DQArea, SQArea);
        assertTrue(aaa.RetString.equals("public"));
        assertTrue(aaa.NextCharPos==6);
        aaa=JspStatic.GetOneToken(str0, 1, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ublic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 2, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("blic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 3, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("lic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic.GetOneToken(str0, 4, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ic"));
        assertTrue(aaa.NextCharPos==6);
  
        aaa=JspStatic.GetOneToken(str0, 5, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("c"));
        assertTrue(aaa.NextCharPos==6);
        
        aaa=JspStatic.GetOneToken(str0, 6, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("final"));
        assertTrue(aaa.NextCharPos==12);
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("static"));
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("class"));
        
        aaa=JspStatic.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("AAA")); 
        
        
        while(aaa!=null) {
            aaa=JspStatic.GetOneToken(str0, aaa.NextCharPos, CommentArea,  DQArea, SQArea);
            if (aaa!=null)
                System.out.println(aaa.toString());
        }
                
        
    }
    
    @Test
    public void Test2() {
         StringBuffer Q=new StringBuffer("<%! int D=3>>>1+5; int E +=15; int F= ++E; %>");
         
         JspStatic obj=new JspStatic(Q);
         obj.go();
         System.out.println("obj.MyFocus.size()="+obj.MyFocus.size());
         assertTrue(obj.MyFocus.size()==20);
         final String[] arr={"int","D","=","3",">>>","1","+","5",";","int","E","+=","15",";","int","F","=","++","E",";"};
         for (int i=0; i<obj.MyFocus.size(); i++) {
             System.out.println(arr[i]);
             assertTrue(arr[i].equals(obj.MyFocus.get(i).RetString));
         }
    }
    
    @Test
    public void Test3() {
        StringBuffer Q=new StringBuffer("int A=1.00+2.00+3.00; int B=5.0+8.0; ");
        CommentArea=new Vector<Pair>();
        ArrayArea=new Vector<Pair>();
        DQArea=new Vector<Pair>();
        SQArea=new Vector<Pair>();
        Vector<Focus> tmp=new Vector<Focus>();
        Focus hand=JspStatic.GetOneToken(Q,0,CommentArea,DQArea,SQArea);
        while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic.GetOneToken(Q, hand.NextCharPos, CommentArea,  DQArea, SQArea);
        }
        Vector<Focus> afterFloat=JspStatic.FloatNUM_Replacement(tmp);
        final String[] arr={"int","A","=","1.00","+","2.00","+","3.00",";","int","B","=","5.0","+","8.0",";"};
        for (int i=0; i<afterFloat.size(); i++) {
            System.out.println(arr[i]);
            assertTrue(arr[i].equals(afterFloat.get(i).getString()));
        }        
    }
    @Test
    public void Test4() {
        StringBuffer Q=new StringBuffer(" AAA.BBB+=3; ");
        CommentArea=new Vector<Pair>();
        ArrayArea=new Vector<Pair>();
        DQArea=new Vector<Pair>();
        SQArea=new Vector<Pair>();
        Vector<Focus> tmp=new Vector<Focus>();
        Focus hand=JspStatic.GetOneToken(Q,0,CommentArea,DQArea,SQArea);
        while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic.GetOneToken(Q, hand.NextCharPos, CommentArea,  DQArea, SQArea);
        }
        final String[] arr={"AAA",".","BBB","+","=","3",";"};
        for (int i=0; i<tmp.size(); i++) {
            System.out.println(arr[i]);
            assertTrue(arr[i].equals(tmp.get(i).getString()));
        }
    }
}
