package ExceptionHandling;

public class Exception3 {
    @SuppressWarnings("null")
	public static void main(String args[]) {
        String value = null;
        try {
            System.out.println(value.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Always executed");
        }
        System.out.println("Successfully Finished");
    }
}





