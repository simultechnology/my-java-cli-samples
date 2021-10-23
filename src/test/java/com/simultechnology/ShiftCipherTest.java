package com.simultechnology;

import static org.junit.jupiter.api.Assertions.*;

class ShiftCipherTest {

    @org.junit.jupiter.api.Test
    void decrypt() {
        assertEquals("khoor", ShiftCipher.decrypt("hello"));
    }
}
