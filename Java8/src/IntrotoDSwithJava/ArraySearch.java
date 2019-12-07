package IntrotoDSwithJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
     int[] arr;
     int capacity;


    ArraySearch(int n, char c){
        arr = new int[n];
        capacity = n;

        if(c =='M'){
            populate();
        } else {
            populateAuto();
        }

    }

    void populate(){
        Scanner sc = new Scanner(System.in);

        for(int i=0;i < capacity;i++){
            int input;
            System.out.println("Enter a valid number: ");
            input = sc.nextInt();
            arr[i] = input;
        }
    }


    void populateAuto(){
        for(int i=0;i < capacity;i++){
            int input = (int) (Math.random() * 100);
            arr[i] = input;
        }
    }

//    void populate(){
//
//        for(int i =0; i< 9;i++){
//        arr[i] = (int) (Math.random() * 10);
//        }
//
//    }

    /**
     * @param search
     * @return Ordered array
     *
     */

    boolean linearsearch(int search){
        int i = 0;

        while(  (i < capacity) && (arr[i] != search)) {
            i++;
            if(i == capacity) return false;
        }
       return true;
    }



    boolean binarysearch(int search){

        return  false;
    }

    int[] selectionsort(int[] arr){
        return arr;
    }


    int[] insertsort(int[] arr){
        return arr;
    }


    int[] mergesort(int[] arr){
        return arr;
    }

    void printarr(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArraySearch arr = new ArraySearch(10 , 'A');
        arr.printarr();
       System.out.println(arr.linearsearch(300));
    }


}
