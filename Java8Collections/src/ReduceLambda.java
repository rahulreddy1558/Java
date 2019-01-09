import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] a = {1,2,4,5,17,8,3,4,5};
				
				IntStream.of(a)
				.forEach(value -> System.out.println(value));
				
				System.out.printf("Max value: %d%n", IntStream.of(a).max().getAsInt());
				System.out.printf("Min value: %d%n", IntStream.of(a).min().getAsInt());
				/* sum of squares 
				 * 
				 */
				IntStream.of(a)
				.reduce(1,(x,y) -> x*y);
//				.limit(5)
				 
				IntStream.of(a)
				.filter(value  -> value%2==0)
				.sorted()
				.forEach(value -> System.out.printf("Even number: %d%n",value));
				Integer[] b = {4,5,2,1,3,87,5,32,6,8,9};
				System.out.printf("Prints the array as list %s",Arrays.asList(b));
				
				System.out.printf("%n%s", Arrays.stream(b)
										 .sorted()
										  .collect(Collectors.toList()));
				System.out.printf("%s", Arrays.stream(b)
										.filter(value -> value > 4)
										
										.sorted()
										.collect(Collectors.toSet()));
				
				Set<Integer> Unsorted = Arrays.stream(b)
						.filter(value -> value > 4)
						.sorted()
						.collect(Collectors.toSet());
	}

}
