package com.tinywars.client.core;

/**
 * 
 * Stores information about the different tile types
 * 
 * @author James Young
 *
 */
public enum TileType {
	
	grass(0, "grass"),
	water(1, "water");
	
	int id;
	
	String textureName;
	
	TileType(int id, String textureName) {
		this.id = id;
		this.textureName = textureName;
	}

}
