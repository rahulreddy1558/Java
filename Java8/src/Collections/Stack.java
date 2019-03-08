package Collections;

public class Stack {
    int[] a = new int[10];
    int tos;

    Stack(){

        tos = -1;
    }


    void push(int item){
        if(item < 0 | item > 10){
            System.out.print("item supplied is out of range");
        }
        else {
            a[++tos] = item;
        }

    }


    int pop(){
        if (tos < 0){
            System.out.println("Out of stack");
            return 0;
        }
        else {
            return a[tos--];
        }
    }

}
