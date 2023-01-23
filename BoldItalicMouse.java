/*Design a screen in Java which accepts text in a text box. Convert the text to bold if the left
mouse button is clicked and to italic if the right button is clicked.*/




package HWORKpkg;

import java.awt.*;
import javax .swing.*;
import java.awt.event.*;

public class BoldItalicMouse extends JFrame {

	
		private JTextField txt1;
		
		public BoldItalicMouse() {
			txt1 = new JTextField(50);
			
			
			setTitle("mouse click");
			setSize(300,300);
			setLocation(100,100);
			setLayout(new FlowLayout());
			add(txt1);
			setVisible(true);
			
			MouseHandler mh = new MouseHandler();
			txt1.addMouseListener(mh);
		}
		
		class MouseHandler extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				
				if(e.getButton()==MouseEvent.BUTTON1) {
					txt1.setFont(new Font("Arial",Font.BOLD,15));
				}
				
				if(e.getButton()==MouseEvent.BUTTON3) {
					txt1.setFont(new Font("Arial",Font.ITALIC,15));
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        new BoldItalicMouse();

	}

}
