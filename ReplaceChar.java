
/*Write a Java program to accept a file name and a character as a command line arguments
and replace all occurrences of that character by *. Store the result in file ''output.txt''.*/

package HWORKpkg;

import java.io.*;
public class ReplaceChar {
	

	public static void main(String[] args) throws Exception  {
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter ("Output.txt");
		
		char ch =args[1].charAt(0);
		int c;
		while((c = fr.read()) != -1) {
		if(ch==(char)c)
			c = '*';
		
		fw.write((char)c);}
		fw.close();
		
		System.out.println("Replace Character Succsesfully....");

	}

}
