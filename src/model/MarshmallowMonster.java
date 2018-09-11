package model;

public class MarshmallowMonster
{
	//-----Declaration section------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default Constructor
		//Generally boring and not as helpful
		//Initializes default object
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
				
	}
	
	
	public String toString()
	{
		String description = "This monster is named " + name
			                   + " and it had " + legCount + " legs "
			                   +"it has " + eyeCount + " eyes and \n" + "it also has " + armCount + " arms it is " + hasNoses + " that he has a nose"
			                   +"\nthe monster is spooky and he says Alakazam"
			                   ;
		return description;
	}
	
}
