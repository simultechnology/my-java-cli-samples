package com.simultechnology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftCipherTest {

    @Test
    void encrypt() {
        assertEquals("khoor", ShiftCipher.encrypt("hello"));
        assertEquals("bhdu", ShiftCipher.encrypt("year"));
    }

    @Test
    void decrypt() {
        assertEquals("hello", ShiftCipher.decrypt("khoor"));
        assertEquals("year", ShiftCipher.decrypt("bhdu"));
    }
}
