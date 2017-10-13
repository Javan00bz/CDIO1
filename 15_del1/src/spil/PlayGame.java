package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{		
		
		GUI.showMessage("Welcome to the Dice Game. Your goal is to get around the board" );

		String PlayerName1 = GUI.getUserString("Player 1: Enter Your Name");
		GUI.addPlayer(PlayerName1, 0);
		String PlayerName2 = GUI.getUserString("Player 2: Enter Your Name");
		GUI.addPlayer(PlayerName2, 0);
		
		int d1;
		int d2;
		int car1 = 1;
		int car2 = 1;
		int sixcounter = 0;
		
		
		
		GUI.setCar(1, PlayerName1);
		GUI.setCar(1, PlayerName2);
		
		while (car1 < 41 && car2 < 41) {
		
		while (true) {	
		GUI.getUserButtonPressed(" ", PlayerName1 + " ROLL DICE");
		
		d1 = Dice.roll();
		d2 = Dice.roll();
			
		GUI.setDice(d1,d2);
		
		
		GUI.removeAllCars(PlayerName1);
		if (d1 == 1 && d2 == 1) {
			car1 = 1;
			GUI.setCar(car1, PlayerName1);
		}
		else if (d1 == d2) {
			car1 = car1 + d1 + d2;
			if (car1 >= 41)
				break;
			else GUI.setCar(car1, PlayerName1);
		}
		if (d1 == 6 && d2 == 6) 
			sixcounter = sixcounter + 1;
		else sixcounter = 0;
		if (d1 != d2){
			car1 = car1 + d1 + d2;
			if (car1 >= 41)
				break;
			else GUI.setCar(car1, PlayerName1);
			break;}
		
		if (sixcounter == 2) {
			car1 = 41;
			break;}
		}
		if (car1 >= 41) {
			GUI.removeAllCars(PlayerName1);
			GUI.removeAllCars(PlayerName2);
			break;}
		
		while (true) {
		GUI.getUserButtonPressed(" ", PlayerName2 + " ROLL DICE");
		
		d1 = Dice.roll();
		d2 = Dice.roll();
		
		GUI.setDice(d1, d2);
		
		GUI.removeAllCars(PlayerName2);
		if (d1 == 1 && d2 == 1) {
			car2 = 1;
			GUI.setCar(car2, PlayerName2);
		}
		else if (d1 == d2) {
			car2 = car2 + d1 + d2;
			if (car2 >= 41)
				break;
			else GUI.setCar(car2, PlayerName2);
		}
		if (d1 == 6 && d2 == 6)
			sixcounter = sixcounter + 1;
		else sixcounter = 0;
		if (d1 != d2){
			car2 = car2 + d1 + d2;
			if (car2 >= 41)
				break;
			else GUI.setCar(car2, PlayerName2);
			break;}
		
		if (sixcounter == 2) {
			car2 = 41;
			break;}
		}
		if (car2 >= 41) {
			GUI.removeAllCars(PlayerName1);
			GUI.removeAllCars(PlayerName2);
			break;}
		
		
	}
		if (car1>car2) 
			GUI.getUserButtonPressed(" ", PlayerName1 + " has Won");
		if (car2>car1)
			GUI.getUserButtonPressed(" ", PlayerName2 + " has Won");
			
		}
	}

