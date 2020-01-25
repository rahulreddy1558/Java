import java.util.List;
import java.util.*;
import static java.lang.System.out;
import java.time.LocalDate;


public class ListTrain{

	public static void main(String[] args){

		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> list2 = Arrays.asList(7,8,9,10,11,12,13,14,15);

		List<Integer> list3= new ArrayList<>(Arrays.asList(7,8,9,10,11,12,13,14,15));

		out.println(list3.addAll(list1));
		out.println(list3.indexOf(2));

		out.println(list1);
		out.println(list3);

		for(Iterator<Integer> i = list1.iterator(); i.hasNext();){
			out.println(i.next());
		}

		List<Integer> sublist = list1.subList(0,10);
		sublist.set(0,10);
		out.println("****************************");
		out.println(list1);

		//out.println(list1.getClassName());

		 

		// Integer[] kk = integerlist1.toArray(Integer[]::new);
		// out.println(kk);

		List<Object> listobject = new ArrayList();
		listobject.add(2);
		listobject.add("heloowe");
		listobject.add(LocalDate.now());

		List<String> liststring = new ArrayList();
		liststring.add("It");liststring.add("is a string array");
		List<Object> listobj = liststring;

	}

}