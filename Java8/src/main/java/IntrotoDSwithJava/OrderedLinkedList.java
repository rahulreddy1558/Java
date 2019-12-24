package IntrotoDSwithJava;

public class OrderedLinkedList{
    Node head;
    Node lastelement;
    int length;


    void add(int data){

        Node e = new Node(data);

        if(head == null) { head = e;
            lastelement = e; length++;

        }
        else{
            lastelement.next = e;length++;
            lastelement = e;
        }


    }

    void printlist(){
        Node in = head;
        if(in == null) return;
        while(in != null){
            System.out.println(in.data);
            in = in.next;
        }
    }

    boolean isempty(){
        if (head == null) return true;
        return false;
    }

    boolean delete(int e){
        Node previous = head;
        Node curr = head;
        if(curr == null) return false;

           while(curr !=null)
       {
            previous = curr;
            curr = curr.next;

            if(curr.data ==  e) break;
       }

       if(curr.data ==e){
           previous.next = curr.next;
           return true;
       }

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


    void delelement(int element){

    }


    public static void main(String[] args) {
        OrderedLinkedList li = new OrderedLinkedList();
        li.add(4);
        //li.add(5);li.add(7);
        //li.delete(6);
        System.out.println(li.head);
        System.out.println(li.head.next);
        li.printlist();
    }

}


/// Would get fuzzy data since the GPS coordinates are not as good.
/// Lantitude and longitude of the search
/// Persistent connection instead of the request and find API
/// a continously have an array to populate the data