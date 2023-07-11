package be.bstorm.exercices;

import java.util.Scanner;

public class ExoComparaison3Nombres {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int temp;
        String op1 = " < ";
        String op2 = " < ";
        String result = "";
        System.out.println("Nombre 1 : ");
        int a = scan.nextInt();
        System.out.println("Nombre 2 : ");
        int b = scan.nextInt();
        System.out.println("Nombre 3 : ");
        int c = scan.nextInt();

        // Comparaison et permutation des nombres pour les trier par ordre croissant
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b > c){
            b = b + c; // b = 8
            c = b - c; // c = 8 - 3 => 5
            b = b - c; // c = 8 - 5 => 3
        }
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        // Mise à jour des opérateurs de comparaison si des nombres sont égaux
        if(a == b){
            op1 = " = ";
        }
        if(b == c){
            op2 = " = ";
        }

        // Affichage du résultat
        System.out.println(a + op1 + b + op2 + c);
//        result = a + (a < b ? " < " : " = ") + b + (b < c ? " < " : " = ") + c;
//        System.out.println(result);
    }
}
