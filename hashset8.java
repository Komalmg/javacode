package javaclass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
public class hashset8 {
	

	

		
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
			LinkedHashMap<String, String> m1= new LinkedHashMap();
			// hashmap will not maitain insertion order
			
			m1.put("Rehan", "Shweta");
			m1.put("Rehan", "Rohit");
		
			System.out.println(m1);
			

		}
		
	}

