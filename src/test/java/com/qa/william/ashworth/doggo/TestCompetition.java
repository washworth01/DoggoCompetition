package com.qa.william.ashworth.doggo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestCompetition 
{
	Competition testComp = new Competition();
	
	public void setUp()
	{
		Dog a = new Dog("me", 5);
		Dog b = new Dog("fe", 1);
		Dog c = new Dog("fo", 27);
		
		testComp.add(a);
		testComp.add(b);
		testComp.add(c);
		
		testComp.hashToList();
	}
	
	public void tearDown()
	{
		testComp = new Competition();
	}
	
	@Test
	public void positionStringTest1()
	{
		assertEquals("","33rd",testComp.positionToString(33));
	}
	
	@Test
	public void positionStringTest2()
	{
		assertEquals("","11th",testComp.positionToString(11));
	}
	
	@Test
	public void positionStringTest3()
	{
		assertEquals("", "13th", testComp.positionToString(13));
	}
	
	@Test
	public void positionStringTest4()
	{
		assertEquals("","2nd",testComp.positionToString(2));
	}
	
	@Test
	public void positionStringTest5()
	{
		assertEquals("","12th",testComp.positionToString(12));
	}
	
	@Test
	public void positionStringTest6()
	{
		assertEquals("","41st",testComp.positionToString(41));
	}
	
	@Test
	public void positionStringTest7()
	{
		assertEquals("","67th",testComp.positionToString(67));
	}
	
	@Test
	public void printResultsTest1()
	{
		assertFalse("",testComp.printResult("123"));
	}
	
	@Test
	public void printResultsTest2()
	{
		assertFalse("",testComp.printResult("Q"));
	}
	
	@Test
	public void printResultsTest3()
	{
		setUp();
		List<Dog> expectedDogs = new ArrayList<>();
		Dog a = new Dog("fe",1);
		Dog b = new Dog("fo",27);
		expectedDogs.add(a);
		expectedDogs.add(b);
		
		List<Dog> actualDogs = new ArrayList<>();
		
		testComp.printResult("5");
		actualDogs = testComp.getListOfDogs();
		
		for(int i = 0; i < expectedDogs.size(); i++)
		{
			assertEquals(expectedDogs.get(i).getName(), actualDogs.get(i).getName());
			assertEquals(expectedDogs.get(i).getRating(), actualDogs.get(i).getRating());
		}
		
		tearDown();
	}
}

