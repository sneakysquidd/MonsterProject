package model;

public class MarshmallowMonster
{
//-----Declaration section----------------------------------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	private String Phrase;
//----------------------------------------------------------	
	
	public MarshmallowMonster()
	{
		//Default Constructor
		//Generally boring and not as helpful
		//Initializes default object
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms, String Phrase)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;		
		this.Phrase = Phrase;
	}
	
//------------Getter-----------------------------------------
	public String getName()
	{
		return name;
	}
	
	public double getlegCount()
	{
		return legCount;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}

	public boolean gethasNoses()
	{
		return hasNoses;
	}
	
	public int getarmCount()
	{
		return armCount;
	}
	
	public String getPhrase()
	{
		return Phrase;
	}
//-----------------------------------------------------------	
	
//------------Setter-----------------------------------------
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setlegCount(Double legCount)
	{
		this.legCount = legCount;
	}
	
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void sethasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setPhrase(String Phrase)
	{
		this.Phrase = Phrase;
	}
//-----------------------------------------------------------	
	
//-----Prints at end of program says features of monster-----
	public String toString()
	{
		String description = "This monster is named " + name
			                   + " and it had " + legCount + " legs "
			                   +"it has " + eyeCount + " eyes and \n" + "it also has " + armCount + " arms it is " + hasNoses + " that he has a nose"
			                   +"\nthe monster is spooky and he says Alakazam" + Phrase
			                   ;
		return description;
	}
	
}
//-----------------------------------------------------------