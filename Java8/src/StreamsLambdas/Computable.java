package StreamsLambdas;

public interface Computable {
	
	public int compare();
	
	public default int doublenumber(int num) {
		return 2 * num;
	}
	
	public default int negatenumber(int num) {
		return -1 * num;
	}

}
