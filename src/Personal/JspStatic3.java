/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Optional;
import java.util.Vector;
/**
 *
 * @author easterday
 */
public class JspStatic3 extends JspStatic {
    /***
     * 設定Class的括號顯示方式
     */
    public final static LineType ClassType=LineType.NEXT_LINE;
    /***
     * 設定Func的括號顯示方式
     */
    public final static LineType FuncType=LineType.AFTER_LINE;
    /***
     * 其他結構的括號顯示方式
     */
    public static LineType OtherType=LineType.AFTER_LINE;
    /***
     * Try後面的Catch要放在Try_Block的後面(After_LINE)或是下一行(NEXT_LINE)
     */
    public static LineType Catch_After_Try_Block=LineType.AFTER_LINE;
    /***
     * 換行符號
     */
    public static String NexLine="\n";
    /***
     * 設定OtherType; 傳回JspStatic3物件本身可以連續設定其他的LineType
     * @param lt
     * @return          傳回JspStatic3物件
     */
    public JspStatic3 setOtherType(LineType lt) {
        OtherType=lt;
        return this;
    }
    /***
     * 設定CatchType; 傳回JspStatic3物件本身可以連續設定其他的LineType
     * @param lt
     * @return          傳回JspStatic3物件
     */
    public JspStatic3 setCatchType(LineType lt) {
        Catch_After_Try_Block=lt;
        return this;
    }
    /***
     * 建構子
     * @param Text 傳入的本文,包含<%!  %>
     */
    public JspStatic3(StringBuffer Text) {
        super(Text);
        sHead="#####";
        sLv="   ";
    }
    /***
     * 顯示編排後的文字
     * @return      傳回編排後的文字
     */
    public StringBuffer Make3() {
        Stack<TextLevel> Complex=new Stack<TextLevel>();
        Complex.push(new TextLevel("class", FocusPair.MotherFocusPair, 0));
        StringBuffer ret=new StringBuffer();
        Integer Level=0;
        int i=0;
        Vector<Integer> Eye=new Vector<Integer>();
        Eye.add(-1);
        try {
           for (i=0; i<MyFocus.size(); i++) {
               if (Eye.size()<=2) {
                   Eye.add(i);
               }else {
                   Eye.removeElementAt(0);                   
               }
               if (Eye.size()>=2) {
                   int sz=Eye.size();
                   FocusPair Range=new FocusPair(Eye.get(sz-2), Eye.get(sz-1));
                   Vector<Pair> comments=GetAllComment(Range,MyFocus,CommentArea);
                   for (Pair P: comments) {
                       //old code: ret.append(ToStr(P,MyText,Level));
                       ret.append(TempToStr(P,Level));
                   }
               }
               
               
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
                   case"switch":
                       i=Make_Switch(ret,i,Level,Complex); 
                       break;
                   case"case":
                       Level=Complex.peek().Level;
                       i=Make_Case_Default(ret,i,Level,Complex,"case"); Level++;                       
                       break;
                   case"default":
                       Level=Complex.peek().Level;
                       i=Make_Case_Default(ret,i,Level,Complex,"default"); Level++;
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
    /***
     * 處理Case關鍵字和Default關鍵字
     * @param refRet            要寫入傳回的本文
     * @param NowPos            現在的字("case" or "default")的位置
     * @param level             現在的Level
     * @param refComplex        現在的區塊堆疊
     * @param what              現在遇到的字是"case" or "default"
     * @return                  傳回冒號所在位置
     */
    public int Make_Case_Default(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex,String what) {
        int Colum=SearchForTokenPos(NowPos,":",MyFocus);
        String line;
        switch(what) {
            case"case": 
                FocusPair _case=new FocusPair(NowPos+1,Colum-1);
                line=sHead+GetString(sLv,level)+what+" "+ _case.toString(MyFocus)+":"+NexLine;
                refRet.append(line);
                return Colum;                
            case"default":
                line=sHead+GetString(sLv,level)+"default:"+NexLine;
                refRet.append(line);
                return Colum;
            default:
                throw new NullPointerException("bad "+what+" without 冒號 NowPos="+NowPos);
        }
    }
    /***
     * 處理"if"關鍵字和"else if"關鍵字
     * @param refRet                要寫入傳回的本文
     * @param NowPos                現在的字("if" or "else if")的位置
     * @param level                 現在的Level
     * @param refComplex            現在的區塊堆疊
     * @param what                  現在遇到的字是"if" or "else if"
     * @return                      傳回準備下一個掃描位置 
     */
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
    /***
     * 處理"switch"關鍵字
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在的字("switch")的位置
     * @param level                         現在的Level
     * @param refComplex                    現在的區塊堆疊
     * @return                              傳回準備下一個掃描位置 
     */
    public int Make_Switch(StringBuffer refRet,int NowPos,int level,Stack<TextLevel> refComplex) {
        FocusPair Brace=GetSmallBrace(NowPos);
        String line=sHead+GetString(sLv,level)+"switch"+Brace.toString(MyFocus);
        refRet.append(line);
        switch(Next(Brace.getEnd())) {
            case"{":
                FocusPair Block=FindSymmetricBigBraceToken(NowPos,MyFocus);
                TextLevel newTL=new TextLevel("switch",Block,level);
                refComplex.push(newTL);
                return Brace.getEnd();
            default:
                throw new NullPointerException("Bad Switch: NowPos="+NowPos);
        }
        
    }
    /***
     * 處理"for"關鍵字和"while"關鍵字
     * @param refRet                    要寫入傳回的本文
     * @param NowPos                    現在的字("for" or "while")的位置
     * @param level                     現在的Level
     * @param refComplex                現在的區塊堆疊
     * @param what                      現在的字("for" or "what
     * @return                          傳回準備下一個掃描位置 
     */
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
    /***
     * 幫忙取得一個敘述的範圍
     * @param i                 開始搜尋位置
     * @return                  傳回敘述的FocusPair
     */
    public FocusPair GetStmt(int i) {
        int EndPos= SearchForTokenPos(i,";",MyFocus);
        return new FocusPair(i,EndPos);
    }
    /***
     * 傳回下一個Focus的代表字串
     * @param i                 開始搜尋位置
     * @return                  傳回字串
     */
    public String Next(int i) {
        if (i+1< MyFocus.size()) 
            return MyFocus.get(i+1).RetString;
        throw new NullPointerException("i="+i+"  i+1="+(i+1));
    }
    /***
     * 往後尋找對稱的小括號
     * @param i                 開始搜尋位置
     * @return                  傳回小括號範圍
     */
    public FocusPair GetSmallBrace(int i) {
        return FindSymmetricSmallBraceToken(i, MyFocus);
    }
    /***
     * 處理"catch"關鍵字
     * @param refRet                    要寫入傳回的本文
     * @param NowPos                    現在catch的位置
     * @param level                     現在的Level
     * @param Brace                     catch後面緊跟著的小括號範圍
     * @param refComplex                區塊堆疊
     * @return                          傳回準備下一個掃描位置
     */
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
    /***
     * 處理"do"關鍵字
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在do的位置
     * @param level                         現在的Level
     * @param Block                         do後面緊跟著的大括號範圍
     * @param refComplex                    區塊堆疊
     * @return                              傳回準備下一個掃描位置
     */
    public int MakeDo(StringBuffer refRet,int NowPos,int level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=NexLine+sHead+GetString(sLv,level)+"do";
        refRet.append(line);
        TextLevel newTL=new TextLevel("do",Block,level);
        refComplex.push(newTL);
        return NowPos;        
    }
    /***
     * 處理"try"關鍵字
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在try的位置
     * @param Level                         現在的Level
     * @param Block                         try後面緊跟著的大括號範圍
     * @param refComplex                    區塊堆疊
     * @return                              傳回準備下一個掃描位置
     */
    public int MakeTry(StringBuffer refRet,int NowPos,int Level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,Level)+"try";
        refRet.append(line);
        TextLevel newTL=new TextLevel("try",Block,Level);
        refComplex.push(newTL);
        return NowPos;
    }
    /***
     * 處理"else"關鍵字
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在else的位置
     * @param level                         現在的Level
     * @param refComplex                    區塊堆疊
     * @return                              傳回準備下一個掃描位置
     */
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
    /***
     *  處理"finally"關鍵字
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在finally的位置
     * @param level                         現在的Level
     * @param refComplex                    區塊堆疊
     * @return                              傳回下一個掃描準備位置
     */
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
    /***
     * 
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在@的位置
     * @param Level                         現在的Level
     * @return                              傳回下一個掃描準備位置
     */
    public int MakeAttribute(StringBuffer refRet,int NowPos,final Integer Level) {        
        String line=sHead+GetString(sLv,Level)+"@"+MyFocus.get(NowPos+1).RetString+NexLine;
        refRet.append(line);
        return NowPos+1;
    }
    /***
     * 
     * @param refRet                        要寫入傳回的本文
     * @param StartPos                      敘述開始位置
     * @param Level                         現在的Level
     * @param refComplex                    區塊堆疊
     * @return                              傳回下一個掃描準備位置
     */
    public int MakeStatement(StringBuffer refRet,int StartPos,int Level,Stack<TextLevel> refComplex) {
        //FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());  //為什麼這樣跑不對...
        Optional<FocusPair> L=GetFuncBase(StartPos,refComplex);
        if (!L.isPresent())    {
            L=GetClassBase(StartPos,refComplex);
        }
        FocusPair Limit=L.get();
        FocusPair Stmt=new FocusPair(StartPos, SearchForTokenPos(StartPos,";",MyFocus));                       
        if (Limit.contains(Stmt)) {
            //old String line=sHead+GetString(sLv,Level)+Stmt.toString(MyFocus);
            String line=sHead+GetString(sLv,Level)+Stmt.toStringCompact(MyFocus);
            refRet.append(line+NexLine);
            return Stmt.getEnd();
        }
        throw new NullPointerException("Bad ComplexStack: NowPos="+StartPos);                 
    }
    /***
     * 
     * @param refRet                        要寫入傳回的本文
     * @param level                         現在的Level
     * @param f                             傳入的FocusPair範圍,這個範圍可能在ClassArea或是FuncHeaderArea
     * @param block                         class或function的大括號範圍
     * @param refComplex                    區塊堆疊
     * @param what                          表示"class"或"func"
     * @return                              傳回下一個掃描準備位置
     */
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
    /***
     * 
     * @param refRet                        要寫入傳回的本文
     * @param level                         現在的Level
     * @param refComplex                    區塊堆疊
     */
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
    /***
     * 
     * @param refRet                        要寫入傳回的本文
     * @param NowPos                        現在右大括號的位置
     * @param Level                         現在的Level
     * @param refComplex                    區塊堆疊
     * @return                              下一個掃描準備位置
     * @throws Exception 
     */
    public int MakeRightBigBrace(StringBuffer refRet,int NowPos,Integer Level,Stack<TextLevel> refComplex) throws Exception{
        TextLevel Top=refComplex.peek();
        if (Top.StartToEnd.getEnd()==NowPos) {
            TextLevel newTL=refComplex.pop();
            Level=newTL.Level;
            String line;
            switch(Top.Type) {
                case"do":
                   //如果吃到do block的右大括號
                   FocusPair Brace=FindSymmetricSmallBraceToken(NowPos,MyFocus);
                   line=sHead+GetString(sLv,Level)+"} while"+ Brace.toString(MyFocus)+";"+NexLine;
                   refRet.append(line);
                   return Brace.getEnd()+1;
                   
                case"try":
                case"catch":
                    //如果吃到try或catch的右大括號
                    line=sHead+GetString(sLv,Level)+"}";
                    refRet.append(line);
                    if (Catch_After_Try_Block==LineType.NEXT_LINE ) {
                        switch(Next(NowPos)) {  
                            case"catch": case"finally":
                            //如果右括號的後面緊接著是catch或finally
                                refRet.append(NexLine);
                            default:
                        }
                    }
                    return NowPos;                   
                default:
                   //including "func","class","if","else if","else","while","for","try","catch","finally","switch"
                   line=sHead+GetString(sLv,Level)+"}"+NexLine;
                   refRet.append(line);
                   return NowPos;
            }
        }else {
           // System.out.println("**************************************");
           // System.out.println(refRet.toString());
           // System.out.println("**************************************");
            throw new Exception("NowPos="+NowPos+" ComplexStack is broken");
        }
    }

    public static String ToStr(Pair p, StringBuffer text,int level) {
            StringBuffer ret = new StringBuffer();
            String that=text.substring(p.getStart(), p.getEnd() + 1);
            if (that.startsWith("/*")) {
                String[] sArr=that.split("\n");
                for (String S: sArr) {
                    ret.append(sHead+GetString(sLv,level)+S+NexLine);
                }
            }else {
                ret.append(sHead+GetString(sLv,level)+that+NexLine);
            }            
            return ret.toString();
    }
    public static String GetCommentID(Pair that,Vector<Pair> refCommentArea) {
        for (int i=0; i<refCommentArea.size(); i++) {
            if (that.equals(refCommentArea.get(i))) {
                return String.format("@%d@", i);
            }
        }
        return"@NO_ID@";
    }
    public  String TempToStr(Pair p,int level) {
        String ID=GetCommentID(p,CommentArea);
        StringBuffer ret=new StringBuffer();
        String that=MyText.substring(p.getStart(), p.getEnd()+1);
        if (that.startsWith("/*")) {
            String[] sArr=that.split("\n");
            for (String S: sArr) {
                ret.append(sHead+GetString(sLv,level)+ID+S+NexLine);                
            }
        }else {
            ret.append(sHead+GetString(sLv,level)+that+NexLine);
        }
        return ret.toString();
    }
}
