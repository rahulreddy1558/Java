package CollectionsRevisit;

import Collections.Hashset;

import java.util.HashSet;
import java.util.Set;

public class Fruit {
    public static enum Color {RED,GREEN,YELLOW,BLUE,ORANGE};
    public Color color;
    Set<String> a = new HashSet<>();

    Fruit(Color color){
        this.color = color;
    }


    @Override
    public int hashCode(){
        return color.ordinal();
    }


    @Override
    public String toString(){
        return "Fruit {"+ this.color+"}";
    }

}
