package be.bstorm.exercices;

import java.util.Scanner;

public class ExoLanceurBalles {

    public static void main(String[] args) {

        int nbBalles = 10;

        while (nbBalles > 0) {
            Scanner scan = new Scanner(System.in);
            boolean joueurPret;
            String input;
            do {
                System.out.println("Etes-vous prêt ? y/n");
                input = scan.next().toLowerCase();
            } while (!input.equals("y") && !input.equals("n"));
            joueurPret = input.equals("y");
            if(joueurPret){
                System.out.println("Lancer une balle");
                nbBalles--;
                System.out.println(nbBalles + " balles restantes");
            }
            if(nbBalles == 0){
                do {
                    System.out.println("Voulez vous remplir le panier à nouveau ? y/n");
                    input = scan.next().toLowerCase();
                } while (!input.equals("y") && !input.equals("n"));
                if(input.equals("y")){
                    nbBalles = 10;
                }
            }
        }
    }
}
