package map;

import processing.core.PApplet;
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
		
		float xCor = 0;
		float yCor = 0;
		
		drawer.stroke(0, 0, 0);
		drawer.noFill();
		for(int y = 0; y < 15; y++) {
			for(int x = 0; x < 15; x++) {
				drawer.rect(xCor, yCor, height, width);
				xCor += width;
			}
			yCor += height;
			xCor = 0;
		}
		
	}
	

}
