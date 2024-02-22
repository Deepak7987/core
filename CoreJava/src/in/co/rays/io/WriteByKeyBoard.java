package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteByKeyBoard {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader inreader=new InputStreamReader(System.in);
		
		 BufferedReader bw=new BufferedReader(inreader);
		 
		 
		 PrintWriter pw=new PrintWriter("C:\\Users\\dell\\Desktop\\text\\keyboard.txt");
		 
		 String line=bw.readLine();
		 
		 while(!line.equals("bye")) {
			 
			 pw.println(line);
			 
			 line=bw.readLine();
			 
			 
			 
			 
			 
		 }
		 
		
		
	}

}
