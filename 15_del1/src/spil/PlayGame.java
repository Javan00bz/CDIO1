package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{
		GUI.addPlayer("ayat", 500);
		GUI.addPlayer("Alex", 500);
		
		int a;
		int b;
		int car1 = 1;
		int car2 = 1;
				
		GUI.setCar(1, "Ayat");
		GUI.setCar(1, "Alex");
		
		while (true) {
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = Dice.roll();
		b = Dice.roll();
		GUI.setDice(a,b);
		
		
		GUI.removeAllCars("Ayat");
		car1 = car1 + a+b;
		
		
		if (car1>40) {
			GUI.removeAllCars("Alex");
			GUI.removeAllCars("Ayat");
			break;
		}
		GUI.setCar(car1, "Ayat");
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = Dice.roll();
		b = Dice.roll();
		GUI.setDice(a, b);
		
		GUI.removeAllCars("Alex");
		car2 = car2 + a+b;
		
		
		if (car2>40) {
			GUI.removeAllCars("Alex");
			GUI.removeAllCars("Ayat");
			break;
		}
		GUI.setCar(car2, "Alex");
		
	}
		if (car2>car1) 
			GUI.getUserButtonPressed(" ", "Alex Won");
		if (car1>car2)
			GUI.getUserButtonPressed(" ", "Ayat Won");
			
		}
}