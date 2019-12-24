package ch01;

public class Utility {


    public boolean ismultiple(long m, long n){
        return  m%n == 0 ;
    }


    public int sumofn(int n){
        int m = 0;
        while (n > 0){
         m = m+n--;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(new Utility().ismultiple(25,2));
        System.out.println(new Utility().sumofn(10));

    }

    //** count number of vowels in the string
//    public int numvowel(String s){
//        s.c
//    }

    // Abstraction
    // Encapsulation
    // Modularity


                                    //Building

                 //Apartment                //House         //CommercialBuilding

    // Low rise apart  High rise apart      Two story house Ranch       Skyscraper



}
