package be.bstorm.demos;

import java.math.BigInteger;

public class DemoVariables {

    public static void main(String[] args) {

        String myString;
        myString = "Hello";
        String myNewString = myString + " World!";
        // sout => shortcut
        System.out.println(myNewString);
        char myChar = 'C';
        byte myByte = 15;
        short myShort = 12;
        int myInt = 5;
        long myLong = 156;
        BigInteger myBigInteger = BigInteger.valueOf(156_645_125);
        float myFloat = 56.14F;
        double myDouble = 5.9;
        boolean myBoolean = true;
    }
}
