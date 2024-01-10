package com.demo;

public class Palindrome {

    public static boolean isPalindrome(String phrase){

        int indexDebut = 0;
        int indexFin = phrase.length()-1;

        while(indexDebut < indexFin && phrase.charAt(indexDebut)==phrase.charAt(indexFin)){
            indexDebut++;
            indexFin--;
        }

        return indexDebut >= indexFin;
    }
}
