package com.tinywars;

import com.tinywars.client.GameClient;

/**
 * 
 * The Application class serves as the client entrance point
 * 		It sets up and runs the {@link GameClient}
 * 
 * @author James Young
 *
 */
public class Application {

	/**
	 * Program entrance point
	 * @param <code>String[]</code> args
	 */
	public static void main(String[] args) {
		
		/**
		 * Create instance of GameClient
		 */
		GameClient client = new GameClient();
		
		/**
		 * Initialise the GameClient
		 */
		client.initialise();
		
		/**
		 * Run the GameClient
		 */
		client.run();
		
	}

}
