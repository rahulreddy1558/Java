package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcenpts {

	public static void main(String[] args) {
		Product table = new Product("Wooden door",35);
		Product floorpanel = new Product("Floor Panel",35);
		Product window = new Product("Glass window",35);
		Product KitchenIsland = new Product("KitchenIsland",20);
		
		Collection<Product> Products =  new ArrayList<>();	
		/* collection of products initiated with ArrayList */
		 Product[] list = {table,floorpanel,window,KitchenIsland};
		 
		 for(Product sublist: list) {
			 Products.add(sublist);
		 }
		 
		 System.out.println(Products);
		 /* This is the toString Method Being implemented in the array
		  * prints all the list of all the elements in the array list */
		 
		 Iterator<Product> iter = Products.iterator();
		 
		 while(iter.hasNext())
		 {
//			 Collections.Product product = iter.next();
//			 System.out.println(product);
			 System.out.println(iter.next());
			 
		 }
		 
		 /* Filtering records with iterator
		  * Add the remove method to iter object to remove from the product
		  */
		 
		 while(iter.hasNext())
		 {
			 Product product = iter.next();
			 if (product.getWeight() >  20)
				 iter.remove();
			 else 
				 System.out.println(product);
			 
		 }
		 
		 System.out.println(Products);
		 
		 
	}
	
	

}
