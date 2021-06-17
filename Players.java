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

	public void receiveCard(Card card, int position) {
		cards[position] = card;
	}

	String getName() {
		return name;
	}

}
