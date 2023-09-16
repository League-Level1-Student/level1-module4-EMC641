package _06_calculator;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.TextUI;

import _01_chuckle_clicker.chuckleClicker;

public class Calculator implements ActionListener{
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static JButton addButton = new JButton();
	static JButton subButton = new JButton();	
	static JButton mulButton = new JButton();
	static JButton divButton = new JButton();
	
	
	
	static int Answer = 0;
	public static void main(String[] args) {


		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		
		

		panel.add(label);
		frame.add(panel);
		JTextField text = new JTextField(16);
		JTextField text2 = new JTextField(16);
		if(text.equals(null)) {
			text.setText("");
		}
		if(text2.equals(null)) {
			text2.setText("");
		}
		String x = text.getText();
		String y = text2.getText();
		panel.add(text);
		panel.add(text2);

		frame.pack();

		
		
		new calc(). run();


		mulButton.setText("Multiply");	
		subButton.setText("Subtract");	
		divButton.setText("Divide");	
		addButton.setText("Add");	
		
		
		int param1 = Integer.parseInt(x);
		int param2 = Integer.parseInt(y);

		panel.add(addButton);
		panel.add(subButton);
		panel.add(mulButton);
		panel.add(divButton);

		label.setHorizontalAlignment(JLabel.CENTER);
		String save = String.valueOf(Answer);
		label.setText(save);
		

			
		
		
	}
	
	static void add(int x, int y) {
		Answer= x + y;
		
	}

	static void sub(int x, int y) {
		Answer= x - y;
	}

	static void multiply(int x, int y) {
		Answer= x * y;
	}

	static void divide(int x, int y) {
		Answer= x/y;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {


	}
}
