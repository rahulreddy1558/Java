package CollectionsRevisit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorImpl {

    public static void main(String[] args){
    List<String> ll = new ArrayList<>();

        ll.add("Jamie");
        ll.add("James");
        ll.add("Kid kudi");
        ll.add("Simon");
        ll.add("Mark");
        Iterator<String> iter = ll.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
