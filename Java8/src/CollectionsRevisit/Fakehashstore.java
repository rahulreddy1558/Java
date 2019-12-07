package CollectionsRevisit;

import java.util.Arrays;

public class Fakehashstore {
    private static final int STORE_SIZE = 10;
    private Object[] store = new Object[STORE_SIZE];

    public void add(Object o){
        store[o.hashCode()] = o;
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        for(Object o : store){
            if(o != null){
                sb.append(o).append(",");
            }
        }
        if(sb.length() >= 2){
            sb.setLength(sb.length()-2);
        }

        return sb.toString();
    }

    public boolean contains(Object o){
        return store[o.hashCode()] != null;
    }

    public static void main(String[] args) {
        Fakehashstore k1 = new Fakehashstore();

        k1.add(new StudentHash("a"));
        k1.add(new StudentHash("aa"));
        k1.add(new StudentHash("aaa"));
        k1.add(new StudentHash("aaaa"));
        k1.add(new StudentHash("aaaaa"));
        k1.add(new StudentHash("aaaaaa"));

        System.out.println(k1.print());
    }

}
