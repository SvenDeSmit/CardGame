package be.sven.cardgame.domain;

import java.util.ArrayList;
import java.util.Vector;

public class Game {

	private Vector<Player> players = new Vector<Player>(4);
	private Vector<Tree> trees = new Vector<Tree>();
	
	private int currentDealerLocation = 1;
		
	public Game() {
		super();
		for (int i = 0;i<4;i++) {
			players.add(null);			
		}
	}

	public Vector<Player> getPlayers() {
		return players;
	}
	
	public Player getPlayer(int pLocation) {
		return players.elementAt(pLocation-1);
	}
	
	public void addPlayer(Player pPlayer,int pLocation) throws IllegalArgumentException {
		if (players.elementAt(pLocation-1) != null) {
			throw new IllegalArgumentException(String.format("Location %i is already taken", pLocation));
		}
		players.setElementAt(pPlayer, pLocation-1);	
	}
	
	public boolean allPlayersPresent() {
		boolean res = true;
		if(players.size() < 4) {
			res = false;
		} else {			
			for (Player player: players) {
				if (player== null) {
					res = false;					
				}
			}			
		}
		return res;		
	}
	
	public Vector<Integer> getAvailableLocations() {
		Vector<Integer> locations = new Vector<Integer>();
		int i = 1;
		for (Player player: players) {
			if (player == null) {
				locations.add(Integer.valueOf(i));					
			}
			i++;
		}		
		
		return locations;
	}
	
	public void deal() {
		Player currentDealer = players.get(currentDealerLocation - 1);
		currentDealer.deal(players);
		
	}
	
}
