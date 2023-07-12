package be.bstorm.exercices;

import java.util.Scanner;

public class ExoDitributeur {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Déclaration des stocks de boissons
        int stockCoca = 10;
        int stockJus = 5;
        int stockCafe = 0;

        // Boucle principale du distributeur
        while (true) {

            // Affichage du menu
            System.out.println("1 : Coca\n2 : Jus\n3 : Café\n4 : Quitter");
            int choix = scan.nextInt();

            // Traitement du choix de l'utilisateur
            switch (choix) {

                case 1:
                    // Vérification du stock de Coca
                    if (stockCoca <= 0) {
                        System.out.println("Plus de coca");
                    } else {
                        stockCoca--;
                        System.out.println("Voici votre coca");
                    }
                    break;

                case 2:
                    // Vérification du stock de Jus
                    if (stockJus <= 0) {
                        System.out.println("Plus de jus");
                    } else {
                        stockJus--;
                        System.out.println("Voici votre jus");
                    }
                    break;

                case 3:
                    // Vérification du stock de Café
                    if (stockCafe <= 0) {
                        System.out.println("Plus de café");
                    } else {
                        stockCafe--;
                        System.out.println("Voici votre café");
                    }
                    break;

                case 4:
                    // Sortie du programme
                    System.out.println("Au revoir!");
                    return;

                default:
                    // Choix invalide
                    System.out.println("WTF?");
            }
        }
    }
}
