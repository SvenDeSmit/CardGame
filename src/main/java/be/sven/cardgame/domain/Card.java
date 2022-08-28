package be.sven.cardgame.domain;



public class Card {
	
	private char colour;
	private String number; 
	
	public Card(char pColour,String pNumber) {
		colour = pColour;
		number = pNumber;
	}
	
	@Override
    public String toString() { 
        return Character.toString(colour) + number; 
    } 

}
