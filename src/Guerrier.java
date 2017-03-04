
public class Guerrier extends Personnage
{

	public Guerrier(String nom, int pv) {
		super(nom, pv);
	}
	
	public void charger(Personnage cible)
	{
		cible.pv-=10;
	}
}
