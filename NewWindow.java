package tutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewWindow implements ActionListener{
	JFrame f = new JFrame("ќсновное приложение");
	JButton b = new JButton("вывести надпись в консоль");
	NewWindow(){
		//frame
		f.setResizable(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(420, 420);
		f.setLayout(null);
		f.setVisible(true);
		//button
		b.setBounds(100,160,200,40);
		b.setFocusable(false);
		b.addActionListener(this);
		b.setEnabled(true);
		f.add(b);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			System.out.println(" нопка нажата");
		}
	}
}
