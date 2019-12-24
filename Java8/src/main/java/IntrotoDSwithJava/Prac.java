package IntrotoDSwithJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Prac {

    public static void main(String[] args) {
        int min = 1;
        int max = 8;
        int range = 9;
        int[] a = {1,2,3,4,5,5,6,7,8,9,0};

       // System.out.println((int)Math.random()*(max-min));
        Random rand = new Random();
        for(int i=0;i<8;i++){
            System.out.println(rand.nextInt(8));
        }



    }
}
