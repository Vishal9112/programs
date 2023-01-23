package HWORKpkg.Games;

import java.util.Scanner;

public class Indoor {
	
	private String Name1[]=new String [10];
	private String Game1;//Game2;
	private int n;
	public Indoor(String n1,String g1) {
		n =1;
		Name1[0] = new String (n1);
		//Name2 = n2;
		Game1 = g1;
		//Game2 = g2;
	      
	}
  public Indoor () {
	  aceept();
  }
	
	public void aceept() {
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter the Game");
		Game1 = s.nextLine();
		
		
		System.out.println("eneter the no of player");
		n = s.nextInt();
		s.nextLine();
		
		for(int i=0; i<n; i++) {
			Name1[i]= new String ();

			System.out.println("enter the name of  player");
			Name1[i]=s.nextLine();
			
		}
		
		
		
		
		
	}
	
	public void Display() {
		System.out.println(" enter the Game:"+Game1);
		
		for( int i=0; i<n; i++) {
		  System.out.println(Name1[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
