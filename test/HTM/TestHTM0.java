/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM;

import Personal.HTML;
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
public class TestHTM0 {
    String HTM0="<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"  <title>Dom</title>\n" +
"</head>\n" +
"<body>\n" +
"  <div>hello,javascript</div>\n" +
"</body>\n" +
"</html>";
    StringBuffer BufHTM0;
    public TestHTM0() {
        BufHTM0=new StringBuffer(HTM0);
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
    public void Test0() {
        HTML that=new HTML(BufHTM0);
        that.go();
        System.out.println("DQArea="+that.DQArea);
        System.out.println("SQARea="+that.SQArea);
        System.out.println("CommentArea="+that.CommentArea);
        assertTrue(that.DQArea.size()==6);
        assertTrue(that.SQArea.size()==0);
        
        
    }
}
