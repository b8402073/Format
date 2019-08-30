/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New20190730;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.lang.ProcessBuilder;
import javax.swing.SwingWorker;
import java.lang.String;


public class CmdLineWorker<String,Integer> extends SwingWorker {
	@Override
	protected void process(List chunks) {
		// TODO Auto-generated method stub
		super.process(chunks);
	}

	private final String[] Commands;
	public java.lang.String WorkDir="C:/Program Files (x86)/Google/Chrome/Application";
	public final StringBuffer   Results;
	public final boolean UpdateScreen;
	public CmdLineWorker(boolean updateScreen,String...  cmds) {
		Commands=cmds;
		Results=new StringBuffer();
		UpdateScreen=updateScreen;
	}
	public void setWorkDir(java.lang.String inn) {
		WorkDir=inn;
	}
	
	
	@Override
	protected String doInBackground() throws Exception {
		return cmd();
	}

	@Override
	protected void done() {
		// TODO Auto-generated method stub
		super.done();
	}

	public String cmd() throws Exception {
		Process p;
		java.lang.String cmd = "";
		//ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Tesseract-OCR\\tesseract.exe","--list-langs");
		java.lang.String[] arr=new java.lang.String[Commands.length];
		for (int i=0; i<Commands.length; i++) {
			arr[i]=(java.lang.String) Commands[i];
		}
		ProcessBuilder pb = new ProcessBuilder(arr);
		pb.directory(new File(WorkDir));
		//pb.directory(new File("C:\\Program Files\\Java\\jdk1.8.0_101\\bin\\"));
		Map<java.lang.String,java.lang.String> map = pb.environment();
		try {
			Process p1 = pb.start();
			java.lang.String line = "";
			BufferedReader p_in = new BufferedReader(new InputStreamReader(p1.getInputStream()));
			Thread.sleep(1000);
			while ((line = p_in.readLine()) != null) {
				System.out.println(line);
				Results.append(line+"\r\n");
			}
			p_in.close();			
		} catch (Exception ex) {
			ex.printStackTrace();
			Results.append(ex.getMessage());
		}
		finally {
			return (String) Results.toString();
		}
	}

}
