package HWORKpkg;


import HWORKpkg.Games.*;
public class GamesDisplay {

	public static void main(String[] args) {
		 
		Indoor i = new Indoor();
		Indoor p = new Indoor("mahesh","kabbdi");
		Outdoor o = new Outdoor();
		Outdoor d = new Outdoor("visahl", "cricket");
		
		
		//i.aceept();
		//o.accept();
		
		
		i.Display();
		p.Display();
		o.Display();
		d.Display();

	}

}
