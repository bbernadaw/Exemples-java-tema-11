import javax.swing.*;
import java.awt.*;
public class exemple11_3 {
	public static void main (String args []) {
		JFrame frame = new JFrame ("Disseny BorderLayout");
		//Indica el que farà quan es pitja el botó de tancar finestra
		//exit_on_close, farà que el programari acabi
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//Estableix la grandària del frame
		frame.setSize (300,300);
		JPanel panell = (JPanel) frame.getContentPane();
		//Estableix el disseny
		panell.setLayout (new BorderLayout());
		//Nord
		JTextField nord = new JTextField ("nord");
		panell.add(nord,BorderLayout.NORTH);
		//Oest
		JTextArea oest = new JTextArea ("oest");
		oest.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		JScrollPane scroll = new JScrollPane(oest);
		panell.add(scroll, BorderLayout.WEST);
		//Centre
		JTextPane centre = new JTextPane ();
		panell.add(centre,BorderLayout.CENTER);
		//Est
		JButton est = new JButton ("est");
		panell.add(est,BorderLayout.EAST);
		//Sud
		JToggleButton sud = new JToggleButton ("sud");
		panell.add(sud,BorderLayout.SOUTH);
		//Centra el frame a la pantalla
		frame.setLocationRelativeTo(null);
		//Fa visible la finestra
		frame.setVisible(true);
	}
}
		
		
