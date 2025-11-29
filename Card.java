import java.util.ArrayList;
import java.util.Collections;

public class Card {

    private String type;
    private String value;
   

   
    public static final String[] CARD_TYPES = {
            "heart", "spade", "diamond", "club"
    };

   
    public static final String[] CARD_RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"
    };

  
    private Card(String type, String value) {
        this.type = type;
        this.value = value;
    
    }

    public String toString() {
        return Character.toUpperCase(this.value.charAt(0)) + this.value.substring(1) ;
    }

   
   

   
    public String getValue() {
        return Character.toUpperCase(this.value.charAt(0)) + this.value.substring(1);
    }

    
    public String getType() {
        return this.type;
    }
}
