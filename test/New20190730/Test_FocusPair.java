/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New20190730;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Personal.*;
/**
 *
 * @author ccn
 */
public class Test_FocusPair {
    
    public Test_FocusPair() {
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
    public void test0() {
        final String OC="()[];=><+-*/%^~@,:!|.~?&"; 
        for (int i=0; i<OC.length(); i++) {
            assertTrue(FocusPair.IsOperation(""+OC.charAt(i)));
        }
        for (String s: JspStatic3.op3) {
            assertTrue(FocusPair.IsOperation(s));
        }
        for (String s: JspStatic3.op2) {
            assertTrue(FocusPair.IsOperation(s));
        }
        String[] arr={"dog","int","abc","@Test","\"","{","}","_"} ;
        for (String s: arr) {
            assertTrue(FocusPair.IsOperation(s)==false);
        }
    }
    @Test
    public void FocusPair1() {
        StringBuffer buf=new StringBuffer("for (int i=0; i<100; i++) System.out.println(i);");
        
    }
}
