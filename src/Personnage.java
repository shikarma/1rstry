
public class Personnage {

	String nom;
	int pv;
	
	public Personnage(String nom,int pv)
	{
		this.nom = nom;
		this.pv = pv;
	}
	
	public void attaquer(Personnage cible)
	{
		cible.pv-=1;
	}
}
