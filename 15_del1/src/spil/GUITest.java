package spil;

import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;

public class GUITest {
	
	public static void main(String[] args)
	{
		Field[] fields = new Field[40];
		GUI.addPlayer("rambo", 40);
		GUI.addPlayer("Tobias", 200);
		
		if (GUI.getUserLeftButtonPressed("press button", "press", "pls"))
		GUI.setDice(2,4);
	}
	

}
