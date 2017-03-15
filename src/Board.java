import java.util.ArrayList;


public class Board {
	
	// Attributes 
	private ArrayList<Card> cards;
	
	// Constructor
	public Board(){
		cards = new ArrayList<Card>();
	}
	
	// Public Methods
	public void clear(){
		cards.clear();
	}
	public void setup(Card card){
		
	}
	public void add(Card card){
		cards.add(card);
	}
	public String showBoard(){
		String str = "";
		for (Card c: cards){
			str += c.toString() + "\n";
		}
		return str;
	}

}
