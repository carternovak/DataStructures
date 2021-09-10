

public interface DeckADT {

    // create a full set of cards (52, no jokers)
    public void initialize();

    // draw a card, and return the card as string
    // using single-letter representation for suits
    public String drawRandomCard();

    public String drawTopCardFromDeck();

    public void shuffleDeck();

}
