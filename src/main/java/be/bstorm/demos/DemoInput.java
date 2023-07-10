package be.bstorm.demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class DemoInput {

    public static void main(String[] args) {


//        System.out.print("Jour : ");
//        int day = scan.nextInt();
//        System.out.print("Mois : ");
//        String month = scan.next();
//        System.out.print("Année : ");
//        long year = scan.nextLong();

        Scanner scan = new Scanner(System.in);

        // Création d'une instance de Scanner pour la saisie utilisateur

        System.out.print("Jour : ");
        int day = scan.nextInt();
        System.out.print("Mois : ");
        int month = scan.nextInt();
        System.out.print("Année : ");
        int year = scan.nextInt();

        // Saisie de jour, mois et année à partir de la console

        LocalDate date = LocalDate.of(year, month, day);

        // Création d'une instance de LocalDate avec les valeurs saisies

        System.out.println(date);
        System.out.println(day + " " + month + " " + year);
    }
}
