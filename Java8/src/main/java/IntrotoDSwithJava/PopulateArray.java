package IntrotoDSwithJava;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    static int[] arr;
    static int capacity;

    PopulateArray(int n, char c){
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


    static  int[] returnArr(){
        return  arr;
    }


    boolean search(int[] arr, int find){
        int len = 0;
        boolean status = false;
        while( ( arr[len] != find) && (len < arr.length-1)) {
            len++;

            if(arr[len]== find) status = true;
        }
        return status;
    }

    boolean searchStream(int[] arr, int find){
         return false;
    }


    boolean binarysearch(int[] arr, int find) {
    int first=0;
    int last=arr.length -1;
    return false;
    }


    public static void main(String[] args) {
        int[] input1 = new PopulateArray(10,'M').returnArr();
        System.out.println(Arrays.toString(input1));
//       System.out.println((int) (Math.random() * 10));


    }


}
