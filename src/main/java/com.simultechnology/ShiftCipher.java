package com.simultechnology;

import java.util.Arrays;

public class ShiftCipher {

    static private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static private final String[] ALPHABET_LETTERS = ALPHABET.split("");

    public static String encrypt(String plainWord, int count) {

        String[] targetLetters = plainWord.split("");

        String[] encryptedLetters = Arrays.stream(targetLetters).map(letter -> {
            int index = ALPHABET.indexOf(letter) + count;
            return ALPHABET_LETTERS[index % ALPHABET_LETTERS.length];
        }).toArray(String[]::new);

        return String.join("", encryptedLetters);
    }

    public static String decrypt(String encryptedWord, int count) {

        String[] targetLetters = encryptedWord.split("");

        String[] plainLetters = Arrays.stream(targetLetters).map(letter -> {
            int index = (ALPHABET.indexOf(letter) - count) + ALPHABET_LETTERS.length;
            return ALPHABET_LETTERS[index % ALPHABET_LETTERS.length];
        }).toArray(String[]::new);

        return String.join("", plainLetters);
    }

}
