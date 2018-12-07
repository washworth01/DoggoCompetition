package com.qa.william.ashworth.doggo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Competition myComp = new Competition();
		
		for(int i = 1; i < 101; i++)
		{
			Dog d = new Dog("fido",i);
			myComp.add(d);
		}
		Dog testDog = new Dog("Jaxin", 4);
		myComp.add(testDog);
		
		myComp.hashToList();
		boolean success;
		do
		{
			System.out.print("Do a thing: ");
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine(); 
			
			 success = myComp.printResult(choice);
		}while(success != true);
		
	}
}
