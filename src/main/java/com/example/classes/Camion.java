package com.example;
public class Camion extends Vehicule {
    private double capaciteDeCharge;

    public Camion(String id, String nom, String marque, int annee, double capaciteDeCharge) {
        super(id, nom, marque, annee);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    public double getCapaciteDeCharge() {
        return capaciteDeCharge;
    }

    public void setCapaciteDeCharge(double capaciteDeCharge) {
        this.capaciteDeCharge = capaciteDeCharge;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacité de charge: " + capaciteDeCharge + " tonnes";
    }
}