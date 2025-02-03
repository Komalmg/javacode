package javaclass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset6 {
	
	

		
		public static void main(String[] args) {
			
			 		// comparater: custome sorting  and comaparable : natural sorting 
			
			// Map: 
			
			// collection : interface ( main );
			
			// 1) List intrfc; 2) set interface 3) map  :    key :  value    pair
			
			
			// map : 1) HashMap; : not preserving inserion order
			
			// key : unique : no repeat ex: : customer order id: 283648723648: "pizaa"
			// new repeat key data will replace old key data 
			// repeated of value is accepted
			HashMap<Integer, String> m1= new HashMap();
			// hashmap will not maitain insertion order
			m1.put(11, "Shweta");
			m1.put(12, "Rohit");
			m1.put(13, "Mrunal");
			m1.put(14, "Shweta");
//			m1.put(12, "Nishant");
//			m1.put(14, "Sanjana");
	      m1.put(15, "Rutuja");
	      m1.put(8, "Komal");
	      m1.put(6, "Sanika");
			System.out.println(m1);
			

		}
		
	}

