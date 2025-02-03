package javaclass;

public class functionn {
	

		int emid;
		
		int empsal;
		
		String name;

		public int getEmid() {
			return emid;
		}

		public void setEmid(int emid) {
			this.emid = emid;
		}

		public int getEmpsal() {
			return empsal;
		}

		public void setEmpsal(int empsal) {
			this.empsal = empsal;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Employee(int emid, int empsal, String name) {  //para?
			super();
			this.emid = emid;
			this.empsal = empsal;
			this.name = name;
		}

		public Employee() {
			System.out.println("Hi rehan with no para");
		}
		
		public Employee(int k) {
			System.out.println("Hi rehan with one para");
		}
		
		public Employee(int k ,int y) {
			System.out.println("Hi rehan with 2 para");
		}
	// monolithic???  //  1)select  2)paym
		
		// microservice?//
		
		// eureka .... server : 1)2)3)4)
}
		
