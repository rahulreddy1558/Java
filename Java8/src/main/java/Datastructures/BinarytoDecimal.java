/* 
*
*
*/

import static java.lang.System.out;
//import  java.util.stream;
import  java.util.*;
import  java.util.stream.*;
public class BinarytoDecimal{

/*
* use length() to get the length of the string
* 
*/
public static void convertDecimal(String in){
 
	int conversion = 1;
	int finalval=0;
	int len = in.length()-1;

	for(int i = len;i>=0;i--){
		finalval += (in.charAt(i) =='1' ?1:0)*conversion;
		conversion *=2;
	}
	out.println(finalval);
		

	 	// int finalvalue = 0;
	 	// char[] chararray = in.toCharArray();
	// out.println(chararray);
	//System.out.println(Integer.parseInt(in.charAt(2)));

	//out.println(Integer.parseInt(in.charAt[0]));

	// for(int i = len;i>=0;i--){
	// 	finalvalue += Integer.parseInt(in.charAt(i)) *Math.pow(2,i);
	// }
	// out.println(finalvalue);

	// out.println(len);
	// out.println(chararray);
	// out.println(Math.pow(2,2));

}



public static void conversionBinary(String in){
	int len = in.length()-1;
	int in_acc = in;
	int point = 1;
	StringBuilder s = new StringBuilder();

	while(in_acc > 0){
		if(in_acc%point ==0) s.append(String.valueOf(point));
		point *=2;

	}

}



public static void main(String[] args){
	convertDecimal("11");
	// String s = "hasdsadasda";
	// List<String> a = new ArrayList<>(Arrays.asList("aas","asda"));
	// out.println(a); 
	// s.stream().map(p -> p.toCharArray()).forEach(k -> out.println(s));
}


}