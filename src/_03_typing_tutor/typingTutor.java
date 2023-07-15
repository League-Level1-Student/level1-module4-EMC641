package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor {
	
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
	char currentLetter;
	

	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		
		JLabel label = new JLabel();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.addKeyListener(null);
		
		panel.add(label);
		frame.add(panel);
		frame.pack();
		
		
		}
	
	void keyReleased() {
		generateRandomLetter();
		
		//do step 8 ii) here
		
		//put the letter the person typed in the prentences System.out.println();
		
	}
}
