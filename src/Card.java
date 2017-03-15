
public class Card {
	
	// Private Fields
	private Suit suit;
	private Rank rank;
	private boolean isFaceUp;
	
	// Constructor Method
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
		isFaceUp = false;
	}
	
	// Public Methods
	public String getSuit(){
		return suit.printSuit();
	}
	public int getRank(){
		return rank.getRank();
	}
	public String toString(){
		String str = " ";
		if (isFaceUp) {
			str += rank.printRank() + " of " + 
			suit.printSuit();
		} else {
			str = "Face Down";
		}
		return str;
	}
	public void flipCard(){
		isFaceUp = !isFaceUp;
	}
}
