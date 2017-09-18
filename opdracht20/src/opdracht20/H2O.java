package opdracht20;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class H2O extends JFrame implements ActionListener{
	private JTextField fieldy;
	private JTextField fieldx;
	private JButton button;
	private JPanel panel;
	private Container window = getContentPane();
	
	public static void main(String[] args) {
		H2O frame = new H2O();
		frame.setSize(600, 700);
		frame.createGUI();
		frame.setVisible(true);
		frame.setTitle("Something...Something...H2O");
	}
	
	public void createGUI () {
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 600));
		fieldy = new JTextField("50");
		fieldx = new JTextField("50");
		button = new JButton("teken die entropie");
		window.add(panel);
		window.add(fieldx);
		window.add(fieldy);
		window.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent event) {
		Graphics paper = panel.getGraphics();
		paper.clearRect(0, 0, 600, 600);
		int a = Integer.valueOf(fieldx.getText());
		int b = Integer.valueOf(fieldy.getText());
		paper.drawLine(a+125, b+25, a+50, b+100);
		paper.drawLine(a+50, b+100, a+125, b+175);
		paper.setColor(Color.blue);
		paper.fillOval(a+100, b, 50, 50);
		paper.fillOval(a+100, b+150, 50, 50);		
		paper.setColor(Color.red);
		paper.fillOval(a, b+50, 100, 100);
		
	}
}
