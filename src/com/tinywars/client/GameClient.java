package com.tinywars.client;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.tinywars.client.screen.GameScreen;

/**
 * 
 * This class is where the {@link GameScreen} meets the {@link GameCore}
 * 		the client processes at 60fps updating {@link GameScreen} and {@link GameCore}
 * 
 * @author James Young
 *
 */
public class GameClient {
	
	/**
	 * Is the {@link GameClient} running
	 */
	private boolean running = false;
	
	/**
	 * Instance of {@link GameScreen} 
	 */
	private GameScreen screen;
	
	/**
	 * Initialises the {@link GameClient}
	 */
	public void initialise() {
		
		screen = new GameScreen("TinyWars Version: ", new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		
		this.setRunning(true);
	}
	
	/**
	 * Runs the {@link GameClient}
	 */
	public void run() {
		
		if (running)
			new Thread(screen).start();
		
	}

	/**
	 * Is the client running
	 * @return <code>boolean</code> running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Set the client to running state
	 * @param <code>boolean</code> running
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

	/**
	 * Gets instance of the screen
	 * @return {@link GameScreen} instance
	 */
	public GameScreen getScreen() {
		return screen;
	}

}
