import java.util.ArrayList;
import java.util.Collections;

import java.util.stream.Collectors;

public class Player  {

   
    private String type;

   
    private boolean skippedRecentTurn;

   
    private ArrayList<Card> hand = new ArrayList<>();

    
   
    public String toString() {
        return Character.toUpperCase(this.type.charAt(0)) + this.type.substring(1);
    }

   
    public void takeCardFromTopOfDeck(ArrayList deck) {
        Card card = (Card) deck.get(0);

        this.hand.add(card);
        deck.remove(card);
    }

    
    public Card playCard(int cardChoice) {
        return this.hand.get(cardChoice - 1);
    }

   
    

   
    public int numberOfCardsInHand() { return this.hand.size(); }

   
    public ArrayList<Card> getHand() { return this.hand; }

   
    public boolean canPlayCardThisTopCard(String newSuit, Card topCard) {
        boolean isplayable = false;

        for (Card card : this.hand) {

            if (card.getValue().equals("8")) {
                isplayable = true;
                break;
            }

            if (newSuit.length() > 0 && card.getType().equals(newSuit)) {
                isplayable = true;
                break;
            }

            if ((newSuit.length() == 0) && (card.getValue().equals(topCard.getValue())
                || card.getType().equals(topCard.getType()))) {

                isplayable   = true;
                break;
            }
        }

        return isplayable;
    }

   

   
    public void setSkipStatus(boolean status) {
        this.skippedRecentTurn = status;
    }

   
    public boolean skipped() { return this.skippedRecentTurn; }
}
