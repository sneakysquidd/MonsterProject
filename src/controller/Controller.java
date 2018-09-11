package controller;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public Controller()
	{
		myMonster = new MarshmallowMonster("Jef", 0.33, 4, false, 2);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
