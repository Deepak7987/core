package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("C:\\Users\\dell\\Desktop\\text\\dhruv.jpg");
		
		FileOutputStream out=new FileOutputStream("C:\\Users\\dell\\Desktop\\Rays\\deep.jpg");
		
		int ch=in.read();
		
		while(ch!=-1) {
			
			out.write(ch);
			
			System.out.println((char)ch);
			
			ch=in.read();
			
			
			
		}
		
		//in.close();
		
		out.close();
		in.close();
		
		
	}

}
