package com.example.cap;

public class Utilis {
    public static int codepoints(String string) {
        return string.codePointCount(0, string.length());
    }
}
