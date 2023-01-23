/*Write a Java program to accept two file names as command line arguments. Copy only
those lines from the first file to the second which contains the word ''Computer''.*/



package HWORKpkg;

import java.io.*;
import java.util.Scanner;

public class CopyLinesFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				FileInputStream fr = new FileInputStream(args[0]);
				Scanner sc = new Scanner(fr);
		        FileWriter fw = new FileWriter(args[1]);
		
		String s = "Computer";
		String p ;
        
		while (sc.hasNextLine()) {
			p=sc.nextLine();
			if(p.indexOf(s)> -1) {
				fw.write(p);
			}
		}
		
		
		fw.close();
		
		System.out.println("file copeid Sucessfulyy");
		   }
	
	
		}
		
		

	


