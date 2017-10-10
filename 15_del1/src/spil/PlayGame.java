package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{
		Player mads = new Player("Mads", 20);
		Player jacob = new Player("ToBiAz", 0);
		
		GUI.addPlayer("ayat", 500);
		GUI.addPlayer("Alex", 500);
		
		int a;
		int b;
		int Ayatcar;
		int Alexcar;
		Ayatcar = 0;
		Alexcar = 0;
		
		boolean qwe = true;
		
		while (qwe == true) {
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = (int)(Math.random()*6+1);
		b = (int)(Math.random()*6+1);
		GUI.setDice(a,b);
		
		
		GUI.removeCar(Ayatcar, "Ayat");
		GUI.setCar(a+b, "Ayat");
		Ayatcar = Ayatcar + a+b;
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = (int)(Math.random()*6+1);
		b = (int)(Math.random()*6+1);
		GUI.setDice(a, b);
		
		GUI.removeCar(Alexcar, "Alex");
		GUI.setCar(a+b, "Alex");
		Alexcar = Alexcar + a + b;
		
		}
		
		GUI.getUserButtonPressed("ROLL", "ROLL DICE");
		GUI.setDice((int)(Math.random()*6+1),(int)(Math.random()*6+1));
		
		GUI.getUserButtonPressed("ROLL", "ROLL DICE");
		GUI.setDice((int)(Math.random()*6+1),(int)(Math.random()*6+1));
		
		
		
		
		System.out.println(mads.getName());
		System.out.println(mads.getPoints());
		mads.setName("Peter");
		mads.setPoints(0);
		System.out.println(mads.getName());
		System.out.println(mads.getPoints());
		System.out.println(mads.toString());
		mads.rollDice();
		System.out.println(mads.toString());
		mads.rollDice();
		mads.rollDice();
		jacob.rollDice();
		jacob.rollDice();
		jacob.rollDice();
		jacob.rollDice();
		jacob.rollDice();
		jacob.rollDice();
		System.out.println(mads.toString());
		System.out.println(jacob.toString());
		
		
	}
}