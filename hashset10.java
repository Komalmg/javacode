package javaclass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class hashset10 {
	

	
		
		public static void main(String[] args) {
			
			 		// comparater: custome sorting  and comaparable : natural sorting 
			
			// set : 1) HashSet 2) LinkedHashSet  
			
				// treeset : data sort 
			TreeSet<Integer> t1= new TreeSet<Integer>();
			
			t1.add(12);
			t1.add(11);
			t1.add(19);
			t1.add(9);
			t1.add(0);
			t1.add(67);
			t1.add(6);
			t1.add(3);
			
			System.out.println(t1);
			
			// [0, 3, 6, 9, 11, 12, 19, 67]

		}
		
	}

