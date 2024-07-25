package com.example;
public class Moto extends Vehicule {
    private double cylindree;

    public Moto(String id, String nom, String marque, int annee, double cylindree) {
        super(id, nom, marque, annee);
        this.cylindree = cylindree;
    }

    public double getCylindree() {
        return cylindree;
    }

    public void setCylindree(double cylindree) {
        this.cylindree = cylindree;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cylindrée: " + cylindree + " cm³";
    }
}