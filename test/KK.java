
import Personal.JspStatic3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author easterday
 */
public class KK {
    public static final String ifX1="if (a>3) a++; else a--;";
    public static final String ifX2="if (a>3) a++; else if (a==3) a=0;";
    public static final String ifX3="if (a>3) a++; else {a++; a--;}";
    public static final String ifX4="if (a>3) a++; else if (a==3) {a++; a--;}";
    public static final String ifX5="if (a>3) {a++; a--;}";
    public static final String ifX6="if (a>3) a++;";

    public static final String whY1="do{ a++; a--; }while(a>=0);";
    public static final String whY2="while(a>=0) a--;";
    public static final String whY3="while(a>=0) {a++; a--;}";
    public static final String whY4="while(a--);";    
    
    public static final String T1="try {a++; a--;} catch(Exception ex) { a++;}";
    public static final String T2="try {a++; a--;} catch(Exception ex) {a++;}";
    public static final String T3="try {a++; a--;} catch(Exception ex) {a++;}  finally {a++; a--;}";
    public static final String T4="try {a++; a--;} catch(Exception ex) {a++; a--;} catch(IOException e) {a++; a--;}";
    public static final String T5="try {a++; a--;} catch(Exception ex) {a++; a--;} catch(IOException ex) { a++; a--;}  finally{ a++; a--;} ";
    public static final String T6="try {a++; a--;} catch(Exception ex) {a++; a--;} catch(IOException ex) { a++; a--;}  finally c++; ";
    
    public static final String F1="for (int a=0; a<10; a++) b++;";
    public static final String F2="for (int a=0; a<10; a++) { a++; a--;}";
    
