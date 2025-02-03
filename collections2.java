package javaclass;
import 
java.util.ArrayList;

import 
java.util.LinkedList;


	

	public
	class 
	Collections {


	public
	static
	void 
	main(String[] args) {
	// 
	TODO 
	Auto-generated method stub

	LinkedList<String> lk1=
	new 
	LinkedList<>();

	vector in collection is called is called legacy - collection collection:

	lefacy: version 1

	lk1.add("Rehan");

	lk1.add("Rahil");

	lk1.add("Pankaj");

	System.
	out
	.println(lk1.get(2));
	System.
	out
	.println(lk1.getFirst());
	System.
	out
	.println(lk1.getLast());

	lk1.remove(1);
	System.
	out
	.println(lk1);

	lk1.add("rohan");
	LinkedList<String> lk2=
	new 
	LinkedList<>(lk1);

	System.
	out
	.println(lk2);

	lk2.add("Rohit");
	lk2.add("Akash");

	System.
	out
	.println(lk2);



	System.
	out
	.println(lk2);
	ArrayList<Integer>a1=
	new 
	ArrayList<Integer>();
	a1.add(98);
	a1.add(100);

	ArrayList<Integer> a2=
	new 
	ArrayList<Integer>(a1);

	System.
	out
	.println(a2);

	ArrayList<String> a3=
	new 
	ArrayList<>(lk2);

	System.
	out
	.println(a3);

	LinkedList<Integer> lk3=
	new 
	LinkedList<>(a2);
	System.
	out
	.println(lk3);

	ArrayList a7= 
	new
	ArrayList();
	a7.add(23);

	a7.add("Rehan");

	System.
	out
	.println(a7);

	}

	}

