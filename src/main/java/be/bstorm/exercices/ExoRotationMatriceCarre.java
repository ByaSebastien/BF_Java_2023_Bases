package be.bstorm.exercices;

public class ExoRotationMatriceCarre {

    public static void main(String[] args) {
        final int TAILLE = 10;
        int [][] tab = new int[TAILLE][TAILLE];
        int cpt = 1;
        int temp;


        // Remplir le tableau avec un nombre incrementer de 1 (cpt) => 1,2,3,4,5....
        for (int i = 0; i < TAILLE; i++){

            for (int j = 0; j < TAILLE; j++){

                tab[i][j] = cpt++;
            }
        }

        // Afficher le tableau
        for (int i = 0; i < TAILLE; i++){

            for (int j = 0; j < TAILLE; j++){

                System.out.print(tab[i][j] + " | ");
            }
            System.out.println();
        }

        for (int i = 0; i < TAILLE / 2  ; i++){

            for (int j = i; j < TAILLE - 1 - i; j++){

                temp = tab[i][j];
                tab[i][j] = tab[TAILLE - 1 - j][i];
                tab[TAILLE - 1 - j][i] = tab[TAILLE - 1 - i][TAILLE - 1 - j];
                tab[TAILLE - 1 - i][TAILLE - 1 - j] = tab[j][TAILLE - 1 - i];
                tab[j][TAILLE - 1 - i] = temp;
            }
        }
        System.out.println("_______________________________________________________________");
        for (int i = 0; i < TAILLE; i++){

            for (int j = 0; j < TAILLE; j++){

                System.out.print(tab[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
