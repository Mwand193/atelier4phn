package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class ParcVehicules {
    private Map<String, Vehicule> vehicules;

    public ParcVehicules() {
        vehicules = new HashMap<>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.put(vehicule.getId(), vehicule);
    }

    public void supprimerVehicule(String id) {
        vehicules.remove(id);
    }

    public void modifierVehicule(String id, Vehicule vehicule) {
        vehicules.put(id, vehicule);
    }

    public Vehicule rechercherVehiculeParNom(String nom) {
        for (Vehicule vehicule : vehicules.values()) {
            if (vehicule.getNom().equalsIgnoreCase(nom)) {
                return vehicule;
            }
        }
        return null;
    }

    public Map<String, Vehicule> listerVehiculesParLettre(char lettre) {
        return vehicules.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getNom().toLowerCase().charAt(0) == Character.toLowerCase(lettre))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int nombreDeVehicules() {
        return vehicules.size();
    }

    // Nouvelle fonctionnalité 1 : Afficher tous les véhicules
    public void afficherTousLesVehicules() {
        vehicules.values().forEach(System.out::println);
    }

    // Nouvelle fonctionnalité 2 : Rechercher un véhicule par ID
    public Vehicule rechercherVehiculeParId(String id) {
        return vehicules.get(id);
    }
}
