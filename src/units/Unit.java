package units;

/**This class represents a Unit object on the grid
 * 
 * @author ewan633
 *
 */
public class Unit {
	
	private int hp;
	private int power;
	
	/**
	 * Creates a default unit with both hp and power at 10
	 */
	public Unit()
	{
		hp = 10;
		power = 10;
	}
	
	/**Creates a unit
	 * 
	 * @param hp the amount of health points the unit will have
	 * @param power the amount of damage/healing the unit will do
	 */
	public Unit(int hp, int power)
	{
		this.hp = hp;
		this.power = power;
	}
	
	/**Heals the unit
	 * 
	 * @param healer the healer that is healing the unit
	 */
	public void getHealed(Healer healer)
	{
		hp += healer.getPower();
		
	}
	
	/**Makes the unit suffer damage
	 * 
	 * @param weapon the weapon used to attack this unit
	 */
	public void takeDamage(Weapon weapon)
	{
		hp -= weapon.getStrength();
		
	}
	
	/**Makes unit die and removes him from grid
	 * 
	 */
	public void die()
	{
		
		
	}
	
	/**Moves the unit
	 * 
	 */
	public void move()
	{
		
		
	}
	
	/**Returns the power level of the unit
	 * 
	 * @return the current power of the unit
	 */
	public int getPower()
	{
		return power;
		
	}
	
	/**Levels the unit up; increases hp and power by a random number
	 * 
	 */
	public void levelUp()
	{
		hp += (int)(Math.random()*10);
		power += (int)(Math.random()*10);
	}
}
