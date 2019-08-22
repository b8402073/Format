package Personal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Main {

	// NO TEST
	public static String ToStr(Vector<Pair> inn) {
		StringBuffer ret = new StringBuffer();
		for (Pair p : inn) {
			ret.append("[" + p.getStart() + "," + p.getEnd() + "]");
		}
		return ret.toString();
	}

	// NO TEST
	public static String ToStr(Vector<Pair> inn, StringBuffer text) {
		StringBuffer ret = new StringBuffer();
		for (Pair p : inn) {
			ret.append("[" + p.getStart() + "," + p.getEnd() + "]=" + text.substring(p.getStart(), p.getEnd() + 1));
			ret.append("\n");
		}
		return ret.toString();
	}

	// NO TEST
	public static String ToStr(Pair p, StringBuffer text) {
		StringBuffer ret = new StringBuffer();
		ret.append("[" + p.getStart() + "," + p.getEnd() + "]=" + text.substring(p.getStart(), p.getEnd() + 1));
		return ret.toString();
	}

	public static Vector<Integer> CrLf = new Vector<Integer>();
	public static Vector<Pair> SQArea = new Vector<Pair>();
	public static Vector<Pair> DQArea = new Vector<Pair>();
	public static Vector<Pair> CommentArea = new Vector<Pair>();
	public static Vector<Integer> Left = new Vector<Integer>();
	public static Vector<Integer> Right = new Vector<Integer>();
	public static Vector<Integer> LeftOrRight = new Vector<Integer>();

	// NEED TEST
	// Needed Elements:  LeftOrRight,DQArea,SQArea,CommentArea
	// White testing is ok
	public static int InJSP(int pos, StringBuffer buf) {
		int t = 0;
		if (pos >= LeftOrRight.get(0)) {
			for (; t < LeftOrRight.size() - 1; t++) {				
				if (LeftOrRight.get(t) <= pos && pos < LeftOrRight.get(t + 1)) {					
					break;
				}
			}
			for (; t >= 0; t--) {
				int i = LeftOrRight.get(t);
				if (In(i, DQArea) || In(i, SQArea) || In(i, CommentArea))
					continue;
				String hand;
				if (buf.charAt(i) == '<')
					hand = buf.substring(i, i + 2);
				else // if (buf.charAt(i)=='>')
					hand = buf.substring(i - 1, i + 1);

				if (hand.equals("<%") || buf.charAt(pos)=='>')
					return 1; // if pos is in a <% %> then return 1
				else if (hand.equals("%>"))
					return 0; // if pos is in a <% %> pos <% %> then return 0				
			}
		}
		return (-1);
	}

	// NO TEST
	public static boolean In(Integer inn, Vector<Pair> that) {
		if (inn >= 0) {
			for (Pair p : that) {
				if (inn >= p.getStart() && inn <= p.getEnd())
					return true;
			}
		}
		return false;
	}
        
        public static boolean In(int inn, Vector<FocusPair> that) {
            if (inn>=0) {
                for (FocusPair p: that) {
                    if (inn>=p.getStart() && inn<=p.getEnd())
                        return true;
                }
            }
            return false;
        }
        
	/*
	 */
	// NEED TEST:
	/*
	 * Needed Elements: Left,Right,DQArea,SQArea,CommentArea
	 */
	public static Vector<JspElement> JSPFileString(StringBuffer inn) {
		Vector<JspElement> ret = new Vector<JspElement>();
		for (int L = 0, R = 0,ID=1; L < Left.size() && R < Right.size(); L++, R++,ID++) {
			if (L > 0) {
				while (Left.get(L) < Right.get(R - 1)) {
					L++;
				}
			}
			String hand = inn.substring(Left.get(L), Right.get(R) + 1);
			if (hand.startsWith("<%@") && hand.endsWith("%>")) {
				//old ret.add("jspimport:" + hand);
                                ret.add(new JspElement(ID,"jspimport",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<!--") && hand.endsWith("-->")) {
				//old ret.add("html_comment:" + hand);
                                ret.add(new JspElement(ID,"html_comment",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<%--") && hand.endsWith("--%>")) {
				//old ret.add("jsp_comment:" + hand);
                                ret.add(new JspElement(ID,"jsp_comment",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<%!") && hand.endsWith("%>")) {
				//old ret.add("jsp_static:" + hand);
                                ret.add(new JspElement(ID,"jsp_static",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<%=") && hand.endsWith("%>")) {
				//old ret.add("jsp_value:" + hand);
                                ret.add(new JspElement(ID,"jsp_value",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<%") && hand.endsWith("%>")) {
				//old ret.add("jsp_main:" + hand);
                                ret.add(new JspElement(ID,"jsp_main",new StringBuffer(hand)));
				continue;
			} else if (hand.startsWith("<") && hand.endsWith("/>")) {
				//old ret.add("html:" + hand);
                                ret.add(new JspElement(ID,"single_html",new StringBuffer(hand)));
				continue;
			}
			// if the code looks not symmetrical, take these steps:
			if (hand.startsWith("<%--")) {
				do {
					R++;
					hand = inn.substring(Left.get(L), Right.get(R) + 1);
				} while (!hand.endsWith("--%>") || In(R, DQArea) || In(R, SQArea) || In(R, CommentArea));
				//old ret.add("jsp_comment:" + hand);
                                ret.add(new JspElement(ID,"jsp_comment",new StringBuffer(hand)));
				continue;
			}
			/*
			 * 不知道未來要不要處理這種情形;因為有人可能會在裡面用三元運算子 if (hand.startsWith("<%=")) { do
			 * {
			 * 
			 * }while(!hand.endsWith(")) }
			 */
			if (hand.startsWith("<%")) {
				do {
					R++;
					hand = inn.substring(Left.get(L), Right.get(R) + 1);
                                        System.out.println("hand=");
                                        System.out.println(hand);
                                        if (R==Right.size()-1) {
                                            break;
                                        }
                                        /*
                                        if (R>=45) {
                                            System.out.println("hand.endsWith(%>)="+hand.endsWith("%>"));
                                            System.out.println("In(DQArea)="+In(R, DQArea));
                                            System.out.println("In(SQArea)="+In(R, SQArea));
                                            System.out.println("In(CommentArea)="+In(R, CommentArea));
                                        }
                                        */
                                        
                                        /***
                                         * 絕對不會被<%=ggyy%>所攔截而出錯
                                         * R=45卻沒有跳出來的原因是
                                         * 吃到後面的DQArea 
                                         * 講清楚一點...
                                         * 就是DQArea的判斷錯誤
                                         */
				} while  (!hand.endsWith("%>") || In(R, DQArea) || In(R, SQArea) || In(R, CommentArea));
				if (hand.startsWith("<%!")) {
					//old ret.add("jsp_static:" + hand);
                                        ret.add(new JspElement(ID,"jsp_static",new StringBuffer(hand)));
                                }
				else if (hand.startsWith("<%")) {
					//old ret.add("jsp_main:" + hand);
                                        ret.add(new JspElement(ID,"jsp_main",new StringBuffer(hand)));
                                }
				continue;
			}
			if (hand.startsWith("<")) {
				while (In(R, DQArea) || In(R, SQArea) || In(R, CommentArea)) {
					R++;
				}
				//old ret.add("html:" + hand);
                                ret.add(new JspElement(ID,"html",new StringBuffer(hand)));
				continue;
			}
			System.out.println("hand="+hand);
		}
		return ret;
	}

	// NEED TEST
	// Needed Elements: SQArea,DQArea,CommentArea,
	// White Test: ok
	public static void Fix_if_SQDQ_in_CommentArea(StringBuffer inn) {
		Vector<Integer> ALLSQ = new Vector<Integer>();
		for (Pair SQ : SQArea) {
			ALLSQ.add(SQ.getStart());
			ALLSQ.add(SQ.getEnd());
		}
		Vector<Integer> ALLDQ = new Vector<Integer>();
		for (Pair DQ : DQArea) {
			ALLDQ.add(DQ.getStart());
			ALLDQ.add(DQ.getEnd());
		}
		for (int t=CommentArea.size()-1; t>=0; t--) {
			Pair Comment=CommentArea.get(t);
			for (int i=ALLSQ.size()-1; i>=0; i--) {
				int that = ALLSQ.get(i);
				if (Comment.getStart() <= that && that <= Comment.getEnd())
					ALLSQ.removeElementAt(i);
			}
			for (int i =ALLDQ.size()-1; i>=0; i--) {
				int that = ALLDQ.get(i);
				if (Comment.getStart() <= that && that <= Comment.getEnd())
					ALLDQ.removeElementAt(i);
			}
		}
		if (ALLDQ.size() % 2 == 1) {
			System.out.println("ALLDQ=" + ALLDQ);
			throw new RuntimeException("DQ not paired");
		}
		if (ALLSQ.size() % 2 == 1) {
			System.out.println("ALLSQ=" + ALLSQ);
			throw new RuntimeException("SQ not paired");
		}
		DQArea.clear();
		SQArea.clear();
		for (int i = 0; i < ALLDQ.size(); i += 2) {
			DQArea.add(new Pair(ALLDQ.get(i), ALLDQ.get(i + 1)));
		}
		for (int i = 0; i < ALLSQ.size(); i += 2) {
			SQArea.add(new Pair(ALLSQ.get(i), ALLSQ.get(i + 1)));
		}
	}

	// NO TEST
	// OUT: Left,LeftOrRight,Right
	public static void Build_Left_and_Right(StringBuffer inn) {
		final int StringLength = inn.length();
		for (int i = 0; i < StringLength; i++) {
			if (inn.charAt(i) == '<') {
				Left.add(i);				
				LeftOrRight.add(i);
			} else if (inn.charAt(i) == '>') {
				Right.add(i);
				LeftOrRight.add(i);
			}
		}
	}

	// NEED TEST
	// Needed-Elements:None
	// Out: DQArea
	// White Testing OK
	public static void Build_DQ_Area(StringBuffer inn) {
		final int StringLength = inn.length();
		int startDQ = (-1);
		for (int i = 0; i < StringLength; i++) {
			if (inn.charAt(i) == '\"') {
				if (i >= 1 && inn.charAt(i - 1) == '\\')
					continue;
				if (startDQ >= 0 && i > startDQ) {
					DQArea.add(new Pair(startDQ, i));
					startDQ = (-1);
				} else
					startDQ = i;
			} else if (inn.charAt(i) == '\n') {
				startDQ = (-1);
			}
		}
	}

	// NEED TEST
	// Needed-Elements: DQArea
	// White Testing:ok
	public static void Build_SQ_Area(StringBuffer inn) {
		final int StringLength = inn.length();
		int startSQ = (-1);
		for (int i = 0; i < StringLength; i++) {
			if (inn.charAt(i) == '\'') {
				if (In(i, DQArea))
					continue;
				if (i >= 1 && inn.charAt(i - 1) == '\\')
					continue;
				if (startSQ >= 0 && i > startSQ) {
					SQArea.add(new Pair(startSQ, i));
					startSQ = (-1);
				} else
					startSQ = i;
			} else if (inn.charAt(i) == '\n') {
				startSQ = (-1);
			}
		}
	}

	// NEED TEST
	// Needed-Elements: DQArea,SQArea
	// OUT: CommentArea
	// White testing is ok
	public static void Build_Comment_Area(StringBuffer inn) {
		final int StringLength = inn.length();
		int start = (-1);
		for (int i = 0; i < StringLength - 2; i++) {
			String hand = inn.substring(i, i + 2);
			if (hand.equals("//")) {
				if (In(i, DQArea) || In(i, SQArea) || In(i, CommentArea))
					continue;
				start = i;
				if (InJSP(i, inn) == 1) {
					for (; i < StringLength ; i++) {
						if (inn.charAt(i) == '\n') {
							Pair p = new Pair(start, i);
							CommentArea.add(p);
							start = (-1);
							break;
						}
					}
				}else {
					start=(-1);
				}
			} else if (hand.equals("/*")) {
				if (In(i, DQArea) || In(i, SQArea) || In(i, CommentArea))
					continue;
				start = i;
				if (InJSP(i, inn) == 1) {
					for (; i < StringLength - 2; i++) {
						String hand2 = inn.substring(i, i + 2);
						if (hand2.equals("*/")) {
							Pair p = new Pair(start, i + 1);
							CommentArea.add(p);
							start = (-1);
							break;
						}
					}
				}else {
					start=(-1);
				}
			}
		}
		
		//這一段是多出來的,基本上不會執行到,因為在JSP內最後的符號是%>,已經佔兩個字了
//		if (start > 0) {
//			String hand2 = inn.substring(StringLength - 2);
//			int crlf = hand2.indexOf("\n");
//			int cmt2 = hand2.indexOf("*/");
//			if (hand2.contains("\n"))
//				CommentArea.add(new Pair(start, StringLength - 2 + crlf));
//			else if (hand2.contains("*/"))
//				CommentArea.add(new Pair(start, StringLength - 2 + cmt2));
//		}
//		
	
	}

	// NO TEST
	// OUT: CrLf
	public static void ReadFileIntoStringBuffer(String path, StringBuffer buf) throws Exception {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		int ch;
		int pos = 0;
		CrLf.add(pos);
		while ((ch = br.read()) != -1) {
			// System.out.println((char) ch);
			buf.append((char) ch);
			if (ch == 13) {
				CrLf.add(pos);
                    }
			pos++;
		}
		fr.close();
		br.close();
		//String that=buf.toString();
	}
	public static void refineStringBuffer(StringBuffer buf) {
		for (int i=buf.length()-1; i>=0; i--) {
			if (buf.charAt(i)=='\r')
				buf.deleteCharAt(i);
		}
	}
	//NO TEST
	public static void Fix_if_LeftRight_in_DQArea(StringBuffer buf) {
		for (int t=Left.size()-1; t>=0; t--) {
			for (Pair p: DQArea) {
				if (p.getStart()<= t && t<= p.getEnd())
					Left.removeElementAt(t);
			}
		}
		for (int t=Right.size()-1; t>=0; t--) {
			for (Pair p: DQArea) {
				if (p.getStart()<=t && t<= p.getEnd())
					Right.removeElementAt(t);
			}
		}
		for (int t=LeftOrRight.size()-1; t>=0; t--) {
			for (Pair p: DQArea) {
				if (p.getStart()<=t && t<= p.getEnd())
					LeftOrRight.removeElementAt(t);
			}
		}
	}
	// NO TEST
	public static void main(String[] args)  {
		StringBuffer buf = new StringBuffer(3000000);
		
		// FileReader fr=new FileReader("c:/test/aaa.jsp");
		// FileReader fr=new FileReader("c:/test/bbb.jsp");
		// FileReader fr=new FileReader("c:/test/ccc.jsp");
		// FileReader fr = new FileReader("c:/test/xxx.jsp");
		//                                "Black.jsp"
		try {
		//ReadFileIntoStringBuffer("c:/DB/ANN/CC1.jsp", buf);
                ReadFileIntoStringBuffer("c:/KKK.jsp", buf);
		refineStringBuffer(buf);   //把全部的\r\n都改成\n
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		Build_Left_and_Right(buf);
		Build_DQ_Area(buf);
                System.out.println(ToStr(DQArea,buf)); 
                System.out.println("DQArea.size()="+DQArea.size());
		Build_SQ_Area(buf);
		Build_Comment_Area(buf);
		Fix_if_SQDQ_in_CommentArea(buf);     //這裡有一點問題以致R-45時切element會出錯
                System.out.println("DQArea.size()="+DQArea.size());
		Fix_if_LeftRight_in_DQArea(buf);
                System.out.println("DQArea.size()="+DQArea.size());
		//Build_JavaScript_Area(buf);
		Vector<JspElement> ret = JSPFileString(buf);
                Vector<StringBuffer> jspmain=new Vector<StringBuffer>();
                for (JspElement X: ret) {
                    switch(X.Type) {
                        case"jsp_main":
                            jspmain.add(X.Txt); break;
                        default:
                    }
                }
                JspMain3 MyMain=new JspMain3(jspmain);
                System.out.println(MyMain.warning());
                MyMain.go();
                MyMain.setCatchType(JspStatic3.LineType.AFTER_LINE).setOtherType(JspStatic3.LineType.AFTER_LINE);
                MyMain.MainMake3();
                int main_index=0;
		for (int i=0; i<ret.size(); i++) {
                    JspElement that=ret.get(i);
                    String line;
                    switch(that.Type) {
                        case"jsp_static":
                            JspStatic3 obj=new JspStatic3(that.Txt);
                            System.out.println(obj.warning());
                            obj.go();
                            obj.setOtherType(JspStatic3.LineType.AFTER_LINE);
                            line=AssembleElement("<%!","%>",obj.Make3().toString());
                            System.out.println(line);
                            break;
                        case"jsp_main":
                            line=AssembleElement("<%","%>",MyMain.MyOutput[main_index++].toString());
                            System.out.println(line);
                            break;
                        case"html":
                            line=AssembleElement("<",">",that.Txt.toString());
                            System.out.println(line);
                            break;
                        case"jsp_import":
                            line=AssembleElement("<%@","%>",that.Txt.toString());
                            System.out.println(line);
                            break;
                        case"html_comment":
                            //line=AssembleElement("<!--","-->",that.Txt.toString());
                            line=AssembleElement("","",that.Txt.toString());
                            System.out.println(line);
                            break;
                        case"jsp_comment":
                            line=AssembleElement("<%--","--%>",that.Txt.toString());
                            System.out.println(line);
                            break;
                        case"jsp_value":
                            line=AssembleElement("<%=","%>",that.Txt.toString());
                            System.out.println(line);
                            break;
                        case"single_html":
                            line=AssembleElement("<"," />",that.Txt.toString());
                            System.out.println(line);
                            break;                            
                    }
                    /*
			if (that.startsWith("jsp_static:")) {
				StringBuffer that=new StringBuffer(str);                                
                                JspStatic3 obj3=new JspStatic3(that);
                                System.out.println(obj3.warning());
                                obj3.go();
				System.out.println("Next OutputText:");
                                System.out.println(obj3.setOtherType(JspStatic3.LineType.NEXT_LINE).Make3());
                                //System.out.println("After OutputText:");
                                //System.out.println(obj3.setOtherType(JspStatic3.LineType.AFTER_LINE).Make3());
				//System.out.println(obj.OutputText);
			}
                    */
                    
		}
		// System.out.println(ret);
	}
        public static String AssembleElement(String start,String end,String inn) {
            StringBuffer ret=new StringBuffer();
            ret.append(start+JspStatic3.NexLine);
            ret.append(inn);
            ret.append(JspStatic3.NexLine+end);
            return ret.toString();
        }
}
