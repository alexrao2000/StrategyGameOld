package map;

import units.Unit;

/**
 * This class represents a spot on the grid.
 * 
 * @author aghatge738
 *
 */
public class Tile {
	private String terrain;
	private Unit unit;
	
	public Tile(String terr, Unit object) {
		terrain = terr;
		unit = object;
	}
	
	public Unit getUnit() {
		return unit;
	}
	
	public String getTerrain() {
		return terrain;
	}
	
	public void addUnit(Unit object) {
		unit = object;
	}
	
	public void removeUnit() {
		unit = null;
	}

}
