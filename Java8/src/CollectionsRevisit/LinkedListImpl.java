package CollectionsRevisit;


public class LinkedListImpl<E> {

    private Node head = new Node();


    private class Node{
        E data;
        Node next;
    }


    public void add(E data){
        Node last = head;
        while(last.next != null){
        last = last.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        last.next = newNode;
    }

    public void print(){
        Node last = head;

        while(last.next != null){
            last = last.next;
            System.out.println(last.data);
        }
    }

     public static void main(String[] args) {
        LinkedListImpl impl = new LinkedListImpl();
        impl.add("Gee");
        impl.add("Gees");
        impl.print();
    }

}
