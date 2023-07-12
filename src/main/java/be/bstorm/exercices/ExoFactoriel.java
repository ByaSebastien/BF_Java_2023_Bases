package be.bstorm.exercices;

import java.util.Scanner;

public class ExoFactoriel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre : ");
        int nb = scan.nextInt();
        long result = 1;

        for (int i = 2; i <= nb ; i++){
            result *= i;
        }
        System.out.println("La factoriel de " + nb + " est => " + result);
    }
}
