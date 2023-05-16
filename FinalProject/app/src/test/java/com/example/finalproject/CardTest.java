package FinalProject.app.src.main.java.com.example.finalproject;
import static org.junit.Assert.*;

import android.database.DatabaseErrorHandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class CardTest {

    Card card;

    @Before
    void setUp() throws Exception {
        card = new Card();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void getMark() {
        assertEquals(card.DEFAULT_MARK, card.getMark());
    }

    @Test
    void getSuit() {
        assertEquals(card.DEFAULT_SUIT, card.getSuit());
    }

    @Test
    void setMark() {
        card.setMark("King");
        assertEquals("King", card.getMark());
    }

    @Test
    void setSuit() {
        card.setSuit("Clubs");
        assertEquals("Clubs", card.getSuit());
    }
}