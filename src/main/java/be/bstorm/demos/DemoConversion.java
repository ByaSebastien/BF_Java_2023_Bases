package be.bstorm.demos;

public class DemoConversion {

    public static void main(String[] args) {

        int nb = 42;
        String myString = String.valueOf(nb); // "42"
        int myInt = Integer.parseInt(myString);
        float myfloat = (float) myInt;

        Integer nb2 = 42;
        myString = nb2.toString();
        nb = nb2;
        nb2 = nb;


    }
}
