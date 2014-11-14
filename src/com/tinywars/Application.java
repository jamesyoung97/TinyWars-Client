package com.tinywars;

public class Application {

	public static void main(String[] args) {
		
		GameClient client = new GameClient();
		
		client.initialise();
		
		client.run();
		
	}

}
