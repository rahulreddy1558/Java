package IntrotoDSwithJava;

public class LinkedListImp {
    Node head;
    Node currentelement;
    int length;


    boolean add(int data){
     Node e=new Node(data);

     if(head == null){
         head = e;
         length++;
         currentelement = e;
     }
     else{
         currentelement.next = e;
         length++;
         currentelement = e;
     }
     return true;
    }

    void printLinkedlist(){
        Node x1 = head;
        while(x1 != null){
            System.out.println(x1.data);
            x1 = x1.next;
        }
    }

    boolean search(int e){

        Node find = head;
        if(find == null)  return false;
        while(e!= find.data & find.next!= null){
            find = find.next;
        }
        if(find.data == e) return true;

        return false;
    }

   class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        LinkedListImp k1 = new LinkedListImp();

//        k1.add(2);k1.add(24);k1.add(4);k1.add(7);k1.add(9);k1.add(10);
//        k1.printLinkedlist();
        System.out.println(k1.search(2));
        System.out.println(k1.search(10));
        System.out.println(k1.search(11));
    }

}
