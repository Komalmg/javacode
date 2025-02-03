package javaclass;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;
public class list4 {
	

	
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
			 
			 // Enumeration e1=  a1.elements();
			 // Iterator :
			 
			 Enumeration e1=  a1.elements();
			
			 while(e1.hasMoreElements()) // true
			 {
				 		 int a=(int) e1.nextElement(); // 12->object  // (int )-> type cast
				 		 System.out.println(a);
			 }
			 
			 
			 
		}
	}
