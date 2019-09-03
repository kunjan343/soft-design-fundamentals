package CardGame;

public class CardHand {
    private int handSize = 60;
    public Card[] cards = new Card[handSize];

    /* Using enum variable to define different pack of values and allow to use it
     * as same datatype as language pre defined types.
     * By changing enum values, we can switch between card game and UNO
     */

    /*** Add comments during class to explain what this method does.*/
    public void generateHand() {
        int countCards = 0;
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Value v : Card.Value.values()) {
                cards[countCards] = (new Card(s, v));
                countCards++;
            }
        }
        //end outer for
    }

    public void sampleMethod() {
    }
}
