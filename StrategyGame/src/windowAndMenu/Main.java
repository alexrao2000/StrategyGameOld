package windowAndMenu;

import javax.swing.*;

import java.awt.*;

public class Main extends JFrame {

	private JPanel cardPanel;
	
	public Main(String title) {
		super(title);
		
		setBounds(400, 100, 587, 569);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    cardPanel = new JPanel();
	    CardLayout cl = new CardLayout();
	    cardPanel.setLayout(cl);
	    
		MainMenu panel1 = new MainMenu(this);    
		GameMenu panel2 = new GameMenu(this);

	    cardPanel.add(panel1,"1"); // Card is named "1"
	    cardPanel.add(panel2,"2"); // Card is named "2"
	    
	    add(cardPanel);
	    addKeyListener(panel2);
	    
	    setResizable(false);
	    setVisible(true);
	}

	public static void main(String[] args)
	{
		Main w = new Main("StrategyGame");
	}
  
	public void changePanel(String name) {
		((CardLayout)cardPanel.getLayout()).show(cardPanel,name);
		requestFocus();
	}
  
}