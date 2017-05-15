package units;

import java.util.ArrayList;

public class Attacker extends Unit{
	
	private int hp;
	private int power;
	private ArrayList<Weapon> weapons;
	//private Weapon weapon;
	
	/**Creates an attacker object that can move and attack
	 * 
	 * @param hp the attacker's health points
	 * @param power the amount of damage the attacker inflicts
	 */
	public Attacker(int hp, int power)
	{
		super();
		//this.hp = hp;
		//this.power = power;
		weapons = new ArrayList<Weapon>();
	}
	
	/**makes the attacker attack an enemy
	 * 
	 */
	public void attack()
	{
		
		
	}
	
	/**Makes the attacker get a weapon
	 * 
	 * @param weapon the weapon being collected
	 */
	public void getWeapon(Weapon weapon)
	{
		weapons.add(weapon);
		
	}
	
}
