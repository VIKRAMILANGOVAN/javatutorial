package org.vgtech.javacollection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIteration {
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		 ArrayList obj = new ArrayList();
		  /*This is how elements should be added to the array list*/
		  obj.add("A");
		  obj.add("B");
		  obj.add(1);
		  obj.add("C");
		  obj.add("D");
		  obj.add(2);
		  obj.add("E");
		  
		  Iterator itr=obj.iterator();
		  int i=0;
		  while(itr.hasNext()){
			System.out.println(i++ +"->"+itr.next());  	  
		  }
		
	}

}
