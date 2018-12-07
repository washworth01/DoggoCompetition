package com.qa.william.ashworth.doggo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Competition 
{
	private List<Dog> listOfDogs = new ArrayList<>();
	private HashMap<Integer, Dog> hashOfDogs = new HashMap<>();
	
	public void add(Dog d)
	{
		hashOfDogs.put(d.getRating(),d);
	}
	
	public void hashToList()
	{
		Iterator<Entry<Integer, Dog>> it = hashOfDogs.entrySet().iterator();
		
		while (it.hasNext())
		{
			Entry<Integer, Dog> entry = it.next();
			listOfDogs.add(entry.getValue());
		}
	}
	
	public boolean printResult(String selection)
	{	
		try
		{
			int number;
			number = Integer.parseInt(selection);
			if(number > 100)
			{
				System.out.println("Error!: Invalid Entry.");
				return false;
			}
			listOfDogs = listOfDogs.stream()
				.filter(dog -> dog.getRating() != number)
				.sorted(Comparator.comparing(Dog::getRating))
				.collect(Collectors.toList());
				
					
				for(Dog d : listOfDogs)
				{
					System.out.print(d);
					System.out.println(positionToString(d.getRating()));
				}
					
				return true;
		} catch(Exception e)
		{
			System.out.println("Error!: Invalid Entry.");
			return false;
		}
		
		
	}
		
	
	public String positionToString(int i)
	{
		switch(i%10)
		{
			case 1:
				if(i != 11) //check for 100+
				{
					return i + "st";
				}
				else
				{
					return i + "th";
				}
			case 2:
				if(i != 12)
				{
					return i + "nd";
				}
				else
				{
					return i + "th";
				}
			case 3:
				if(i != 13)
				{
					return i + "rd";
				}
				else
				{
					return i + "th";
				}
			default:
				return i + "th";
		}
	}
	
	public List<Dog> getListOfDogs()
	{
		return this.listOfDogs;
	}
}
