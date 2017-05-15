package units;

import java.util.ArrayList;

public class Attacker extends Unit{
	
	private int hp;
	private int power;
	private ArrayList<Weapon> weapons;
	//private Weapon weapon;
	
	public Attacker(int hp, int power)
	{
		super();
		//this.hp = hp;
		//this.power = power;
		weapons = new ArrayList<Weapon>();
	}
	
	public void attack()
	{
		
		
	}

	public void getWeapon(Weapon name)
	{
		weapons.add(name);
		
	}
	
}
