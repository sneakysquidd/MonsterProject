package controller;

import model.MarshmallowMonster;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	//private Scanner inputScanner;
	//Constructors initialize data members!
	public Controller()
	{
		myMonster = new MarshmallowMonster("0", 0.33, 4, false, 2);
		userMonster = new MarshmallowMonster();
		//inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);
		System.out.println(myMonster);
		
		//System.out.println("What is the monster's name?");
		//JOptionPane.showMessageDialog(null, "What is the monster's name?");
		//String name = inputScanner.nextLine();
		
		String userInputName = JOptionPane.showInputDialog(null, "What is the monster's name");		
		userMonster.setName(userInputName);
		
		//System.out.println("how many legs does the monster have?");
		String userInputLegs = JOptionPane.showInputDialog(null, "How many legs does the monster have?");
		double legs = -99;
		if (validDouble(userInputLegs))
		{
			legs = Double.parseDouble(userInputLegs);
		}
		//Double legCount = inputScanner.nextDouble();
		userMonster.setlegCount(legs);
	
		//System.out.println("how many arms does the monster have?");
		String userInputArms = JOptionPane.showInputDialog(null, "How many arms does the monster have?");
		int arms = -99;
		if (validInt(userInputArms))
		{
			arms = Integer.parseInt(userInputArms);
		}
		//int armCount = inputScanner.nextInt();
		userMonster.setarmCount(arms);
		
		//System.out.println("how many eyes does the monster have?");
		//int eyeCount = inputScanner.nextInt();
		String userInputEyes = JOptionPane.showInputDialog(null, "How many eyes does the monster have?");
		int eyes = -99;
		if (validInt(userInputEyes))
		{
			eyes = Integer.parseInt(userInputEyes);
		}
		userMonster.seteyeCount(eyes);
		
		//System.out.println("Does the monster have a nose?");
		//boolean hasNoses = inputScanner.nextBoolean();
		String userInputNose = JOptionPane.showInputDialog(null, "Is it true or false that the monster has a nose?");
		boolean nose = Boolean.parseBoolean(userInputNose);
		
		userMonster.sethasNoses(nose);	

		
		JOptionPane.showMessageDialog(null, "This monster is named " + userInputName + 
				" and it had " + legs + " legs \n" + 
				"it has " + eyes + " eyes and " + "it also has " + arms + " arms it is " + nose + " that he has a nose" + 
				" the monster is spooky and he says Alakazam");
		
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a number :/");
		}
		return isValid;
	}
	
	public boolean validDouble(String mightbeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightbeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "Type in a decimal value aka a number with a . in it");
		}
		
		return isValid;
	
	}
}


