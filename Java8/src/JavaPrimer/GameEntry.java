package JavaPrimer;

import java.util.Arrays;

public class GameEntry {


    public static void main(String[] args) {

        Score score1 = new Score("rahul",40);
        Score score2 = new Score("akhil",100);

        Score[] sc1 = new Score[]{score1, score2};
        Score[] sc2 = sc1.clone();

        sc1[1].score = 120;
        System.out.println(Arrays.toString(sc1));
        System.out.println(Arrays.toString(sc2));
    }

}



class Score implements Cloneable{
    String name;
    int score;


    Score(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return "score :"+name+" score: "+score;
    }
}
