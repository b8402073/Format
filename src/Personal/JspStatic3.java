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
     * �]�wClass���A����ܤ覡
     */
    public final static LineType ClassType=LineType.NEXT_LINE;
    /***
     * �]�wFunc���A����ܤ覡
     */
    public final static LineType FuncType=LineType.AFTER_LINE;
    /***
     * ��L���c���A����ܤ覡
     */
    public static LineType OtherType=LineType.AFTER_LINE;
    /***
     * Try�᭱��Catch�n��bTry_Block���᭱(After_LINE)�άO�U�@��(NEXT_LINE)
     */
    public static LineType Catch_After_Try_Block=LineType.AFTER_LINE;
    /***
     * ����Ÿ�
     */
    public static String NexLine="\n";
    /***
     * �]�wOtherType; �Ǧ^JspStatic3���󥻨��i�H�s��]�w��L��LineType
     * @param lt
     * @return          �Ǧ^JspStatic3����
     */
    public JspStatic3 setOtherType(LineType lt) {
        OtherType=lt;
        return this;
    }
    /***
     * �]�wCatchType; �Ǧ^JspStatic3���󥻨��i�H�s��]�w��L��LineType
     * @param lt
     * @return          �Ǧ^JspStatic3����
     */
    public JspStatic3 setCatchType(LineType lt) {
        Catch_After_Try_Block=lt;
        return this;
    }
    /***
     * �غc�l
     * @param Text �ǤJ������,�]�t<%!  %>
     */
    public JspStatic3(StringBuffer Text) {
        super(Text);
        sHead="#####";
        sLv="   ";
    }
    /***
     * ��ܽs�ƫ᪺��r
     * @return      �Ǧ^�s�ƫ᪺��r
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
                   case"do": //do�᭱�@�w��Block
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
                   case"else":  //else��finally�欰�p�G��Catch_after_Try�N���@��
                       i=i=Make_Else(ret,i,Level,Complex);
                       break;
                   case"catch":                       
                       i=MakeCatch(ret,i,Level,FindSymmetricSmallBraceToken(i,MyFocus),Complex);
                       break;
                   case"try":  //try�᭱�@�w��Block
                       i=MakeTry(ret,i,Level,FindSymmetricBigBraceToken(i,MyFocus),Complex);
                       break;                       
                   case"finally"://else��finally�欰�p�G��Catch_after_Try�N���@��
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
     * �B�zCase����r�MDefault����r
     * @param refRet            �n�g�J�Ǧ^������
     * @param NowPos            �{�b���r("case" or "default")����m
     * @param level             �{�b��Level
     * @param refComplex        �{�b���϶����|
     * @param what              �{�b�J�쪺�r�O"case" or "default"
     * @return                  �Ǧ^�_���Ҧb��m
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
                throw new NullPointerException("bad "+what+" without �_�� NowPos="+NowPos);
        }
    }
    /***
     * �B�z"if"����r�M"else if"����r
     * @param refRet                �n�g�J�Ǧ^������
     * @param NowPos                �{�b���r("if" or "else if")����m
     * @param level                 �{�b��Level
     * @param refComplex            �{�b���϶����|
     * @param what                  �{�b�J�쪺�r�O"if" or "else if"
     * @return                      �Ǧ^�ǳƤU�@�ӱ��y��m 
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
     * �B�z"switch"����r
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�b���r("switch")����m
     * @param level                         �{�b��Level
     * @param refComplex                    �{�b���϶����|
     * @return                              �Ǧ^�ǳƤU�@�ӱ��y��m 
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
     * �B�z"for"����r�M"while"����r
     * @param refRet                    �n�g�J�Ǧ^������
     * @param NowPos                    �{�b���r("for" or "while")����m
     * @param level                     �{�b��Level
     * @param refComplex                �{�b���϶����|
     * @param what                      �{�b���r("for" or "what
     * @return                          �Ǧ^�ǳƤU�@�ӱ��y��m 
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
                //�J��stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,Brace.getEnd()+1,level+1,refComplex);
        }        
    }
    /***
     * �������o�@�ӱԭz���d��
     * @param i                 �}�l�j�M��m
     * @return                  �Ǧ^�ԭz��FocusPair
     */
    public FocusPair GetStmt(int i) {
        int EndPos= SearchForTokenPos(i,";",MyFocus);
        return new FocusPair(i,EndPos);
    }
    /***
     * �Ǧ^�U�@��Focus���N��r��
     * @param i                 �}�l�j�M��m
     * @return                  �Ǧ^�r��
     */
    public String Next(int i) {
        if (i+1< MyFocus.size()) 
            return MyFocus.get(i+1).RetString;
        throw new NullPointerException("i="+i+"  i+1="+(i+1));
    }
    /***
     * ����M���٪��p�A��
     * @param i                 �}�l�j�M��m
     * @return                  �Ǧ^�p�A���d��
     */
    public FocusPair GetSmallBrace(int i) {
        return FindSymmetricSmallBraceToken(i, MyFocus);
    }
    /***
     * �B�z"catch"����r
     * @param refRet                    �n�g�J�Ǧ^������
     * @param NowPos                    �{�bcatch����m
     * @param level                     �{�b��Level
     * @param Brace                     catch�᭱���۪��p�A���d��
     * @param refComplex                �϶����|
     * @return                          �Ǧ^�ǳƤU�@�ӱ��y��m
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
     * �B�z"do"����r
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�bdo����m
     * @param level                         �{�b��Level
     * @param Block                         do�᭱���۪��j�A���d��
     * @param refComplex                    �϶����|
     * @return                              �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int MakeDo(StringBuffer refRet,int NowPos,int level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=NexLine+sHead+GetString(sLv,level)+"do";
        refRet.append(line);
        TextLevel newTL=new TextLevel("do",Block,level);
        refComplex.push(newTL);
        return NowPos;        
    }
    /***
     * �B�z"try"����r
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�btry����m
     * @param Level                         �{�b��Level
     * @param Block                         try�᭱���۪��j�A���d��
     * @param refComplex                    �϶����|
     * @return                              �Ǧ^�ǳƤU�@�ӱ��y��m
     */
    public int MakeTry(StringBuffer refRet,int NowPos,int Level,FocusPair Block,Stack<TextLevel> refComplex) {
        String line=sHead+GetString(sLv,Level)+"try";
        refRet.append(line);
        TextLevel newTL=new TextLevel("try",Block,Level);
        refComplex.push(newTL);
        return NowPos;
    }
    /***
     * �B�z"else"����r
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�belse����m
     * @param level                         �{�b��Level
     * @param refComplex                    �϶����|
     * @return                              �Ǧ^�ǳƤU�@�ӱ��y��m
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
                //�J��stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,NowPos+1,level+1,refComplex);
        }
    }
    /***
     *  �B�z"finally"����r
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�bfinally����m
     * @param level                         �{�b��Level
     * @param refComplex                    �϶����|
     * @return                              �Ǧ^�U�@�ӱ��y�ǳƦ�m
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
                //�J��stmt
                refRet.append(NexLine);
                return  MakeStatement(refRet,NowPos+1,level+1,refComplex);
        }
    }
    /***
     * 
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�b@����m
     * @param Level                         �{�b��Level
     * @return                              �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int MakeAttribute(StringBuffer refRet,int NowPos,final Integer Level) {        
        String line=sHead+GetString(sLv,Level)+"@"+MyFocus.get(NowPos+1).RetString+NexLine;
        refRet.append(line);
        return NowPos+1;
    }
    /***
     * 
     * @param refRet                        �n�g�J�Ǧ^������
     * @param StartPos                      �ԭz�}�l��m
     * @param Level                         �{�b��Level
     * @param refComplex                    �϶����|
     * @return                              �Ǧ^�U�@�ӱ��y�ǳƦ�m
     */
    public int MakeStatement(StringBuffer refRet,int StartPos,int Level,Stack<TextLevel> refComplex) {
        //FocusPair Limit=GetFuncBase(NowPos,refComplex).orElse(GetClassBase(NowPos,refComplex).get());  //������o�˶]����...
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
     * @param refRet                        �n�g�J�Ǧ^������
     * @param level                         �{�b��Level
     * @param f                             �ǤJ��FocusPair�d��,�o�ӽd��i��bClassArea�άOFuncHeaderArea
     * @param block                         class��function���j�A���d��
     * @param refComplex                    �϶����|
     * @param what                          ���"class"��"func"
     * @return                              �Ǧ^�U�@�ӱ��y�ǳƦ�m
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
     * @param refRet                        �n�g�J�Ǧ^������
     * @param level                         �{�b��Level
     * @param refComplex                    �϶����|
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
     * @param refRet                        �n�g�J�Ǧ^������
     * @param NowPos                        �{�b�k�j�A������m
     * @param Level                         �{�b��Level
     * @param refComplex                    �϶����|
     * @return                              �U�@�ӱ��y�ǳƦ�m
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
                   //�p�G�Y��do block���k�j�A��
                   FocusPair Brace=FindSymmetricSmallBraceToken(NowPos,MyFocus);
                   line=sHead+GetString(sLv,Level)+"} while"+ Brace.toString(MyFocus)+";"+NexLine;
                   refRet.append(line);
                   return Brace.getEnd()+1;
                   
                case"try":
                case"catch":
                    //�p�G�Y��try��catch���k�j�A��
                    line=sHead+GetString(sLv,Level)+"}";
                    refRet.append(line);
                    if (Catch_After_Try_Block==LineType.NEXT_LINE ) {
                        switch(Next(NowPos)) {  
                            case"catch": case"finally":
                            //�p�G�k�A�����᭱�򱵵۬Ocatch��finally
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
