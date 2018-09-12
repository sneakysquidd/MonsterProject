package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	//Constructors initialize data members!
	public Controller()
	{
		myMonster = new MarshmallowMonster("0", 0.33, 4, false, 2);
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
		System.out.println("What is the monster's name?");
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		
		System.out.println("how many legs does the monster have?");
		Double legCount = inputScanner.nextDouble();
		userMonster.setlegCount(legCount);
		
		System.out.println("how many arms does the monster have?");
		int armCount = inputScanner.nextInt();
		userMonster.setarmCount(armCount);
		
		System.out.println("how many eyes does the monster have?");
		int eyeCount = inputScanner.nextInt();
		userMonster.seteyeCount(eyeCount);
		
		System.out.println("Does the monster have a nose?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.sethasNoses(hasNoses);	
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("This monster is named " + name + 
		" and it had " + legCount + " legs \n" + 
		"it has " + eyeCount + " eyes and " + "it also has " + armCount + " arms it is " + hasNoses + " that he has a nose" + 
		" the monster is spooky and he says Alakazam");
	}
	
	
	
}


