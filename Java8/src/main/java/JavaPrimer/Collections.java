package JavaPrimer;

import java.util.*;

public class Collections {


    public static void main(String[] args){
        List<String> collection_test = new ArrayList();
        collection_test.add("B");
        collection_test.add("A");
        collection_test.add("A");



        Set<String> collection2 = new HashSet<>(collection_test);
        System.out.println("Hello");

        Iterator<String> iter = collection2.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println( collection2);
    }

}
