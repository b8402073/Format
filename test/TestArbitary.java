/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.Focus;
import Personal.FocusPair;
import Personal.JspStatic3;
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
public class TestArbitary {
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
"               char CH='��'"+            
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
"                   System.out.println(\"ok�p��\");\n" +
"		}	\n" +
"	}  ");

    static Vector<Pair> DQArea=new Vector<Pair>();
    static Vector<Pair> SQArea=new Vector<Pair>();
    static Vector<Pair> CommentArea=new Vector<Pair>();
    static Vector<FocusPair> ArrayArea=new Vector<FocusPair>();
    static Vector<FocusPair> FuncHeaderArea=new Vector<FocusPair>();
    static Vector<FocusPair> ClassArea=new Vector<FocusPair>();
    public TestArbitary() {
        JspStatic3.Build_DQ_Area(str0,DQArea);
        JspStatic3.Build_SQ_Area(str0,DQArea,SQArea);
        JspStatic3.Build_Comment_Area(str0,DQArea,SQArea,CommentArea);
        //JspStatic3.Build_Array_Area(str0,ArrayArea);
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DQArea=new Vector<Pair>();SQArea=new Vector<Pair>();CommentArea=new Vector<Pair>();
        ArrayArea=new Vector<FocusPair>(); FuncHeaderArea=new Vector<FocusPair>(); ClassArea=new Vector<FocusPair>();
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
        Focus aaa=JspStatic3.GetOneToken(str0, 0, CommentArea,  DQArea, SQArea);
        assertTrue(aaa.RetString.equals("public"));
        assertTrue(aaa.NextCharPos==6);
        aaa=JspStatic3.GetOneToken(str0, 1, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ublic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic3.GetOneToken(str0, 2, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("blic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic3.GetOneToken(str0, 3, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("lic"));
        assertTrue(aaa.NextCharPos==6);

        aaa=JspStatic3.GetOneToken(str0, 4, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("ic"));
        assertTrue(aaa.NextCharPos==6);
  
        aaa=JspStatic3.GetOneToken(str0, 5, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("c"));
        assertTrue(aaa.NextCharPos==6);
        
        aaa=JspStatic3.GetOneToken(str0, 6, CommentArea,  DQArea, SQArea); 
        assertTrue(aaa.RetString.equals("final"));
        assertTrue(aaa.NextCharPos==12);
        
        aaa=JspStatic3.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("static"));
        
        aaa=JspStatic3.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("class"));
        
        aaa=JspStatic3.GetOneToken(str0,aaa.NextCharPos,CommentArea,DQArea,SQArea);
        assertTrue(aaa.RetString.equals("AAA")); 
        
        
        while(aaa!=null) {
            aaa=JspStatic3.GetOneToken(str0, aaa.NextCharPos, CommentArea,  DQArea, SQArea);
            if (aaa!=null)
                System.out.println(aaa.toString());
        }
                
        
    }
    
    @Test
    public void Test_Before_Writing() {
         StringBuffer Q=new StringBuffer("<%! int D=3>>>1+5; int E +=15; int F= ++E; %>");
         
         JspStatic3 obj=new JspStatic3(Q);
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
    public void Test_Build_MyFocus(){
         StringBuffer str=new StringBuffer(" int D=3>>>1+5; int E +=15; int F= ++E;");         
         final String[] arr={"int","D","=","3",">",">",">","1","+","5",";","int","E","+","=","15",";","int","F","=","+","+","E",";"};
         Vector<Focus> tmp=new Vector<Focus>();
         Focus hand=JspStatic3.GetOneToken(str, 0, CommentArea,  DQArea, SQArea); 
         while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic3.GetOneToken(str, hand.NextCharPos, CommentArea, DQArea, SQArea); 
        }
         assertTrue(tmp.size()==arr.length );
         
         for (int i=0; i<tmp.size(); i++) {
             assertTrue(arr[i].equals(tmp.get(i).RetString));
         }
         //final String[] op3={">>>","<<=",">>="};
         Vector<Focus> tmp2=JspStatic3.OP_Replacement(tmp,JspStatic3.op3);
         final String[] arr2={"int","D","=","3",">>>","1","+","5",";","int","E","+","=","15",";","int","F","=","+","+","E",";" };         
         assertTrue(tmp2.size()==arr2.length);
         for (int i=0; i<tmp2.size(); i++) {
             assertTrue(arr2[i].equals(tmp2.get(i).RetString));
         }
         
         //final String[] op2={"++","--","==","!=",">=","<=","<<",">>","&&","||","+=","-=","*=","/=","%=","&=","^=","|="};
         Vector<Focus> tmp3=JspStatic3.OP_Replacement(tmp2, JspStatic3.op2);
         final String[] arr3={"int","D","=","3",">>>","1","+","5",";","int","E","+=","15",";","int","F","=","++","E",";"};
         assertTrue(tmp3.size()==arr3.length);
         for (int i=0; i<tmp3.size(); i++) {
             assertTrue(arr3[i].equals(tmp3.get(i).RetString));
         }
         Vector<Focus> tmp4=JspStatic3.ELSE_IF_Replacement(tmp3);
         assertTrue(tmp4.size()==arr3.length);
         for (int i=0; i<tmp4.size(); i++) {
             assertTrue(arr3[i].equals(tmp4.get(i).RetString));
         }
         Vector<Focus> _myfocus=JspStatic3.FloatNUM_Replacement(tmp4);
         assertTrue(_myfocus.size()==arr3.length);
         for (int i=0; i< _myfocus.size(); i++) {
             assertTrue(arr3[i].equals(_myfocus.get(i).RetString));
         }
        
    }
    @Test
    public void Test_Build_ClassArea(){
         StringBuffer Q=new StringBuffer("<%! int D=3>>>1+5; int E +=15; int F= ++E; %>");         
         final String[] arr3={"int","D","=","3",">>>","1","+","5",";","int","E","+=","15",";","int","F","=","++","E",";"};
         JspStatic3 obj=new JspStatic3(Q);
         obj.Build_MyFocus();
         obj.Build_Class_Area(ClassArea);
         assertTrue(obj.MyFocus.size()==arr3.length );         
         for (int i=0; i<obj.MyFocus.size(); i++) {
             System.out.println(arr3[i]);
             assertTrue(arr3[i].equals(obj.MyFocus.get(i).RetString));
         }
        
    }   
    
    
    @Test
    public void Test3() {
        StringBuffer Q=new StringBuffer("int A=1.00+2.00+3.00; int B=5.0+8.0; ");
        /*
        CommentArea=new Vector<Pair>();
        ArrayArea=new Vector<FocusPair>();
        DQArea=new Vector<Pair>();
        SQArea=new Vector<Pair>();
        */
        
        Vector<Focus> tmp=new Vector<Focus>();
        Focus hand=JspStatic3.GetOneToken(Q,0,CommentArea,DQArea,SQArea);
        while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic3.GetOneToken(Q, hand.NextCharPos, CommentArea,  DQArea, SQArea);
        }
        Vector<Focus> afterFloat=JspStatic3.FloatNUM_Replacement(tmp);
        final String[] arr={"int","A","=","1.00","+","2.00","+","3.00",";","int","B","=","5.0","+","8.0",";"};
        for (int i=0; i<afterFloat.size(); i++) {
            System.out.println(arr[i]);
            assertTrue(arr[i].equals(afterFloat.get(i).getString()));
        }        
    }
    @Test
    public void Test4() {
        StringBuffer Q=new StringBuffer(" AAA.BBB+=3; ");
        /*
        CommentArea=new Vector<Pair>();
        ArrayArea=new Vector<Pair>();
        DQArea=new Vector<Pair>();
        SQArea=new Vector<Pair>();
        */
        
        Vector<Focus> tmp=new Vector<Focus>();
        Focus hand=JspStatic3.GetOneToken(Q,0,CommentArea,DQArea,SQArea);
        while(hand!=null) {
            tmp.add(hand);
            hand=JspStatic3.GetOneToken(Q, hand.NextCharPos, CommentArea,  DQArea, SQArea);
        }
        final String[] arr={"AAA",".","BBB","+","=","3",";"};
        for (int i=0; i<tmp.size(); i++) {
            System.out.println(arr[i]);
            assertTrue(arr[i].equals(tmp.get(i).getString()));
        }
    }
    
    
    
}
