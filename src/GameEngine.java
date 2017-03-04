import java.util.ArrayList;


public class GameEngine extends Thread
{
	Ecran ecran;
	ArrayList<Personnage> personnage = new ArrayList<Personnage>();
	
	public GameEngine(Ecran ecran)
	{
		this.ecran = ecran;
		this.ecran.attachEngine(this);
	}
	
	@Override
	public void run()
	{
		Personnage paul = new Personnage("Paul",10);
		Personnage pierre = new Personnage("Pierre",10);
		
		paul.y = 200;
		pierre.y = 200;
		
		paul.x = 50;
		
		this.personnage.add(paul);
		this.personnage.add(pierre);
		
		long tps_actuel = 0;
		long tps_precedent = 0;
		
		while(true)
		{
			tps_actuel = System.currentTimeMillis();
			if(tps_actuel - tps_precedent > 25 )
			{
				for(Personnage p : this.personnage)
					p.deplacer();
				
				ecran.repaint();
				tps_precedent = tps_actuel;
			}
		}
	}

}
