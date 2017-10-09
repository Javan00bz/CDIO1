package spil;

public class Dice {

	public int roll()
	{
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		int roll = dice1 + dice2;
		return roll;
			
	}
		
}
