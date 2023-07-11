package be.bstorm.exercices;

import java.util.Scanner;

public class ExoComparaison2Nombres {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";
        System.out.println("Nombre 1 : ");
        int a = scan.nextInt();
        System.out.println("Nombre 2 : ");
        int b = scan.nextInt();

        if(a < b){
            result = a + " < " + b;
        } else if (a > b) {
            result = a + " > " + b;
        }else{
            result = a + " = " + b;
        }

//        result = a + (a < b ? " < " : (a > b ? " > " : " = ")) + b;
//        result = (a < b ? a + " < " + b : (a > b ? a + " > " + b : a + " = " + b));
        System.out.println(result);
    }
}
