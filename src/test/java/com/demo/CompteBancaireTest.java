package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    CompteBancaire compte;

    @BeforeEach
    void setUp(){
       compte  = new CompteBancaire("Compte Courant");
    }

    @Test
    void testDeposer(){
        float soldeInitial = compte.getSolde();
        float montantDuDepot = 100;
        compte.deposer(montantDuDepot);
        assertEquals(soldeInitial+montantDuDepot, compte.getSolde());
    }

    @Test
    void testRetirer(){
        float montantDuDepot = 100;
        float montantDuRetrait = 50;
        compte.deposer(montantDuDepot);
        compte.retirer(montantDuRetrait);
        assertEquals(50, compte.getSolde());
    }

    @Test
    void testRetirerMontantSuperieurAuSolde(){
        float montantDuDepot = 100;
        float montantDuRetrait = 150;

        compte.deposer(montantDuDepot);
        float soldeInitial = compte.getSolde();
        compte.retirer(montantDuRetrait);
        assertEquals(soldeInitial, compte.getSolde());
    }
}
