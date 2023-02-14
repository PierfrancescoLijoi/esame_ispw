package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void Testdivisione() {
        int a=4;
        int b=0;
        int result=0;
        assertEquals(Main.divisione(a,b),result);
    }


}