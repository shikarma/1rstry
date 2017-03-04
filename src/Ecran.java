import java.awt.Graphics;

import javax.swing.JPanel;


public class Ecran extends JPanel {
	
	GameEngine engine;
	public Ecran()
	{
		
	}
	
	public void attachEngine(GameEngine engine)
	{
		this.engine = engine;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(Personnage p : this.engine.personnage)
		{
			p.dessiner(g);
		}
		
	}
}
