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
	public void TestdicerollThousandtimes() {
		for(int o = 0;o<1000;o++) {
		int low = 1;
		int high = 6;
		int actual = d1.roll();
		System.out.print(actual);
		assertTrue("Error, random is too high", high >= actual);
		assertTrue("Error, random is too low",  low  <= actual);
	}
		
	}
	



}
