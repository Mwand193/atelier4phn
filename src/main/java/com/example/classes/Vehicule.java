package com.example;
public abstract class Vehicule {
    protected String id;
    protected String nom;
    protected String marque;
    protected int annee;

    public Vehicule(String id, String nom, String marque, int annee) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.annee = annee;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public int getAnnee() {
        return annee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Marque: " + marque + ", Année: " + annee;
    }
}