package JavaPrimer;

public class Player {
    String name;
    boolean matched = false;

    public int guessnum(){
        return (int) (Math.random() * 10);
    }


//    public static void main(String[] args) {
//        System.out.println(new Player().guessnum());
//    }

}
