package JavaPrimer;

import java.util.Scanner;

public class JavaPrimerch1 {


    public String reversestring(String s){
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(new JavaPrimerch1().reversestring("hello"));
        new JavaPrimerch1().wrappertype();
        String s1 = new String("3");
        System.out.println(Integer.parseInt(s1));

        Scanner sc = new Scanner(System.in);
        int intnum = sc.nextInt();
        System.out.println(intnum);


    }


    public void wrappertype(){
        Boolean b1 = new Boolean(true);
        Character c1 = new Character('C');
        Integer i1 = new Integer(100);
        Double d1 = new Double(3.94);
        Float f1 = new Float(3.94f);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(f1);
    }
}
