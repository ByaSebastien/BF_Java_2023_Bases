package be.bstorm.exercices;

import java.util.Random;
import java.util.Scanner;

public class ExoFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Demande à l'utilisateur le nombre de termes de la suite de Fibonacci à afficher
        System.out.println("Combien de nombres de la suite de Fibonacci voulez-vous ?");
        int length = scan.nextInt();

        // Initialisation des deux premiers termes de la suite
        int first = 0;
        int second = 1;
        int temp;

        // Boucle pour générer et afficher les termes de la suite de Fibonacci
        for (int i = 0; i < length; i++) {
            System.out.print(first + " | ");

            // Calcul du prochain terme en utilisant les deux termes précédents
            temp = first + second;
            first = second;
            second = temp;
        }
    }
}
