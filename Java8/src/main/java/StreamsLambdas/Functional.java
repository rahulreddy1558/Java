package StreamsLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functional {

	public static void main(String[] args) {
 
		String[] a = { "a","b"};
		
		// declaring a array and converting each element in the array
		
		List<String> b = new ArrayList<>();
		b .add("a");
		b .add("b");
		b .add("c");
		b .add("d");
		for(String element : b) {
			System.out.println(element.toUpperCase());
		}
		
		b.forEach(s ->System.out.println(processString(t->t.toLowerCase(), s)));
		
	}
	public static String processString(Function<String, String> operation, String target) {
		return operation.apply(target);
		
	}

}
