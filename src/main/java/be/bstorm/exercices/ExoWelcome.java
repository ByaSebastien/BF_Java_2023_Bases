package be.bstorm.exercices;

import java.util.Scanner;

public class ExoWelcome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quel âge avez-vous? ");
        int age = scan.nextInt();

        // Vérification de l'âge pour afficher un message approprié
        if(age < 18){
            System.out.println("As-tu l'accord de ta maman?");
        }else{
            System.out.println("Welcome enjoy!");
        }
    }
}
