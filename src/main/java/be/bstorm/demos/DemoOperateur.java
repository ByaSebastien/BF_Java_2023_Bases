package be.bstorm.demos;

public class DemoOperateur {

    public static void main(String[] args) {

        int nb1 = 5, nb2 = 2, result;
        // Addition
        result = nb1 + nb2;
        System.out.println(nb1 + " + " + nb2 + " = " + result);
        // Soustraction
        result = nb1 - nb2;
        System.out.println(nb1 + " - " + nb2 + " = " + result);
        // Multiplication
        result = nb1 * nb2;
        System.out.println(nb1 + " X " + nb2 + " = " + result);
        // Division
        double res = (double)nb1 / nb2;
        System.out.println(nb1 + " / " + nb2 + " = " + res);
        // Modulo
        result = nb1 % nb2;
        System.out.println(nb1 + " % " + nb2 + " = " + result);
    }
}
