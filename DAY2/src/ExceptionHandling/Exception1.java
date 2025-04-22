package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   int a=50/0;
	   System.out.println(a);
   }
   catch(ArithmeticException e){
	   System.out.println(e);
	   System.out.println("Can't divided by zero");
   }
   System.out.println("Completed Sucessfully");
	}

}
