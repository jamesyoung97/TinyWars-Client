package com.tinywars.client.screen;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GameScreen screen;
	
	public GamePanel(GameScreen screen) {
		
		this.setScreen(screen);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		/**
		 * Start Rendering
		 */
		screen.getMap().draw(g2d);
		
	}

	/**
	 * @return the screen
	 */
	public GameScreen getScreen() {
		return screen;
	}

	/**
	 * @param screen the screen to set
	 */
	public void setScreen(GameScreen screen) {
		this.screen = screen;
	}

}
