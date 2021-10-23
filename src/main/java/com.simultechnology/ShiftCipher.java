package com.simultechnology;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftCipher {

    static private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainWord) {

        String[] alphabets = ALPHABET.split("");
        String[] targetLetters = plainWord.split("");

        List<String> encryptedList = Arrays.stream(targetLetters).map(letter -> {
            int index = ALPHABET.indexOf(letter) + 3;
            return alphabets[index % alphabets.length];
        }).collect(Collectors.toList());

        return String.join("", encryptedList);
    }
}
