package FinalProject.app.src.main.java.com.example.finalproject;

public class Card {
    public static final String DEFAULT_MARK = "Ace";
    private static String mark;
    public static final String DEFAULT_SUIT = "Diamond";
    private static String suit;

    public Card(String mark, String material) {
        this.mark = mark;
        this.suit = suit;
    }

    public Card() {
        this(DEFAULT_MARK,DEFAULT_SUIT);
    }

    public static String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public static String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
