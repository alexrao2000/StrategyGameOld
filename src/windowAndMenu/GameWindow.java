package windowAndMenu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameWindow extends JPanel {
	
	public GameWindow() {
		super();
		setBackground(Color.GREEN);

		
		add(new JButton("Start"));
		add(new JButton("Load"));
		add(new JButton("Options"));
		add(new JButton("Quit"));
		
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
	}
}
