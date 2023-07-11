package be.bstorm.exercices;

import java.util.Scanner;

public class ExoConvertisseurTemp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month, day, hour, minute;
        long year, second;

        System.out.print("Entrez une valeur en secondes : ");
        second = scan.nextLong();

        if (second < 0) {
            System.out.println("WTF?"); // Si la valeur de secondes est négative, affiche un message d'erreur
        } else {
            year = (second / 31_536_000); // Conversion des secondes en années
            second = second % 31_536_000; // Calcul du reste de secondes après conversion en années
            month = (int) (second / 2_628_288); // Conversion du reste de secondes en mois
            second = second % 2_628_288; // Calcul du reste de secondes après conversion en mois
            day = (int) (second / 86400); // Conversion du reste de secondes en jours
            second = second % 86400; // Calcul du reste de secondes après conversion en jours
            hour = (int) (second / 3600); // Conversion du reste de secondes en heures
            second = second % 3600; // Calcul du reste de secondes après conversion en heures
            minute = (int) (second / 60); // Conversion du reste de secondes en minutes
            second = second % 60; // Calcul du reste de secondes après conversion en minutes

            System.out.printf("%d an(s) %d mois %d jour(s) %d heure(s) %d minute(s) %d seconde(s).\n",
                    year, month, day, hour, minute, second); // Affiche le résultat de la conversion
        }
    }
}
