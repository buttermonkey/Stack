public class Stack<T> {
    private final T[] cards;
    private int counter;

    public Stack(T[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(T card) {
        if (counter + 1 >= cards.length) {
            System.err.println("To many cards on the stack. This stack takes only " + cards.length + " cards.");
            return;
        }

        cards[++counter] = card;
    }

    public T pop() {
        if (counter < 0) {
            System.err.println("Stack is already empty. Please pop someone else.");
            return null;
        }

        return cards[counter--];
    }
}
