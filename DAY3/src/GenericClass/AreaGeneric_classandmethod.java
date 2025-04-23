package GenericClass;

public class AreaGeneric_classandmethod<T>{


		    private T value;

		    public void add(T value) {
		        this.value = value;
		    }

		    public T get() {
		        return value;
		    }

		    public void getArea() {
		        // Calculate area logic can be added here
		    }

		    public static void main(String[] args) {
		        AreaGeneric_classandmethod<Integer> rectangle = new AreaGeneric_classandmethod<>();
		        AreaGeneric_classandmethod<Double> circle = new AreaGeneric_classandmethod<>();

		        rectangle.add(100);
		        circle.add(25.56);

		        System.out.println(rectangle.get());
		        System.out.println(circle.get());
		    }
		}

	






