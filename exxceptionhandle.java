package javaclass;

public class exxceptionhandle {
   public static void main(String[] args) {
	   try {
		   int a=0;
		   int result=20/a;    //exception 1)checked(compile time means syntax errror) 2)unchecked err means logical err handle using try catch bloack
		   System.out.println("result is:"+result);
		   
	   }catch(ArithmeticException e) {
		   System.out.println("exception is:"+e);}  //multiple catch block use
		   
	   catch(Exception e) {
	   
		   System.out.println("exception occured"+e);
	   }
	   finally {
       System.out.println(" finally block executed"); //this block always run and after catch block used for internally not used coonection it remove
   }
	   }
}
//exception class= parent class
//1) arithmeticexceptionclass
//2) arrayindeoutofbound
//3) stringindexoutofbound
//4) nullpointerexceptionclass 