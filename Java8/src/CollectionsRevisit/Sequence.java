package CollectionsRevisit;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {
    int start, limit,increment;

    Sequence(int start, int limit, int increment){
        this.start = start;
        this.increment = increment;
        this.limit = limit;
    }


    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {

            int nextval = start;

            @Override
            public boolean hasNext() {
                return nextval <= limit;
            }

            @Override
            public Integer next() {

               if(!hasNext()) {
               throw new IllegalArgumentException("index out of bound");
               }

               int val = nextval;
               nextval+=increment;
               return val;
            }
        };
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence(1,100,3);
        Iterator<Integer> iter = seq.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
