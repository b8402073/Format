/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM;

import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class CompactOneTag {
        String try1= ("<p   />");
        String try2= ("<p  src='abc' >");
        String try3= ("<p  src=\"ABC\"  >");
        String try4= ("<p>");
        String try5= ("<p/>");
        String try6= ("<p      ");
        String try7= ("<p    aabb >");
        String try8= "<p  src=\"AA \n  \" width=10 />";
        String try9= "<p  src='AA  \n  '  width=10 />";
                    
    public CompactOneTag() {
    }
    @Test
    public void Test1() {
        String a1=HTML.ToCompactOneTag(try1);
        String result="<p/>";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test2() {
// String try2= ("<p  src='abc' >");        
        String a1=HTML.ToCompactOneTag(try2);
        String result="<p src='abc'>";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test3() {
        //String try3= ("<p  src=\"ABC\"  >");        
        String a1=HTML.ToCompactOneTag(try3);
        String result="<p src=\"ABC\">";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test4() {
//        String try4= ("<p>");        
        String a1=HTML.ToCompactOneTag(try4);
        String result="<p>";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test5() {
//        String try5= ("<p/>");        
        String a1=HTML.ToCompactOneTag(try5);
        String result="<p/>";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test6() {
//        String try6= ("<p      ");        
        String a1=HTML.ToCompactOneTag(try6);
        String result="<p ";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test7() {
//        String try7= ("<p    aabb >");        
        String a1=HTML.ToCompactOneTag(try7);
        String result="<p aabb>";
        assertTrue(result.equals(a1));
    }
    
    @Test
    public void Test8() {
  //String try8= "<p  src=\"AA \n  \" width=10 />";
        String a1=HTML.ToCompactOneTag(try8);
        String result="<p src=\"AA\n" +" \" width=10/>";
        assertTrue(result.equals(a1));
    }
    @Test
    public void Test9() {

  //      String try9= "<p  src='AA  \n  '  width=10 />";
        String a1=HTML.ToCompactOneTag(try9);
        String result="<p src='AA\n" +" ' width=10/>";
        assertTrue(result.equals(a1));
    }    
    
}
