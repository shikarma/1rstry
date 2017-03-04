import java.awt.Graphics;


public class Personnage {

	String nom;
	int pv;
	
	int x;
	int y;
	
	public Personnage(String nom,int pv)
	{
		this.nom = nom;
		this.pv = pv;
	}
	
	public void attaquer(Personnage cible)
	{
		cible.pv-=1;
	}
	
	public void deplacer()
	{
		this.x+=1;
		this.y+=1;
	}
	
	public void dessiner(Graphics g)
	{
		g.fillRect(x, y,10,10);
	}
}
