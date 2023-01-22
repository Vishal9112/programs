/*Write a Java program to that accepts a file name from the user as a command line
argument and displays every alternate character of the file. Generate exceptions for
insufficient number of arguments and file not found.*/



package HWORKpkg;

import java.io.FileReader;

public class AlternateChar {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(args[0]);
		
		
		int ch,i=0;
		while((ch=fr.read())!=-1) {
			
			if(i%2==0)
			System.out.print((char)ch);
			i++;
		}
		

	}

}
