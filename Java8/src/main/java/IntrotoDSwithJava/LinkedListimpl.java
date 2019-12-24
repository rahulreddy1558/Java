package IntrotoDSwithJava;



public class LinkedListimpl {
    int length=0;
    Node head;
    Node current;

    LinkedListimpl(int data){
        Node e = new Node(data);

        if(length == 0){head = e; length++;current =e;}
        else{length++;current.next =e; current =e;}
    }


    private void appendoperation(int data) throws Exception {
        if(length ==0){
            throw new Exception("Linked list not initiated yet");
        }
        else{Node e = new Node(data);
        current.next =e; current =e;
        }
    }

    void  insert(int data) throws Exception{
        appendoperation(data);
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void printlist(){
        Node temp = this.head;
        while(temp!= null){
           System.out.println(temp.data);
            temp =  temp.next;
        }
    }




    public static void main(String[] args) throws Exception {
        LinkedListimpl impl = new LinkedListimpl(1);
//        impl.printlist();
        System.out.println(impl.head.data);
        System.out.println(impl.head);
        System.out.println(impl.head.next);
//        impl.insert(10);
//        impl.insert(11);
//        impl.insert(12);
//        impl.insert(13);
//        impl.printlist();

    }
}
