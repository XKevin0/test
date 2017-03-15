
public class Deck extends Board{
	
	// Public Methods
	public void populate(){
		/*
		 *	FOR suit in Suits
		 * 		For rank in Ranks
		 *			SET card to Card with rank & suit
		 *			CALL cards.add with card
		 *		END FOR
		 * 	END FOR
		 */
		for (Suit suit: Suit.values()){ // Optimize loop order
			for (Rank rank: Rank.values()){
				Card card = new Card(rank, suit);
				card.flipCard();
				this.add(card);
			}
		}
	}
}
