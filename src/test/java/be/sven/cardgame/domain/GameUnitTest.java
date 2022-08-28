package be.sven.cardgame.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameUnitTest {

	@Test
	void testAddPlayer() {
		Game game = new Game();
		game.addPlayer(new Player("Sven",3), 3);		
		assertNotNull(game.getPlayer(3));
		assertEquals("Sven", game.getPlayer(3).getName());
		
	}

	@Test
	void testAddPlayerAtTakenLocation() {
		Game game = new Game();
		game.addPlayer(new Player("Sven",3), 3);	
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    	game.addPlayer(new Player("Pieter",3), 3);
	    	});
		
	}
	
	@Test
	void testAllPlayersPresent() {
		Game game = new Game();
		game.addPlayer(new Player("Player1",1), 1);	
		game.addPlayer(new Player("Player2",2), 2);	
		game.addPlayer(new Player("Player3",3), 3);	
		game.addPlayer(new Player("Player4",4), 4);
		assertTrue(game.allPlayersPresent());	
	}
	
	@Test
	void testAllPlayersPresentNOK() {
		Game game = new Game();
		game.addPlayer(new Player("Player1",1), 1);	
		game.addPlayer(new Player("Player2",2), 2);	
		game.addPlayer(new Player("Player3",3), 3);	
		assertFalse(game.allPlayersPresent());	
	}

	@Test
	void testGetAvailableLocations1() {
		Game game = new Game();
		game.addPlayer(new Player("Player1",1), 1);	
		game.addPlayer(new Player("Player2",2), 2);	
		game.addPlayer(new Player("Player3",3), 3);
		assertEquals(1, game.getAvailableLocations().size());			
		assertEquals(4, game.getAvailableLocations().get(0).intValue());	
	}

	@Test
	void testGetAvailableLocations2() {
		Game game = new Game();
		game.addPlayer(new Player("Player1",1), 1);	
		game.addPlayer(new Player("Player3",3), 3);
		assertEquals(2, game.getAvailableLocations().size());			
		assertEquals(2, game.getAvailableLocations().get(0).intValue());	
		assertEquals(4, game.getAvailableLocations().get(1).intValue());	
	}
	

}
