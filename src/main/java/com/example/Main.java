package com.example;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParcVehicules parc = new ParcVehicules();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter un véhicule");
            System.out.println("2. Supprimer un véhicule");
            System.out.println("3. Modifier un véhicule");
            System.out.println("4. Rechercher un véhicule par nom");
            System.out.println("5. Lister les véhicules par lettre");
            System.out.println("6. Afficher le nombre de véhicules");
            System.out.println("7. Afficher tous les véhicules");
            System.out.println("8. Rechercher un véhicule par ID");
            System.out.println("9. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du véhicule: ");
                    String id = scanner.nextLine();
                    System.out.print("Entrez le nom du véhicule: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque du véhicule: ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez l'année du véhicule: ");
                    int annee = scanner.nextInt();
                    scanner.nextLine(); // Consommer le retour à la ligne

                    System.out.println("1. Voiture");
                    System.out.println("2. Camion");
                    System.out.println("3. Moto");
                    System.out.print("Choisissez le type de véhicule: ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consommer le retour à la ligne

                    if (type == 1) {
                        System.out.print("Entrez le nombre de portes: ");
                        int nombreDePortes = scanner.nextInt();
                        scanner.nextLine(); // Consommer le retour à la ligne
                        parc.ajouterVehicule(new Voiture(id, nom, marque, annee, nombreDePortes));
                    } else if (type == 2) {
                        System.out.print("Entrez la capacité de charge (tonnes): ");
                        double capaciteDeCharge = scanner.nextDouble();
                        scanner.nextLine(); // Consommer le retour à la ligne
                        parc.ajouterVehicule(new Camion(id, nom, marque, annee, capaciteDeCharge));
                    } else if (type == 3) {
                        System.out.print("Entrez la cylindrée (cm³): ");
                        double cylindree = scanner.nextDouble();
                        scanner.nextLine(); // Consommer le retour à la ligne
                        parc.ajouterVehicule(new Moto(id, nom, marque, annee, cylindree));
                    } else {
                        System.out.println("Type de véhicule invalide.");
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'ID du véhicule à supprimer: ");
                    id = scanner.nextLine();
                    parc.supprimerVehicule(id);
                    break;

                case 3:
                    System.out.print("Entrez l'ID du véhicule à modifier: ");
                    id = scanner.nextLine();
                    System.out.print("Entrez le nouveau nom du véhicule: ");
                    nom = scanner.nextLine();
                    System.out.print("Entrez la nouvelle marque du véhicule: ");
                    marque = scanner.nextLine();
                    System.out.print("Entrez la nouvelle année du véhicule: ");
                    annee = scanner.nextInt();
                    scanner.nextLine(); // Consommer le retour à la ligne

                    Vehicule vehicule = parc.rechercherVehiculeParId(id);
                    if (vehicule != null) {
                        vehicule.setNom(nom);
                        vehicule.setMarque(marque);
                        vehicule.setAnnee(annee);
                        parc.modifierVehicule(id, vehicule);
                    } else {
                        System.out.println("Véhicule non trouvé.");
                    }
                    break;

                case 4:
                    System.out.print("Entrez le nom du véhicule à rechercher: ");
                    nom = scanner.nextLine();
                    vehicule = parc.rechercherVehiculeParNom(nom);
                    if (vehicule != null) {
                        System.out.println(vehicule);
                    } else {
                        System.out.println("Véhicule non trouvé.");
                    }
                    break;

                case 5:
                    System.out.print("Entrez la lettre de début des noms des véhicules: ");
                    char lettre = scanner.nextLine().charAt(0);
                    Map<String, Vehicule> vehicules = parc.listerVehiculesParLettre(lettre);
                    vehicules.values().forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Nombre de véhicules: " + parc.nombreDeVehicules());
                    break;

                case 7:
                    parc.afficherTousLesVehicules();
                    break;

                case 8:
                    System.out.print("Entrez l'ID du véhicule à rechercher: ");
                    id = scanner.nextLine();
                    vehicule = parc.rechercherVehiculeParId(id);
                    if (vehicule != null) {
                        System.out.println(vehicule);
                    } else {
                        System.out.println("Véhicule non trouvé.");
                    }
                    break;

                case 9:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Option invalide.");
                    break;
            }
        }
    }
}