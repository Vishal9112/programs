/*Write a Java program to create n objects of the Student class. Assign
roll numbers in the ascending order. Accept name and percentage from
the user for each object. Define a static method “sortStudent” which
sorts the array on the basis of percentage.*/




package HWORKpkg;

import java.util.Scanner;

public class SortingStudent {

	private static int count=1;
	private int Rollno;
	private String Name;
	private float per;
	
     public SortingStudent(String n,float p) {
    	 Rollno=count++;
    	 Name= n;
    	 per=p;
    	 
     }
     public  String toString() {
    	 return Rollno+"\t"+Name+"\t"+per;
    	 
     }
     public float getper() {
    	 return per;
     }

public class SortStd {
	public static void  SortStd(SortingStudent s[]){
		int n=s.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(s[j].getper() > s[j+1].getper()) {
					SortingStudent t = s[j];
					s[j] = s[j+1];
					s[j+1] = s[j];
					
				}
			}
		}
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no ofStudets1:");
		int n = input.nextInt();
		
		SortingStudent p[] = new SortingStudent[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name:");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.println("Enter percentage:");
			float per = input.nextFloat();
			
			p[i] = new SortingStudent (name,per);
		}
		
	SortStd(p);
	for (int i = 0; i < n; i++) {
		System.out.println(p[i]);
		
		
	}
	
	}

}
}
