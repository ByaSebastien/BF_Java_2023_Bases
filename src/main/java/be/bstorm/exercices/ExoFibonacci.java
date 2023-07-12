package be.bstorm.exercices;

import java.util.Random;
import java.util.Scanner;

public class ExoFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Combien de nombre de la suite de fibonacci voulez vous ?");
        int length = scan.nextInt();

        int first = 0;
        int second = 1;
        int temp;

        for(int i = 0; i < length; i++){

            System.out.print(first + " | ");
            temp = first + second;
            first = second;
            second = temp;
        }
    }
}
