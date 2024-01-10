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

    @Test
    void testSoustraire()
    {
        assertEquals(2, Calculatrice.soustraire(6, 4));
    }

    @Test
    void testMax(){
        assertEquals(8, Calculatrice.max(2,8));
    }
    @Test
    void testMaxAvecZero(){
        assertEquals(2, Calculatrice.max(2,0));
    }
    @Test
    void testMaxAvecNombreNegatif(){
        assertEquals(2, Calculatrice.max(2,-8));
    }
    @Test
    void testMaxAvecNombreIdentiques(){
        assertEquals(3, Calculatrice.max(3,3));
    }

}
