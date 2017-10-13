package spil; 

public class Dice { //Klasse der finder et tilfældigt tal mellem 1 og 6

	public static int roll()
	{
		int dice = (int)(Math.random()*6+1);
		return dice;
	}
		
}