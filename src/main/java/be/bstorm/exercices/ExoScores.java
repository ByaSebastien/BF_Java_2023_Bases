package be.bstorm.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ExoScores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];
        System.out.print("Nombre de joueurs : ");
        int nbJoueur = scan.nextInt();

        // Saisie des scores pour chaque joueur
        for (int i = 0; i < nbJoueur; i++) {
            System.out.print("Joueur " + (i + 1) + " : ");
            scores[i] = scan.nextInt();
        }

        int somme = 0;
        // Calcul de la somme des scores
        for (int i = 0; i < nbJoueur; i++) {
            somme += scores[i];
        }

//        for(int score : scores){
//
//            somme += score;
//        }

        // Calcul de la moyenne des scores
        float moyenne = (float) somme / nbJoueur;

        System.out.println("Moyenne => " + moyenne);
    }
}
