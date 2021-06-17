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

import java.util.Random;

public class DakeOfCards {

	private static final int SIZE = 52;
	private static Card[] deckOfCards = new Card[SIZE]; // created dake of cards of size 52

	/**
	 * UC-1 Method to return dake of cards with suits and ranks
	 * 
	 * @return
	 */
	public static Card[] getDeckOfCards() {

		int count = 0;

		String[] suits = { "Diamonds", "Clubs", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		for (String s : suits) {
			for (String r : ranks) {

				Card card = new Card(s, r);
				deckOfCards[count] = card;
				count++;
			}
		}

		return deckOfCards;
	}

	/**
	 * UC-4 Method to shuffle the 52 cards using random class
	 * 
	 * @param deckOfCards
	 * @return
	 */
	public static Card[] shuffleCards(Card[] deckOfCards) {
		Random rand = new Random();
		int j;
		for (int i = 0; i < SIZE; i++) {
			j = rand.nextInt(SIZE);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
		return deckOfCards;
	}

	
	/**
	 * UC-5 Method to distribute 52 cards in 4 players
	 * @param players
	 * @param deck
	 * @return
	 */
	public static Players[] distributeCards(Players[] players, Card[] deck) {

		int numOfCardsPerPlayer = deck.length / players.length;
		for (int i = 0; i < deck.length; i++) {
			int positionInHand = i % numOfCardsPerPlayer;
			players[i % players.length].receiveCard(deck[i], positionInHand);
		}
		
		return players;
	}

}
