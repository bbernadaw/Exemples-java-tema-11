import javax.swing.*;
public class exemple11_2 {
	public static void main (String args []) {
		//Crea contenidor
		JFrame frame = new JFrame ("Calculadora");
		//Crea panell contingut 
		JPanel panell = (JPanel)frame.getContentPane();
		//Crea un control tipus etiqueta
		JLabel display = new JLabel ("Hola");
		panell.add (display);
		
		JPanel panellBotons = new JPanel();
		JButton boto1 = new JButton ("1");panellBotons.add(boto1);
		JButton boto2 = new JButton ("2");panellBotons.add(boto2);
		JButton boto3 = new JButton ("3");panellBotons.add(boto3);
		JButton boto4 = new JButton ("4");panellBotons.add(boto4);
		JButton boto5 = new JButton ("5");panellBotons.add(boto5);
		JButton boto6 = new JButton ("6");panellBotons.add(boto6);
		JButton boto7 = new JButton ("7");panellBotons.add(boto7);
		JButton boto8 = new JButton ("8");panellBotons.add(boto8);
		JButton boto9 = new JButton ("9");panellBotons.add(boto9);
		JButton botoper = new JButton ("*");panellBotons.add(botoper);
		JButton botomenys = new JButton ("-");panellBotons.add(botomenys);
		JButton botonmes = new JButton ("+");panellBotons.add(botonmes);
		JButton botoigual = new JButton ("=");panellBotons.add(botoigual);
		JButton botoidividir = new JButton ("/");panellBotons.add(botoidividir);
		JButton botoC = new JButton ("C");panellBotons.add(botoC);
		JButton boto0 = new JButton ("0");panellBotons.add(boto0);
		panell.add(panellBotons);
		frame.setVisible(true);
	}
}
