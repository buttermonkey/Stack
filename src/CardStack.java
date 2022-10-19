public class CardStack {
    private final Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card card) {
        if (counter + 1 >= cards.length) {
            System.err.println("To many cards on the stack. This stack takes only " + cards.length + " cards.");
            return;
        }

        cards[++counter] = card;
    }

    public Card pop() {
        if (counter < 0) {
            System.err.println("Stack is already empty. Please pop someone else.");
            return null;
        }

        return cards[counter--];
    }
}
