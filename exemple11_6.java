
import javax.swing.*;
import java.awt.*;
public class exemple11_6 {


	public static void main(String[] args) {
		JFrame frame = new JFrame("Formulari amb Box");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		
		JLabel lalumne = new JLabel("ALUMNE");
		lalumne.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
		JPanel panalumne = new JPanel ( new FlowLayout(FlowLayout.CENTER));
		panalumne.add(lalumne);
		
		Box boxdni = Box.createHorizontalBox();
		JLabel ldni = new JLabel("Dni:"); JTextField tdni = new JTextField(6);
		boxdni.add(Box.createHorizontalStrut(5));
		boxdni.add(ldni); boxdni.add(Box.createHorizontalStrut(16));
		boxdni.add(tdni);
		JPanel pandni = new JPanel( new FlowLayout(FlowLayout.LEFT));
		pandni.add(boxdni);
		
		Box boxnom = Box.createHorizontalBox();
		JLabel lnom = new JLabel("nom");
		JTextField tnom = new JTextField(20);
		pandni.add(Box.createHorizontalStrut(5));
		pandni.add(lnom); pandni.add(Box.createHorizontalStrut(9));
		pandni.add(tnom);
		JPanel pannom = new JPanel( new FlowLayout(FlowLayout.LEFT));
		pannom.add(boxnom);
		
		Box boxedat = Box.createHorizontalBox();
		JLabel ledat = new JLabel("Edat:"); JTextField tedat = new JTextField(2);
		boxedat.add(Box.createHorizontalStrut(5));
		boxedat.add(ledat); boxedat.add(Box.createHorizontalStrut(10));
		boxedat.add(tedat);
		JPanel panedat = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panedat.add(boxedat);
		
		Box boxnivell = Box.createHorizontalBox();
		JLabel lnivell = new JLabel("Nivell:");
		JRadioButton tnivell1 = new JRadioButton("B",false);
		JRadioButton tnivell2 = new JRadioButton("M",false);
		JRadioButton tnivell3 = new JRadioButton("S",false);
		JRadioButton tnivell4 = new JRadioButton("?",false);
		ButtonGroup grup = new ButtonGroup();
		grup.add(tnivell1); grup.add(tnivell2); grup.add(tnivell3);
		grup.add(tnivell4);
		boxnivell.add(Box.createHorizontalStrut(5));
		boxnivell.add(lnivell); boxnivell.add(Box.createHorizontalStrut(8));
		boxnivell.add(tnivell1); boxnivell.add(Box.createHorizontalStrut(4));
		boxnivell.add(tnivell2); boxnivell.add(Box.createHorizontalStrut(4));
		boxnivell.add(tnivell3); boxnivell.add(Box.createHorizontalStrut(4));
		boxnivell.add(tnivell4);
		JPanel pannivell = new JPanel( new FlowLayout(FlowLayout.LEFT));
		pannivell.add(boxnivell);
		
		Box boxbotons = Box.createHorizontalBox();
		JButton botoA = new JButton("Acceptar");
		JButton botoC = new JButton("Cancelar");
		boxbotons.add(Box.createHorizontalStrut(5));
		boxbotons.add(botoA); boxbotons.add(Box.createHorizontalStrut(4));
		boxbotons.add(botoC);
		JPanel panbotons = new JPanel( new FlowLayout(FlowLayout.RIGHT));
		panbotons.add(boxbotons);
		
		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(5));
		box.add(panalumne); box.add(Box.createVerticalStrut(5));
		box.add(pandni); box.add(Box.createVerticalStrut(5));
		box.add(pannom); box.add(Box.createVerticalStrut(5));
		box.add(panedat); box.add(Box.createVerticalStrut(5));
		
		box.add(pannivell);
		box.add(panbotons);
		
		JPanel panell = (JPanel)frame.getContentPane();
		panell.add(box);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
