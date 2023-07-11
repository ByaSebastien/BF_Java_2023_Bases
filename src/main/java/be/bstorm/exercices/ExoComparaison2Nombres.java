package be.bstorm.exercices;

import java.util.Scanner;

public class ExoComparaison2Nombres {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Création d'un objet Scanner pour lire l'entrée utilisateur

        String result = "";
        System.out.println("Nombre 1 : ");
        int a = scan.nextInt(); // Lecture du premier nombre saisi par l'utilisateur
        System.out.println("Nombre 2 : ");
        int b = scan.nextInt(); // Lecture du deuxième nombre saisi par l'utilisateur

        // Comparaison des deux nombres et création de la chaîne de résultat
        if(a < b){
            result = a + " < " + b;
        } else if (a > b) {
            result = a + " > " + b;
        } else {
            result = a + " = " + b;
        }

        // Autres façons d'écrire la condition ternaire pour construire la chaîne de résultat
        result = a + (a < b ? " < " : (a > b ? " > " : " = ")) + b;
        result = (a < b ? a + " < " + b : (a > b ? a + " > " + b : a + " = " + b));

        // Affichage du résultat
        System.out.println(result);
    }
}
