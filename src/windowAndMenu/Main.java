package windowAndMenu;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String args[]) {
		JFrame w = new JFrame("GameWindow");
		w.setBounds(100, 100, 640, 480);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameWindow panel = new GameWindow();
		w.add(panel);
		w.setResizable(true);
		w.setVisible(true);
	}
}
