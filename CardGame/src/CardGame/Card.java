package CardGame;

public class Card {
    public enum Suit {RED, BLUE, YELLOW, GREEN}

    public enum Value {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, SWITCH, PICKUP2, PICKUP4, WILDCARD}

    /*
    * We can easily create card class for card game by extending and changing enum variable values.
    * */

    private final Suit suit;
    private final Value value;

    public Card(Suit s, Value gVal) {
        suit = s;
        value = gVal;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
