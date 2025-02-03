package javaclass;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset5 {
	
	
		
		public static void main(String[] args) {
			
		
			
			
			// Arrylist : linkedList : Vectors; curser:-> 1)enumeration(legacy cursor) 2)iterator 3)listiterator;
			
			// for loop  // inhanse for loop   a1.size()  ; a1.get(index)
			
			//Collection : 1) List 2) Set
			// set: remove the duplicates
			// 1)HashSet  2)LinkedHaShset
			
			 	
			 		// hashset: 16 block of bucket memory : hashcode:
			
			0
			1: 9
			2
			3 : 10
			4
			5: 1
			6 : 78
			7
			8
			9
			10
			11
			12
			13
			14
			15
			
			
			1) 10 : -> (hashcode:):: 67 (suppose )
						
							67%16= rem : 3 
				
			2) 1:      	(hashcode:):: 69 (suppose )
				
							69%16= rem : 5
			
			
			
			3) 9:   81
				81%16= rem : 1
			
			
			4) 78 :    xyz

				xyz %16: 5
			
			
			
			5) 10: 1) 10 : -> (hashcode:):: 67 (suppose )
			
			67%16= rem : 3 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			 			
			 			LinkedHashSet<Integer> h1= new LinkedHashSet<>();
			 			
			 			h1.add(67);								// duplicates
				 		h1.add(89);
				 		h1.add(52);
				 		h1.add(12);
				 		h1.add(1);
				 		
				 		h1.add(18);
				 		h1.add(18);
				 		h1.add(1);

			 			System.out.println(h1);
			
			
		}
		
	}
