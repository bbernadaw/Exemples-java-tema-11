import javax.swing.*;
import java.awt.*;

public class exemple11_11 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculadora2");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(215,220);
		JPanel panell = (JPanel)frame.getContentPane();
		GroupLayout disseny = new GroupLayout(panell);
		panell.setLayout(disseny);
		
		JTextField display = new JTextField("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);
		display.setBackground(Color.WHITE);
		
		JButton boto7 = new JButton("7");
		JButton boto8 = new JButton("8");
		JButton boto9 = new JButton("9");
		JButton botomes = new JButton("+");
		JButton boto4 = new JButton("4");
		JButton boto5 = new JButton("5");
		JButton boto6 = new JButton("6");
		JButton botomenys = new JButton("-");
		JButton boto3 = new JButton("3");
		JButton boto2 = new JButton("2");
		JButton boto1 = new JButton("1");
		JButton botoper = new JButton("x");
		JButton boto0 = new JButton("0");
		JButton botoC = new JButton("C");
		JButton botoigual = new JButton("=");
		JButton botodiv = new JButton("/");
		
		// Grup Horizontal
		GroupLayout.ParallelGroup hg = disseny.createParallelGroup();
		
		GroupLayout.SequentialGroup hg1 = disseny.createSequentialGroup();
		hg1.addGap(10); hg1.addComponent(boto7);
		hg1.addGap(7); hg1.addComponent(boto8);
		hg1.addGap(7); hg1.addComponent(boto9);
		hg1.addGap(7); hg1.addComponent(botomes); hg1.addGap(10);
		
		GroupLayout.SequentialGroup hg2 = disseny.createSequentialGroup();
		hg2.addGap(10); hg2.addComponent(boto4);
		hg2.addGap(7); hg2.addComponent(boto5);
		hg2.addGap(7); hg2.addComponent(boto6);
		hg2.addGap(7); hg2.addComponent(botomenys); hg2.addGap(10);
		
		GroupLayout.SequentialGroup hg3 = disseny.createSequentialGroup();
		hg3.addGap(10); hg3.addComponent(boto3);
		hg3.addGap(7); hg3.addComponent(boto2);
		hg3.addGap(7); hg3.addComponent(boto1);
		hg3.addGap(7); hg3.addComponent(botoper); hg3.addGap(10);
		
		GroupLayout.SequentialGroup hg4 = disseny.createSequentialGroup();
		hg4.addGap(10); hg4.addComponent(boto0);
		hg4.addGap(7); hg4.addComponent(botoC);
		hg4.addGap(7); hg4.addComponent(botoigual);
		hg4.addGap(7); hg4.addComponent(botodiv); hg3.addGap(10);
		
		hg.addComponent(display);
		hg.addGroup(hg1);
		hg.addGroup(hg2);
		hg.addGroup(hg3);
		hg.addGroup(hg4);
		
		// Grup Vertical
		GroupLayout.SequentialGroup vg = disseny.createSequentialGroup();
		
		GroupLayout.ParallelGroup vg1 = disseny.createParallelGroup();
		vg1.addComponent(boto7); vg1.addComponent(boto8);
		vg1.addComponent(boto9); vg1.addComponent(botomes);
		
		GroupLayout.ParallelGroup vg2 = disseny.createParallelGroup();
		vg2.addComponent(boto4); vg2.addComponent(boto5);
		vg2.addComponent(boto6); vg2.addComponent(botomenys);
		
		GroupLayout.ParallelGroup vg3 = disseny.createParallelGroup();
		vg3.addComponent(boto3); vg3.addComponent(boto2);
		vg3.addComponent(boto1); vg3.addComponent(botoper);
		
		GroupLayout.ParallelGroup vg4 = disseny.createParallelGroup();
		vg4.addComponent(boto0); vg4.addComponent(botoC);
		vg4.addComponent(botoigual); vg4.addComponent(botodiv);
		
		vg.addGap(10);
		vg.addComponent(display);
		vg.addGap(10);
		vg.addGroup(vg1);
		vg.addGap(7);
		vg.addGroup(vg2);
		vg.addGap(7);
		vg.addGroup(vg3);
		vg.addGap(7);
		vg.addGroup(vg4);
		vg.addGap(10);
		
		disseny.setHorizontalGroup(hg);
		disseny.setVerticalGroup(vg);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
