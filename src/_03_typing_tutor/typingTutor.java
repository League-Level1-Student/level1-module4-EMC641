package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class typingTutor implements KeyListener {
	
		public static void main(String[] args){
			typingTutor tutor = new typingTutor();
			tutor.setup(); 
		}
	
	
	char generateRandomLetter() {
	    Random r = new Random(); {
	    return (char) (r.nextInt(26) + 'a');
	}
	
	    
	}
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;


	
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "");
		frame.addKeyListener(this);
		
		panel.add(label);
		frame.add(panel);
		frame.pack();
		
		
		}
	public void keyPressed(KeyEvent e) {
		char save = e.getKeyChar();
		System.out.println("You typed: " + save);
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);

		}
		currentLetter = newcurrentLetter();
		label.setText(currentLetter + "");
		
		//put the letter the person typed in the prentences System.out.println();
		System.out.println(currentLetter);
	}
}

	private char newcurrentLetter() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	


	
}
