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
		myMonster = new MarshmallowMonster("0", 0.33, 4, false, 2, "h");
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
		
//------------------------Name Section---------------------------------------------------------------------------
		
		String userInputName = JOptionPane.showInputDialog(null, "What is the monster's name");		
		userMonster.setName(userInputName);
		
//------------------------Leg Section----------------------------------------------------------------------------
		
		//System.out.println("how many legs does the monster have?");
		String userInputLegs = JOptionPane.showInputDialog(null, "How many legs does the monster have?");
		double legs = -99;
		if (validDouble(userInputLegs))
		{
			legs = Double.parseDouble(userInputLegs);
		}
		//Double legCount = inputScanner.nextDouble();
		userMonster.setlegCount(legs);
		
//---------------------------------------------------------------------------------------------------------------
	
		
//------------------------Arm Section----------------------------------------------------------------------------		
		
		//System.out.println("how many arms does the monster have?");
		String userInputArms = JOptionPane.showInputDialog(null, "How many arms does the monster have?");
		int arms = -99;
		if (validInt(userInputArms))
		{
			arms = Integer.parseInt(userInputArms);
		}
		//int armCount = inputScanner.nextInt();
		userMonster.setarmCount(arms);
		
		
		
//------------------------Eye Section----------------------------------------------------------------------------		
		//System.out.println("how many eyes does the monster have?");
		//int eyeCount = inputScanner.nextInt();
		String userInputEyes = JOptionPane.showInputDialog(null, "How many eyes does the monster have?");
		int eyes = -99;
		if (validInt(userInputEyes))
		{
			eyes = Integer.parseInt(userInputEyes);
		}
		userMonster.seteyeCount(eyes);
	
//---------------------------------------------------------------------------------------------------------------
	
		
//-----------------------Nose Section----------------------------------------------------------------------------
		//System.out.println("Does the monster have a nose?");
		//boolean hasNoses = inputScanner.nextBoolean();
		String userInputNose = JOptionPane.showInputDialog(null, "Is it true or false that the monster has a nose?");
		boolean nose = Boolean.parseBoolean(userInputNose);
		
		userMonster.sethasNoses(nose);	

//---------------------------------------------------------------------------------------------------------------		
	
		
//-----------------------------If Block Spooky Saying------------------------------------------------------------
		String userAnswer = JOptionPane.showInputDialog(null, "Does your monster say something spooky?");
		if (userAnswer.startsWith("y"))
		{
			String userInputPhrase = JOptionPane.showInputDialog(null, "What does your monster say?");		
			userMonster.setPhrase(userInputPhrase);
		}
		else
		{
			JOptionPane.showInputDialog(null, "Your monster is dum lol");
		}
		
		
//--------------------Prints Monster's Attributes-----------------------------------------------------------------
		JOptionPane.showMessageDialog(null, "This monster is named " + userInputName + 
				" and it had " + legs + " legs \n" + 
				"it has " + eyes + " eyes and " + "it also has " + arms + " arms it is " + nose + " that he has a nose" + 
				" the monster is spooky and he says " + userMonster.getPhrase() );
	
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


