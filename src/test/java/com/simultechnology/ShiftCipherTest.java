package com.simultechnology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftCipherTest {

    @Test
    void encrypt() {
        assertEquals("khoor", ShiftCipher.encrypt("hello", 3));
        assertEquals("bhdu", ShiftCipher.encrypt("year", 3));
    }

    @Test
    void decrypt() {
        assertEquals("hello", ShiftCipher.decrypt("khoor", 3));
        assertEquals("year", ShiftCipher.decrypt("bhdu", 3));
    }
}
