/**
 * This is runner class for players
 */

package workshop;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Players[] players = new Players[4];
		Card[] deck = DakeOfCards.getDeckOfCards();

		/**
		 * UC-3 added 4 players to the game
		 */
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter Player Name: ");
			players[i] = new Players(input.nextLine());
		}

		Players[] playersWithCards = DakeOfCards.distributeCards(players, deck); // distribute cards

		System.out.println("---------------------------------------------");

		for (Players player : playersWithCards) {
			System.out.println(player.getName());
			player.showPlayerCards();
		}
	}
}