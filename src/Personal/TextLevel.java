/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 * �����Y�Ӧ�m��Level���ӭ��]���h��,�bJspStatic.Make()�̭��ϥ�
 * @author easterday
 */
public class TextLevel {
    public final String     Type;
    public final FocusPair  StartToEnd;
    public final int Level;
    public TextLevel(String type,FocusPair that,int level) {
        Type=type;StartToEnd=that; Level=level;
    }
    public String toString() {
        String ret=Type+"# Level="+Level+StartToEnd.toString();
        return ret;
    }
}
