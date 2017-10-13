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
		Board board = new Board(); //Laver et nyt bræt og indlæser data fra Board klassen
		board.BoardController();

		int d1; // Variabel for den ene terning
		int d2; // Varibal for den anden terning
		int car1 = 1; // Variabel der holder styr på hvor den ene spiller er på pladen
		int car2 = 1; // Variabel der holder styr på hvor den anden spiller er på pladen
		int SixCounter = 0; // Tæller hvor mange gange i træk der er slået 6

		GUI.showMessage("Welcome to the best Dice Game in the world!\nHere are the rules:\nRoll the dice to move your car\nIf you roll two ones, your lose your points\nIf you roll two of a kind, you get an extra turn\nIf you roll two sixes two times in a row, you win the game\nGet around the board before your oppponent to win\nGood Luck!");

		String PlayerName1 = GUI.getUserString("Player 1: Enter Your Name"); //Spiller 1 indtaster sit navn
		GUI.addPlayer(PlayerName1, 0);

		//Spiller 2 indtaster sit navn, hvis navnet er det samme som spiller et kommer der en fejlmeddelelse frem og spiller 2 skal indtaste en nyt navn
		String PlayerName2 = GUI.getUserString("Player 2: Enter Your Name"); 
		while(PlayerName2.equals(PlayerName1)) {
			GUI.showMessage("The Names Cant Be The Same. \nPlease Try Again ");
			String NewPlayerName2 = GUI.getUserString("Player 2: Enter Your Name");
			PlayerName2 = NewPlayerName2;
		}
		GUI.addPlayer(PlayerName2, 0);

	
		GUI.setCar(1, PlayerName1);
		GUI.setCar(1, PlayerName2);

		while (true) { //While loop for hele spillet, breakes først når en brik er i mål

			while (true) {	//While loop for første spillers tur
				GUI.getUserButtonPressed(" ", PlayerName1 + ", it is your turn, click here to roll the dice");

				//Ruller 2 terninger og viser dem på pladen
				d1 = Dice.roll();
				d2 = Dice.roll();
				GUI.setDice(d1,d2);


				GUI.removeAllCars(PlayerName1); //Fjerner bilen fra pladen
				if (d1 == 1 && d2 == 1) //Tjekker om de to terninger begge er 1, hvis de er ryger man tilbage til start
					car1 = 1;
				else
					car1 = car1 + d1 + d2; //Tjekker om de to terninger har samme værdi, hvis de er får man lov til at slå igen
				if (d1 != d2) //Hvis de to terninger har forskellig værdi bliver loopet breaket og det er næste spillers tur
					break;
				else GUI.setCar(car1, PlayerName1);
				if (d1 == 6 && d2 == 6 ) //Hvis de to terninger begge viser 6 får man lov at slå igen og SixCounter bliver incrementeret
					SixCounter++;
				else //sixcounter bliver nulstillet hvis ikke der bliver slået 2 seksere
					SixCounter=0;
				if (SixCounter == 2) //Spilleren vinder automatisk hvis sixcounter rammer 2
					car1 = 41;
			}
			if (car1>40) { // Tjekker om bilen er noget i mål, hvis bilen er i mål breakes while-loopet og en vinder bliver fundet
				GUI.removeAllCars(PlayerName2);
				GUI.removeAllCars(PlayerName1);
				break;
			}


			GUI.setCar(car1, PlayerName1); //Placerer bilen på pladen

			while (true) { //While loop for anden spillers tur
				GUI.getUserButtonPressed(" ", PlayerName2 + ", it is your turn, click here to roll the dice");

				//Ruller 2 terninger og viser dem på pladen
				d1 = Dice.roll();
				d2 = Dice.roll();
				GUI.setDice(d1, d2);

				GUI.removeAllCars(PlayerName2); //Fjerner bilen fra pladen
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
			if (car2>40) { // Tjekker om bilen er nået i mål, hvis bilen er i mål breakes while-loopet og en vinder bliver fundet
				GUI.removeAllCars(PlayerName2);
				GUI.removeAllCars(PlayerName1);
				break;
			}

			GUI.setCar(car2, PlayerName2); //Placerer bilen på pladen

		} //Finder vinderen af spillet og viser en meddelelse
		if (car2>car1) 
			GUI.showMessage("Congratulations " + PlayerName2 + ", you have won the game");
		if (car1>car2)
			GUI.showMessage("Congratulations " + PlayerName1 + ", you have won the game");

	}
}