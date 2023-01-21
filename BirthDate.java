package HWORKpkg;
import java.io.*;
import java.util.Scanner;


class BirthDateException extends Exception{}
public class BirthDate {
	private int date,month,year;
	
	public BirthDate(int d, int m, int y) {
		
		date = d;
		month = m;
		year = y;
	}
	void display() {
		System.out.println(date+"/"+month+"/"+year);
	}


	public static void main(String[] args) {
		int d,m,y;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter date ,month and year");
	d= sc.nextInt();
	m= sc.nextInt();
	y=sc.nextInt();
	
	 
		try {
			switch(m)
			{
				case 4:
			    case 6:
		     	case 9:
				case 11:
					if (d>=1 && d<=30) {}
					else throw new BirthDateException();
					break;
					case 1:
					case 3:
					case 5:
					case 7:
				    case 8:
				    case 10:
				    case 12:
				    	
				    	if (d>=1 && d<=31) {}
				    
							else throw new BirthDateException();
				    	break;
				    	case 2:
				    		if ((y%4==0 && y%100!=0 || y%400==0))
				    		{
				    			if(d>=1 && d<=29) {}
				    				else throw new BirthDateException();
				    			break;
							}
							else
							{
								if(d>=1 && d<=28) {}
									else throw new BirthDateException();
								break ;
							}	
							default :
								 throw new BirthDateException();
			}BirthDate b = new BirthDate(d,m,y);
			b.display();
		}
		
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
