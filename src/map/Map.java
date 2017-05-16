package map;

import java.awt.Graphics;

import units.Unit;

public class Map {
	
	private Tile[][] map;
	
	public Map() {
		map = new Tile[15][15];
	}
	
	public Tile getTile(int r, int c) {
		if(r >= 15 || r < 0) {
			if(c >= 15 || c < 0) {
				return map[r][c];
			}
		}
		return null;
	}
	
	public Unit getAdjacentObject() {
		
		
		
		return null;
	}
	
	public void paintComponent(Graphics g) {
		
	}
	

}
