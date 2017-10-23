/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *
 * @author easterday
 */
public class JspElement {
    public final int ID;
    public String Type;
    public StringBuffer Txt;
    public JspElement(int id,String type,StringBuffer txt) {
        ID=id; Type=type; Txt=txt;
    }
    
}
