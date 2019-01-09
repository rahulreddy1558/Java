package Collections;

import java.util.LinkedList;
import java.util.List; 
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		String[] colors1 = {"black","Yellow","green","blue","violet","silver"};
		List<String> list1 = new LinkedList<>();
		
		for(String list : colors1)
			list1.add(list);
		
		String[] colors2 = {"Gold","White","Brown","blue","Gray"};
		List<String> list2 = new LinkedList<>();
		
		for(String list : colors2)
			list2.add(list);
		
		list2.addAll(list1);
		
//		System.out.print(list2);
		upper(list2);
		printlist(list2);
		System.out.print(".");
		remove(list2, 1,  3);
		printlist(list2);
		}
		 

		public static void printlist( List<String> a) {
			for(String i : a) 
				System.out.println(i);
		}
			
		 public static void  upper(List<String> list) {
			 ListIterator<String> k = (ListIterator<String>) list.listIterator();
			 
			 while(k.hasNext())
			 {
				 String b = k.next();
				 k.set(b.toUpperCase());
			 }
			 
			 
		 }
		 
		 public static void remove( List<String> i, int a, int b) {
			 i.subList(a, b).clear();
				
			}
		
}
