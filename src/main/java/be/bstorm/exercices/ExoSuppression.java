package be.bstorm.exercices;

import java.util.Scanner;

public class ExoSuppression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbElement = 6;
        int[] numbers = new int[]{2, 4, 6, 8, 10, 6};

        // Affichage des éléments du tableau
        for (int number : numbers) {
            System.out.print(number + " | ");
        }
        System.out.println();

        System.out.println("Quel élément voulez-vous supprimer ?");
        int choice = scan.nextInt(); // Lecture de l'élément à supprimer

        // Suppression de l'élément en décalant les éléments suivants vers la gauche
//        for (int i = choice; i < nbElement - 1; i++) {
//            numbers[i] = numbers[i + 1];
//        }
//        nbElement--;

        // Suppression de toutes les occurrences de l'élément en décalant les éléments suivants vers la gauche
        for (int i = 0; i < nbElement; i++) {
            if (numbers[i] == choice) {
                for (int j = i; j < nbElement - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                nbElement--;
            }
        }

        // Affichage des éléments restants du tableau
        for (int i = 0; i < nbElement; i++) {
            System.out.print(numbers[i] + " | ");
        }
    }
}
