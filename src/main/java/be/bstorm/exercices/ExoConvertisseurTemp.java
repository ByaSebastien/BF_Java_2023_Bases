package be.bstorm.exercices;

import java.util.Scanner;

public class ExoConvertisseurTemp {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month, day, hour, minute;
        long year,second;


        System.out.print("Entrez une valeur en secondes : ");
        second = scan.nextLong();

        if (second < 0) {
            System.out.println("WTF?");
        } else {

//            year = (second / 31_536_000);
//            month = (int) ((second % 31_536_000) / 2_628_288);
//            day = (int) ((second % 2_628_288) / 86400);
//            hour = (int) ((second % 86400) / 3600);
//            minute = (int) ((second % 3600) / 60 );
//            second = second % 60;

            year = (second / 31_536_000);
            second = second % 31_536_000;
            month = (int) (second / 2_628_288);
            second = second % 2_628_288;
            day = (int) (second / 86400);
            second = second % 86400;
            hour = (int) (second / 3600);
            second = second % 3600;
            minute = (int) (second / 60 );
            second = second % 60;

            System.out.printf("%d an(s) %d mois %d jour(s) %d heure(s) %d minute(s) %d seconde(s).\n",year,month,day,hour,minute,second);


            System.out.println(Long.MAX_VALUE);
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Long.MAX_VALUE / 31_536_000);
        }
    }


}
