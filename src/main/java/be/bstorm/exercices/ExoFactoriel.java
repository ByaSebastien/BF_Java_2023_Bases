package be.bstorm.exercices;

import java.util.Scanner;

public class ExoFactoriel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre
        System.out.print("Nombre : ");
        int nb = scan.nextInt();
        long result = 1;

        // Calcul de la factorielle du nombre
        for (int i = 2; i <= nb ; i++) {
            result *= i;
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + nb + " est => " + result);
    }
}
