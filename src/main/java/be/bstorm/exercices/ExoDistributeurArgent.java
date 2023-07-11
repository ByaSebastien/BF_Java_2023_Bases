package be.bstorm.exercices;

import java.util.Scanner;

public class ExoDistributeurArgent {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Montant : ");
        int montant = scan.nextInt();

        // Calcul et distribution des billets de 500
        if (montant / 500 >= 1) {
            int billets500 = montant / 500; // Calcul du nombre de billets de 500
            System.out.println(billets500 + " billet(s) de 500");
            montant = montant % 500; // Mise à jour du montant restant
        }

        // Calcul et distribution des billets de 200
        if (montant / 200 >= 1) {
            int billets200 = montant / 200; // Calcul du nombre de billets de 200
            System.out.println(billets200 + " billet(s) de 200");
            montant = montant % 200; // Mise à jour du montant restant
        }

        // Et ainsi de suite pour les autres valeurs de billets et pièces...

        // Calcul et distribution des billets de 100
        if (montant / 100 >= 1) {
            int billets100 = montant / 100; // Calcul du nombre de billets de 100
            System.out.println(billets100 + " billet(s) de 100");
            montant = montant % 100; // Mise à jour du montant restant
        }

        // ... (pour les billets de 50, 20, 10, 5)
        if(montant / 50 >= 1){
            System.out.println((montant / 50) + " billet(s) de 50");
            montant = montant % 50;
        }
        if(montant / 20 >= 1){
            System.out.println((montant / 20) + " billet(s) de 20");
            montant = montant % 20;
        }
        if(montant / 10 >= 1){
            System.out.println((montant / 10) + " billet(s) de 10");
            montant = montant % 10;
        }
        if(montant / 5 >= 1){
            System.out.println((montant / 5) + " billet(s) de 5");
            montant = montant % 5;
        }

        // Calcul et distribution des pièces de 2
        if (montant / 2 >= 1) {
            int pieces2 = montant / 2; // Calcul du nombre de pièces de 2
            System.out.println(pieces2 + " pièce(s) de 2");
            montant = montant % 2; // Mise à jour du montant restant
        }

        // Calcul et distribution des pièces de 1
        if (montant / 1 >= 1) {
            int pieces1 = montant / 1; // Calcul du nombre de pièces de 1
            System.out.println(pieces1 + " pièce(s) de 1");
            montant = montant % 1; // Mise à jour du montant restant
        }
    }
}
