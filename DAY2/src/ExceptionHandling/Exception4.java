package ExceptionHandling;

class Sam {
    void method() throws Exception {
        int a = 50 / 0; // This will throw ArithmeticException
        System.out.println(a);
    }
}

public class Exception4 {
    public static void main(String args[]) throws Exception {
        try {
            Sam obj = new Sam();
            obj.method();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("Inside main function");
    }
}