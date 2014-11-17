package com.tinywars.client.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

/**
 * 
 * The Tile class stores game tile information
 * 
 * @author James Young
 *
 */
public class Tile {
	
	/**
	 * The tile ID
	 */
	private int id;
	
	/**
	 * The tile width
	 */
	private int width;
	
	/**
	 * The tile height
	 */
	private int height;
	
	/**
	 * The tile X coordinate
	 */
	private int x;
	
	/**
	 * The tile Y coordinate
	 */
	private int y;
	
	/**
	 * The tile type
	 */
	private TileType type;
	
	/**
	 * Is the mouse over tile
	 */
	private boolean mouseOver = false;
	
	/**
	 * Tile constructor
	 * 		Creates a new tile with set variables
	 * 
	 * @param width : tile width
	 * @param height : tile height
	 * @param x : x coordinate
	 * @param y : y coordinate
	 * @param type : tile type
	 */
	public Tile(int id, int width, int height, int x, int y, TileType type) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public boolean IsMouseOver(int x, int y) {
		
		if ((x <= (this.x + this.width) && x >= this.x) && (y <= (this.y + this.height) && y >= this.y)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Draws the tile to the screen
	 * @param g : the graphics device
	 */
	public void draw(Graphics2D g) {
		g.setColor(Color.BLUE);
		
		g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLUE);

		if (isMouseOver() == true) {
			g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		} else {
			g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
	}

	/**
	 * Gets the x coordinate
	 * @return x coordinate
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Gets the y coordinate 
	 * @return y coordinate
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Gets the tile height
	 * @return the height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Gets the tile width
	 * @return the width
	 */
	public int getWidth() {
		return this.width;
	}
	
	/**
	 * Gets the tile type
	 * @return the type
	 */
	public TileType getType() {
		return this.type;
	}
	
	/**
	 * Check if mouse is over the tile
	 * @return mouseOver tile
	 */
	public boolean isMouseOver() {
		return this.mouseOver;
	}

	/**
	 * Set the mouse over object true
	 * @param mouseOver 
	 */
	public void setMouseOver(boolean mouseOver) {
		this.mouseOver = mouseOver;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
