package units;

public class Healer extends Unit
{
	private int hp;
	private int power;
	
	public Healer()
	{
		super();
		
	}

	public void heal(Unit other)
	{
		other.getHealed(this);
		
	}
	
}
