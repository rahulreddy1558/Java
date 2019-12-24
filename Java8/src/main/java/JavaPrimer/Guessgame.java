package JavaPrimer;

import java.util.Arrays;
import java.util.List;

public class Guessgame {
    Player p1 = new Player();
    Player p2= new Player();
    Player p3= new Player();
    int actualnum =  (int) (Math.random() * 10);


    public List<Player> startgame(){
        List<Player> l1 = Arrays.asList(p1,p2,p3);

        for (Player p1: l1){
            if(p1.guessnum() == actualnum) {
                p1.matched = true;
            }
        }

        return l1;

    }

    public static void main(String[] args) {
        List<Player> ex = new Guessgame().startgame();
        for(Player ps: ex){
            System.out.println(ps.matched);

        }

    }

}
