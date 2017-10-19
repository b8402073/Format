/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Optional;
/**
 *
 * @author easterday
 */
public class JspStatic3 extends JspStatic {
    public final static LineType ClassType=LineType.NEXT_LINE;
    public final static LineType FuncType=LineType.AFTER_LINE;
    public static LineType OtherType=LineType.AFTER_LINE;
    public static LineType Catch_After_Try_Block=LineType.AFTER_LINE;
    public static String NexLine="\n";
    
    public JspStatic3 setOtherType(LineType lt) {
        OtherType=lt;
        return this;
    }
    public JspStatic3 setCatchType(LineType lt) {
        Catch_After_Try_Block=lt;
        return this;
    }
    
    public JspStatic3(StringBuffer Text) {
        super(Text);
        sHead="#####";
        sLv="   ";
    }
    public StringBuffer Make3() {
        Stack<TextLevel> Complex=new Stack<TextLevel>();
        Complex.push(new TextLevel("class", FocusPair.MotherFocusPair, 0));
        StringBuffer ret=new StringBuffer();
        Integer Level=0;
        int i=0;
        try {
           for (i=0; i<MyFocus.size(); i++) {
               FocusPair F=GetPair(i,ClassArea);
               if (F!=null) {
                   i=Make_Class_Function_Area(ret,Level,F,FindSymmetricBigBraceToken(i,MyFocus),Complex,"class");
                   continue;
               }
               F=GetPair(i,FuncHeaderArea);
               if (F!=null) {
                   i=Make_Class_Function_Area(ret,Level,F,FindSymmetricBigBraceToken(i,MyFocus),Complex,"func");
                   continue;
               }
               switch(MyFocus.get(i).getString()) {
                   case"{":
                       MakeLeftBigBrace(ret,Level,Complex);  Level++;
                       break;
                   case"}":
                       i=MakeRightBigBrace(ret,i,Level,Complex); Level--;
                       break;
                   case"do": //do後面一定有Block
                       i=MakeDo(ret,i,Level,FindSymmetricBigBraceToken(i,MyFocus),Complex);
                       break;
                   case"for":
                       i=Make_For_While(ret,i,Level,Complex,"for");
                       break;
                   case"while":
                       i=Make_For_While(ret,i,Level,Complex,"while");
                       break;                            
                   case"if":
                       i=Make_If_ElseIf(ret,i,Level,Complex,"if");
                       break;
                   case"else if":                       
                       i=Make_If_ElseIf(ret,i,Level,Complex,"else if");
                       break;
                   case"else":  //else跟finally行為如果有Catch_after_Try就不一樣
                       i=i=Make_Else(ret,i,Level,Complex);
                       break;
                   case"catch":                       
                       i=MakeCatch(ret,i,Level,FindSymmetricSmallBraceToken(i,MyFocus),Complex);
                       break;
                   case"try":  //try後面一定有Block
                       i=MakeTry(ret,i,Level,FindSymmetricBigBraceToken(i,MyFocus),Complex);
                       break;                       
                   case"finally"://else跟finally行為如果有Catch_after_Try就不一樣
                       i=Make_Finally(ret,i,Level,Complex);
                       break;
                   case"@":
                       i=MakeAttribute(ret,i,Level);
                       break;
                   default:
                       i=MakeStatement(ret,i,Level,Complex);
                       break;                                             
               }
           }
        }catch(Exception ex) {
            ex.printStackTrace();
        }        
        return ret;
    }
    public int Make_If_ElseIf(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex,String what) {
        switch(what){
        case"if": case"else if": break;
        default:                 throw new NullPointerException("Bad Make_If_ElseIf: NowPos="+NowPos+" what="+what);
        }
        String line=sHead+GetString(sLv,level)+what;
        FocusPair Brace=GetSmallBrace(NowPos);
        refRet.append(line+" "+Brace.toString(MyFocus));
        switch(Next(Brace.getEnd())) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos,MyFocus);
                TextLevel newTL=new TextLevel(what,Block,level);
                refComplex.push(newTL);                
                return Brace.getEnd();
            default:
                refRet.append(NexLine);
                return  MakeStatement(refRet,Brace.getEnd()+1,level+1,refComplex);
        }        
    }
    public int Make_For_While(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex,String what) {
        switch(what) {
        case"for": case"while":            break;
        default:                           throw new NullPointerException("Bad Make_For_While: NowPos="+NowPos+" what="+what);
        }
        String line=sHead+GetString(sLv,level)+what;
        FocusPair Brace=GetSmallBrace(NowPos);
        refRet.append(line+Brace.toString(MyFocus));
        switch(Next(Brace.getEnd())) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos,MyFocus);
                TextLevel newTL=new TextLevel(what,Block,level);
                refComplex.push(newTL);                
                return Brace.getEnd();
            case";":
                refRet.append(";"+NexLine);
                return Brace.getEnd()+1;
            default:
                //遇到stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,Brace.getEnd()+1,level+1,refComplex);
        }        
    }
    public FocusPair GetStmt(int i) {
        int EndPos= SearchForTokenPos(i,";",MyFocus);
        return new FocusPair(i,EndPos);
    }
    public String Next(int i) {
        if (i+1< MyFocus.size()) 
            return MyFocus.get(i+1).RetString;
        throw new NullPointerException("i="+i+"  i+1="+(i+1));
    }
    public FocusPair GetSmallBrace(int i) {
        return FindSymmetricSmallBraceToken(i, MyFocus);
    }    
    public int MakeCatch(StringBuffer refRet,int NowPos,int level,FocusPair Brace,Stack<TextLevel> refComplex) {
        String line="<bad catch>";
        if (Catch_After_Try_Block==LineType.NEXT_LINE)
            line=sHead+GetString(sLv,level)+"catch";
        else if (Catch_After_Try_Block==LineType.AFTER_LINE)
            line="catch";        
        refRet.append(line);
        refRet.append(Brace.toCatchString(MyFocus).get());
        switch(Next(Brace.getEnd())) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos, MyFocus);
                TextLevel newTL=new TextLevel("catch",Block,level);
                refComplex.push(newTL);
                return Brace.getEnd();                
            default:
                refRet.append(NexLine);
                return MakeStatement(refRet,NowPos,level+1,refComplex);
        }
    }
    public int MakeDo(StringBuffer refRet,int NowPos,int level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=NexLine+sHead+GetString(sLv,level)+"do";
        refRet.append(line);
        TextLevel newTL=new TextLevel("do",Block,level);
        refComplex.push(newTL);
        return NowPos;        
    }
    public int MakeTry(StringBuffer refRet,int NowPos,int Level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,Level)+"try";
        refRet.append(line);
        TextLevel newTL=new TextLevel("try",Block,Level);
        refComplex.push(newTL);
        return NowPos;
    }
    public int Make_Else(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,level)+"else";
        refRet.append(line);
        switch(Next(NowPos)) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos,MyFocus);
                refComplex.push(new TextLevel("else",Block,level));
                return NowPos;
            default:
                //遇到stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,NowPos+1,level+1,refComplex);
        }
    }
    public int Make_Finally(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex) {
        String line="<bad finally>";
        if (Catch_After_Try_Block==LineType.AFTER_LINE)
            line="finally"+" ";
        else if (Catch_After_Try_Block==LineType.NEXT_LINE) {
            line=sHead+GetString(sLv,level)+"finally"+" ";
        }
        refRet.append(line);
        switch(Next(NowPos)) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos,MyFocus);
                refComplex.push(new TextLevel("finally",Block,level));
                return NowPos;
            default:
                //遇到stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,NowPos+1,level+1,refComplex);
        }
    }
    public int MakeAttribute(StringBuffer refRet,int NowPos,final Integer Level) {        
        String line=sHead+GetString(sLv,Level)+"@"+MyFocus.get(NowPos+1).RetString+NexLine;
        refRet.append(line);
        return NowPos+1;
    }
    public int MakeStatement(StringBuffer refRet,int StartPos,int Level,Stack<TextLevel> refComplex) {
        //FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());  //為什麼這樣跑不對...
        Optional<FocusPair> L=GetFuncBase(StartPos,refComplex);
        if (!L.isPresent())    {
            L=GetClassBase(StartPos,refComplex);
        }
        FocusPair Limit=L.get();
        FocusPair Stmt=new FocusPair(StartPos, SearchForTokenPos(StartPos,";",MyFocus));                       
        if (Limit.contains(Stmt)) {
            String line=sHead+GetString(sLv,Level)+Stmt.toString(MyFocus);
            refRet.append(line+NexLine);
            return Stmt.getEnd();
        }
        throw new NullPointerException("Bad ComplexStack: NowPos="+StartPos);                 
    }
    public int Make_Class_Function_Area(StringBuffer refRet,int level,FocusPair f,FocusPair block,Stack<TextLevel> refComplex,String what) {
        switch(what) {
            case"class": case"func": break;
            default:
                throw new NullPointerException("Bad MakeClass_Function_Area");
        }
        String line=sHead+GetString(sLv,level)+f.toString(MyFocus);
        refRet.append(line);
        TextLevel newTL=new TextLevel(what,block,level);
        refComplex.push(newTL);
        return  f.getEnd();
    }

    public void MakeLeftBigBrace(StringBuffer refRet,int level,Stack<TextLevel> refComplex) {
        LineType use;
        TextLevel top=refComplex.peek();
        switch(top.Type) {
            case"class":
                use=JspStatic3.ClassType; break;
            case"func":
                use=JspStatic3.FuncType; break;
            default:
                use=JspStatic3.OtherType; break;
        }
        switch(use) {
            case AFTER_LINE:
                refRet.append(" {"+NexLine);
                break;
            case NEXT_LINE:
                refRet.append(NexLine);
                String line=sHead+GetString(sLv,level)+"{"+NexLine;
                refRet.append(line);
                break;
        }
    }
    //MakeRightBigBrace(ret,Level,Complex);
    public int MakeRightBigBrace(StringBuffer refRet,int NowPos,Integer Level,Stack<TextLevel> refComplex) throws Exception{
        TextLevel Top=refComplex.peek();
        if (Top.StartToEnd.getEnd()==NowPos) {
            TextLevel newTL=refComplex.pop();
            Level=newTL.Level;
            String line;
            switch(Top.Type) {
                case"do":
                   FocusPair Brace=FindSymmetricSmallBraceToken(NowPos,MyFocus);
                   line=sHead+GetString(sLv,Level)+"} while"+ Brace.toString(MyFocus)+";\n";
                   refRet.append(line);
                   return Brace.getEnd()+1;
                   
                case"try":
                case"catch":                    
                    line=sHead+GetString(sLv,Level)+"}";
                    refRet.append(line);
                    if (Catch_After_Try_Block==LineType.NEXT_LINE) {
                        refRet.append(NexLine);
                    }
                    return NowPos;                   
                default:
                   //including "func","class","if","else if","else","while","for","try","catch","finally"
                   line=sHead+GetString(sLv,Level)+"}"+NexLine;
                   refRet.append(line);
                   return NowPos;
            }
        }else {
            throw new Exception("NowPos="+NowPos+" ComplexStack is broken");
        }
    }
}
