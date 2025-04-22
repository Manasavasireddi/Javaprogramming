package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int a[] = new int[5];
            a[6] = 30; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Exception Handled");
    }
}