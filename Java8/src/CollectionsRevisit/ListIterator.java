package CollectionsRevisit;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {


    public static void main(String[] args) {

        List<String> li = new ArrayList<>();
        li.add("Jim");
        li.add("Jim1");
        li.add("Jim2");
        li.add("Jim3");
        li.add("Jim4");
        li.add("Jim5");


        java.util.ListIterator<String> itertest = li.listIterator();

        while(itertest.hasNext()){

        }



    }
}
