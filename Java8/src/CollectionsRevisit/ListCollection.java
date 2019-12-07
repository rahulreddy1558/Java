package CollectionsRevisit;

        import java.util.ArrayList;
        import java.util.List;

public class ListCollection {



    public static void main(String[] args){
        List<String> ll = new ArrayList<String>();

        ll.add("Jim");
        ll.add("Jason");
        ll.add("Anthony");
        ll.add("Anthony");
        System.out.println(ll);

//        ll.remove("Anthony");
//        ll.remove(1);
        System.out.println(ll.indexOf("Anthony"));
        System.out.println(ll.lastIndexOf("Anthony"));
        System.out.println(ll);


    }
}
