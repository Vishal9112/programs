package HWORKpkg.Games;

import java.util.Scanner;

public class Outdoor {
    private String name2[] = new String[10], game2;
    private int n;
    
    public Outdoor(String n2 , String g2 ) {
    	n = 1;
    	name2[0] =new String(n2);
    	game2 = g2;
    	
    	
    }
    
    public Outdoor() {
    	accept();
    }
    
    public void accept() {
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter the game: ");
		game2= s.nextLine();
		
		System.out.println("enter the NO of  player");
		n = s.nextInt();
		s.nextLine();
		
		
		for(int i=0; i<n; i++) {
			name2[i]= new String ();

			System.out.println("enter the name of  player");
			name2[i]=s.nextLine();
			
		}

	}
    
    
    public void Display() {
    	
    	System.out.println("enter the game : "+game2);
    	
    	for( int i=0; i<n; i++) {
  		  System.out.println(name2[i]);
  		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
