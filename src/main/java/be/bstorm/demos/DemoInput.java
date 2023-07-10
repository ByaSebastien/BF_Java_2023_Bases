package be.bstorm.demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class DemoInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.print("Jour : ");
//        int day = scan.nextInt();
//        System.out.print("Mois : ");
//        String month = scan.next();
//        System.out.print("Année : ");
//        long year = scan.nextLong();

        System.out.print("Jour : ");
        int day = scan.nextInt();
        System.out.print("Mois : ");
        int month = scan.nextInt();
        System.out.print("Année : ");
        int year = scan.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
//        Date d = new Date(year,month,day);

//        System.out.println(d);
        System.out.println(date);
        System.out.println(day + " " + month + " " + year);
    }
}
