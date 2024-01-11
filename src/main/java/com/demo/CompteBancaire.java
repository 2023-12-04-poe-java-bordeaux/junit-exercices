package com.demo;

public class CompteBancaire {

    private float solde;
    private String nom;

    public CompteBancaire(String nom) {
        this.nom = nom;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void deposer(float montant){
        solde+=montant;
    }

    public void retirer(float montant){
        if(montant <= solde)
            solde-=montant;
    }
}
