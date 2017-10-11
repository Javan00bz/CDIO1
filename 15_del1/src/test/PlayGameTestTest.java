package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.Dice;
import spil.PlayGame;

public class PlayGameTestTest {
	PlayGame t1;
	Dice d1;

	@Before
	public void setUp() throws Exception {
		t1 = new PlayGame();
		d1=new Dice();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void TestDicerollThousandTimes() {
		for(int o = 0;o<1000;o++) {
		int low = 1;
		int high = 6;
		int actual = d1.roll();
		//System.out.print(actual);
		assertTrue("Error, random is too high", high >= actual);
		assertTrue("Error, random is too low",  low  <= actual);
	}
		
		
	}

	
	@Test
	public void TestRandomnessDice()
	{
		int amount12 = 0;
		System.out.println("");
		for(int o = 0 ; o<1000;o++) {
			int a1 = d1.roll();
			int a2 = d1.roll();
			int actual = a1+a2;
			if (actual == 12)
				amount12++;
		}
		System.out.println(amount12);
		assertTrue("Error, random is too high", 32 >= amount12);
		assertTrue("Error, random is too low",  22  <= amount12);
	}
	
		
	public void TestResponseTid() {
		long l = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		for(int o = 0 ; o<1000;o++) {
			int actual = d1.roll();
			}
		long k = System.currentTimeMillis();
		assertTrue(k-l<333000);
		System.out.println(k-l);
	}
}

