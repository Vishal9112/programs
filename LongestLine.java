
/*Write a java program which accepts a filename as command line argument and finds the
length of the longest line. Display error message if file does not exist.*/




package HWORKpkg;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;

public class LongestLine {

	public static void main(String[] args) throws Exception{
		try {
		FileInputStream fr = new FileInputStream(args[0]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fr));		
		String ch,str="";
		int max = -9999;
		while((ch=br.readLine())!= null) {
			if(ch.length()>max) {
				max=ch.length();
				str=ch;
			}
		}
	      System.out.println("the String with Maximum Length ="+str+"\nMaximum length is = "+max);
	}
		catch(FileNotFoundException e) {
			System.out.println("File does not exit");
			
			
			
		}
	}
}


