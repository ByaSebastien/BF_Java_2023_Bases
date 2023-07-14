package be.bstorm.exercices;

import java.util.Scanner;

public class ExoDeplacement2D {

    public static void main(String[] args) {

        final int TAILLE = 10;
        char[][] plateau = new char[TAILLE][TAILLE];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < TAILLE; i++){

            for (int j = 0; j < TAILLE; j++){

                plateau[i][j] = ' ';
//                plateau[i][j] = (char)9633;
            }
        }

        plateau[0][0] = 'O';
        int x = 0,y = 0;
//        plateau[0][0] = (char)9635;


        String input;
        do{
            for(int i = 0; i < TAILLE; i++){

                for (int j = 0; j < TAILLE; j++){

                    System.out.print(plateau[i][j] + " | ");
                }
                System.out.println();
            }

            input = scan.nextLine();

//            plateau[x][y] = (char)9633;
            plateau[x][y] = ' ';
            switch (input){

                case "z":
                    if(x == 0){
                        x = TAILLE - 1;
                    }else{
                        x--;
                    }
                    break;
                case "s":
                    if(x == TAILLE - 1){
                        x = 0;
                    }else{
                        x++;
                    }
                    break;
                case "q":
                    if(y == 0){
                        y = TAILLE - 1;
                    }else{
                        y--;
                    }
                    break;
                case "d":
                    if(y == TAILLE - 1){
                        y = 0;
                    }else{
                        y++;
                    }
                    break;
                case "w":
                    System.out.println("Ciao!");
                    break;
            }

            plateau[x][y] = 'O';
//            plateau[x][y] = (char)9635;
        }while(!input.equals("w"));
    }
}
