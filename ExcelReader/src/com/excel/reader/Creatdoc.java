package com.excel.reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Creatdoc {
	
	
	public static void main(String[] args) throws IOException {
		
		XWPFDocument document =new  XWPFDocument();
		
		
			FileOutputStream out = new FileOutputStream("F:\\Screeshots\\createnew.doc");
			
			//crreate paragraph
			
			 XWPFParagraph paragraph = document.createParagraph();
		      XWPFRun run = paragraph.createRun();
		      run.setText("we strive hard to " +
		         "provide quality tutorials for self-learning " +
		         "purpose in the domains of Academics, Information " +
		         "Technology, Management and Computer Programming Languages.");

		      document.write(out);
		      out.close();
		      System.out.println("createparagraph.docx written successfully");
		   }
		}
			
		
		
	


