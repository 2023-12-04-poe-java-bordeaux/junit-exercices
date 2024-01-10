package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {


    @Test
    void testAdditionner() {
        assertEquals(5, Calculatrice.additionner(2,3));
    }

    @Test
    void testAdditionnerDeuxAvecZero(){
        assertEquals(2, Calculatrice.additionner(2,0));
    }

    @Test
    void testAdditionnerAvecNombreNegatif(){
        assertEquals(-6, Calculatrice.additionner(-2, -4));
    }
}
