/*Design a screen in Java which contains a text box. If the left mouse button is clicked,
convert the text to uppercase and if the right mouse button is clicked, convert it to lower
case.*/




package HWORKpkg;

import java.awt.*;

import javax .swing.*;
import java.awt.event.*;
public class MouseClickAction extends JFrame{
	
	private JTextField txt1;
	
	public MouseClickAction () {
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
			String s = txt1.getText();
			if(e.getButton()==MouseEvent.BUTTON1) {
				txt1.setText(s.toUpperCase());
			}
			
			if(e.getButton()==MouseEvent.BUTTON3) {
				txt1.setText(s.toLowerCase());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new  MouseClickAction();
	}

}
