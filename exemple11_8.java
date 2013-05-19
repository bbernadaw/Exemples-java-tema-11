import javax.swing.*;
import java.awt.*;

public class exemple11_8 {
	public static void main (String args []) {
		JFrame frame = new JFrame ("Exemple de GropuLayout");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize (500,300);
		JPanel panell = (JPanel) frame.getContentPane();
		//diferència en el constructor
		GroupLayout disseny = new GroupLayout (panell);
		panell.setLayout(disseny);
		JButton b1 = new JButton ("Boto 1");
		JButton b2 = new JButton ("Boto 2");
		JButton b3 = new JButton ("Boto 3");
		JButton b4 = new JButton ("Boto 4");
		JTextArea area = new JTextArea ("Area text");
		JTextField t1 = new JTextField ("text");
		
		//Grup horitzontal 
		GroupLayout.SequentialGroup hg = disseny.createSequentialGroup ();
		GroupLayout.SequentialGroup hg3 = disseny.createSequentialGroup ();
		hg3.addComponent (b3); hg3.addComponent(t1);
		GroupLayout.ParallelGroup hg1 = disseny.createParallelGroup();
		hg1.addComponent(area); hg1.addGroup (hg3);
		GroupLayout.ParallelGroup hg2 = disseny.createParallelGroup();
		hg2.addComponent (b1);
		hg2.addComponent (b2);
		hg2.addComponent (b4);
		
		hg.addGroup (hg1);hg.addGroup (hg2);
		
		//Grup vertical
		GroupLayout.ParallelGroup vg = disseny.createParallelGroup();
		//alinear els dos components a la part inferior 
		GroupLayout.ParallelGroup vg3 = disseny.createParallelGroup(GroupLayout.Alignment.BASELINE);
		
		vg3.addComponent (b3);
		vg3.addComponent (t1);
		GroupLayout.SequentialGroup vg1 = disseny.createSequentialGroup ();
		vg1.addComponent (area);
		vg1.addGroup (vg3);
		GroupLayout.SequentialGroup vg2 = disseny.createSequentialGroup ();
		vg2.addComponent(b1);
		
		//valors minim, preferible, màxim
		vg2.addGap (1,15,1000);
		vg2.addComponent(b2);
		vg2.addGap (1,15,1000);
		vg2.addComponent(b4);
		
		vg.addGroup (vg1); vg.addGroup(vg2);
		
		disseny.setHorizontalGroup(hg);
		disseny.setVerticalGroup(vg);
		
		frame.setLocationRelativeTo (null);
		frame.setResizable(true);
		frame.setVisible(true);
	}
}
		
		
