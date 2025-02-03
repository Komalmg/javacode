package javaclass;
import
java.util.ArrayList;

import
java.util.LinkedList;

import 
java.util.Vector;

public class list3 {
  public
	static
	void 
	main(String[] args) {
	// collection: 1.2;

	// vector: 1 : lgacy class
	// arralist : 3/2*c+1 // LinkedList : preserve order, duplicate allow , read, best : update

	// vector?? : 10 block presize : 2*c;

	Vector<Integer>v1= 
	new 
	Vector<Integer>(100,500); // size // 100+5
	v1.add(12);
	v1.add(34);


	System.
	out
	.println(v1);



	}
}
