package exercises.week12.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.lang.foreign.AddressLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutExample extends JFrame {
	
	public static void main(String[] args) {
		new BorderLayoutExample();
	}

	public BorderLayoutExample() throws HeadlessException {
		setTitle("Layout Examples");
		setSize(300,300);
		setLayout(new BorderLayout(10,10));
		
		JButton b1=new JButton("Button1");
		JButton b2=new JButton("Button2");
		
		JButton b3=new JButton("Button3");
		JButton b4=new JButton("Button4");
		
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		JTextField t1=new JTextField("A");
		JTextField t2=new JTextField("B");
		JTextField t3=new JTextField("C");
		JTextField t4=new JTextField("D");
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		panel.add(t4);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new FlowLayout());
		JButton b10=new JButton("B1");
		JButton b11=new JButton("B1");
		JButton b12=new JButton("B1");
		JButton b13=new JButton("B1");
		JButton b14=new JButton("B1");
		JButton b15=new JButton("B1");
		panel2.add(b10);
		panel2.add(b11);
		panel2.add(b12);
		panel2.add(b13);
		panel2.add(b14);
		panel2.add(b15);
		add(panel2,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
}
