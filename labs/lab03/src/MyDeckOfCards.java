import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyDeckOfCards implements DeckADT{

    List<String> deck = new ArrayList<>();
    String[] suits = {"S", "C", "H", "D"};
    String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public void initialize() {
        String cardNum;
        String currentSuit;
        for(int i = 0; i < 4; i++)
        {
            currentSuit = suits[i];
            for (int x = 0; x < 13; x++)
            {
                cardNum = cards[x];
                deck.add(cardNum + currentSuit);
            }
        }
        System.out.println(deck);
    }

    public String drawRandomCard() {
        Random rand = new Random();
        int r = rand.nextInt(deck.size());
        return(deck.get(r));
    }

    public String drawTopCardFromDeck() {
        return (deck.get(0));
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println(deck);
    }

    public static void main(String args[]) {
        MyDeckOfCards one = new MyDeckOfCards();
        System.out.println("\nDeck 1");
        one.initialize();
        System.out.println(one.drawRandomCard());
        System.out.println(one.drawTopCardFromDeck());
        one.shuffleDeck();

        MyDeckOfCards two = new MyDeckOfCards();
        System.out.println("\nDeck 2");
        two.initialize();
        System.out.println(two.drawRandomCard());
        System.out.println(two.drawTopCardFromDeck());
        two.shuffleDeck();

        MyDeckOfCards three = new MyDeckOfCards();
        System.out.println("\nDeck 3");
        three.initialize();
        System.out.println(three.drawRandomCard());
        System.out.println(three.drawTopCardFromDeck());
        three.shuffleDeck();

    }

}
