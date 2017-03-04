
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world !");
		Personnage paul = new Personnage("Paul",100);
		Personnage pierre = new Personnage("Pierre",100);
		
		paul.attaquer(pierre);
		System.out.println(pierre.pv);
	}

}
