/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;

/**
 *
 * @author easterday
 */
public class JspStatic3 extends JspStatic {
    public static LineType ClassType=LineType.NEXT_LINE;
    public static LineType FuncType=LineType.AFTER_LINE;
    public static LineType OtherType=LineType.AFTER_LINE;
        
    
    public JspStatic3(StringBuffer Text) {
        super(Text);
        sHead="#####";
        sLv="   ";
    }
    public StringBuffer Make3() {
        Stack<TextLevel> Complex=new Stack<TextLevel>();
        StringBuffer ret=new StringBuffer();
        Integer Level=0;
        int i=0;
        try {
           for (i=0; i<MyFocus.size(); i++) {
               FocusPair F=GetPair(i,ClassArea);
               if (F!=null) {
                   i=MakeClassArea(ret,Level,F,FindSymmetricBigBraceToken(i,MyFocus),Complex);
               }
               F=GetPair(i,FuncHeaderArea);
               if (F!=null) {
                   i=MakeFuncHeaderArea(ret,Level,F,FindSymmetricBigBraceToken(i,MyFocus),Complex);
               }
               switch(MyFocus.get(i).getString()) {
                   case"{":
                       MakeLeftBigBrace(ret,Level,Complex);  Level++;
                       break;
                   case"}":
                       i=MakeRightBigBrace(ret,i,Level,Complex);
                       break;
                   case"do":
                       i=MakeDo(ret,i,Level,FindSymmetricBigBraceToken(i,MyFocus),Complex);
                       break;
                   case"for":
                       i=MakeFor(ret,i,Level,Complex);
                       break;
                   case"while":
                       i=MakeWhile(ret,i,Level,Complex);
                       break;                            
                   case"if":
                       i=MakeIf();
                       break;
                   case"else if":
                       i=MakeElseIf();
                       break;
                   case"else":
                       i=MakeElse();
                       break;

                   case"catch":
                       i=MakeCatch();
                       break;
                   case"try":    
                       //try後面一定有Block
                       i=MakeTry(ret,i,Level,FindSymmetricBigBraceToken(i,MyFocus),Complex);
                       break;                       
                   case"finally":
                       //finally後面不一定是Block,也有可能是stmt
                       i=MakeFinally(ret,i,Level,FindSymmetricBigBraceToken(i, MyFocus),Complex);
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
            
        }        
        return ret;
    }
    public int MakeTry(StringBuffer refRet,int NowPos,int Level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,Level)+"try";
        refRet.append(line);
        TextLevel newTL=new TextLevel("try",Block,Level);
        refComplex.push(newTL);
        return NowPos+1;
    }
    public int MakeFinally(StringBuffer refRet,int NowPos,int level,FocusPair Block,Stack<TextLevel> refComplex) {
        //在此暫時不考慮stmt的情形
        String line=sHead+GetString(sLv,level)+" finally ";
        refRet.append(line);
        refComplex.push(new TextLevel("finally",Block,level));
        return (NowPos+1);
    }
    public int MakeAttribute(StringBuffer refRet,int NowPos,final Integer Level) {        
        String line=sHead+GetString(sLv,Level)+"@"+MyFocus.get(NowPos+1).RetString+"\n";
        refRet.append(line);
        return NowPos+1;
    }
    public int MakeStatement(StringBuffer refRet,int NowPos,int Level,Stack<TextLevel> refComplex) throws Exception{
        FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());
        FocusPair Stmt=new FocusPair(SearchForStatementHeadPos(NowPos,MyFocus), SearchForTokenPos(NowPos,";",MyFocus));                       
        if (Limit.contains(Stmt)) {
            String line=sHead+GetString(sLv,Level)+Stmt.toString(MyFocus);
            refRet.append(line+"\n");
        }
        throw new Exception("Bad ComplexStack: NowPos="+NowPos);                 
    }
    public int MakeClassArea(StringBuffer refRet,int level,FocusPair f,FocusPair block,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,level)+f.toString(MyFocus);
        refRet.append(line);
        TextLevel newTL=new TextLevel("class",block,level);
        refComplex.push(newTL);
        return  f.getEnd();
    }
    public int MakeFuncHeaderArea(StringBuffer refRet,int level,FocusPair f,FocusPair block,Stack<TextLevel> refComplex) {
        return MakeClassArea(refRet,level,f,block,refComplex);  //因為是完全一樣的動作
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
                refRet.append(" {"+"\n");
                break;
            case NEXT_LINE:
                refRet.append("\n");
                String line=sHead+GetString(sLv,level)+"{"+"\n";
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
                default:
                   //including "func","class","if","else if","else","while","for","try","catch","finally"
                   line=sHead+GetString(sLv,Level)+"}"+"\n";
                   refRet.append(line);
                   return NowPos;
            }
        }else {
            throw new Exception("NowPos="+NowPos+" ComplexStack is broken");
        }
    }
}
