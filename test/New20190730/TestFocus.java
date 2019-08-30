/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New20190730;

import Personal.Focus;
import Personal.JspStatic3;
import static Personal.JspStatic3.MyText;
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
 * @author ccn
 */
public class TestFocus {

    public Vector<Focus> ans1 = null;
    public Vector<Focus> ans2 = null;

    public TestFocus() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ans1 = new Vector<Focus>();
        ans1.add(new Focus("for", 0, 3));
        ans1.add(new Focus("(", 4, 5));
        ans1.add(new Focus("int", 5, 8));
        ans1.add(new Focus("i", 9, 10));
        ans1.add(new Focus("=", 10, 11));
        ans1.add(new Focus("1", 11, 12));
        ans1.add(new Focus(";", 12, 13));
        ans1.add(new Focus("i", 14, 15));
        ans1.add(new Focus("<", 15, 16));
        ans1.add(new Focus("=", 16, 17));
        ans1.add(new Focus("10", 17, 19));
        ans1.add(new Focus(";", 19, 20));
        ans1.add(new Focus("i", 21, 22));
        ans1.add(new Focus("+", 22, 23));
        ans1.add(new Focus("+", 23, 24));
        ans1.add(new Focus(")", 24, 25));
        ans1.add(new Focus("System", 26, 32));
        ans1.add(new Focus(".", 32, 33));
        ans1.add(new Focus("out", 33, 36));
        ans1.add(new Focus(".", 36, 37));
        ans1.add(new Focus("println", 37, 44));
        ans1.add(new Focus("(", 44, 45));
        ans1.add(new Focus("i", 45, 46));
        ans1.add(new Focus(")", 46, 47));
        ans1.add(new Focus(";", 47, 48));

