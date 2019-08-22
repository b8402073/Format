/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New20190730;

import Personal.JspStatic3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author ccn
 */
public class Testing {
    
    public Testing() {
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
    public void hello() {
        String str="<%! public int a() { int i=0;  //註解1\r\n"
                + "/****   this is  a book  \r\n"
                + "       dog run  */\r\n"
                + " do {System.out.println(i); \r\n"
                + "++i; }while(i<100); return i;//註解2 \r\n } %>";
        JspStatic3 obj=new JspStatic3(new StringBuffer(str));
        JspStatic3.NexLine="\r\n";
        JspStatic3.sHead="";
        JspStatic3.sLv="\t";
        assertTrue(obj.warning().equals(""));
        obj.go();
        System.out.println(obj.Make3().toString());        
    }
    @Test public void hello2() {
        String str="<%! public int a() { int i=0;  //註解1\r\n"
                + "/****   this is  a book  \r\n"
                + "       dog run  */\r\n"
                + " do {System.out.println(i); \r\n"
                + "++i; }while(i<100); return i;//註解2 \r\n } %>";        
        JspStatic3 obj=new JspStatic3(new StringBuffer(str));
        JspStatic3.NexLine="       \\ann  \r\n";
       
        StringBuffer bbb=new StringBuffer(JspStatic3.NexLine);
        for (int i=0; i<bbb.length(); i++) {
            System.out.println(bbb.charAt(i));
        }
        System.out.println(bbb.chars().toArray());
        JspStatic3.sHead="";
        JspStatic3.sLv="\t";
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.showCommentID=true;
        System.out.println(obj.Make3().toString());
    }

}
