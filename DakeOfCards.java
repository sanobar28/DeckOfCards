/**
 * 
 * @author Sanobar Mujawar
 * @since 17.06.21
 * 
 * Purpose: To perform deck of cards problem using oop and 
 * Data structure concepts
 *
 */

package workshop;

public class DakeOfCards {
	
	private static final int SIZE = 52;
    private static Card[] deckOfCards = new Card[SIZE]; //created dake of cards of size 52

    /**
     * UC-1 Method to return dake of cards with suits and ranks
     * @return
     */
    public static Card[] getDeckOfCards() {

        int count = 0;

        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String s : suits) {
            for (String r : ranks) {

                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }

        return deckOfCards;

    }    
}
	

