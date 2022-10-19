public class CardStackDemo {
    public static void main(String[] args) {
        CardStack stack = new CardStack(new Card[10]);
        stack.push(new Card(CardValue.five, CardColor.green));
        stack.push(new Card(CardValue.drawTwo, CardColor.yellow));
        print(stack.pop());
        print(stack.pop());
    }

    private static void print(Card card) {
        if (card == null)
            return;
        System.out.println(card);
    }
}
