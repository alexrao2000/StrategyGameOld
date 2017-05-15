package units;

public class Unit {
	
	private int hp;
	private int power;
	
	public Unit()
	{
		hp = 10;
		power = 10;
	}
	
	public Unit(int hp, int power)
	{
		this.hp = hp;
		this.power = power;
	}
	
	public void getHealed(Healer healer)
	{
		hp += healer.getPower();
		
	}
	
	public void takeDamage(Weapon name)
	{
		hp -= name.getStrength();
		
	}
	
	public void die()
	{
		
		
	}
	
	public void move()
	{
		
		
	}
	
	public int getPower()
	{
		return power;
		
	}
	
}
