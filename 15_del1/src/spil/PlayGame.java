package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{
		String PlayerName1 = GUI.getUserString("PLayer 1´: Enter Your Name");
		GUI.addPlayer(PlayerName1, 500);
		String PlayerName2 = GUI.getUserString("PLayer 2´: Enter Your Name");
		GUI.addPlayer(PlayerName2, 500);
		
		int a;
		int b;
		int car1 = 1;
		int car2 = 1;
				
		GUI.setCar(1, PlayerName1);
		GUI.setCar(1, PlayerName2);
		
		while (true) {
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = Dice.roll();
		b = Dice.roll();
		GUI.setDice(a,b);
		
		
		GUI.removeAllCars(PlayerName1);
		car1 = car1 + a+b;
		
		
		if (car1>40) {
			GUI.removeAllCars(PlayerName2);
			GUI.removeAllCars(PlayerName1);
			break;
		}
		GUI.setCar(car1, PlayerName1);
		
		GUI.getUserButtonPressed(" ", "ROLL DICE");
		
		a = Dice.roll();
		b = Dice.roll();
		GUI.setDice(a, b);
		
		GUI.removeAllCars(PlayerName2);
		car2 = car2 + a+b;
		
		
		if (car2>40) {
			GUI.removeAllCars(PlayerName2);
			GUI.removeAllCars(PlayerName1);
			break;
		}
		GUI.setCar(car2, PlayerName2);
		
	}
		if (car2>car1) 
			GUI.getUserButtonPressed(" ", PlayerName2 + " has Won");
		if (car1>car2)
			GUI.getUserButtonPressed(" ", PlayerName1 + " has Won");
			
		}
}