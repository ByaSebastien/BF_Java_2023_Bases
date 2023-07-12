package be.bstorm.exercices;

import java.util.Scanner;

public class ExoPrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Demande à l'utilisateur la longueur de la liste des nombres premiers à afficher
        System.out.print("Longueur : ");
        int length = scan.nextInt();
        int found = 1; // Variable pour compter le nombre de nombres premiers trouvés
        int toTest = 3; // Variable pour tester les nombres

        System.out.println(2); // Affiche le premier nombre premier (2)
        while (found < length) {

            boolean isPrime = true;
            // Boucle pour tester si toTest est un nombre premier
            for (int div = 2; div <= Math.sqrt(toTest) && isPrime; div++) {

                if (toTest % div == 0) {
                    isPrime = false; // Si toTest est divisible par div, il n'est pas premier
                }
            }

            // Si toTest est un nombre premier, l'affiche et incrémente found
            if (isPrime) {
                System.out.println(toTest);
                found++;
            }

            toTest += 2; // Passe au prochain nombre impair pour le test suivant
        }
    }
}
