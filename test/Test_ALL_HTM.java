/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JSP.CH1.TestJSP1;
import JSP.CH1.TestJSP2;
import JSP.CH1.TestJSP3;
import JSP.CH1.TestJSP4;
import JSP.CH1.TestJSP5;
import JSP.CH2.J06;
import JSP.CH2.J08;
import JSP.CH2.Test01;
import JSP.CH2.Test03;
import JSP.CH2.Weird;
import HTM.TestHTM0;
import HTM.TestHTM1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author easterday
 */
@RunWith(Suite.class)
@Suite.SuiteClasses (
        {
            TestHTM0.class,
            TestHTM1.class,
            TestJSP1.class,
            TestJSP2.class,
            TestJSP3.class,
            TestJSP4.class,
            TestJSP5.class,
            J06.class,
            J08.class,
            Test01.class,
            Test03.class,
            Weird.class
                
                
                
                
        }
)
public class Test_ALL_HTM {
    
    public Test_ALL_HTM() {
    }
    
}
