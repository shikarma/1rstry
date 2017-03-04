import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) 
	{
		Ecran ecran = new Ecran();
		
		GameEngine engine = new GameEngine(ecran);
		
		JFrame  frame = new JFrame();
		frame.setContentPane(ecran);
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		engine.start();
	}

}
