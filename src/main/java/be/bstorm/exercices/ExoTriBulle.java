package be.bstorm.exercices;

public class ExoTriBulle {

    public static void main(String[] args) {

        int cpt = 0; // Variable pour compter le nombre de comparaisons effectuées
        int[] numbers = new int[]{6, 2, 4, 8, 3, 9, 4, 7};

        // Affichage du tableau initial
        for (int number : numbers) {
            System.out.print(number + " | ");
        }
        System.out.println();

        // tri Dylahivic par insertion
        // Tri du tableau par la méthode du tri par insertion
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                for (int j = i; j > 0 && numbers[j] < numbers[j - 1]; j--) {
                    // Échange des éléments
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    cpt++;
                }
            }
        }

        for (int number : numbers) {

            System.out.print(number + " | ");
        }
        System.out.println();

        for (int i = 1; i < numbers.length; i++){

            if(numbers[i] < numbers[i - 1]){

                for (int j = i; j > 0 && numbers[j] < numbers[j - 1]; j--){

                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;

                    cpt++;
                }
            }
        }

//        for (int i = 0; i < numbers.length - 2; i++) {
//
//            for (int j = 0; j < numbers.length - i - 1; j++) {
//
//                if (numbers[j] > numbers[j + 1]) {
//
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//
//                }
//                cpt++;
//            }
//        }

//        boolean swap;
//        do {
//            swap = false;
//            for (int i = 0; i < numbers.length - 1; i++) {
//
//                if (numbers[i] > numbers[i + 1]) {
//
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                    swap = true;
//                }
//                cpt++;
//            }
//        } while (swap);

        // Affichage du nombre de comparaisons effectuées
        System.out.println(cpt);

        // Affichage du tableau trié
        for (int number : numbers) {
            System.out.print(number + " | ");
        }
    }
}
