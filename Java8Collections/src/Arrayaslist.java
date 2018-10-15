import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;


public class Arrayaslist {

	public static void main(String[] args) {
		String[] a = {"red","blue","black","brown"};
//		LinkedList<String>  k = (LinkedList<String>) Arrays.asList(a);
		LinkedList<String>  k = new LinkedList<>(Arrays.asList(a));
		k.add("pink");
		k.add(2,"burgande");
		k.addFirst("a");
		k.addLast("z");
		for(String b : k) {
			System.out.println(b);
		}
		
		/**
		 * Printing LinkedList to array
		 */
		String[] p =  k.toArray(new String[k.size()]);
		for(String b : p) {
			System.out.println(b);
		} 
		/**
		 * Sort is the Method from Collections 
		 * used to sort List
		 */
		 Collections.sort(k);
		 
		 for(String b : k) {
				System.out.println(b);
			}
		
	}

}
