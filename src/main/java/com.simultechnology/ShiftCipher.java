package com.simultechnology;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftCipher {

    static private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static private final String[] ALPHABET_LETTERS = ALPHABET.split("");

    public static String encrypt(String plainWord) {

        String[] targetLetters = plainWord.split("");

        List<String> encryptedList = Arrays.stream(targetLetters).map(letter -> {
            int index = ALPHABET.indexOf(letter) + 3;
            return ALPHABET_LETTERS[index % ALPHABET_LETTERS.length];
        }).collect(Collectors.toList());

        return String.join("", encryptedList);
    }

    public static String decrypt(String encryptedWord) {

        String[] targetLetters = encryptedWord.split("");

        List<String> plainList = Arrays.stream(targetLetters).map(letter -> {
            int index = (ALPHABET.indexOf(letter) - 3) + ALPHABET_LETTERS.length;
            return ALPHABET_LETTERS[index % ALPHABET_LETTERS.length];
        }).collect(Collectors.toList());

        return String.join("", plainList);
    }

}
