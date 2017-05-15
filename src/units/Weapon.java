package units;

public class Weapon 
{
	private String name;
	private int strength;
	
	public Weapon(String name, int strength)
	{
		this.name = name;
		this.strength = strength;
	}
	
	public void alterStrength(int amount)
	{
		strength += amount;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getStrength()
	{
		return strength;
	}
}
