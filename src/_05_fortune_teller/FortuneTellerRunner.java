package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	JOptionPane.showMessageDialog(null, "Hello new user. Your lucky that you decided to play this game becuase I'm going "
    			+ "to give you a few hints.");
    	JOptionPane.showMessageDialog(null, " Tip 1: When the cordinates are added up, it is 525 ");
    	JOptionPane.showMessageDialog(null, " Tip 2: Look at the middle ");
    	JOptionPane.showMessageDialog(null, " Tip 3: Look at the left of the middle ");
    	JOptionPane.showMessageDialog(null, " GOOD LUCK AND HAVE A LOT OF FUN :) :) :) :)");

    }
}
