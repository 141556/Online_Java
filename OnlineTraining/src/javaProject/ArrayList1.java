package javaProject;

import java.util.ArrayList;


public class ArrayList1 {

	public static void main(String[] args) {
		// Create ArrayList - We can use when we don't have fixed length
		ArrayList<Object> Obj = new ArrayList<Object>();
		// Adding Object in ArrayList
		Obj.add(1);
		Obj.add("Selenium");
		Obj.add(7.0);
		Obj.add(3>12);
		Obj.add('a');
		
		//Print ArrayList elements - 1st way
		System.out.println(Obj);
		
		//Using for each
		for(Object b:Obj) {
			System.out.println("Using for each loop:" + b);
		}
	}

}
