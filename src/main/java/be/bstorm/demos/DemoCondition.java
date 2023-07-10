package be.bstorm.demos;

import java.time.LocalDate;

public class DemoCondition {

    public static void main(String[] args) {

        boolean myBoolean = true;

        int nb = 10;

        System.out.println(10 > 5);
        System.out.println(10 >= 5);
        System.out.println(10 < 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);

//        if (nb > 10){
//            System.out.println("Plus grand que 10");
//        }else if(nb < 10){
//            System.out.println("Plus petit que 10");
//        }else{
//            System.out.println("Egal à 10");
//        }
//        System.out.println("finito");

//        String result = nb > 10 ? "Plus grand que 10" : "plus petit ou egale à 10";
//        String result2 = nb > 10 ? "Plus grand que 10" : nb < 10 ? "Plus petit que 10" : "Egal à 10";
//        System.out.println(result2);

        nb = 5;

        if(nb >= 1 && nb <= 10){
            System.out.println("Entre 1 et 10");
        }

        if(nb < 1 || nb > 10){
            System.out.println("Pas entre 1 et 10");
        }

        if(!(nb < 1 || nb > 10)){
            System.out.println("Entre 1 et 10");
        }

        int day = LocalDate.now().getDayOfWeek().getValue();

//        switch (day){
//
//            case 1:
//                System.out.println("Lundi des patates");
//                break;
//            case 2:
//                System.out.println("Mardi des patates");
//                break;
//            case 3:
//                System.out.println("Mercredi des patates");
//                break;
//            case 4:
//                System.out.println("Jeudi des patates");
//                break;
//            case 5:
//                System.out.println("Vendredi des patates");
//                break;
//            case 6:
//                System.out.println("Samedi des patates");
//                break;
//            case 7:
//                System.out.println("Et le dimanche, jour du seigneur, à quel bonheur, des patates au beur");
//                break;
//            default:
//                System.out.println("Erreur");
//                break;
//        }
        switch (day){

            case 1 -> System.out.println("Lundi des patates");
            case 2 -> System.out.println("Mardi des patates");
            case 3 -> System.out.println("Mercredi des patates");
            case 4 -> System.out.println("Jeudi des patates");
            case 5 -> System.out.println("Vendredi des patates");
            case 6 -> System.out.println("Samedi des patates");
            case 7 -> System.out.println("Et le dimanche, jour du seigneur, à quel bonheur, des patates au beur");
            default -> System.out.println("Erreur");
        }

    }
}
