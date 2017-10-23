/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Stack;
import java.util.Vector;


/**
 *
 * @author easterday
 */
public class JspMain3 extends JspStatic3{
    public StringBuffer[] MyOutput;
    public static final String NextElement="//<$$$JspMain.Next$$$>";
    public JspMain3(StringBuffer[] arrText) {  
        super();
        MyOutput=new StringBuffer[arrText.length];
        for (int i=0; i<arrText.length; i++)
            MyOutput[i]=new StringBuffer();
        MyText = GetMyMainText(arrText);
        init();
        Build_DQ_Area(MyText, DQArea);
        Build_SQ_Area(MyText, DQArea, SQArea);
        Build_Comment_Area(MyText, DQArea, SQArea, CommentArea);
        Fix_if_SQDQ_SLeft_SRight_SemiColon_in_CommentArea(MyText, SQArea, DQArea, CommentArea);        
        sHead="#####";
        sLv="   ";        
    }
    public JspMain3(Vector<StringBuffer> vecText) {
        this((StringBuffer[]) vecText.toArray());
    }
    
    public StringBuffer GetMyMainText(StringBuffer[] arrText) {
        StringBuffer ret=new StringBuffer();
        for (int i=0; i<arrText.length-1; i++) {
           int C1= arrText[i].indexOf("<%");
           int C2= arrText[i].lastIndexOf("%>");
           String that=arrText[i].substring(C1+2,C2);
           ret.append(that+"\n");
           ret.append(NextElement+"\n");
        }
        int c1=arrText[arrText.length-1].indexOf("<%");
        int c2=arrText[arrText.length-1].lastIndexOf("%>");
        String last=arrText[arrText.length-1].substring(c1+2,c2);
        ret.append(last);
        return ret;
    }
    public void MainMake3() {
        Stack<TextLevel> Complex=new Stack<TextLevel>();
        Stack<Pair> StackCommentArea=CopyCommentAreaIntoStackCommentArea(CommentArea);
        Complex.push(new TextLevel("func",FocusPair.MotherFocusPair,0));
        int OutputIndex=0;
        Integer Level=0;
        int i=0;
        Vector<Integer> Eye=new Vector<Integer>();
        Eye.add(-1);
        try {
           for (i=0; i<MyFocus.size(); i++)  {
               if (Eye.size()<=2) {
                   Eye.add(i);
               }
               if (Eye.size()>2)
                   Eye.removeElementAt(0);
               if (Eye.size()>=2) {
                   int sz=Eye.size();
                   FocusPair Range=new FocusPair(Eye.get(sz-2),Eye.get(sz-1));
                   Vector<Pair> comments=GetAllCommentFromStackCommentArea(Range,MyFocus,StackCommentArea);
                   for (Pair P: comments) {
                       String that= MyText.substring(P.getStart(), P.getEnd()+1);
                       if (that.startsWith(NextElement)) {
                           ++OutputIndex;
                       }else {
                           MyOutput[OutputIndex].append(TempToStr(P,Level));
                       }
                   }
               }
               FocusPair F = GetPair(i, ClassArea);
                if (F != null) {
                    i = Make_Class_Function_Area(MyOutput[OutputIndex], Level, F, FindSymmetricBigBraceToken(i, MyFocus), Complex, "class");
                    continue;
                }
                F = GetPair(i, FuncHeaderArea);
                if (F != null) {
                    i = Make_Class_Function_Area(MyOutput[OutputIndex], Level, F, FindSymmetricBigBraceToken(i, MyFocus), Complex, "func");
                    continue;
                }
                switch (MyFocus.get(i).getString()) {
                    case "{":
                        MakeLeftBigBrace(MyOutput[OutputIndex], Level, Complex);
                        Level++;
                        break;
                    case "}":
                        i = MakeRightBigBrace(MyOutput[OutputIndex], i, Level, Complex);
                        Level--;
                        break;
                    case "do": //do後面一定有Block
                        i = MakeDo(MyOutput[OutputIndex], i, Level, FindSymmetricBigBraceToken(i, MyFocus), Complex);
                        break;
                    case "for":
                        i = Make_For_While(MyOutput[OutputIndex], i, Level, Complex, "for");
                        break;
                    case "while":
                        i = Make_For_While(MyOutput[OutputIndex], i, Level, Complex, "while");
                        break;
                    case "if":
                        i = Make_If_ElseIf(MyOutput[OutputIndex], i, Level, Complex, "if");
                        break;
                    case "else if":
                        i = Make_If_ElseIf(MyOutput[OutputIndex], i, Level, Complex, "else if");
                        break;
                    case "else":  //else跟finally行為如果有Catch_after_Try就不一樣
                        i = i = Make_Else(MyOutput[OutputIndex], i, Level, Complex);
                        break;
                    case "catch":
                        i = MakeCatch(MyOutput[OutputIndex], i, Level, FindSymmetricSmallBraceToken(i, MyFocus), Complex);
                        break;
                    case "try":  //try後面一定有Block
                        i = MakeTry(MyOutput[OutputIndex], i, Level, FindSymmetricBigBraceToken(i, MyFocus), Complex);
                        break;
                    case "finally"://else跟finally行為如果有Catch_after_Try就不一樣
                        i = Make_Finally(MyOutput[OutputIndex], i, Level, Complex);
                        break;
                    case "@":
                        i = MakeAttribute(MyOutput[OutputIndex], i, Level);
                        break;
                    case "switch":
                        i = Make_Switch(MyOutput[OutputIndex], i, Level, Complex);
                        break;
                    case "case":
                        Level = Complex.peek().Level;
                        i = Make_Case_Default(MyOutput[OutputIndex], i, Level, Complex, "case");
                        Level++;
                        break;
                    case "default":
                        Level = Complex.peek().Level;
                        i = Make_Case_Default(MyOutput[OutputIndex], i, Level, Complex, "default");
                        Level++;
                        break;
                    case "synchronized":
                        if (InFunction(i, Complex)) {
                            i = Make_Synchronized(MyOutput[OutputIndex], i, Level, Complex);
                            break;
                        }
                        throw new NullPointerException("Keyword\"Synchronzied\" appears in no function...");
                    default:
                        i = MakeStatement(MyOutput[OutputIndex], i, Level, Complex);
                        break;
                }
           }
            while(!StackCommentArea.empty()) {
                Pair P=StackCommentArea.pop();
                //old code: ret.append(ToStr(P,MyText,Level));
                MyOutput[OutputIndex].append(TempToStr(P, Level));                                
            }           
        }catch(Exception ex) {
           ex.printStackTrace();
        }
    }
    
    
}
