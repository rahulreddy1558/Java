package IntrotoDSwithJava;

public class OrderedLnkdList {
    Node head;
    int length;
    Node currentNode;

    OrderedLnkdList(){
        Node e = new Node(0);
        head = e;
        currentNode = e;
        length++;
    }

    boolean add(int data){
        Node e = new Node(data);
        if(length!=0){
            currentNode.next = e;
            length++;
            currentNode = e;
            return true;

        }
        else{
            throw new IllegalArgumentException("Linked list has not been initiated");
        }

    }
    void print(){
        Node e = getHead();
        while(e!=null){
            System.out.println(e.data);
            e = e.next;
        }
    }

    Node getHead(){
        return  head.next;
    }

    int getCurrent(){
        return currentNode.data;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
          this.next = next;
        }
    }

    int getCountElements(){
        return length-1;
    }


    Node search(int element){
        Node e = getHead();
        while (e.next!=null && e.data!= element){
         e = e.next;
        }
        if(e.data == element) return e;
        return null;
    }


    boolean delete(int element){
        Node current = getHead();
        Node previous = getHead();
        while (current.next!=null & current.data != element){
            previous = current;
            current = current.next;
        }
        if(current.data == element){
            previous.next = current.next;
            return true;
        }
        return false;
    }


    void addOrdered(int element){
        Node e = new Node(element);
        if(getCountElements()==0){
            currentNode.next = e;
            currentNode = e;
            length++;
            return;
        }
        Node current = getHead();
        Node previous = head;
        while (current.next!=null & e.data > current.data){
            current = current.next;
        }

    }

    public static void main(String[] args) {
        OrderedLnkdList li = new OrderedLnkdList();
        li.add(10);
        li.add(11);
        System.out.println(li.search(12));
        System.out.println(li.delete(11));
        li.print();
        System.out.println("********* get Logging *********");
        System.out.println(li.getCurrent());
        System.out.println(li.getCountElements());
    }

}

/// head { data: 0 ,next : {data: 10, next: {data:11, next: null}}