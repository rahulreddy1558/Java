package IntrotoDSwithJava;

import java.util.Arrays;

public class Hashimpl {
    int[] arr;
    int capacity;

    Hashimpl(){
        arr = new int[20];
        for(int i=0;i < 20;i++){
            arr[i] = 0;
        }
      capacity = arr.length;
    }

    int hashfunc(int n){
        return n%10;
    }

    boolean insert(int n){
        int home = hashfunc(n);
        int count = 0;

        while( (arr[home] !=0) && home < capacity){
            home++; count++;
            if(home==capacity) home=0;
            if(count == capacity) { System.out.println("Array is full");return false;}
        }
        arr[home] = n;
        return true;
    }





    void printarr(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Hashimpl impl = new Hashimpl();
        impl.insert(1);
        impl.insert(41);
        impl.insert(51);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(61);
        impl.insert(91);
        impl.printarr();
    }


}
