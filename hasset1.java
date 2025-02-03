package javaclass;
import java.util.Vector;

public class hasset1 {
	
	

		
		public static void main(String[] args) {
			
			Vector<Integer> a1=new Vector<Integer>();
			 a1.add(12);
			 a1.add(10);
			 a1.add(19);
			 a1.add(9);
			 a1.add(8);
			 System.out.println(a1);
			 
			 for(int i=0;i<a1.size();i++)
			 {
				 System.out.println(a1.get(i));  // a[i];
			 }
			System.out.println("*******");
			
			for(Integer i : a1)
			{
				System.out.println(i);
			}
		}
		
	}
