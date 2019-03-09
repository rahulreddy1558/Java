package JavaPrimer;

public class Simplecalc {
//    static double val1 = 100.0;
//    static double val2 = 50.0;
//    char operator;

    public static void main(String[] args) {
        double val1 = 100.0;
        double val2 = 50.0;
        double result;
        char operator = '/';

        if (operator == '+') {
            result = val1 + val2;
        } else if (operator == '-') {
            result = val1 - val2;
        } else if (operator == '/') {
            result = val1 / val2;
        } else if (operator == '*') {
            result = val1 * val2;
        }
        else {
            result = 0.0;
        }

        System.out.println(result);

        Simplecalc a = new Simplecalc();
                a.factorial();
                a.array();

    }


    int kval = 5;
    int fac=1;

     void factorial(){
        while(kval > 1){
            fac *= kval;
            kval -= 1;
        }


        System.out.println(fac);
    }


    void array(){
         float[] array = {0.01f, 0.02f, 0.03f};

        for (float a :array) {
            System.out.println(a);
        }
    }


}