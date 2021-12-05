package tutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import tutorial.NewWindow;

public class LaunchPage implements ActionListener{
	JFrame f = new JFrame("Лаунчер");
	JButton b = new JButton("Запустить приложение");
	LaunchPage(){
		//frame
		f.setResizable(false);
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
			f.dispose();
			NewWindow NewWindow = new NewWindow();
		}
	}
}
