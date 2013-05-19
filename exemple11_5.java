import javax.swing.*;
import java.awt.*;

//Exemple 11.5: interfície gràfica BoxLayout.

public class exemple11_5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Exemple de Box");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		
		Box box = Box.createHorizontalBox();
		JButton b1 = new JButton("Boto1"); box.add(b1);
		box.add(Box.createHorizontalStrut(20));
		JButton b2 = new JButton("Un Boto2 mes llarg"); box.add(b2);
		box.add(Box.createHorizontalGlue());
		JButton b3 = new JButton("Boto3"); box.add(b3);
		JPanel panell = (JPanel)frame.getContentPane();
		panell.add(box);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}//main
}//exemple11_5
