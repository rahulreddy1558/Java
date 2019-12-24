package StreamsLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Functional Interface only have one abstract method
 * Functional Interface facilitate the use of lamba expressions
 * Consumer Interface has a single abstract method accept
 * Method and constructor references allows to use method or constructor as if its a lambda expression
 */

public class FunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterface a= new FunctionalInterface();
		FunctionalInterface.show();		
	}
	public static void show() {
	 IntStream.of(12,52,35,232,345,223,3456)
	 .map(x -> x*2)
	 .forEach(x -> System.out.println(x));
	 
	 Stream<Integer> streams = Stream.of(12, 52, 32, 74, 25);
	    streams
	        .map(x -> x * 2)
	        .forEach(x ->System.out.println(x));
	 
	 String names[] = {"Sally", "George", "Paul"};
	    List<String> list = Arrays.asList(names);
	    Stream<String> stream = list.stream();
	    stream.forEach(
	    		name ->System.out.println(name + " - "  + name.length())
	    		);
	    
	  
	    
	    
	    
 
	}
}