        ans2 = new Vector<Focus>();
        ans2.add(new Focus("for", 0, 3));
        ans2.add(new Focus("(", 4, 5));
        ans2.add(new Focus("int", 5, 8));
        ans2.add(new Focus("i", 9, 10));
        ans2.add(new Focus("=", 10, 11));
        ans2.add(new Focus("1", 11, 12));
        ans2.add(new Focus(";", 12, 13));
        ans2.add(new Focus("i", 14, 15));
        ans2.add(new Focus("<=", 15, 17));
        ans2.add(new Focus("10", 17, 19));
        ans2.add(new Focus(";", 19, 20));
        ans2.add(new Focus("i", 21, 22));
        ans2.add(new Focus("++", 22, 24));
        ans2.add(new Focus(")", 24, 25));
        ans2.add(new Focus("System", 26, 32));
        ans2.add(new Focus(".", 32, 33));
        ans2.add(new Focus("out", 33, 36));
        ans2.add(new Focus(".", 36, 37));
        ans2.add(new Focus("println", 37, 44));
        ans2.add(new Focus("(", 44, 45));
        ans2.add(new Focus("i", 45, 46));
        ans2.add(new Focus(")", 46, 47));
        ans2.add(new Focus(";", 47, 48));

    }

    @After
    public void tearDown() {
    }

    @Test
    public void Focus01() {
        StringBuffer buf = new StringBuffer("for (int i=1; i<=10; i++) System.out.println(i); ");
        Vector<Pair> nothing = new Vector<Pair>();
        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(buf, 0, nothing, nothing, nothing);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(buf, hand.NextCharPos, nothing, nothing, nothing);
        }
        assertTrue(tmp.size() == ans1.size());
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans1.get(i)));
        }
        tmp = JspStatic3.OP_Replacement(tmp, JspStatic3.op3);
        assertTrue(tmp.size() == ans1.size());
        tmp = JspStatic3.OP_Replacement(tmp, JspStatic3.op2);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans2.get(i)));
        }
        tmp = JspStatic3.ELSE_IF_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans2.get(i)));
        }
        tmp = JspStatic3.ELSE_IF_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans2.get(i)));
        }
        tmp = JspStatic3.FloatNUM_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans2.get(i)));
        }

    }

    @Test
    public void Focus02() {
        StringBuffer buf = new StringBuffer("for (   int    i = 1; i <=   10; i++) \nSystem.out\n.println(i); ");
        Vector<Pair> nothing = new Vector<Pair>();
        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(buf, 0, nothing, nothing, nothing);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(buf, hand.NextCharPos, nothing, nothing, nothing);
        }
        assertTrue(tmp.size() == ans1.size());
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(tmp.get(i).RetString.equals(ans1.get(i).RetString));
        }
        tmp = JspStatic3.OP_Replacement(tmp, JspStatic3.op3);
        assertTrue(tmp.size() == ans1.size());
        tmp = JspStatic3.OP_Replacement(tmp, JspStatic3.op2);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(tmp.get(i).RetString.equals(ans2.get(i).RetString));
        }
        tmp = JspStatic3.ELSE_IF_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(tmp.get(i).RetString.equals(ans2.get(i).RetString));
        }
        tmp = JspStatic3.ELSE_IF_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(tmp.get(i).RetString.equals(ans2.get(i).RetString));
        }
        tmp = JspStatic3.FloatNUM_Replacement(tmp);
        assertTrue(tmp.size() == ans1.size() - 2);
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(tmp.get(i).RetString.equals(ans2.get(i).RetString));
        }
    }

    @Test
    public void Focus03() {
        System.out.println("Running Focus3:");
        Vector<Focus> ans3 = new Vector<Focus>();
        ans3.add(new Focus("/*for (int i=1; i<=10; i++) */", 0, 30));
        ans3.add(new Focus("System", 30, 36));
        ans3.add(new Focus(".", 36, 37));
        ans3.add(new Focus("out", 37, 40));
        ans3.add(new Focus(".", 40, 41));
        ans3.add(new Focus("/*java*/", 42, 50));
        ans3.add(new Focus("println", 51, 58));
        ans3.add(new Focus("(", 58, 59));
        ans3.add(new Focus("i", 59, 60));
        ans3.add(new Focus(")", 60, 61));
        ans3.add(new Focus(";", 61, 62));

        StringBuffer buf = new StringBuffer("/*for (int i=1; i<=10; i++) */System.out. /*java*/ println(i);  ");
        Vector<Pair> nothing = new Vector<Pair>();
        Vector<Pair> CommentArea = new Vector<Pair>();
        JspStatic3.Build_Comment_Area(buf, nothing, nothing, CommentArea);
        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(buf, 0, nothing, nothing, CommentArea);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(buf, hand.NextCharPos, nothing, nothing, CommentArea);
        }
        assertTrue(tmp.size() == ans3.size());
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans3.get(i)));
        }

    }

    @Test
    public void Focus04() {
        System.out.println("Running Focus4:");
        Vector<Focus> ans4 = new Vector<Focus>();
        ans4.add(new Focus("call", 0, 4));
        ans4.add(new Focus("(", 4, 5));
        ans4.add(new Focus("\"for (int i=1; i<=10; i++) System.out.println(i);\"", 5, 55));
        ans4.add(new Focus(")", 55, 56));
        ans4.add(new Focus(";", 56, 57));

        StringBuffer buf = new StringBuffer("call(\"for (int i=1; i<=10; i++) System.out.println(i);\");");
        Vector<Pair> nothing = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(buf, 0, nothing, DQArea, nothing);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(buf, hand.NextCharPos, nothing, DQArea, nothing);
        }
        assertTrue(tmp.size() == ans4.size());
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans4.get(i)));
            //System.out.println(tmp.get(i));
        }

    }

    @Test
    public void Focus05() {
        System.out.println("Running Focus5:");
        Vector<Focus> ans5 = new Vector<Focus>();
        ans5.add(new Focus("call", 0, 4));
        ans5.add(new Focus("(", 4, 5));
        ans5.add(new Focus("'A'", 5, 8));
        ans5.add(new Focus(",", 8, 9));
        ans5.add(new Focus("'B'", 9, 12));
        ans5.add(new Focus(",", 12, 13));
        ans5.add(new Focus("'C'", 13, 16));
        ans5.add(new Focus(")", 16, 17));
        ans5.add(new Focus(";", 17, 18));
        StringBuffer buf = new StringBuffer("call('A','B','C');");
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, SQArea, DQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        Vector<Focus> tmp = new Vector<Focus>();
        Focus hand = JspStatic3.GetOneToken(buf, 0, CommentArea, DQArea, SQArea);
        while (hand != null) {
            tmp.add(hand);
            hand = JspStatic3.GetOneToken(buf, hand.NextCharPos, CommentArea, DQArea, SQArea);
        }
        assertTrue(tmp.size() == ans5.size());
        for (int i = 0; i < tmp.size(); i++) {
            assertTrue(FocusEqual(tmp.get(i), ans5.get(i)));
            //System.out.println(tmp.get(i));
        }

    }

    /**
     * *
     * 在註解內落單的DQ符號
     */
    @Test
    public void Focus06() {
        System.out.println("Focus6(落單的DQ符號:");
        StringBuffer buf = new StringBuffer("call(  /*  ggyy\"  */\"123\");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(CommentArea.size() == 1);
        assertTrue(CommentArea.get(0).getStart() == 7 && CommentArea.get(0).getEnd() == 19);
        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 20 && DQArea.get(0).getEnd() == 24);
        assertTrue(SQArea.size() == 0);

        System.out.println(CommentArea);
        System.out.println(DQArea);
        System.out.println(SQArea);
    }

    @Test
    public void Focus07() {
        System.out.println("Focus7(落單的DQ符號):");
        StringBuffer buf = new StringBuffer("//Comment \" \ncall( \"123\");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(CommentArea.size() == 1);
        assertTrue(CommentArea.get(0).getStart() == 0 && CommentArea.get(0).getEnd() == 12);
        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 19 && DQArea.get(0).getEnd() == 23);
        assertTrue(SQArea.size() == 0);
        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(SQArea);        
    }

    @Test
    public void Focus08() {
        System.out.println("   \"         ");
        System.out.println("Focus8(落單的DQ符號+DQ in DQ):");
        StringBuffer buf = new StringBuffer("//Comment \" \ncall(\"   \\\"         \");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(CommentArea.size() == 1);
        assertTrue(CommentArea.get(0).getStart() == 0 && CommentArea.get(0).getEnd() == 12);
        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 18 && DQArea.get(0).getEnd() == 33);
        assertTrue(SQArea.size() == 0);
        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(SQArea);        
    }

    @Test
    public void Focus09() {
        System.out.println("Focus9(DQ in DQ):");
        StringBuffer buf = new StringBuffer("call(\"   \\\"         \");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(CommentArea.size() == 0);

        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 5 && DQArea.get(0).getEnd() == 20);
        assertTrue(SQArea.size() == 0);
        System.out.println(CommentArea);
        System.out.println(DQArea);
        System.out.println(SQArea);
    }

    @Test
    public void Focus10() {
        System.out.println("   \\\" 　/*GGYY*/        ");
        System.out.println("Focus10:有點詭異的狀況");
        StringBuffer buf = new StringBuffer("call(\"   \\\" 　/*GGYY*/        \");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(CommentArea.size() == 0);
        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 5 && DQArea.get(0).getEnd() == 29);
        assertTrue(SQArea.size() == 0);
        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(SQArea);        
    }

    @Test(expected = RuntimeException.class)
    public void Focus11() {

        System.out.println("Focus11:有點詭異的狀況--此時要丟出Exception才正確");
        StringBuffer buf = new StringBuffer("call(\"     \\\" 　/*GGYY        \"*/ \");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);
        System.out.println("1st DQ:" + DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);
        System.out.println("1st SQ:" + SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea);
        System.out.println("1st Comment:" + CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);

        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(DQArea);
    }

    @Test
    public void Focus12() {
        System.out.println("Focus12:DQ in DQ");
        StringBuffer buf = new StringBuffer("call(\" \\\"  \\\"  \");");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);        //System.out.println("1st DQ:"+DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);        //System.out.println("1st SQ:"+SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea); //System.out.println("1st Comment:"+CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);
        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 5 && DQArea.get(0).getEnd() == 15);
        assertTrue(SQArea.size() == 0);
        assertTrue(CommentArea.size() == 0);
        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(DQArea);
    }

    @Test
    public void Focus13() {
        System.out.println("Focus13:DQ in DQ");
        StringBuffer buf = new StringBuffer("call(\" \\\"  \\\"  \"/*ggaa\"  */);");
        System.out.println("buf=" + buf.toString());
        Vector<Pair> CommentArea = new Vector<Pair>();
        Vector<Pair> DQArea = new Vector<Pair>();
        Vector<Pair> SQArea = new Vector<Pair>();
        JspStatic3.Build_DQ_Area(buf, DQArea);        //System.out.println("1st DQ:"+DQArea);
        JspStatic3.Build_SQ_Area(buf, DQArea, SQArea);       // System.out.println("1st SQ:"+SQArea);
        JspStatic3.Build_Comment_Area(buf, DQArea, SQArea, CommentArea); // System.out.println("1st Comment:"+CommentArea);
        JspStatic3.Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(buf, SQArea, DQArea, CommentArea);

        assertTrue(DQArea.size() == 1);
        assertTrue(DQArea.get(0).getStart() == 5 && DQArea.get(0).getEnd() == 15);
        assertTrue(SQArea.size() == 0);
        assertTrue(CommentArea.size() == 1);
        assertTrue(CommentArea.get(0).getStart() == 16 && CommentArea.get(0).getEnd() == 26);
        //System.out.println(CommentArea);
        //System.out.println(DQArea);
        //System.out.println(DQArea);
    }

    @Test(expected = Exception.class)
    public void testCmdLine() throws Exception{
        CmdLineWorker worker = new CmdLineWorker(false, "C:/ANT/bin/ant.bat", "compile");
        //"二者擇一"
        /***************************************************************************************/
        //worker.setWorkDir("D:\\NetBeansProject\\Format-master\\test\\Template");
        worker.setWorkDir("C:\\Users\\easterday\\Documents\\NetBeansProjects\\Format\\test\\Template");
        /***************************************************************************************/
        System.out.println("before exec:");
        worker.execute();
        while (!worker.isDone()) {
            try {
            Thread.sleep(10);
            }catch(Exception ex) {
                //do_nothing;
            }
        }
        System.out.println("after exec:");
        System.out.println(worker.Results.toString());
        if (worker.Results.toString().contains("error:")) {
            throw new Exception("要丟出例外才正常(We have to throw Exception here to make a successful TestCase)");
        }
    }
    @Test
    public void hello() {
        for (String line: MakeString1()) {
            System.out.println("line="+line);
            System.out.println("removeAllMoney="+ RemoveAllMoney(line));
        }
    }
    public static Vector<String>  MakeString1() {
        Vector<String> ret=new Vector<String>();
        String s="$1\"$2     $3\"$4";
        for (int i=1; i<=4; i++) {
            String temp1=s.replace(("$"+i),  "/*"); 
            for (int j=1; j<=4; j++) {
                String temp2= temp1.replace(("$"+j),  "*/");
                for (int k=1; k<=4; k++) {
                    String temp3= temp2.replace(("$"+k),"\\\"");
                    ret.add(temp3);
                }
            }

        }
        for (int i=1; i<=4; i++) {
            String temp3=s.replace(("$+i"), "*/");
            for (int j=1; j<=4; j++) {
                String temp4=temp3.replace(("$"+j), "/*");
                for (int k=1; k<=4; k++) {
                    String temp5=temp4.replace(("$"+k), "\\\"");
                    ret.add(temp5);                
                }                
            }
        }        
        return ret;
    }
    public static String RemoveAllMoney(String inn) {
        StringBuffer ret=new StringBuffer();
        for (int i=0; i<inn.length(); i++) {
            if (inn.charAt(i)=='$') {
                ++i;
                while(i<inn.length() && Character.isDigit(inn.charAt(i))) {
                    ++i;
                }
                if (i>=inn.length())
                    break;
            }
            ret.append(inn.charAt(i));            
        }
        return ret.toString();
    }
    public static boolean FocusEqual(Focus f1, Focus f2) {
        if (f1 != null && f2 != null) {
            boolean r1 = f1.RetString.equals(f2.RetString);
            boolean r2 = (f1.StartPos == f2.StartPos);
            boolean r3 = (f1.NextCharPos == f2.NextCharPos);
            return r1 && r2 && r3;
        }
        return false;
    }
}
