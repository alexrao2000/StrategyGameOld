package map;

import units.Unit;
import processing.core.PApplet;

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
	
	public Unit getAdjacentObject(int r, int c, int degrees) {
		if(degrees == 0) {
			if(r+1 < 15) {
				return map[r+1][c].getUnit();
			} else {
				return null;
			}
		} else if(degrees == 90) {
			if(c-1 >+ 0) {
				return map[r][c-1].getUnit();
			} else {
				return null;
			}
		} else if(degrees == 180) {
			if(r-1 >= 0) {
				return map[r-1][c].getUnit();
			} else {
				return null;
			}
		} else {
			if(c+1 < 15) {
				return map[r][c+1].getUnit();
			} else {
				return null;
			}
		}
	}
	
	
	public void draw(PApplet drawer) {
		float height = drawer.height/15f;
		float width = drawer.width/15f;
		
		drawer.stroke(0, 0, 0);
		drawer.noFill();
		
		float xCor = width, yCor = height;
		for(int x = 0; x < 15; x++) {
			drawer.line(0, yCor, drawer.width, yCor);
			drawer.line(xCor, 0, xCor, drawer.height);
			xCor += height;
			yCor += width;
		}
		
	}
	

}
