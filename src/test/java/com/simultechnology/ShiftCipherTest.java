package com.simultechnology;

import static org.junit.jupiter.api.Assertions.*;

class ShiftCipherTest {

    @org.junit.jupiter.api.Test
    void encrypt() {
        assertEquals("khoor", ShiftCipher.encrypt("hello"));
    }
}
