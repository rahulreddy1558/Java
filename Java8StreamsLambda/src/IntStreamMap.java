import java.util.stream.IntStream;

public class IntStreamMap {

	public static void main(String[] args) {
		 int[] a = {10,2,6,4,6,7,2,4,6,7};
		 
		 IntStream.of(a)
			.filter(value -> value % 2 == 0)
//			.map(value  = value * 2 )
			.sorted()
			.forEach(value -> System.out.printf(" %d%n",value));
	
		 System.out.print("The actual Number are");
		 IntStream.of(a)
		 			.forEach(value -> System.out.println(value));
		 
		 

	}

}
