package be.bstorm.exercices;

import java.util.Scanner;

public class ExoLanceurBalles {

    public static void main(String[] args) {

        int nbBalles = 10;

        // Boucle principale pour lancer les balles
        while (nbBalles > 0) {
            Scanner scan = new Scanner(System.in);
            boolean joueurPret;
            String input;

            // Demande à l'utilisateur s'il est prêt
            do {
                System.out.println("Etes-vous prêt ? y/n");
                input = scan.next().toLowerCase();
            } while (!input.equals("y") && !input.equals("n"));
            joueurPret = input.equals("y");

            // Si le joueur est prêt, lance une balle et décrémente le nombre de balles restantes
            if (joueurPret) {
                System.out.println("Lancer une balle");
                nbBalles--;
                System.out.println(nbBalles + " balles restantes");
            }

            // Si le nombre de balles atteint 0, demande au joueur s'il souhaite remplir le panier à nouveau
            if (nbBalles == 0) {
                do {
                    System.out.println("Voulez-vous remplir le panier à nouveau ? y/n");
                    input = scan.next().toLowerCase();
                } while (!input.equals("y") && !input.equals("n"));
                if (input.equals("y")) {
                    nbBalles = 10; // Remplit le panier avec 10 nouvelles balles
                }
            }
        }
    }
}
