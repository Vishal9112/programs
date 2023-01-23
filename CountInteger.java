
/*Write a Java program to find the sum of command line argument and count the invalid
integers entered through command line.
eg. $java myprog 8 2 8.2 6 4 4.8
Output:
Total numbers entered = 6
Invalid integers = 2
Sum of integers = 20*/



package HWORKpkg;

public class CountInteger {

	public static void main(String[] args) {
		 int i =0, s=0, j=0, n=args.length;
		 
		 for(int k=0; k<n; k++) {
			 try {
				 i = Integer.parseInt(args[k]);
				 s+=i;
			 }
			 catch(NumberFormatException e) {
				 j++;
			 }
			 
		 }
          System.out.println("Total numbered enter :"+n+"\ninvalid integer :"+j+"\nSum of integer :"+s);
	}

}
