package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest
{
    @ParameterizedTest
    @CsvSource({ "ABBA,true" , "KAYAK,true" , "bonjour,false" })
    public void testPalindrome(String phrase, boolean resultat){

        assertEquals(resultat, Palindrome.isPalindrome(phrase));
    }
}
