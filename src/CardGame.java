
public class CardGame {

	public static void main(String[] args)
	{
		Deck deck = new Deck();
		
		while (deck.getCardLeft()>0)
		{
			System.out.printf(deck.DealCard().toString() + " Cards left in the deck: %d \n", deck.getCardLeft());
		}
	}
}
