package HWORKpkg;

import java.io.*;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Eneter a String");
		
		String s = br.readLine();
		String[] m= s.split("\\s+");
		int n =m.length;
		System.out.println("Words in String " +n);
		
		Scanner sc = new Scanner (s);
		
		String [] r = new String[n];
		
		for (int i = 0; i < m.length; i++) {
			                                         //
			r[i] = new String();
			r[i] = sc.next();
			
			
		}
		System.out.print("reverse String :");
		for(int i = n-1; i>=0; i--) {
			System.out.print(r[i]+" ");
		}

	}

}
