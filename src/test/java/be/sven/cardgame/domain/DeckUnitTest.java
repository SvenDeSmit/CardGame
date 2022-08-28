package be.sven.cardgame.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckUnitTest {

	@Test
	void testConstuctor() {
		Deck deck = new Deck();
		//System.out.println(deck);
		assertEquals(32, deck.getCards().size());
	}

}
