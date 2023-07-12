package be.bstorm.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ExoScores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];
        System.out.print("Nombre de joueur : ");
        int nbJoueur = scan.nextInt();

        for (int i = 0; i < nbJoueur; i++) {

            System.out.print("Joueur " + (i+1) + " : ");
            scores[i] = scan.nextInt();
        }

        int somme = 0;
        for (int i = 0; i < nbJoueur; i++) {

            somme += scores[i];
//            somme = somme + scores[i];
        }

//        for(int score : scores){
//
//            somme += score;
//        }

        float moyenne = (float)somme / nbJoueur;

        System.out.println("Moyenne => " + moyenne);
    }
}
