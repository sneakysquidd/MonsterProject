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
		String description = "";
		
		return description;
	}
	
}
