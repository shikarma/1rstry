import java.awt.Graphics;


public class Personnage {

	String nom;
	int pv;
	
	double x;
	double y;
	
	double vx;
	double vy;
	
	double ax;
	double ay;
	
	
	public Personnage(String nom,int pv)
	{
		this.nom = nom;
		this.pv = pv;
		
		this.x = 0;
		this.y = 0;
		
		this.vy = -10.0;
		this.vx = 2.0;
		
		this.ax = 0;
		this.ay = 0.2;
	}
	
	public void attaquer(Personnage cible)
	{
		cible.pv-=1;
	}
	
	public void deplacer()
	{
		this.x+=vx;
		this.y+=vy;
		this.vx+=ax;
		this.vy+=ay;
		
		if(this.y >= 400)
		{
			this.vy = -this.vy;
		}
		if(this.x >= 400)
		{
			this.vx = -this.vx;
		}
		if(this.x < 0)
		{
			this.vx = -this.vx;
		}
		if(this.y < 0)
		{
			this.vy = -this.vy;
		}
	}
	
	public void dessiner(Graphics g)
	{
		g.fillRect((int)x,(int)y,10,10);
	}
}
