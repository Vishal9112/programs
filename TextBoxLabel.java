
/*Write a program having a text box and a label. As the user types characters in the text box,
  simultaneously displays it in label. Window should exit when „X‟ is occurred.*/


package HWORKpkg;

import java.awt.*;
import javax. swing.*;
import java .awt.Event.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
public class TextBoxLabel extends JFrame {
	
	private Label lbluser;
	private TextField Txt1 ;
	
	
	public  TextBoxLabel() {
	lbluser = new Label("enter text");
	Txt1 = new TextField(50);
	
	//lbluser.setBounds(10,50,100,35);
	//Txt1.setBounds(120,95,200,110);
	
	setTitle("text box");
	setSize(300,300);
	setLocation(100,100);
	setLayout(new FlowLayout());
	add(lbluser);
	add(Txt1);
	setVisible(true);
	    
	
    Txt1.addTextListener(new TextListener(){
		  
    	public void textValueChanged(TextEvent e) {
    		String s= Txt1.getText();
    		lbluser.setText(s);
    		int n = (s.indexOf("x"));
    		if(n>-1 )System.exit(0);
    		
    	}
    	
	});
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextBoxLabel();
	}

}
