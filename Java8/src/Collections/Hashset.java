package Collections;

import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
public class Hashset {
	
//	static List<String> k;

	public static void main(String[] args) {
		
		String[] a = {"a","b","c","d","a","b"}; 
		// This is the array and need to be converted into LIST
		
		List<String> b = Arrays.asList(a);
		
		for(String k: b) 
			System.out.println(k);
		
		set(b);
		 

	}
	
	public static void set(Collection<String> b) {
		Set<String> a = new HashSet<>(b);
		for(String i: a) {
			System.out.printf("List : %s%n",i);
		}
		System.out.printf("List : %s%n",a);
		
	}
}
	 
