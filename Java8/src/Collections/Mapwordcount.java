package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Mapwordcount {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		mapwords(map);
		display(map);

	}

	private static void mapwords(Map<String, Integer> map) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine(); 
		String[] tokens = x.split(" ");
		
		for(String token : tokens){
			String word = token.toLowerCase();
			
			if(map.containsKey(token))
			{
				int count = map.get(word);
				map.put(word,count+1);
			}
			else 
				map.put(word,1);
		}
	}
	
	public static void display(Map<String, Integer> map) {
		System.out.println(map);
		System.out.println(map.get("the")); 
		Set<String> keys = map.keySet();
		TreeSet<String> keys2 = new TreeSet<>(keys);
		for(String key: keys2) {
			System.out.printf("%-10s: %10s%n", key,map.get(key));
		}
		
	}

}
