import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.function.Predicate;

public class AppleTest{

		public static boolean isGreenApple(Apple apple) {
		    return Colour.GREEN.equals(apple.getcolour());
		}
		public static List<Apple> applefilter(List<Apple> inventory){
			List<Apple> modified = new ArrayList<>();
			for(Apple a1: inventory){
				if(Colour.ORANGE.equals(a1.getcolour())) modified.add(a1);
			}
			return modified;

		}

		public static List<Apple> filterpredicate(List<Apple> inventory, Predicate<Apple> p1){
			List<Apple> modified = new ArrayList<>();
			for(Apple a1: inventory){
				if(p1.test(a1)) modified.add(a1);
			}
			return modified;
		}

		public static void main(String[] args){
		Apple app1 = new Apple("app1", 100, Colour.RED, AppleType.TYPE1);
		Apple app2 = new Apple("app2", 100);
		System.out.println(app1);


		List<Apple> ll = new ArrayList<>(
			Arrays.asList( new Apple("a1",100),new Apple("a2",70),new Apple("a3",20),new Apple("a4",150))
			);
		System.out.println(ll);
		Collections.sort(ll, (Apple a1, Apple a2) -> Integer.compare(a1.weight, a2.weight));
		ll.stream().forEach(t -> System.out.println(t.getWeight()));

		Collections.sort(ll, new Comparator<Apple>(){
			@Override
			public int compare(Apple a1, Apple a2){
				return Integer.compare(a1.weight, a2.weight);
			}
		});

		List<Apple> inventory = new ArrayList<>(Arrays.asList(new Apple("a1",100),new Apple("a2",70),new Apple("a3",20),new Apple("a4",150)
			, new Apple("a10",140,Colour.RED,AppleType.TYPE1)
			, new Apple("a11",169,Colour.YELLOW,AppleType.TYPE2)
			, new Apple("a11",179,Colour.ORANGE,AppleType.TYPE3)
			));

		System.out.println(applefilter(inventory));
		Predicate<Apple> t1 = new Predicate<Apple>(){
			@Override
			public boolean test(Apple a1){
				return a1.getWeight() < 70;
			}
		};
		System.out.println(filterpredicate(inventory,AppleTest::isGreenApple));
		System.out.println(filterpredicate(inventory,(Apple a1) -> a1.getWeight() > 90));
		System.out.println(filterpredicate(inventory,new Predicate<Apple> (){ 
			@Override
			public boolean test(Apple a1){
				return a1.getWeight() > 20;
			}
		}));
	}
}