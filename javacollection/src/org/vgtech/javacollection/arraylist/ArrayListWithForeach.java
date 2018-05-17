package org.vgtech.javacollection.arraylist;

import java.util.ArrayList;

public class ArrayListWithForeach {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("E");
		
		for(String s:obj){
			System.out.println(s);
		}
	}
}
