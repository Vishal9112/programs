/*Write a Java program to accept a string and an integer n as command line arguments and
display the first and last n characters of the str*/



package HWORKpkg;

import java.io.FileReader;

public class FindnChar {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader(args[0]);
		
		int ch,n=Integer.parseInt(args[1]);
		int i=1;
		while((ch=fr.read()) != -1) {
			
			if(i%n==0)
			System.out.print((char)ch);
			i++;
		}

	}

}
