package be.bstorm.demos;

import java.math.BigInteger;

public class DemoVariables {

    public static void main(String[] args) {

        // Déclaration d'une variable de type String
        String myString;

        // Attribution d'une valeur à la variable myString
        myString = "Hello";

        // Création d'une nouvelle variable de type String et concaténation de myString avec " World!"
        String myNewString = myString + " World!";

        // Affichage du contenu de myNewString dans la console
        System.out.println(myNewString);

        // Déclaration d'une variable de type char et attribution de la valeur 'C'
        char myChar = 'C';

        // Déclaration d'une variable de type byte et attribution de la valeur 15
        byte myByte = 15;

        // Déclaration d'une variable de type short et attribution de la valeur 12
        short myShort = 12;

        // Déclaration d'une variable de type int et attribution de la valeur 5
        int myInt = 5;

        // Déclaration d'une variable de type long et attribution de la valeur 156
        long myLong = 156;

        // Déclaration d'une variable de type BigInteger et attribution de la valeur 156_645_125
        BigInteger myBigInteger = BigInteger.valueOf(156_645_125);

        // Déclaration d'une variable de type float et attribution de la valeur 56.14
        float myFloat = 56.14F;

        // Déclaration d'une variable de type double et attribution de la valeur 5.9
        double myDouble = 5.9;

        // Déclaration d'une variable de type boolean et attribution de la valeur true
        boolean myBoolean = true;
    }
}
