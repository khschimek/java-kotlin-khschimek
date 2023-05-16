package FinalProject.app.src.main.java.com.example.finalproject;

import java.util.Random;

public class DeckOfCards {
    Card[] deck;
    static Random seed = new Random();
    public DeckOfCards() {
        deck = new Card[52];
        deck[0]=new Card("Ace", "Diamond");
        deck[1]=new Card("Ace", "Clubs");
        deck[2]=new Card("Ace", "Spades");
        deck[3]=new Card("Ace", "Heart");
        deck[4]=new Card("Two", "Diamond");
        deck[5]=new Card("Two", "Clubs");
        deck[6]=new Card("Two", "Spades");
        deck[7]=new Card("Two", "Heart");
        deck[8]=new Card("Three", "Diamond");
        deck[9]=new Card("Three", "Clubs");
        deck[10]=new Card("Three", "Spades");
        deck[11]=new Card("Three", "Heart");
        deck[12]=new Card("Four", "Diamond");
        deck[13]=new Card("Four", "Clubs");
        deck[14]=new Card("Four", "Spades");
        deck[15]=new Card("Four", "Heart");
        deck[16]=new Card("Five", "Diamond");
        deck[17]=new Card("Five", "Clubs");
        deck[18]=new Card("Five", "Spades");
        deck[19]=new Card("Five", "Heart");
        deck[20]=new Card("Six", "Diamond");
        deck[21]=new Card("Six", "Clubs");
        deck[22]=new Card("Six", "Spades");
        deck[23]=new Card("Six", "Heart");
        deck[24]=new Card("Seven", "Diamond");
        deck[25]=new Card("Seven", "Clubs");
        deck[26]=new Card("Seven", "Spades");
        deck[27]=new Card("Seven", "Heart");
        deck[28]=new Card("Eight", "Diamond");
        deck[29]=new Card("Eight", "Clubs");
        deck[30]=new Card("Eight", "Spades");
        deck[31]=new Card("Eight", "Heart");
        deck[32]=new Card("Nine", "Diamond");
        deck[33]=new Card("Nine", "Clubs");
        deck[34]=new Card("Nine", "Spades");
        deck[35]=new Card("Nine", "Heart");
        deck[36]=new Card("Ten", "Diamond");
        deck[37]=new Card("Ten", "Clubs");
        deck[38]=new Card("Ten", "Spades");
        deck[39]=new Card("Ten", "Heart");
        deck[40]=new Card("Jack", "Diamond");
        deck[41]=new Card("Jack", "Clubs");
        deck[42]=new Card("Jack", "Spades");
        deck[43]=new Card("Jack", "Heart");
        deck[44]=new Card("Queen", "Diamond");
        deck[45]=new Card("Queen", "Clubs");
        deck[46]=new Card("Queen", "Spades");
        deck[47]=new Card("Queen", "Heart");
        deck[48]=new Card("King", "Diamond");
        deck[49]=new Card("King", "Clubs");
        deck[50]=new Card("King", "Spades");
        deck[51]=new Card("King", "Heart");
    }

    public void drawCard() {
        Card drawn = deck[seed.nextInt(52)];
        String drawnMark = Card.getMark();
        String drawnSuit = Card.getSuit();
        System.out.print(drawnMark + " " + drawnSuit);
    }

    public void drawPokerHand() {
        for(int i=0; i<5; i++) {
            drawCard();
        }
    }

}
