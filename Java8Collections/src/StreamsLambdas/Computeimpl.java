package StreamsLambdas;

import java.util.ArrayList;
 
public class Computeimpl implements Computable {

	
	public static void main(String[] args) {
		Computeimpl computeimpl = new Computeimpl();	
		System.out.println(computeimpl.doublenumber(2));
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Orange");
		a.add("Beto");
		a.add("Stacy");
		a.add("Pineapple");
		a.add("Guellum");
		a.add("pink");
		a.forEach(x ->System.out.println(x));
	}

	@Override
	public int compare() {
		// TODO Auto-generated method stub
		return 1;
	} 

}

