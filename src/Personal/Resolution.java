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
    public String toString(StringBuffer text) {
        if (!Type.equals("{") && !Type.equals("}")) {
            String ret=text.substring(that.getStart(),that.getEnd());
            return (Type+ret);
        }else
            return Type;
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
    public static Vector<Resolution> GetResolution(Resolution source,Vector<Pair> refCommentArea,StringBuffer text) {        
        Vector<Resolution> ret=new Vector<Resolution>();
        for (int i=0; i<refCommentArea.size(); i++) {
            if (Left(source,refCommentArea.get(i))) {
                Resolution Pre=new Resolution("comment#", refCommentArea.get(i).getStart(), refCommentArea.get(i).getEnd());
                Resolution that=new Resolution(source.Type, refCommentArea.get(i).getEnd()+1, source.that.getEnd());
                ret.add(Pre);
                ret.add(that);
            }else if (Right(source,refCommentArea.get(i))) {
                Resolution that=new Resolution(source.Type,source.that.getStart(), refCommentArea.get(i).getStart()-1);
                Resolution Post=new Resolution("comment#",refCommentArea.get(i).getStart(),refCommentArea.get(i).getEnd());
                ret.add(that);
                ret.add(Post);
            }else if (source.that.getStart()< refCommentArea.get(i).getStart() && refCommentArea.get(i).getEnd()< source.that.getEnd())
            {
                Resolution pre=new Resolution(source.Type,source.that.getStart(), refCommentArea.get(i).getStart());
                Resolution middle=new Resolution("comment#",refCommentArea.get(i).getStart(), refCommentArea.get(i).getEnd());
                Resolution post=new Resolution(source.Type,refCommentArea.get(i).getEnd(),source.that.getEnd());
                ret.add(middle);
                Vector<Resolution> preadd=GetResolution(pre,refCommentArea,text);
                Vector<Resolution> postadd=GetResolution(post,refCommentArea,text);
                for (int j=0; j<preadd.size(); j++) {
                    Pair p=preadd.get(j).that;
                    if (Main.ToStr(p,text).trim().length()>0)
                        ret.add(preadd.get(j));
                }
                for (int j=0; j<postadd.size(); j++) {
                    Pair p=preadd.get(j).that;
                    if (Main.ToStr(p,text).trim().length()>0)                    
                        ret.add(postadd.get(j));
                }
            }
        }
        if (ret.size()==0) {
            Pair p=source.that;
            if (Main.ToStr(p,text).trim().length()>0)                    
              ret.add(source);
        }
        return ret;
    }
}
