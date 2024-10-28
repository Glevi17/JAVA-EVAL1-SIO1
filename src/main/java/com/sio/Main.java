package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while (true) {
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici

                    System.out.println("Entrer un nombre: ");
                    int nombre = scanner.nextInt();
                    System.out.println("Entrer une puissance: ");
                    int puissance = scanner.nextInt();
                    if (puissance <= 0) {
                        System.out.println("Erreur : la puissance doit être supérieure à 0.");
                    }
                    double résultat = Math.pow(nombre, puissance);
                    System.out.println("le resultat de " + nombre + " à la puissance de " + puissance + " est égal à " + résultat);

                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici

                    System.out.println("Entrez le nombre de kilomètres parcourus par le client: ");
                    double kilometres = scanner.nextDouble();
                    if (kilometres <= 0) {
                        System.out.println("Erreur : le nombre de kilomètres parcourus par le client doit être supérieur a 0.");
                    } else {
                        double frais;
                        if (kilometres < 100) {
                            frais = kilometres * 0.20;
                        } else if (kilometres <= 500) {
                            frais = kilometres * 0.50;
                        } else {
                            frais = kilometres * 0.80;
                        }
                        System.out.println("le montant a payer par le client est de " + frais + " €");
                    }

                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici

                    System.out.println("Entrer la largeur du rectangle: ");
                    int largeur = scanner.nextInt();
                    if (largeur <= 0) {
                        System.out.println("Erreur : la largeur du rectangle doit être superieur a 0.");
                    }
                    System.out.println("Entrer la hauteur du rectangle: ");
                    int hauteur = scanner.nextInt();
                    if (hauteur <= 0) {
                        System.out.println("Erreur : la hauteur du rectangle doit être superieur a 0.");
                    } else {
                        for (int i =0; i++);
                        for (int j =0; )

                            System.out.println("---------------------------------------------");

                        break;
                        case 4:
                            System.out.println("---------------------------------------------");
                            System.out.println("Exercice 4");
                            System.out.println("---------------------------------------------");
                            //Exercice 4 : Entrer votre code ici

                            System.out.println("Entrer un nombre: ");
                            int nombre = scanner.nextInt();
                            if (nombre <= 0) {
                                System.out.println("le nombre doit être superieur ou egal a 0.");
                            }
                            System.out.println("Entrer un nombre: ");
                            int nombre = scanner.nextInt();
                            int factorielle = 1;
                            while(factorielle <= nombre) {}

                            }
                            System.out.println("---------------------------------------------");
                            break;
                        case 0:
                            System.out.println(RESET);
                            System.exit(0);
                            break;
                        default:
                    }
                    break;
                default:
            }
        }
    }}

