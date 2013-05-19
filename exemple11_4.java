import java.awt.*;
import javax.swing.*;
public class exemple11_4 {
	public static void main (String args []){
	JFrame frame = new JFrame ("Exemple de GridLayout");
	frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	JPanel panell = (JPanel) frame.getContentPane();
	panell.setLayout (new GridLayout (3,2));
	
	JButton b1 = new JButton ("Boto 1"); panell.add (b1);
	JButton b2 = new JButton ("Boto 2"); panell.add (b2);
	JButton b3 = new JButton ("Boto 3"); panell.add (b3);
	JButton b4 = new JButton ("Boto 4"); panell.add (b4);
	JButton b5 = new JButton ("Boto 5"); panell.add (b5);
	
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
}
