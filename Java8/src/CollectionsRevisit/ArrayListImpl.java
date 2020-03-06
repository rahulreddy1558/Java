package CollectionsRevisit;

import java.util.Arrays;

public class ArrayListImpl<E> {

    private E[] data;
    private int actualLength;

    ArrayListImpl(){
        data = (E[])(new Object[10]);
        actualLength = 0;

    }

    public int size(){
        return actualLength;
    }

    public void add(E e){
        evaluateLength(actualLength+1);
        data[actualLength++] = e;
    }


    public void evaluateLength(int minCapacity ){
        if(size() < minCapacity+1){
            data = Arrays.copyOf(data,minCapacity+1);
        }
    }


    @Override
    public String toString(){
        return Arrays.toString(data);
    }




    public static void main(String[] args) {
        ArrayListImpl impl = new ArrayListImpl<String>();

        for(int i=0; i<20; i++){impl.add("Jim");}

        System.out.println(impl);
    }


}
