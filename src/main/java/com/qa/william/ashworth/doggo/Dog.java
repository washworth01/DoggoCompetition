package com.qa.william.ashworth.doggo;

import java.util.Random;

public class Dog 
{
	private String name;
	private int rating;
	
	public Dog()
	{
		Random r = new Random();
		this.name = "Fido";
		this.rating = r.nextInt(6) + 1;
	}
	
	public Dog(String name, int rating)
	{
		this.setName(name);
		this.setRating(rating);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString()
	{		return "This Dog is called: " + this.name + " and they are a good boy, and they placed ";
	}
}