    public static final String S1="switch(a) { case 1: a++; a--;}";
    public static final String S2="switch(a) { case 1: a++; a--; break; case 2: a++; a--; break; default: a++; a--;  }";
    public static final String S3="switch(a) { default: a++; a--; }";
    public static final String S4="switch(a) { case 1: a++; a--; continue; case 2: a++; a--; continue; default: a++; a--;  }";
    
    
    public static final String Syn1="synchronized(A) { a++; a--; } ";
    public static final String[] IX={ifX1,ifX2,ifX3,ifX4,ifX5,ifX6};
    public static final String[] W={whY1,whY2,whY3,whY4};
    public static final String[] T={T1,T2,T3,T4,T5,T6,F1,F2};    
    public static final String[] S={S1,S2,S3,S4};
    public static final String   NexLine=JspStatic3.NexLine;
    public static String SeqTestString(String[] a1,String[] a2,String[] a3) {
        StringBuffer ret=new StringBuffer();
        for (String s1:a1) {
            for (String s2: a2) {
                for (String s3: a3) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();         
    }
    public static String MixTestString(String[] A1,String[] A2) {
        StringBuffer ret=new StringBuffer();
        for (String s:A1) {
            for (String t:A2) {
                ret.append(s.replace("a++; a--;", t));
            }
        }
        for (String t:A2) {
            for (String s:A1) {
                ret.append(t.replace("a++; a--;",s));
            }
        }
        return ret.toString();         
    }
    
   
    public static String S_T_Mixing() {
        StringBuffer ret=new StringBuffer();
        for (String s:S) {
            for (String t:T) {
                ret.append(s.replace("a++; a--;", t));
            }
        }
        for (String t:T) {
            for (String s:S) {
                ret.append(t.replace("a++; a--;",s));
            }
        }
        return ret.toString();         
    }
    public static String S_T_S() {
        StringBuffer ret=new StringBuffer();
        for (String s1:S) {
            for (String s2: T) {
                for (String s3: S) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();          
    }
    public static String W_T_W(){
        StringBuffer ret=new StringBuffer();
        for (String s1:W) {
            for (String s2: T) {
                for (String s3: W) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();         
    }
    public static String W_T_Mixing(){
        StringBuffer ret=new StringBuffer();
        for (String w:W) {
            for (String t:T) {
                ret.append(w.replace("a++; a--;", t));
            }
        }
        for (String t:T) {
            for (String w:W) {
                ret.append(t.replace("a++; a--;",w));
            }
        }
        return ret.toString();         
    }    
    public static String IX_S_Mixing(){
        StringBuffer ret=new StringBuffer();
        for (String x:IX) {
            for (String s:S) {
                ret.append(x.replace("a++; a--;", s));
            }
        }
        for (String s:S) {
            for (String x:IX) {
                ret.append(s.replace("a++; a--;",x));
            }
        }
        return ret.toString();         
    }
    public static String IX_S_IX(){
        StringBuffer ret=new StringBuffer();
        for (String s1:IX) {
            for (String s2: S) {
                for (String s3: IX) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();        
    }    
    public static String IX_T_Mixing(){
        StringBuffer ret=new StringBuffer();
        for (String s:IX) {
            for (String t:T) {
                ret.append(s.replace("a++; a--;", t));
            }
        }
        for (String t:T) {
            for (String s:IX) {
                ret.append(t.replace("a++; a--;",s));
            }
        }
        return ret.toString();         
    }
    public static String IX_T_IX(){
        StringBuffer ret=new StringBuffer();
        for (String s1:IX) {
            for (String s2: T) {
                for (String s3: IX) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();        
    }
    public static String IX_W_Mixing() {
        StringBuffer ret=new StringBuffer();
        for (String s:IX) {
            for (String w:W) {
                ret.append(s.replace("a++; a--;", w));
            }
        }
        for (String w:W) {
            for (String s:IX) {
                ret.append(w.replace("a++; a--;",s));
            }
        }
        return ret.toString();  
    }
    public static String IX_W_IX() {            //IX與W的順序性測試
        StringBuffer ret=new StringBuffer();
        for (String s1:IX) {
            for (String s2: W) {
                for (String s3: IX) {
                    ret.append(s1+NexLine);
                    ret.append(s2+NexLine);
                    ret.append(s3+NexLine);
                }
            }
        }
        return ret.toString();  
    }
    public static String S_Syn_Mixing() {       //S與Syn的混合性測試
        StringBuffer ret=new StringBuffer();
        for (String s:S) {
            ret.append(s.replace("a++; a--;", Syn1));
        }
        String syn=Syn1;
        for (String s:S) {
            ret.append(syn.replace("a++; a--;", s));            
        }         
        return ret.toString();        
    }
    public static String S_Syn_S(){         //S與Syn的順序性測試
        StringBuffer ret=new StringBuffer();
        for (String s:S) {
            ret.append(s+JspStatic3.NexLine);
            ret.append(Syn1+JspStatic3.NexLine);
        }
        for (String s: S) {
            ret.append(Syn1+JspStatic3.NexLine);
            ret.append(s+JspStatic3.NexLine);
        }        
        return ret.toString();        
    }
    public static String T_Syn_Mixing() {   //T與Syn的混合性測試
        StringBuffer ret=new StringBuffer();
        for (String t:T) {
            ret.append(t.replace("a++; a--;", Syn1));
        }
        String syn=Syn1;
        for (String t:T) {
            ret.append(syn.replace("a++; a--;", t));            
        }         
        return ret.toString();        
    }
    public static String T_Syn_T(){         //T與Syn的順序性測試
        StringBuffer ret=new StringBuffer();
        for (String t:T) {
            ret.append(t+JspStatic3.NexLine);
            ret.append(Syn1+JspStatic3.NexLine);
        }
        for (String t: T) {
            ret.append(Syn1+JspStatic3.NexLine);
            ret.append(t+JspStatic3.NexLine);
        }        
        return ret.toString();
        
    }
    public static String W_Syn_Mixing() {  //W與Syn的混合性測試
        StringBuffer ret=new StringBuffer();
        for (String w:W) {
            ret.append(w.replace("a++; a--;", Syn1));
        }
        String syn=Syn1;
        for (String w:W) {
            ret.append(syn.replace("a++; a--;", w));            
        }        
        return ret.toString();        
    }
    public static String W_Syn_W() {      //W跟Syn的順序性測試
        StringBuffer ret=new StringBuffer();
        for (String w:W) {
            ret.append(w+JspStatic3.NexLine);
            ret.append(Syn1+JspStatic3.NexLine);
        }
        for (String w: W) {
            ret.append(Syn1+JspStatic3.NexLine);
            ret.append(w+JspStatic3.NexLine);
        }        
        return ret.toString();
    } 
    public static String IX_Syn_IX() {    //IX跟Syn的順序性測試
        StringBuffer ret=new StringBuffer();
        for (String x1:IX) {
            ret.append(x1+JspStatic3.NexLine);
            ret.append(Syn1+JspStatic3.NexLine);
        }
        for (String x2: IX) {
            ret.append(Syn1+JspStatic3.NexLine);
            ret.append(x2+JspStatic3.NexLine);
        }
        return ret.toString();
    }
    
    public static String IX_Syn_Mixing() {   //IX與Syn的混合性測試
        StringBuffer ret=new StringBuffer();
        for (String x:IX) {
            ret.append(x.replace("a++; a--;", Syn1));
        }
        String syn=Syn1;
        for (String x:IX) {
            ret.append(syn.replace("a++; a--;", x));            
        }
        return ret.toString();
    }
    public static  String FUNC(String... Arr) {
        StringBuffer ret=new StringBuffer("public void FuncA() {"+JspStatic3.NexLine);
        for(String s:Arr) {
            ret.append(s+JspStatic3.NexLine);
        }
        ret.append("}");
        return ret.toString();
    }
    public static void main(String[] arr) {        
        String str=IX_Syn_IX();
        System.out.println(str);
        System.out.println("---------------------");
        String s=str.replace("a++; a--;", F1);
        System.out.println(s);
    }
}
