/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Vector;

/**
 *
 * @author easterday
 */
public class Resolution {
    public String Type;
    public Pair   that;
    public Resolution(String type,int start,int end) {
        Type=type;
        that=new Pair(start,end);
    }
    public static boolean Left(Resolution source,Pair comment) {
        if (source.that.getStart()== comment.getStart()) {
            return true;
        }
        return false;
    }
    public static boolean Right(Resolution source,Pair comment) {
        if (source.that.getEnd()==comment.getEnd()) {
            return true;
        }
        return false;
    }
    public static Vector<Resolution> GetResolution(Resolution source,Vector<Pair> refCommentArea) throws Exception{        
        Vector<Resolution> ret=new Vector<Resolution>();
        for (int i=0; i<refCommentArea.size(); i++) {
            if (Left(source,refCommentArea.get(i))) {
                Resolution that=new Resolution(source.Type, refCommentArea.get(i).getEnd()+1, source.that.getEnd());
                ret.add(that);
            }else if (Right(source,refCommentArea.get(i))) {
                Resolution that=new Resolution(source.Type,source.that.getStart(), refCommentArea.get(i).getStart()-1);
                ret.add(that);
            }
        }
        return ret;
    }
}
