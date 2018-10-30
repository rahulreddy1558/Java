import java.util.stream.IntStream;

public class Intstreams {
	public static void main(String[] args) {
		int[] values = {1,2,4,3,2,5,6,7,3,5,6,7};
		
		IntStream.of(values)
				.forEach(a -> System.out.printf("%d ",a));
		System.out.println();
		System.out.printf("Sum: %d%n", IntStream.of(values).sum());
		System.out.printf("Min: %d", IntStream.of(values).min().getAsInt());
	}
}
	