package be.bstorm.demos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTableaux {

    public static void main(String[] args) {

        String [] names = new String[3];
        names[0] = "Pierre";
        names[1] = "Paul";
        names[2] = "Jacques";


        System.out.println("Bonjour " + names[2]);

//        System.out.println(strings);
        for (int i = 0; i < names.length; i++ ){
            System.out.println(names[i]);
        }

        for(String s : names) {
            System.out.println(s);
        }

//        int[][] ints2D = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        int[][] ints2D = new int[3][3];

//        ints2D[0][0] = 1;
//        ints2D[0][1] = 2;
//        ...
        int cpt = 1;
        for (int i = 0; i < ints2D.length; i++){

            for (int j = 0; j < ints2D[i].length; j++){

                ints2D[i][j] = cpt++;
            }
        }

        for (int i = 0; i < ints2D.length; i++){

            for (int j = 0; j < ints2D[i].length; j++){

                System.out.print(ints2D[i][j] + " | ");
            }
            System.out.println();
        }



    }
}
