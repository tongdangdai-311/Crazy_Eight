import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Rules {

   
    public static final int CARDS_TO_DEAL = 7;

    public static final int NUMBER_OF_DECKS = 1;

   
    private static final Map<String, Integer> CARD_VALUES = initMap();
    private static Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("Jack", 11);
        map.put("Queen", 12);
        map.put("King", 10);
        map.put("Ace", 1);

        return Collections.unmodifiableMap(map);
    }

    
    public static Player randomPlayer(Player player, Player player1) {
        ArrayList<Player> players = new ArrayList<>(2);

        players.add(player);
        players.add(player1);

        Collections.shuffle(players);

        return players.get(0);
    }

   
    public static boolean checkForValidPlay(String newSuit, Card upCard, Card layedDown) {
        boolean validPlay = false;
////THE CODE FOR CHECKING FOR PLAYING THE CARD
////*
///
       if (layedDown.getValue().equals(player.)) {
            validPlay = true;
        }
        else if (newSuit.length() > 0) {
            if (layedDown.getType().equals(newSuit)) {
                validPlay = true;
            }
        }
        else {
            if (upCard.getType().equals(layedDown.getType())) {
                validPlay = true;
            }
            else if (upCard.getValue().equals(layedDown.getValue())) {
                validPlay = true;
            }
        }

        return validPlay;
    }

   
    public static Game.Status determineWinner(Player player, Player player1) {

        int playerPoints = 0;
   import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Rules {

   
    public static final int CARDS_TO_DEAL = 7;

    public static final int NUMBER_OF_DECKS = 1;

   
    private static final Map<String, Integer> CARD_VALUES = initMap();
    private static Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("Jack", 11);
        map.put("Queen", 12);
        map.put("King", 10);
        map.put("Ace", 1);

        return Collections.unmodifiableMap(map);
    }

    
    public static Player randomPlayer(Player player, Player player1) {
        ArrayList<Player> players = new ArrayList<>(2);

        players.add(player);
        players.add(player1);

        Collections.shuffle(players);

        return players.get(0);
    }

   
    public static boolean checkForValidPlay(String newSuit, Card upCard, Card layedDown) {
        boolean validPlay = false;
////THE CODE FOR CHECKING FOR PLAYING THE CARD
////*
///
       if (layedDown.getValue().equals(player.)) {
            validPlay = true;
        }
        else if (newSuit.length() > 0) {
            if (layedDown.getType().equals(newSuit)) {
                validPlay = true;
            }
        }
        else {
            if (upCard.getType().equals(layedDown.getType())) {
                validPlay = true;
            }
            else if (upCard.getValue().equals(layedDown.getValue())) {
                validPlay = true;
            }
        }

        return validPlay;
    }

   
    public static Game.Status determineWinner(Player player, Player player1) {

        int playerPoints = 0;
        int player1Points = 0;

        
        for (Card card : player.getHand()) {
            playerPoints += CARD_VALUES.get(card.getValue());
        }

        
        for (Card card : player1.getHand()) {
              player1Points += CARD_VALUES.get(card.getValue());
        }

        Game.Status status;
        if (playerPoints > player1Points) {
            status = Game.Status.WON;
        }
        else if (playerPoints < player1Points) {
            status = Game.Status.LOST;
        }
        else {
            status = Game.Status.TIE;
        }

        return status;
    }
}     int player1Points = 0;

        
        for (Card card : player.getHand()) {
            playerPoints += CARD_VALUES.get(card.getValue());
        }

        
        for (Card card : player1.getHand()) {
              player1Points += CARD_VALUES.get(card.getValue());
        }

        Game.Status status;
        if (playerPoints > player1Points) {
            status = Game.Status.WON;
        }
        else if (playerPoints < player1Points) {
            status = Game.Status.LOST;
        }
        else {
            status = Game.Status.TIE;
        }

        return status;
    }
}
