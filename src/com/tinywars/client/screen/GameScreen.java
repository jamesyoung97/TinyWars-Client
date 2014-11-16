package com.tinywars.client.screen;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.tinywars.client.core.Map;

public class GameScreen extends JFrame implements Runnable {
	
	/**
	 * Default generated serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instance of the GamePanel
	 */
	private GamePanel panel;
	
	/**
	 * Optimal update time (1 second)
	 */
	protected final long OPTIMAL_TIME_BETWEEN_UPDATES = 1000;  

	/**
	 * The screen width
	 */
	private int screenWidth;
	
	/**
	 * The screen height
	 */
	private int screenHeight;
	
	private Map map;
	
	int[][] testMap = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
	};
	
	/**
	 * {@link GameScreen} constructor
	 * 		builds the JFrame and attaches the {@link GamePanel}
	 * @param name
	 * @param d
	 */
	public GameScreen(String name, Dimension d) {
		this.setScreenWidth(d.width);
		this.setScreenHeight(d.width);
		
		panel = new GamePanel(this);
		
		this.setTitle(name);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(panel);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(this.getScreenWidth(), this.getScreenHeight());
		
		this.setMap(new Map(testMap));
		
	}

	/**
	 * Run the {@link GameScreen}
	 */
	@Override
	public void run() {
        long lastUpdateTime = System.currentTimeMillis();

		while(true)
		{
			double now = System.currentTimeMillis();
			
			/**
			 * Accept input
			 */
			
			/**
			 * Process client core
			 */
			
			/**
			 * Render to screen
			 */
			panel.repaint();
			
			lastUpdateTime = (long) now;
			if (now - lastUpdateTime > OPTIMAL_TIME_BETWEEN_UPDATES) { //update took too long
				System.out.println("World update took: " + (OPTIMAL_TIME_BETWEEN_UPDATES - (now - lastUpdateTime))
						+ " longer than the optimal update time");
				try {
					Thread.sleep((long) (OPTIMAL_TIME_BETWEEN_UPDATES - (now - lastUpdateTime))); //Sleep untill next update 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					Thread.sleep((long) (OPTIMAL_TIME_BETWEEN_UPDATES - (now - lastUpdateTime)));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Get the screen width
	 * @return the screenWidth
	 */
	public int getScreenWidth() {
		return screenWidth;
	}

	/**
	 * Set the screen width
	 * @param screenWidth the screenWidth to set
	 */
	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	/**
	 * Get the screen height
	 * @return the screenHeight
	 */
	public int getScreenHeight() {
		return screenHeight;
	}

	/**
	 * Set the screen height
	 * @param screenHeight the screenHeight to set
	 */
	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	/**
	 * @return the map
	 */
	public Map getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map map) {
		this.map = map;
	}
	
}
