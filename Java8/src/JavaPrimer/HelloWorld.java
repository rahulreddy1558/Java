package JavaPrimer;

public class HelloWorld {
    public static void main(String[] args) {


        Long a = 15l;
        char letter = 'a';

        int number1 = 100;
        int number2 = number1;
        number1 = 200;

       float f1 = 10.0f;
        float f2 = 10.0f;

        float f3 = f1/f2 == 1.0f? 1.0f:1.1f;

        boolean b1 = false;
        String k = "";
        if (b1){
            k = "asda";

        }
//System.out.println(k);

        int v1, v2,v3;
        v1 = 10;
        v2 = 20;
        v3 = 30;

        if(v1 < v2 & v2 < v3){
            System.out.println("hellow");
        }
        else if(v1 > v2 & v2 > v3) {
            System.out.println("hello");
        }
        else {
            System.out.println("hello1");
        }



    }
}
