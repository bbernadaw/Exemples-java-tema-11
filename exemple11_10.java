import javax.swing.*;
import java.awt.*;

//Exemple11_10: 
public class exemple11_10 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculadora");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(215,225);
		JPanel panell = (JPanel)frame.getContentPane();
		panell.setLayout(new GridBagLayout());
		
		JTextField display = new JTextField("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);
		display.setBackground(Color.WHITE);
		
		/*GridBagConstraint(
		 * int gridx, //Número de columna on comença.
		 * int gridy, //Número línia on comença.
		 * int gridwidth, //Cel·les en horitzontal que ocupa
		 * int gridheight, //Cel·les en vertical que ocupa
		 * double weightx, //Estira fila de la cel·la
		 * double weighty, //Estira columna de la cel·la
		 * int anchor,(GridBagConstraints.CENTER)//Situa camp. dins cel·la
		 * int fill,(GridBagConstraints.BOTH)//Estira camp. dins cel·la
		 * Insets insets, //(a,b,c) farcit extern a la casella
		 * int ipadx, //farcit intern de la casella
		 * int ipady, //farcit intern de la casella
		 * )*/
		
		panell.add(display,new GridBagConstraints(0,0,4,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0),0,10));
		panell.add(new JButton("7"), new GridBagConstraints(0,1,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("8"), new GridBagConstraints(1,1,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("9"), new GridBagConstraints(2,1,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("+"), new GridBagConstraints(3,1,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("4"), new GridBagConstraints(0,2,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("5"), new GridBagConstraints(1,2,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("6"), new GridBagConstraints(2,2,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("-"), new GridBagConstraints(3,2,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("3"), new GridBagConstraints(0,3,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("2"), new GridBagConstraints(1,3,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("1"), new GridBagConstraints(2,3,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("X"), new GridBagConstraints(3,3,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("0"), new GridBagConstraints(0,4,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("C"), new GridBagConstraints(1,4,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("="), new GridBagConstraints(2,4,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		panell.add(new JButton("/"), new GridBagConstraints(3,4,1,1,0.0,0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,5,5),0,0));
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}//main
}//exemple11_10
