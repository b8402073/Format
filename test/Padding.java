/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Personal.JspMain3;
import Personal.JspStatic3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ccn
 */
public class Padding {
    public static StringBuffer S;
    public static String Text="<%\n" +
"    dsjccom dsjccom=(dsjccom)session.getAttribute(\"_DSJCCOM\");\n" +
"\n" +
"    //PPAP�渹\n" +
"    String s_pano   = request.getParameter(\"pano\")==null ? \"\"  :request.getParameter(\"pano\");\n" +
"    String s_puthead= request.getParameter(\"puthead\")==null ? \"N\"  :request.getParameter(\"puthead\");        \n" +
"    try {    \n" +
"      //�إ߳s�u����\n" +
"      conBean = new conBean();\n" +
"      con = conBean.getConnection();           \n" +
"      dgjclpap dgjclpap=new dgjclpap(con);  //�ި�p���D��\n" +
"      simpleTime simpleTime=new simpleTime(); //�T�P�s�u�ɶ����            \n" +
"      if(dgjclpap.isExistSetData(s_pano))\n" +
"      {\n" +
"        PdfPTable TabTmp;       \n" +
"        //�ŧi�r��\n" +
"        BaseFont bfChinese = BaseFont.createFont(\"MHei-Medium\", \"UniCNS-UCS2-H\", BaseFont.NOT_EMBEDDED); \n" +
"        //�з���\n" +
"        //BaseFont bfChinese = BaseFont.createFont(\"C:\\\\winnt\\\\fonts\\\\KAIU.TTF\", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);      \n" +
"        Font FontChinese18 = new Font(bfChinese,18,Font.NORMAL);        \n" +
"        Font FontChinese16 = new Font(bfChinese,16,Font.NORMAL);        \n" +
"        Font FontChinese14 = new Font(bfChinese,14,Font.NORMAL);\n" +
"        Font FontChinese12 = new Font(bfChinese,12,Font.NORMAL); \n" +
"        Font FontChinese10 = new Font(bfChinese,10,Font.NORMAL);\n" +
"        Font FontChinese8 = new Font(bfChinese,8,Font.NORMAL);\n" +
"        Font FontChinese6 = new Font(bfChinese,6,Font.NORMAL);\n" +
"        //�]�w����\n" +
"        Font BfFontChinese18 = new Font(bfChinese,18,Font.BOLD);        \n" +
"        Font BfFontChinese16 = new Font(bfChinese,16,Font.BOLD);        \n" +
"        Font BfFontChinese14 = new Font(bfChinese,14,Font.BOLD);\n" +
"        Font BfFontChinese12 = new Font(bfChinese,12,Font.BOLD); \n" +
"        Font BfFontChinese10 = new Font(bfChinese,10,Font.BOLD);\n" +
"        Font BfFontChinese8 = new Font(bfChinese,8,Font.BOLD);\n" +
"        Font BfFontChinese6 = new Font(bfChinese,6,Font.BOLD);  \n" +
"        //�]�w�U���u�r��\n" +
"        Font UBfFontChinese8 = new Font(bfChinese,8,Font.NORMAL);        \n" +
"	UBfFontChinese8.setStyle(Font.UNDERLINE);\n" +
"\n" +
"        //���Y        \n" +
"        //�]�w�ܼƸ��                 \n" +
"        String s_imgfile =this.getServletContext().getRealPath(\"dg/images/ss1.gif\");\n" +
"        String s_qcsign  =this.getServletContext().getRealPath(\"dg/images/�\�Ӧ�.gif\");\n" +
"        String s_tcsign  =this.getServletContext().getRealPath(\"dg/images/���A��.gif\");    \n" +
"        String s_doon=\"\";\n" +
"        String s_verdate=\"\";\n" +
"        String s_signdate=\"\";\n" +
"        String s_sql=\"\";\n" +
"        SimpleDateFormat dateFormat = new SimpleDateFormat(\"MMM d, yyyy\", Locale.ENGLISH);\n" +
"        String s_ver=\"\";        \n" +
"        if(dgjclpap.get_doon().length()==8)\n" +
"        {\n" +
"          s_doon=dgjclpap.get_doon().substring(0,4)+\"/\"+dgjclpap.get_doon().substring(4,6)+\"/\"+dgjclpap.get_doon().substring(6,8);\n" +
"        }\n" +
"        if(dgjclpap.get_verdate().length()==8)\n" +
"        {\n" +
"          s_verdate=dgjclpap.get_verdate().substring(0,4)+\"/\"+dgjclpap.get_verdate().substring(4,6)+\"/\"+dgjclpap.get_verdate().substring(6,8);\n" +
"        }\n" +
"        if(!s_doon.equals(\"\"))\n" +
"        {\n" +
"          if(!s_verdate.equals(\"\"))\n" +
"            s_signdate=dateFormat.format(simpleTime.parseDate(s_verdate));\n" +
"          else\n" +
"            s_signdate=dateFormat.format(simpleTime.parseDate(s_doon));\n" +
"        }           \n" +
"        if(dgjclpap.get_verdate().length()==8) s_ver=dgjclpap.get_version().toString();\n" +
"        \n" +
"         \n" +
"        //�����T�{�H���^��W��\n" +
"        String s_conFirmName=\"\";\n" +
"        s_sql=\"SELECT EMPLENG FROM DB.TBDGRSWK WHERE EMPLNO='\"+dgjclpap.get_confirmby()+\"'\";\n" +
"        crs = new CachedRowSet();\n" +
"        crs.setCommand(s_sql);\n" +
"        crs.execute(this.con);\n" +
"        if(crs!=null && crs.next()) \n" +
"        {\n" +
"          s_conFirmName=crs.getString(\"EMPLENG\").trim();  \n" +
"        }  \n" +
"        \n" +
"        //<1>�C�L�T�P���Y���                 \n" +
"            \n" +
"        PdfPTable headTable = new PdfPTable(4);       \n" +
"        int headwidths[] = {7,13,12,68}; // percentage                                  \n" +
"        headTable.setWidths(headwidths);\n" +
"        headTable.setWidthPercentage(100); // percentage\n" +
"        headTable.getDefaultCell().setPadding(4);        \n" +
"        headTable.getDefaultCell().setBorderWidth(0);            \n" +
"        headTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);   //�m��       \n" +
"        java.io.File imgFile = new java.io.File(s_imgfile);\n" +
"        if(imgFile.exists())\n" +
"        {\n" +
"          Image img= Image.getInstance(s_imgfile);                      \n" +
"          img.setAlignment(Image.MIDDLE); \n" +
"          //document.add(img);  \n" +
"          headTable.addCell(img); \n" +
"        }else{\n" +
"          headTable.addCell(new Paragraph(\"No sanlogo.gif\",FontChinese12));                     \n" +
"        }\n" +
"\n" +
"        headTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);   //�m��               \n" +
"        headTable.addCell(new Paragraph(\"SAN SHING\",BfFontChinese16));             \n" +
"        headTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);   //�m��             \n" +
"        headTable.getDefaultCell().setPaddingTop(12);  \n" +
"        headTable.addCell(new Paragraph(\"FASTECH CORP.\",FontChinese10));  \n" +
"        headTable.getDefaultCell().setPaddingTop(3);          \n" +
"        headTable.addCell(new Paragraph(\"�s�{�y�{�� PROCESS FLOW CHART\",FontChinese16));       \n" +
"\n" +
"        PdfPTable headTable2 = new PdfPTable(3);             \n" +
"        headTable2.setWidths(new int[]{30,35,35});\n" +
"        headTable2.setWidthPercentage(100); // percentage\n" +
"        headTable2.getDefaultCell().setPadding(2);        \n" +
"        headTable2.getDefaultCell().setBorderWidth(0);            \n" +
"        headTable2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);   //�m��\n" +
"\n" +
"        headTable2.addCell(new Paragraph(\"�y�{�Ͻs�� Flow Diagram Number:\",FontChinese10));                                       \n" +
"        headTable2.addCell(new Paragraph(\"�s��s��/���� Part Number:\",FontChinese10));                                       \n" +
"        headTable2.addCell(new Paragraph(\"�s��W��/���� Part Description:\",FontChinese10));                                       \n" +
"\n" +
"        headTable2.addCell(new Paragraph(dgjclpap.get_code14()+\"-\"+dgjclpap.get_pano(),BfFontChinese10));                                               \n" +
"        headTable2.addCell(new Paragraph(dgjclpap.get_partno(),BfFontChinese10));                                               \n" +
"        headTable2.addCell(new Paragraph(dgjclpap.get_partdesc(),BfFontChinese10));                                               \n" +
"        \n" +
"        headTable2.addCell(new Paragraph(\"�䥦�{�i/���(�Y�ݭn) Other Approval/Date:(If Req'd)\",FontChinese10));          \n" +
"        headTable2.addCell(new Paragraph(\"�޳N�{�i/���(�Y�ݭn) Technical Approval/Date(If Req'd)\",FontChinese10));          \n" +
"        //���/����\n" +
"        TabTmp = new PdfPTable(2);       \n" +
"        TabTmp.setWidths(new int[]{60,40} );\n" +
"        TabTmp.setWidthPercentage(35); // percentage\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);    \n" +
"        TabTmp.addCell(new Paragraph(\"��� Date:\"+s_signdate,FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"���� Rev:\"+s_ver,FontChinese10));          \n" +
"        headTable2.addCell(TabTmp);                             \n" +
"        \n" +
"\n" +
"        headTable2.addCell(new Paragraph(\"\",FontChinese10));          \n" +
"        //�޳N�{�i���\n" +
"        TabTmp = new PdfPTable(2);       \n" +
"        TabTmp.setWidths(new int[]{70,30} );\n" +
"        TabTmp.setWidthPercentage(35); // percentage\n" +
"        TabTmp.getDefaultCell().setPadding(2);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);            \n" +
"        imgFile = new java.io.File(s_tcsign);                \n" +
"        if(imgFile.exists())\n" +
"        {          \n" +
"          Image img= Image.getInstance(s_tcsign); \n" +
"          img.scaleAbsolute(100,17);\n" +
"          img.setAlignment(com.lowagie.text.Image.MIDDLE);                     \n" +
"          PdfPCell cell = new PdfPCell(img);  \n" +
"          cell.setBorderWidth(0);  \n" +
"          cell.setPadding(4); \n" +
"          cell.setHorizontalAlignment(Element.ALIGN_CENTER);   //�m��     \n" +
"          TabTmp.addCell(cell);      \n" +
"        }else{\n" +
"          TabTmp.addCell(new Paragraph(\"�L��\",BfFontChinese10));                                  \n" +
"        }  \n" +
"        TabTmp.addCell(new Paragraph(s_signdate,BfFontChinese10));          \n" +
"        headTable2.addCell(TabTmp);                             \n" +
"\n" +
"        headTable2.addCell(new Paragraph(\"�s��� Prepared By:\"+s_conFirmName,FontChinese10));          \n" +
"\n" +
"        headTable2.addCell(new Paragraph(\"\",FontChinese10));          \n" +
"        headTable2.addCell(new Paragraph(\"\",FontChinese10));          \n" +
"        headTable2.addCell(new Paragraph(\"\",FontChinese10));          \n" +
"        \n" +
"        //*********************************************************************************\n" +
"        //���Y���\n" +
"        PdfPTable headTable3 = new PdfPTable(9);             \n" +
"        int headwidths3[] = {4,17,7,22,5,5,18,4,18}; // percentage                           \n" +
"        headTable3.setWidths(headwidths3);\n" +
"        headTable3.setWidthPercentage(100); // percentage\n" +
"        headTable3.getDefaultCell().setPadding(2);        \n" +
"        headTable3.getDefaultCell().setBorderWidth(1f);            \n" +
"        headTable3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);   //�m��\n" +
"        \n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        //TabTmp.setWidthPercentage(4); // percentage\n" +
"        TabTmp.getDefaultCell().setPadding(2);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Step\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"�B�J\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"        \n" +
"        TabTmp = new PdfPTable(4);       \n" +
"        TabTmp.setWidths(new float[]{24.5f,24.5f,24.5f,26.5f} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);    \n" +
"        \n" +
"        PdfPTable TabTmp2 = new PdfPTable(1); \n" +
"        TabTmp2.setWidths(new int[]{100} );\n" +
"        TabTmp2.getDefaultCell().setPadding(2);        \n" +
"        TabTmp2.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);            \n" +
"        TabTmp2.addCell(new Paragraph(\"Fab.\",FontChinese10));          \n" +
"        TabTmp2.addCell(new Paragraph(\"�x��\",FontChinese10));          \n" +
"        TabTmp.addCell(TabTmp2); \n" +
"        \n" +
"        TabTmp2 = new PdfPTable(1); \n" +
"        TabTmp2.setWidths(new int[]{100} );\n" +
"        TabTmp2.getDefaultCell().setPadding(2);        \n" +
"        TabTmp2.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);                    \n" +
"        TabTmp2.addCell(new Paragraph(\"Move\",FontChinese10));          \n" +
"        TabTmp2.addCell(new Paragraph(\"�h�B\",FontChinese10));          \n" +
"        TabTmp.addCell(TabTmp2); \n" +
"        \n" +
"        TabTmp2 = new PdfPTable(1); \n" +
"        TabTmp2.setWidths(new int[]{100} );\n" +
"        TabTmp2.getDefaultCell().setPadding(2);        \n" +
"        TabTmp2.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);                            \n" +
"        TabTmp2.addCell(new Paragraph(\"Store\",FontChinese10));          \n" +
"        TabTmp2.addCell(new Paragraph(\"�x�s\",FontChinese10));          \n" +
"        TabTmp.addCell(TabTmp2); \n" +
"        \n" +
"        TabTmp2 = new PdfPTable(1); \n" +
"        TabTmp2.setWidths(new int[]{100} );\n" +
"        TabTmp2.getDefaultCell().setPadding(2);        \n" +
"        TabTmp2.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);                            \n" +
"        TabTmp2.addCell(new Paragraph(\"Inspect\",FontChinese10));          \n" +
"        TabTmp2.addCell(new Paragraph(\"�ˬd\",FontChinese10));          \n" +
"        TabTmp.addCell(TabTmp2);                 \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Number\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"�s�{�s��\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Operation Description\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"�ާ@����\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"CLS\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"����\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Item\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"����\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Key Product Characteristics\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"�D�n���~�S��\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Item\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"����\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"\n" +
"\n" +
"        TabTmp = new PdfPTable(1);       \n" +
"        TabTmp.setWidths(new int[]{100} );\n" +
"        TabTmp.getDefaultCell().setPadding(0);        \n" +
"        TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"        TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"        TabTmp.addCell(new Paragraph(\"Key Control Characteristics\",FontChinese10));          \n" +
"        TabTmp.addCell(new Paragraph(\"�D�n����S��\",FontChinese10));          \n" +
"        headTable3.addCell(TabTmp);                             \n" +
"        \n" +
"        //**********************************************************************************\n" +
"        \n" +
"       \n" +
"        \n" +
"        //��L\n" +
"        document = new Document(PageSize.A4.rotate(),5,5,10,10);             \n" +
"        ByteArrayOutputStream buffer = new ByteArrayOutputStream();\n" +
"        PdfWriter myPdfWriter = PdfWriter.getInstance(document,buffer);      //�ק惡�� \n" +
"\n" +
"        \n" +
"        PdfPTable HeadTmp = new PdfPTable(1);       \n" +
"        int HeadTmp_widths[] = {100}; // percentage                                  \n" +
"        HeadTmp.setWidths(HeadTmp_widths);        \n" +
"        HeadTmp.setWidthPercentage(100); // percentage\n" +
"        HeadTmp.getDefaultCell().setPadding(0);        \n" +
"        HeadTmp.getDefaultCell().setBorderWidth(0); \n" +
"        HeadTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);   //�m��                        \n" +
"        HeadTmp.addCell(headTable);                  \n" +
"        HeadTmp.addCell(headTable2);\n" +
"        HeadTmp.addCell(headTable3);\n" +
"        \n" +
"        PdfPTable FootTmp = new PdfPTable(1);       \n" +
"        int FootTmp_widths[] = {100}; // percentage                                  \n" +
"        FootTmp.setWidths(FootTmp_widths);        \n" +
"        FootTmp.setWidthPercentage(100); // percentage\n" +
"        FootTmp.getDefaultCell().setBorderWidth(0);           \n" +
"        FootTmp.getDefaultCell().setPadding(6);     \n" +
"        FootTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);   //�m��                        \n" +
"        FootTmp.addCell(new Paragraph(\"\",FontChinese8));          \n" +
"\n" +
"        \n" +
"        pageHead pageHead=new pageHead(document);                       \n" +
"        pageHead.initFont();          \n" +
"	pageHead.setHeader(HeadTmp);          \n" +
"	pageHead.setFooter(FootTmp);\n" +
"	pageHead.setMargin(10.0f,10.0f);\n" +
"	pageHead.f_total_x=(-10.0f);\n" +
"	pageHead.f_total_y=(0.0f);\n" +
"	myPdfWriter.setPageEvent(pageHead);                        \n" +
"\n" +
"          \n" +
"        document.open();  \n" +
"        \n" +
"        //�C�L���        \n" +
"        PdfPTable DataTable = new PdfPTable(9); \n" +
"        DataTable.setWidths(headwidths3);        \n" +
"        DataTable.setWidthPercentage(100); // percentage\n" +
"        DataTable.getDefaultCell().setPadding(2);        \n" +
"        DataTable.getDefaultCell().setBorderWidth(0.5f); \n" +
"        DataTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);   //�m��                        \n" +
"        DataTable.setSplitLate(false);   \n" +
"        //�������\n" +
"        s_sql=\"SELECT * FROM DB.TBDGDPFW WHERE PANO='\"+dgjclpap.get_pano()+\"' ORDER BY SEQ\";\n" +
"        s_sql=\"SELECT DPFW.*\"+\n" +
"              \",COALESCE(MFLN.PFCOPER,'')AS PFCOPER\"+\n" +
"              \",COALESCE(MFLN.PFCCONT,'')AS PFCCONT\"+\n" +
"              \",COALESCE(MFLN.PFCRELA,'')AS PFCRELA\"+\n" +
"              \",COALESCE(MFLN.PFCSTEP1,'')AS PFCSTEP1\"+\n" +
"              \",COALESCE(MFLN.PFCSTEP2,'')AS PFCSTEP2\"+              \n" +
"              \" FROM(\"+s_sql+\")AS DPFW\"+\n" +
"              \" LEFT OUTER JOIN DB.TBDGMFLN MFLN ON (DPFW.FLOWNO=MFLN.FLOWNO)\"+\n" +
"              \" ORDER BY DPFW.SEQ\";              \n" +
"              \n" +
"        //out.println(s_sql);      \n" +
"        CachedRowSet crsDpfw = new CachedRowSet();\n" +
"        crsDpfw.setCommand(s_sql);\n" +
"        crsDpfw.execute(this.con);\n" +
"        int i_step=0; \n" +
"        if(crsDpfw!=null && crsDpfw.size()>0)\n" +
"        {\n" +
"          //�ŧi�ܼ�\n" +
"          String s_fab=\"\";\n" +
"          String s_move=\"\";\n" +
"          String s_store=\"\";\n" +
"          String s_inspect=\"\";\n" +
"          String s_pfcoper=\"\";\n" +
"          String s_splev=\"\";\n" +
"          String s_pfccont=\"\";\n" +
"          String s_pfcrela=\"\";\n" +
"          \n" +
"          while(crsDpfw.next())\n" +
"          {\n" +
"          \n" +
"            ///////////////////////////////////////////////////////////////////////////////\n" +
"            //�y�{���~����\n" +
"            s_pfcrela=crsDpfw.getString(\"PFCRELA\");\n" +
"            if(!s_pfcrela.equals(\"\"))\n" +
"            {\n" +
"              DataTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);             \n" +
"              i_step+=1;\n" +
"              DataTable.addCell(new Paragraph(Integer.toString(i_step),FontChinese10));                                                                      \n" +
"              \n" +
"              TabTmp = new PdfPTable(4);       \n" +
"              TabTmp.setWidths(new float[]{24.5f,24.5f,24.5f,26.5f} );\n" +
"              TabTmp.getDefaultCell().setPadding(2);        \n" +
"              TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"              TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"              \n" +
"              TabTmp.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              TabTmp.addCell(new Paragraph(\"��\",FontChinese10));                                                                      \n" +
"              TabTmp.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              TabTmp.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              DataTable.addCell(TabTmp);  \n" +
"            \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              \n" +
"              TabTmp = new PdfPTable(1);       \n" +
"              TabTmp.setWidths(new int[]{100} );\n" +
"              TabTmp.getDefaultCell().setPadding(4);        \n" +
"              TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"              TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);    \n" +
"              String s_str=\"\";\n" +
"              for(int i=0;i<s_pfcrela.length();i++)\n" +
"              {\n" +
"                if(s_pfcrela.substring(i,i+1).equals(\"\\n\"))\n" +
"                {\n" +
"                  TabTmp.addCell(new Paragraph(s_str,FontChinese10)); \n" +
"                  s_str=\"\";                                                           \n" +
"                }else{\n" +
"                  s_str+=s_pfcrela.substring(i,i+1);            \n" +
"                }                            \n" +
"              }//end for\n" +
"              TabTmp.addCell(new Paragraph(s_str,FontChinese10));\n" +
"              DataTable.addCell(TabTmp);           \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"              DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"                                  \n" +
"            }//end if(!s_pfcoper.equals(\"\"))\n" +
"            ////////////////////////////////////////////////////////////////////////\n" +
"          \n" +
"            //�����s�{�˶��ɸ��\n" +
"            if(s_puthead.equals(\"N\"))\n" +
"            {\n" +
"              s_sql=\"SELECT DPTM.*,(CASE WHEN DPTM.POS!='' THEN DPTM.POS ELSE '99' END )AS SORT FROM DB.TBDGDPTM DPTM WHERE PANO='\"+dgjclpap.get_pano()+\"' AND FLOWSEQ=\"+crsDpfw.getString(\"SEQ\")+\" AND ITEMNO NOT IN('0000')\";\n" +
"              s_sql=\"SELECT TEMP.* FROM(\"+s_sql+\")AS TEMP ORDER BY INT(TEMP.SORT),TEMP.SEQ\";\n" +
"            }else{\n" +
"              s_sql=\"SELECT DPTM.*,(CASE WHEN DPTM.POS!='' THEN DPTM.POS ELSE 'ZZ' END )AS SORT FROM DB.TBDGDPTM DPTM WHERE PANO='\"+dgjclpap.get_pano()+\"' AND FLOWSEQ=\"+crsDpfw.getString(\"SEQ\")+\" AND ITEMNO NOT IN('0000')\";\n" +
"              s_sql=\"SELECT TEMP.* FROM(\"+s_sql+\")AS TEMP ORDER BY TEMP.SORT,TEMP.SEQ\";             \n" +
"            }             \n" +
"            CachedRowSet crsDptm = new CachedRowSet();\n" +
"            crsDptm.setCommand(s_sql);\n" +
"            crsDptm.execute(con);\n" +
"                      \n" +
"            i_step+=1;\n" +
"            DataTable.addCell(new Paragraph(Integer.toString(i_step),FontChinese10));                                                                      \n" +
"            //�x�� �h�B �x�s �ˬd\n" +
"            s_fab=\"\";\n" +
"            s_move=\"\";\n" +
"            s_store=\"\";\n" +
"            s_inspect=\"\";\n" +
"                        \n" +
"            TabTmp = new PdfPTable(4);       \n" +
"            TabTmp.setWidths(new float[]{24.5f,24.5f,24.5f,26.5f} );\n" +
"            TabTmp.getDefaultCell().setPadding(2);        \n" +
"            TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"            TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"            \n" +
"            if(crsDpfw.getString(\"PFCSTEP1\").equals(\"1\"))\n" +
"            {\n" +
"              s_fab=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP1\").equals(\"2\")){\n" +
"              s_move=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP1\").equals(\"3\")){\n" +
"              s_store=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP1\").equals(\"4\")){\n" +
"              s_inspect=\"��\";\n" +
"            }\n" +
"\n" +
"            if(crsDpfw.getString(\"PFCSTEP2\").equals(\"1\"))\n" +
"            {\n" +
"              s_fab=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP2\").equals(\"2\")){\n" +
"              s_move=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP2\").equals(\"3\")){\n" +
"              s_store=\"��\";\n" +
"            }else if(crsDpfw.getString(\"PFCSTEP2\").equals(\"4\")){\n" +
"              s_inspect=\"��\";\n" +
"            }\n" +
"            \n" +
"           TabTmp.addCell(new Paragraph(s_fab,BfFontChinese10));          \n" +
"           TabTmp.addCell(new Paragraph(s_move,BfFontChinese10));          \n" +
"           TabTmp.addCell(new Paragraph(s_store,BfFontChinese10));          \n" +
"           TabTmp.addCell(new Paragraph(s_inspect,BfFontChinese10));          \n" +
"           DataTable.addCell(TabTmp);                                        \n" +
"           DataTable.addCell(new Paragraph(crsDpfw.getString(\"FLOWNO\"),FontChinese10));                                                                      \n" +
"           DataTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);                          \n" +
"           //�ާ@����\n" +
"           ///////////////////////////////////////////////////////////////////////////\n" +
"           TabTmp = new PdfPTable(1);       \n" +
"           TabTmp.setWidths(new int[]{100} );\n" +
"           TabTmp.getDefaultCell().setPadding(4);        \n" +
"           TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"           TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);    \n" +
"           s_pfcoper=crsDpfw.getString(\"PFCOPER\");\n" +
"           if(!s_pfcoper.equals(\"\"))\n" +
"           {\n" +
"             String s_str=\"\";\n" +
"             for(int i=0;i<s_pfcoper.length();i++)\n" +
"             {\n" +
"               if(s_pfcoper.substring(i,i+1).equals(\"\\n\"))\n" +
"               {\n" +
"                 TabTmp.addCell(new Paragraph(s_str,FontChinese10)); \n" +
"                 s_str=\"\";                                                           \n" +
"               }else{\n" +
"                 s_str+=s_pfcoper.substring(i,i+1);            \n" +
"               }                            \n" +
"             }//end for\n" +
"             TabTmp.addCell(new Paragraph(s_str,FontChinese10));\n" +
"             DataTable.addCell(TabTmp);           \n" +
"           }else{\n" +
"             DataTable.addCell(new Paragraph(\"\",FontChinese10));                                             \n" +
"           }                      \n" +
"           ///////////////////////////////////////////////////////////////////////////   \n" +
"           //CLS�����A�����A�D�n���~�S��\n" +
"           if(crsDptm.size()!=0)\n" +
"           {\n" +
"             DataTable.getDefaultCell().setColspan(3);\n" +
"             DataTable.getDefaultCell().setPadding(0);                     \n" +
"             DataTable.getDefaultCell().setBorderWidth(0); \n" +
"                                                   \n" +
"             TabTmp = new PdfPTable(3);       \n" +
"             TabTmp.setWidths(new int[]{5,5,18});\n" +
"             TabTmp.setWidthPercentage(28); // percentage             \n" +
"             TabTmp.getDefaultCell().setPadding(2);        \n" +
"             TabTmp.getDefaultCell().setBorderWidth(0);   \n" +
"             TabTmp.getDefaultCell().setBorderWidthRight(0.5f);        \n" +
"             //TabTmp.getDefaultCell().setBorderWidthLeft(0.5f);  \n" +
"             TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);    \n" +
"             while(crsDptm.next())\n" +
"             {\n" +
"               s_splev =crsDptm.getString(\"SPLEV\");               \n" +
"               if(s_splev.equals(\"1\"))\n" +
"               {\n" +
"                 s_splev=\"��\";\n" +
"               }else if(s_splev.equals(\"2\")){\n" +
"                 s_splev=\"��\";\n" +
"               }else if(s_splev.equals(\"3\")){\n" +
"                 s_splev=\"��\"; \n" +
"               }else if(s_splev.equals(\"4\")){\n" +
"                 s_splev=\"��\";\n" +
"               }else if(s_splev.equals(\"5\")){\n" +
"                 s_splev=\"��\";\n" +
"               }else if(s_splev.equals(\"6\")){\n" +
"                 s_splev=\"��\";\n" +
"               }else if(s_splev.equals(\"7\")){\n" +
"                 s_splev=\"��\";\n" +
"               }\n" +
"               PdfPTable TabTmpSpec = new PdfPTable(1);       \n" +
"               TabTmpSpec.setWidths(new int[]{100} );\n" +
"               TabTmpSpec.getDefaultCell().setPadding(2);        \n" +
"               TabTmpSpec.getDefaultCell().setBorderWidth(0);         \n" +
"               \n" +
"               TabTmpSpec.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);                 \n" +
"               TabTmpSpec.addCell(new Paragraph(crsDptm.getString(\"ITEMENG\"),FontChinese10));                                         \n" +
"               TabTmpSpec.addCell(new Paragraph(crsDptm.getString(\"ITEMCHI\"),FontChinese10));                                         \n" +
"                                             \n" +
"                                             \n" +
"               TabTmp.addCell(new Paragraph(s_splev,BfFontChinese10));             \n" +
"               TabTmp.addCell(new Paragraph(crsDptm.getString(\"POS\"),FontChinese10));                                                        \n" +
"               TabTmp.addCell(TabTmpSpec);       \n" +
"\n" +
"             }//end while\n" +
"             DataTable.getDefaultCell().setBorderWidth(0.5f); \n" +
"             DataTable.addCell(TabTmp);                                   \n" +
"             DataTable.getDefaultCell().setColspan(1);\n" +
"             DataTable.getDefaultCell().setPadding(2);                     \n" +
"             DataTable.getDefaultCell().setBorderWidth(0.5f);            \n" +
"                                                                                \n" +
"           }else{\n" +
"             DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                                            \n" +
"             DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                                            \n" +
"             DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                                                         \n" +
"           }\n" +
"           /////////////////////////////////////////////////////////////////////////////                                                                   \n" +
"           \n" +
"           DataTable.addCell(new Paragraph(\"\",FontChinese10));                                                                      \n" +
"           //////////////////////////////////////////////////////////////////////////////\n" +
"           //�D�n����S��  \n" +
"           TabTmp = new PdfPTable(1);       \n" +
"           TabTmp.setWidths(new int[]{100} );\n" +
"           TabTmp.getDefaultCell().setPadding(4);        \n" +
"           TabTmp.getDefaultCell().setBorderWidth(0);         \n" +
"           TabTmp.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);    \n" +
"           s_pfccont=crsDpfw.getString(\"PFCCONT\");\n" +
"           if(!s_pfccont.equals(\"\"))\n" +
"           {\n" +
"             String s_str=\"\";\n" +
"             for(int i=0;i<s_pfccont.length();i++)\n" +
"             {\n" +
"               if(s_pfccont.substring(i,i+1).equals(\"\\n\"))\n" +
"               {\n" +
"                 TabTmp.addCell(new Paragraph(s_str,FontChinese10)); \n" +
"                 s_str=\"\";                                                           \n" +
"               }else{\n" +
"                 s_str+=s_pfccont.substring(i,i+1);            \n" +
"               }                            \n" +
"             }//end for\n" +
"             TabTmp.addCell(new Paragraph(s_str,FontChinese10));\n" +
"             DataTable.addCell(TabTmp);           \n" +
"           }else{\n" +
"             DataTable.addCell(new Paragraph(\"\",FontChinese8));            \n" +
"           }\n" +
"           DataTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);                                               \n" +
"          }//end while                \n" +
"        }//end if(crsDpfw!=null && crsDpfw.size()>0)\n" +
"        document.add(DataTable);\n" +
"        document.close();        \n" +
"        byte[] bs =buffer.toByteArray();  \n" +
"        response.reset();                     \n" +
"        response.setContentType( \"application/pdf\" );      \n" +
"        OutputStream outs = response.getOutputStream(); \n" +
"        outs.write(bs);\n" +
"        outs.flush();           \n" +
"                                                    \n" +
"      }else{      \n" +
"        out.println(\"�d�L�ި�p�����:\"+s_pano+\"���\");                        \n" +
"      }\n" +
"    } catch(Exception e) {\n" +
"      out.println(e);          \n" +
"    }\n" +
"    finally\n" +
"    {\n" +
"       try{ \n" +
"         con.close();       \n" +
"       } catch(Exception e) \n" +
"       { \n" +
"         out.println(\"������Ʈw����\"+e); \n" +
"       } \n" +
"    }            \n" +
"    \n" +
"%>";
    public Padding() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        S=new StringBuffer(Padding.Text);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {        
        StringBuffer[] sArr=new StringBuffer[1];
        sArr[0]=S;
        JspMain3 obj=new JspMain3(sArr);
        assertTrue(obj.warning().equals(""));
        obj.go();
        obj.setOtherType(JspStatic3.LineType.NEXT_LINE);
        //System.out.println(obj.Make3().toString().trim());
        StringBuffer ret=obj.Make3();
        String that=obj.Make3().toString();
        System.out.println(that);
        System.out.println(obj.CollectVariableAboutWhat("PdfPTable"));
        System.out.println(obj.CollectVariableAboutWhat("PdfPCell"));
        System.out.println(obj.CollectVariableAboutSetPadding());
    }
}
