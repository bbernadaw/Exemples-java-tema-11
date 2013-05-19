import javax.swing.*;
public class exemple11_1 {
	public static void main (String args []) {
		//Crea contenidor
		JFrame frame = new JFrame ("Nom finestra princiapl");
		//Crea panell contingut 
		JPanel panell = (JPanel)frame.getContentPane();
		//Crea un control tipus etiqueta
		JLabel display = new JLabel ("Hola món");
		//Afegeix el control al panell
		panell.add(display);
		//Estableis una grandària adequada al frame
		frame.pack();
		//Centra el frame a la pantalla
		frame.setLocationRelativeTo(null);
		//Fa visible la finestra
		frame.setVisible(true);
	}
}
