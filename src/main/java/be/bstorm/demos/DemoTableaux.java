package be.bstorm.demos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DemoTableaux {

    public static void main(String[] args) {

        // Déclaration et initialisation d'un tableau de chaînes de caractères
        String[] names = new String[3];
        names[0] = "Pierre";
        names[1] = "Paul";
        names[2] = "Jacques";

        // Affichage d'un élément spécifique du tableau
        System.out.println("Bonjour " + names[2]);

        // Parcours du tableau avec une boucle for
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Parcours du tableau avec une boucle for-each
        for (String s : names) {
            System.out.println(s);
        }

        // Déclaration et initialisation d'un tableau 2D
        int[][] ints2D = new int[3][3];

        int cpt = 1;
        // Parcours du tableau 2D et assignation de valeurs
        for (int i = 0; i < ints2D.length; i++) {
            for (int j = 0; j < ints2D[i].length; j++) {
                ints2D[i][j] = cpt++;
            }
        }

        // Affichage du tableau 2D
        for (int i = 0; i < ints2D.length; i++) {
            for (int j = 0; j < ints2D[i].length; j++) {
                System.out.print(ints2D[i][j] + " | ");
            }
            System.out.println();
        }

        final int TAILLE = 10;
        int[] tab = new int[TAILLE];
        int nbElement = 0;

        // Remplissage du tableau avec des valeurs
        for (int i = 0; i < TAILLE; i++) {
            tab[i] = i + 1;
            nbElement++;
        }

        // Affichage des éléments du tableau
        for (int i = 0; i < nbElement; i++) {
            System.out.println(tab[i]);
        }
    }
}
