package be.bstorm.demos;

public class DemoConversion {

    public static void main(String[] args) {

        // Conversion int vers String
        int nb = 42;
        String myString = String.valueOf(nb); // "42"

        // Conversion String vers int
        int myInt = Integer.parseInt(myString);

        // Conversion int vers float
        float myFloat = (float) myInt;

        // Conversion Integer vers String
        Integer nb2 = 42;
        myString = nb2.toString();

        // Conversion int vers Integer (boxing)
        nb2 = nb;

        // Conversion Integer vers int (unboxing)
        nb = nb2;
    }
}
