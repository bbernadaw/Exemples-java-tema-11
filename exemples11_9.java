import javax.swing.*;
import java.awt.*;
public class exemples11_9 {
	public static void main (String args []){
		JFrame frame = new JFrame ("Calculadora");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(225,300);
		JPanel panell = (JPanel)frame.getContentPane();
		//espaisH, espaisV
		panell.setLayout (new BorderLayout(8,8));
		
		JTextField display = new JTextField ("0");
		//test alineat a la dreta
		display.setHorizontalAlignment (SwingConstants.RIGHT);
		//no es pot editar
		display.setEditable(false);
		//fondo blanc
		display.setBackground(Color.WHITE);
		panell.add(display,BorderLayout.NORTH);
		
		JPanel panellBotons = new JPanel();
		//files, columnes, espaisH, espaisV
		panellBotons.setLayout(new GridLayout(4,4,5,5));
		panellBotons.add(new JButton("7"));
		panellBotons.add(new JButton("8"));
		panellBotons.add(new JButton("9"));
		panellBotons.add(new JButton("+"));
		panellBotons.add(new JButton("4"));
		panellBotons.add(new JButton("5"));
		panellBotons.add(new JButton("6"));
		panellBotons.add(new JButton("-"));
		panellBotons.add(new JButton("3"));
		panellBotons.add(new JButton("2"));
		panellBotons.add(new JButton("1"));
		panellBotons.add(new JButton("x"));
		panellBotons.add(new JButton("0"));
		panellBotons.add(new JButton("C"));
		panellBotons.add(new JButton("="));
		panellBotons.add(new JButton("/"));
		panell.add(panellBotons,BorderLayout.CENTER);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}


		
