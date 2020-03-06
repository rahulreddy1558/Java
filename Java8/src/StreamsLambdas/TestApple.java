import java.util.*;
import java.util.concurrent.Callable; 
import java.util.concurrent.Future;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 interface ApplePredicate{
	boolean test(Apple a);
}

interface AppleSelectString{
	void print(Apple a);
}


class AppleSelectStringClass implements AppleSelectString{
	@Override 
	public void print(Apple a){
		String description = a.getWeight() > 100? "Heavy": "light";
		System.out.println(String.format("This apple with getWeight %d is %s", a.getWeight(),description));
	}
}

class ApplePredicateWeight implements ApplePredicate{

@Override
public boolean test(Apple a ){
	return a.getWeight() > 120;
}
}


public class TestApple{

	public List<Apple> ApplePredicate(List<Apple> ll, ApplePredicate p){
		List<Apple> newlist = new ArrayList<>();
		for(Apple a : ll){
			if(p.test(a)) newlist.add(a);
		}
		return newlist;
	}


	public void AppleSelectString(List<Apple> ll, AppleSelectString p){
		List<Apple> newlist = new ArrayList<>();
		for(Apple a : ll){
			 p.print(a);
		} 
	}

	public static void main(String[] args){
		List<Apple> inventory = new ArrayList<>(Arrays.asList(new Apple("a1",100),new Apple("a2",70),new Apple("a3",20),new Apple("a4",150)
			, new Apple("a10",140,Colour.RED,AppleType.TYPE1)
			, new Apple("a11",169,Colour.YELLOW,AppleType.TYPE2)
			, new Apple("a11",179,Colour.ORANGE,AppleType.TYPE3)
			));

		List<Apple> k = new TestApple().ApplePredicate(inventory, new ApplePredicateWeight());
		System.out.println(k);

		new TestApple().AppleSelectString(inventory, new AppleSelectStringClass());

		new TestApple().AppleSelectString(inventory, (Apple a) -> {String s =  String.format("This apple with getWeight %d is %s", a.getWeight(), a.getWeight() > 95 ? "Heavy": "light");
			System.out.println(s);
		});

		Thread th = new Thread(() -> {System.out.println(" This is the only name that its ");});
		th.run();

		Runnable r = () -> {System.out.println("asdasd ");};
		new Thread(r).run();
		 Callable<Integer> callable = new Callable(){
		 	@Override
		 	public Integer call(){
		 		return 10;
		 	}

		 };

		 Callable<Integer> m1 = () -> {return 10;};
 
		 ExecutorService es = Executors.newFixedThreadPool(2); 
		 es.execute(() -> {System.out.println("asda");});
		 Future<String> fs = es.submit(() -> {return "Helloow";});
		 try {
		 	System.out.println(fs.get());
		 }
		 catch(Exception e){

		 }
		 
		 



		}
}