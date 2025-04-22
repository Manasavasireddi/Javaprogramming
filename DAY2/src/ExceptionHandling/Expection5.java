package ExceptionHandling;

import java.util.Scanner;

public class Expection5 {


	    static void validate(int employeeAge) {
	        if (employeeAge <= 20) {
	            throw new ArithmeticException("Not valid");
	        } else {
	            System.out.println("Welcome to CTS");
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your age: ");
	        int employeeAge = sc.nextInt();
	        try {
	            validate(employeeAge);
	        } catch (Exception e) {
	            System.out.println(e.getMessage()); // prints "Not valid"
	        }
	        System.out.println("Execution over");
	        sc.close(); // close the scanner to prevent resource leak
	    }
	}



