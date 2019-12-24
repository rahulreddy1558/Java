package IntrotoDSwithJava;

import java.util.Arrays;

public class Arraysort {



    int[] selectsort(int[] arr){

        int start = 0;
        int end = arr.length;

        while(start < end){
            for(int i = start; i < end;i++){
                if(arr[i] < arr[start]) swap(arr,i,start);
                System.out.println(String.format( "Start: %d, i: %d",start,i));
            }
            start++;
        }
        return arr;
    }

    private void swap(int[] arr, int i, int start){
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }


    void mergesort(int[] arr,int start,int end){
        if(start < end) {
            int mid = (start + end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,mid+1,end);
        }
    }

    int[] merge(int[] arr,int leftstart,int leftend, int rightstart,int rightend){


        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {40,29,1,4,5,2,8,9,31,12,21};
        Thread.dumpStack();
        System.out.println();
        Arraysort sort = new Arraysort();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println(Arrays.toString(sort.selectsort(arr)));


    }


}
