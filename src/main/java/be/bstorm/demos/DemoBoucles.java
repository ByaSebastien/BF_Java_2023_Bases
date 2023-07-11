package be.bstorm.demos;

public class DemoBoucles {

    public static void main(String[] args) {

        int count = 0;

        // Boucle while : exécute le bloc de code tant que la condition est vraie
        while (count < 10) {
            System.out.println(count++); // Affiche la valeur de count et incrémente count de 1
            // Autre maniere d'incrementer :
            // count = count + 1
            // count += 1;
            // count++
            // ++count
        }

        count = 0;

        // Boucle do-while : exécute le bloc de code au moins une fois, puis continue tant que la condition est vraie
        do {
            System.out.println(count++); // Affiche la valeur de count et incrémente count de 1
        } while (count < 10);

        // Boucle for : exécute un certain nombre d'itérations en définissant une initialisation, une condition et une mise à jour
        int i;
        for (i = 0; i < 10; i++) {
            int test = 42; // Déclaration et initialisation d'une variable locale "test" (qui n'est pas utilisée dans cet exemple)
            System.out.println(i); // Affiche la valeur de i à chaque itération
        }
        System.out.println(i); // Affiche la dernière valeur de i après la boucle for

        for (i = 0; i < 10; i++) {
            System.out.println(i); // Affiche la valeur de i à chaque itération
        }
    }
}
