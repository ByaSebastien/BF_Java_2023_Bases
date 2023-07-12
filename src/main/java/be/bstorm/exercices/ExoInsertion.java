package be.bstorm.exercices;

import java.util.Scanner;

public class ExoInsertion {

    public static void main(String[] args) {

        final int SIZE = 7;
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[]{0, 2, 4, 6, 8, 10, 0};

        // Lecture du nombre à insérer
        int nb = scan.nextInt();

        // Insertion du nombre dans le tableau trié par ordre croissant
        for (int i = 0; i < SIZE; i++) {
            if (nb < numbers[i]) {
                int temp = numbers[i];
                numbers[i] = nb;
                nb = temp;
            }
        }
        // Ajout du nombre à la dernière position du tableau
        numbers[SIZE - 1] = nb;

        // Affichage du tableau mis à jour
        for (int number : numbers) {
            System.out.print(number + " | ");
        }
    }
}
