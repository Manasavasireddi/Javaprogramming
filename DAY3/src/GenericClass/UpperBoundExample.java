package GenericClass;

public class UpperBoundExample {

		    public static <T extends Number> double addNumbers(T num1, T num2) {
		        return num1.doubleValue() + num2.doubleValue();
		    }

		    public static void main(String[] args) {
		        System.out.println("Sum of Integers: " + addNumbers(10, 20));
		        System.out.println("Sum of Doubles: " + addNumbers(10.5, 20.3));

		        // addNumbers("Hello", "World"); // Compilation error
		    }
		}
	


