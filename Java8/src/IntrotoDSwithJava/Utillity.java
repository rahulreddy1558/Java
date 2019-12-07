package IntrotoDSwithJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Utillity {
    int[] arr;
    int length;

    Utillity(int n){
        arr = new int[n];
        length = n;
    }


    public void populate(){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < length;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
    }

    public static int readValue( )throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.
                in));
        String input;
        int value =0;
        boolean OK = false;
        while (!OK){
            try{
                input = in.readLine();
                value = Integer.parseInt(input);
                OK = true;
            }
            catch (Exception e) {
                System.out.println("Invalid – please enter integer value");
            }
        }
        return value;
    }

    public boolean binarysearch(int[] arr, int item){
        int first=0;
        int last = arr.length -1;
        int mid = (first+last)/2;

        if(item == arr[mid]){
            return true;
        }
        else if(arr.length < 10) {

        }

        return false;
    }


    public static void main(String[] args)  throws IOException{
//        Utillity k = new Utillity(2);
//        k.populate();
//        System.out.println(Arrays.toString( k.arr));
        Utillity k = new Utillity(10);
        k.readValue( );

        int[] search = {1,2,3,4,5,6,7,8,8,9,9,0,0,9};
        int interim = search.length-1;
        while(search[interim] != 1 && interim < search.length){
            interim--;
        }
        System.out.println(search[interim]);

    }





}
