package com.example.cap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilisTest {

    @Test
    public void codepoints() {
        assertEquals(0,Utilis.codepoints(""));
        assertEquals(5,Utilis.codepoints("Hello"));
        assertEquals(8,Utilis.codepoints("Hello 👍!"));
    }
}