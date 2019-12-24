package IntrotoDSwithJava;

import java.util.*;

public class Coins {

    public boolean match(String s1, String s2){
         if (s1.toUpperCase().compareTo(s2.toUpperCase()) ==0) return true;
         else return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=0;i<9;i++){

            System.out.println(rand.nextInt(8));
        }

      System.out.println(  1.0%1!= 0);

      System.out.println(new Coins().match("hello","Helo"));
        int actual = 99;
        int change = 0;
       int[] ab = {25,10,5,1};
       int actual_temp = actual;

       for(int i = 0;i<ab.length;i++){

           if(actual_temp > ab[i]){
               change += actual_temp/ab[i];
               actual_temp = actual_temp%ab[i];
           }
       }
        System.out.println(change);

    }
}

//           while(actual_temp!=0){
//               if(ab[i] > actual_temp) break;
//               change += actual_temp/ab[i];
//               actual_temp = actual_temp%ab[i];
//               break;
//           }