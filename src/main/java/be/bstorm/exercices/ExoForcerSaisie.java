package be.bstorm.exercices;

import java.util.Scanner;

public class ExoForcerSaisie {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nb;

        // Demande à l'utilisateur de saisir un nombre entre 1 et 10
        do {
            System.out.println("Rentrez un nombre entre 1 et 10 : ");
            nb = scan.nextInt();
        } while (!(nb >= 1 && nb <= 10));
//        }while(nb < 1 || nb > 10);
        // La boucle continue tant que la condition (nb < 1 ou nb > 10) est vraie

        System.out.println(nb);
    }
}
