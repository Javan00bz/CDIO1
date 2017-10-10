package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{
		GUI.addPlayer("ayat", 500);
		GUI.addPlayer("Alex", 500);
		
		int a;
		int b;
		int Ayatcar;
		int Alexcar;
		Ayatcar = 1;
		Alexcar = 1;
		
		boolean qwe = true;
		
		GUI.setCar(1, "Ayat");
		GUI.setCar(1, "Alex");
		
		while (qwe == true) {
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = (int)(Math.random()*6+1);
		b = (int)(Math.random()*6+1);
		GUI.setDice(a,b);
		
		
		GUI.removeCar(Ayatcar, "Ayat");
		Ayatcar = Ayatcar + a+b;
		GUI.setCar(Ayatcar, "Ayat");
		
		if (Ayatcar>40)
			qwe = false;
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = (int)(Math.random()*6+1);
		b = (int)(Math.random()*6+1);
		GUI.setDice(a, b);
		
		GUI.removeCar(Alexcar, "Alex");
		Alexcar = Alexcar + a+b;
		GUI.setCar(Alexcar, "Alex");
		
		if (Alexcar>40)
			qwe = false;
		
		}
		
		if (Ayatcar<Alexcar)
			GUI.getUserButtonPressed("Ayat", "Ayat har vundet!");
		if (Ayatcar>Alexcar)
			GUI.getUserButtonPressed("Alex", "Alex har vundet!");
	}
}