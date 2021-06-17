
public class Cards {

	public final static int SPADES = 0; // Codes for the 4 suits
	public final static int HEARTS = 1;
	public final static int DIAMONDS = 2;
	public final static int CLUBS = 3;

	public final static int ACE = 1; 
	public final static int JACK = 11; // Cards 2 through 10 have their
	public final static int QUEEN = 12; // numerical values for their codes.
	public final static int KING = 13;

	String[] cardsArray = new String[52]; //array of 52 unique cards

	public String[] getCardsArray() {
		return cardsArray;
	}

	public void setCardsArray(String[] cardsArray) {
		this.cardsArray = cardsArray;
	}
	
}
