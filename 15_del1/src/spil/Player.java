package spil;

public class Player {
	
	String Name;
	int Points;
	
	public Player(String N, int P)
	{
		Name = N;
		Points = P;
	}
	
	public String toString()
	{
		return (Name + " " + "has" + " " + Points + " " + "points");
	}
	
	public int rollDice()
	{
		Dice cup = new Dice();
		int roll1 = cup.roll();
		int roll2 = cup.roll();
		System.out.println("You Rolled " + roll1 + " and " + roll2 + ", Your Score is Now " + Points );
		Points = Points + roll1 + roll2;
		if (Points >= 40)
			System.out.println("Winner Winner, Chicken Dinner");
		return Points;
	}
		
	
	public String getName()
	{
		return Name;
	}
	
	public int getPoints()
	{
		return Points;
	}

	public void setName(String NewName)
	{
		Name = NewName;
	}
	
	public void setPoints(int NewPoints)
	{
		Points = NewPoints;
	}
}
