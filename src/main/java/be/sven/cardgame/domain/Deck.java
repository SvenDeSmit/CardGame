package be.sven.cardgame.domain;

import java.util.Collections;
import java.util.Vector;

public class Deck {

	private Vector<Card> cards = new Vector<Card>(32); 
	
	private char[] colours = {'H','T','S','C'};
	private String[] numbers = {"1","7","8","9","10","J","Q","K"};
	
	public Deck() {
		for(String nbr: numbers) {
			for(char c: colours) {
				cards.add(new Card(c,nbr));
			}
		}
		randomShuffle(cards);
	}

	public Vector<Card> getCards() {
		return cards;
	}
	
	private void randomShuffle(Vector<Card> v) {
		Collections.shuffle(v);
	}
	
	@Override
    public String toString() {
		StringBuffer sb = new StringBuffer();
		for(Card card: cards) {
			sb.append(card.toString());
			sb.append(";");
		}
        return sb.toString(); 
    } 

}
