package _01_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

		/*
		 *    Copyright (c) The League of Amazing Programmers 2013-2021
		 *    Level 1
		 */

		import java.awt.Dimension;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JPanel;

		public class chuckleClicker implements ActionListener {

			JButton leftButton = new JButton();
			JButton rightButton = new JButton();

			Dimension BIG = new Dimension(400, 400);
			Dimension SMALL = new Dimension(200, 200);

			JFrame frame = new JFrame();
			JPanel panel = new JPanel();

			public void run() {

				
				frame.add(panel);
				
				frame.setVisible(true);
			    leftButton.setText("Joke");	
				
				rightButton.setText("Punchline");
				
				leftButton.addActionListener(this);
				
				rightButton.addActionListener(this);
			
				panel.add(leftButton);
			
				panel.add(rightButton);
				
				frame.pack();
			
				frame.setTitle("Chuckles Clicker");
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JButton buttonPressed = (JButton) arg0.getSource();

				

				if(buttonPressed==leftButton) {
					setTextSize(100);
					leftButton.setText("Hi");
					JOptionPane.showMessageDialog(null, "Why wasn't the pencil sharp? Becuase it was dull");
				}
				
				if(buttonPressed==rightButton) {
					setTextSize(100);
					rightButton.setText("Hi");
					JOptionPane.showMessageDialog( null, "Why did you press punchline?");
				}
				
				

				frame.pack();
			}

			private void setTextSize(int i) {
				// TODO Auto-generated method stub
				
			}
		}