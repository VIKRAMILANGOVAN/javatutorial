package org.vgtech.javacollection.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		 /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList obj = new ArrayList();

		  /*This is how elements should be added to the array list*/
		  obj.add("A");
		  obj.add("B");
		  obj.add(1);
		  obj.add("C");
		  obj.add("D");
		  obj.add(2);
		  obj.add("E");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "F");
		  obj.add(1, "G");
		  
		  /* Displaying array list elements after adding element with index */
		  System.out.println("Elements after adding element with index:"+obj);
		  
		  /*Remove elements from array list like this*/
		  obj.remove("C");
		  obj.remove("E");

		  /* Displaying array list elements after removing element */
		  System.out.println("Elements after removing element:"+obj);
		  
		  /*Remove element from the given index*/
		  obj.remove(1);
		  
		  
		  boolean a=obj.contains("D");
		  
		  System.out.println(a);

		  /* Displaying array list elements after removing element with index */
		  System.out.println("Elements after removing element with index:"+obj);
		  
		  /*set element from the given index*/
		  obj.set(2, "E");
		  
		  /* Displaying array list elements after adding element with index */
		  System.out.println("Elements after setting element with index:"+obj);
		  
	   }
}
