package javaclass;

public class superr {
	
	class AAA extends Object{ // parent
		
		public AAA()
		{
			super();
			System.out.println("Hi I am in AAA");
		}
		
	}

	class BBB extends AAA{  // child
		
		public BBB()
		{
			super();
			System.out.println("Hi I am in BBB");
		}
		public BBB(int y)
		{
			super();
			System.out.println("Hi I am in BBB");
		}
		
	}


	public class Super {

		public static void main(String[] args) {
		
			BBB B1= new BBB(8);

		}

	}
}
