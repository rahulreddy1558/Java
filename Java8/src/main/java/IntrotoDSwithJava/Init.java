package IntrotoDSwithJava;

public class Init {

    public static void main(String[] args) {
      //  int x = 98;
//        System.out.println(x%10);
//        System.out.println(x/10);
        int  x = 29;
        int exit = x;
        while( !(exit >=0 && exit <=10)){
            int seconddigit  = exit%10;
            int firstdigit = exit/10;
            exit = seconddigit + firstdigit;
            System.out.println("****");

        }
       
        System.out.println(exit);
    }
}
