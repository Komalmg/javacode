package javaclass;
import java.util.HashMap;
	import java.util.HashSet;
	import java.util.LinkedHashMap;
	import java.util.LinkedHashSet;
public class hashset9 {
	

	

		
		public static void main(String[] args) {
			
			 		// comparater: custome sorting  and comaparable : natural sorting 
			
			// Map: 
			
			// collection : interface ( main );
			
			// 1) List intrfc; 2) set interface 3) map  :    key :  value    pair
			
			
			// map : 1) HashMap; : not preserving inserion order
			
			// key : unique : no repeat ex: : customer order id: 283648723648: "pizaa"
			// new repeat key data will replace old key data 
			// repeated of value is accepted
			
			//LinkedHashMap: preserve the insertion order:
			LinkedHashMap<String, Long> m1= new LinkedHashMap();
			// hashmap will not maitain insertion order
			
			m1.put("Rehan",1234210987654l);
			m1.put("Sanjana",64567890987654l);
		
			System.out.println(m1);
			

		}
		
	}
	[10:21 PM, 7/5/2024] Rehan Sir: 22
	//Enumeration - legacy cursor supports only legacy classes, only read data, can not remove
	23
	//Iterator - universal cursor, read and remove but not add and update, unidirectional cursor
	24
	//ListIterator - bi directinal cursor which can add, update, remove and read
}
