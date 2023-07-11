package be.bstorm.exercices;

import java.util.Scanner;

public class ExoForcerSaisie {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nb;

        do {
            System.out.println("Rentrez un nombre entre 1 et 10 : ");
            nb = scan.nextInt();
        }while(!(nb >= 1 && nb <= 10));
//        }while(nb < 1 || nb > 10);

        System.out.println(nb);
    }
}
