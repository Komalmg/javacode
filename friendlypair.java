package javaclass;

	import java.util.Scanner;

	public class friendlypair {

		public static void main(String[] args) {
			
			int num1;
			
			int num2; 
			
			System.out.println("Enter Num 1=");
			Scanner sc=new Scanner(System.in);
			
			num1=sc.nextInt();
			
			int sum1=getdev(num1); // sum1=sum
			
			System.out.println("Enter Num 2=");
			
			num2=sc.nextInt();
			int sum2=getdev(num2);  // sum2=sum
			
			if(num1/sum1 == num2/sum2)
			{
				System.out.println("This all are frndly pair");
			}
			else {
				System.out.println("This all are NOT frndly pair");
			}
			
			
			

		}
		
		public static int getdev(int num) {  // num=num1;
			int sum=0;
			
				for(int i=1;i<num;i++)
				{
							if(num%i==0)
							{
								sum=sum+i;
							}
				}
			
			return sum;
			
			
		}

	}


	/*num1 and num2;

	num1 -> devsr;   add the devsr  num1/add1=ansr1
	num2-> devsr     add the devsr   num2/add2=ansr2

	ansr1==ansr2


	21-> 1,3,7 : 1+3+7:= 11   21/11 : 1.90

	27-> 1,3,9 :  1+3+9: 13   27/13 : 2.07


	30,140...*/
}
