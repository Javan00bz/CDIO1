/**
 Verdens Bedste Terningespil! V 1.0.1
 Et spil mellem to spillere hvor målet er at komme rundt om pladen først
 Skrevet af Mads Jørgensen, Alexander Kjeldsen, Oliver Uldall Schultz, Josephine Mellin, Ayat Toma, Elisa  Sverrisdottir
 */

package spil;

import desktop_resources.GUI;

public class PlayGame {
	
	public static void main(String[] args)
	{
		Board board = new Board();
		board.BoardController();
		
		GUI.showMessage("Welcome to the game\nDouble one, resets points.\nDouble six twice, wins the game.\nTwo of a kind, get an extra roll.\nFirst to 40 points, wins.");

		String PlayerName1 = GUI.getUserString("Player 1: Enter Your Name");
		GUI.addPlayer(PlayerName1, 0);
		
		String PlayerName2 = GUI.getUserString("Player 2: Enter Your Name");
		while(PlayerName2.equals(PlayerName1)) {
			GUI.showMessage("The Names Cant Be The Same. \nPlease Try Again ");
			String NewPlayerName2 = GUI.getUserString("Player 2: Enter Your Name");
			PlayerName2 = NewPlayerName2;
		}
		GUI.addPlayer(PlayerName2, 0);
		
		int d1; // Variabel for den ene terning
		int d2; // Varibal for den anden terning
		int car1 = 1; // Variabel der holder styr på hvor den ene spiller er på pladen
		int car2 = 1; // Variabel der holder styr på hvor den anden spiller er på pladen
		int SixCounter = 0; // Tæller hvor mange gange i træk der er slået 6
				
		GUI.setCar(1, PlayerName1);
		GUI.setCar(1, PlayerName2);
		
		while (true) {
		
		while (true) {	
		GUI.getUserButtonPressed(" ", PlayerName1 + " ROLL DICE");
		
		d1 = Dice.roll();
		d2 = Dice.roll();
		
			
		GUI.setDice(d1,d2);
		
		
		GUI.removeAllCars(PlayerName1);
		if (d1 == 1 && d2 == 1)
			car1 = 1;
		else
			car1 = car1 + d1 + d2;
		if (d1 != d2)
			break;
		else GUI.setCar(car1, PlayerName1);
		if (d1 == 6 && d2 == 6 )
			SixCounter++;
		else
			SixCounter=0;
		if (SixCounter == 2)
			car1 = 41;
		}
		if (car1>40) {
			GUI.removeAllCars(PlayerName2);
			GUI.removeAllCars(PlayerName1);
			break;
		}

		
		GUI.setCar(car1, PlayerName1);
		
		while (true) {
		GUI.getUserButtonPressed(" ", PlayerName2 + " ROLL DICE");
		
		d1 = Dice.roll();
		d2 = Dice.roll();
		
		GUI.setDice(d1, d2);
		
		GUI.removeAllCars(PlayerName2);
		if (d1 == 1 && d2 == 1)
			car2 = 1;
		else
			car2 = car2 + d1 + d2;
		if (d1 != d2)
			break;
		else 
			GUI.setCar(car2, PlayerName2);
		if (d1 == 6 && d2 == 6 )
			SixCounter++;
		else
			SixCounter=0;
		if (SixCounter == 2)
			car2 = 41;
		}
		if (car2>40) {
			GUI.removeAllCars(PlayerName2);
			GUI.removeAllCars(PlayerName1);
			break;
		}
		
		GUI.setCar(car2, PlayerName2);
		
	}
		if (car2>car1) 
			GUI.showMessage("Congratulations " + PlayerName2 + ", you have won the game");
		if (car1>car2)
			GUI.showMessage("Congratulations " + PlayerName1 + ", you have won the game");
			
		}
}