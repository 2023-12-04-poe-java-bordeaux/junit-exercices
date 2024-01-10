package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

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

    @Test
    void testImpairsAvecCinq(){
        assertTrue(Calculatrice.getNombresImpairs(10).contains(5));
    }
    @Test
    void testImpairsAvecQuatre(){
        assertFalse(Calculatrice.getNombresImpairs(10).contains(4));
    }
    @Test
    void testImpairsAvecZero(){
        assertFalse(Calculatrice.getNombresImpairs(10).contains(0));
    }
    @Test
    void testImpairsAvecMax(){
        assertFalse(Calculatrice.getNombresImpairs(10).contains(10));
    }

    @ParameterizedTest
    @CsvSource({ "2,8,8" , "2,0,2", "2,-8,2"  })
    void testMaxAvecParametres(int a,int b,int resultat){
        assertEquals(resultat, Calculatrice.max(a,b));
    }

    @Test
    void testAssertSame(){
        Calculatrice c1 = new Calculatrice();
        Calculatrice c2 = new Calculatrice();
        Calculatrice c3 = c1;

        assertSame(c1, c3);
        assertNotSame(c1, c2);
    }

    @Test
    void testDivision(){
        assertEquals(2, Calculatrice.diviser(10, 5));
    }

    @Test
    void testDivisionParZero(){
       assertThrows( ArithmeticException.class, () -> {
           Calculatrice.diviser(10, 0);
       });
    }

}
