package com.tinywars.client.core;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 * 
 * The Map class creates a new game map and stores
 * 		all game tiles for that map in the <code>gameMap</code> arrayList
 * 
 * @author James Young
 *
 */
public class Map {
	
	/**
	 * The tile width
	 */
	private final int tileWidth = 64;
	
	/**
	 * The tile height
	 */
	private final int tileHeight = 32;
	
	/**
	 * List of all tiles in the world
	 */
	private ArrayList<Tile> gameMap;
	
	/**
	 * Map constructor
	 * 		Gets a integer array and builds map
	 * @param inMap : map to build
	 */
	public Map(int[][] inMap) {
		gameMap = new ArrayList<Tile>();
		for (int y = 0; y < inMap.length; y++) {
			for (int x = 0; x < inMap[y].length; x++) {
				int tileX = x * tileWidth;
				int tileY = y * tileHeight;
				PlaceTile(inMap.length, tileWidth, tileHeight, tileX, tileY, inMap[x][y]);
				//System.out.println("Tile created X: " + tileX + " Y:" + tileY + " Type: " + inMap[x][y]);
			}
		}
	}
	
	/**
	 * Adds a tile to the <code>gameMap</code>
	 * 
	 * @param width : tile width
	 * @param height : tile height
	 * @param x : x coordinate
	 * @param y : y coordinate
	 * @param type : tile type
	 */
	private void PlaceTile(int id, int width, int height, int x, int y, int type) {
		switch(type) {
			case 0: 
				gameMap.add(new Tile(id, width, height, x, y, TileType.grass));
			case 1:
				gameMap.add(new Tile(id, width, height, x, y, TileType.water));
			default:
				break;
		}
	}
	
	/**
	 * Draws the map to the screen
	 */
	public void draw(Graphics2D g) {
		for (Tile t : gameMap) {
			if(t != null) {
				t.draw(g);
			}
		}
	}
	
	/**
	 * Returns list of all tiles in the map
	 * @return tile arraylist
	 */
	public ArrayList<Tile> getTiles() {
		return gameMap;
	}

}
