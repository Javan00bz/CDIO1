package spil;

public class PlayGame {
	
	public static void main(String[] args)
	{
		Player mads = new Player("Mads", 20);
		Player jacob = new Player("ToBiAz", 0);
		
		
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