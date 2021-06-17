/**
 * Player class stores player name and array of cards received
 */

package workshop;

public class Players {

	private String name;
	private Card[] cards = new Card[13];

	Players(String name) {
		this.name = name;
	}
	
	/**
	 * UC-6 Method to print the cards each player got 
	 */
	public void showPlayerCards() {
		System.out.println("---------------------------------------------");
		for (Card card : cards) {

			System.out.printf("%s  of %s\n", card.rank, card.suit);	
		}
		
		System.out.println("---------------------------------------------");
	}
	
	public void receiveCard(Card card, int position) {
		cards[position] = card;
	}

	String getName() {
		return name;
	}

}
