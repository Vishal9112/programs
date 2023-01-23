
/*Write a Java program that inputs a person's name in the form of First Middle Last, and
then prints it in the form Last First M., where ''M.'' is the person's middle initial.*/



package HWORKpkg;

import java.util.*;

public class ChanegeNamePosition {
	Scanner sc = new Scanner (System.in);
	
	String n1,n2,n3;
	int n;
	void accept() {
	System.out.print("Enter the First Name ");
	n1=sc.next();
	
	System.out.print("Enter the Middle Name ");
	n2=sc.next();
	
	System.out.print("Enter the Last Name ");
	n3=sc.next();
	
	
	}
	
	void Display() {
		System.out.println("Last Name : " +n3);
		System.out.println("First Name :" +n1);
		System.out.println("Middle Name :" +n2.charAt(0)+".");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChanegeNamePosition p = new  ChanegeNamePosition();
		 
		 p.accept();
		 p.Display();

	}

}
