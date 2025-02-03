package javaclass;
import 
java.util.ArrayList;

public class arraylist1 {
	

	

	public
	static
	void 
	main(String[] args) {


	ArrayList<Integer> a1=
	new 
	ArrayList<Integer>();

	// <Integer> = generics
	a1.add(11);


	// list:-> 
	// arrayList: read operations; preserve insertion order, Allow duplicates
	// we can update , but it auto shift thereself

	a1.add(12);
	a1.add(9);
	a1.add(31);
	a1.add(6);

	System.
	out
	.println(a1);
	a1.add(2,15);
	System.
	out
	.println(a1);
	a1.remove(0);

	// [ , 12, 15, 9, 31, 6]

	System.
	out
	.println(a1);
	}
	}

