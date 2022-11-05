public class Stack<T> {
    private final T[] values;
    private int counter;

    public Stack(T[] cards) {
        this.values = cards;
        this.counter = -1;
    }

    public void push(T card) {
        if (counter + 1 >= values.length) {
            System.err.println("To many values on the stack. This stack takes only " + values.length + " values.");
            return;
        }

        values[++counter] = card;
    }

    public T pop() {
        if (counter < 0) {
            System.err.println("Stack is already empty. Please pop someone else.");
            return null;
        }

        return values[counter--];
    }
}
