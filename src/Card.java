public class Card {
    private final CardValue value;
    private final CardColor color;

    public Card(CardValue value, CardColor color) {
        this.value = value;
        this.color = color;
    }

    public CardValue getValue() {
        return value;
    }

    public CardColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", color=" + color +
                '}';
    }
}
