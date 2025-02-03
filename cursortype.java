package javaclass;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class cursortype {
	
	
		 public static void main(String[] args) {
			// collection: 1.2;
		
			   // cursor  : input: concept: guys agar apko pura print karna hai :
			 //  System.out.println(v1);
			 
			 // for individaul cursor;
			 //: types: 3: 1) enumerations: legacy cursor
			 
			Vector<Integer> a1=new Vector<Integer>();
			 a1.add(12);
			 a1.add(10);
			 a1.add(19);
			 a1.add(9);
			 a1.add(8);
			 System.out.println(a1);
			 
			 // Enumeration e1=  a1.elements(); // version: 1
			 // Iterator : ver 1.2
			 
			Iterator i1=  a1.iterator();
			
			 while(i1.hasNext()) // true
			 {
				 		 int a=(int) i1.next(); // 12->object  // (int )-> type cast
				 		 System.out.println(a);
				 		 if(a==10)
				 		 {
				 			 i1.remove();
				 		 }
				 		 
			 }
			 System.out.println(a1);
			 
			 
			 
		}
	}

