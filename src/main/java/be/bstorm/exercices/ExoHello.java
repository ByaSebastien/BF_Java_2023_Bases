package be.bstorm.exercices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExoHello {

    public static void main(String[] args) {

//        Exercice 1:
//        Demander a l'utilisateur de rentrer son prenom et le saluer en lui affichant la date du jour.
//        ex input => Sebastien ... output => Bonjour Sebastien nous somme les 10 Juillet 2023

        Scanner scan = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son prénom
        System.out.print("Prénom : ");
        String prenom = scan.next();

        // Obtient la date du jour
        LocalDate today = LocalDate.now();

        // Formate la date selon le modèle "dd MMMM yyyy"
        String dateFormatted = today.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Affiche le message de salutation avec le prénom et la date formatée
        System.out.println("Bonjour " + prenom + ", nous sommes le " + dateFormatted);

//        String day = today.getDayOfWeek().name();
//        String monthDay = String.valueOf(today.getDayOfMonth());
//        monthDay = switch (monthDay) {
//            case "1" -> "1st";
//            case "2" -> "2nd";
//            case "3" -> "3rd";
//            default -> monthDay + "th";
//        };
//        int month = today.getMonth().getValue();
//        int year = today.getYear();
//        System.out.println("Bonjour " + nom + " nous sommes le " + day + " " + monthDay + " " + month + " " + year );
    }
}
