package javaclass;

public class itprenureloop {


	 public static void main(String[] args) {
		 for(int i=1; i<=50; i++) {
			 if(i%3==0 && i%5==0) {
				 System.out.println(+i);
			 }
		 else if(i%3==0) {
				 System.out.println(+i);
			 }
			 else if(i%5==0) {
				 System.out.println(+i);
			 }
		 }
	 }
	}


