package be.sven.cardgame.domain;

import java.util.Vector;

public class Player {
	
	private String name;
	private int location;
	private Hand hand; 
	public String getName() {
		return name;
	}

	public Player(String pName,int pLocation) {
		name = pName;
	}
	
	public void deal(Vector<Player> players) {
		Vector<Player> dealOrderPlayers = new Vector<Player>();
		int nextLocation = getNextLocation(location);
		for(Player player: players) {
			dealOrderPlayers.add
			int nextPlayerLocation = 
			
		}
		
	}
	
	private int getNextLocation(int location) {
		if(location < 3) {
			return location++;
		} else {
			return 0;
		}
	}
	 
	
	

}
