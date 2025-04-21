package Compositon;
class engine{
	void start()
	{
		System.out.println("engine started.");
	}
}
class Car
{
	private engine Engine;
	public Car()
	{
		Engine=new engine();
		
	}
	public void startCar()
	{
		Engine.start();
		System.out.println("car is starting.");
	}
	
}
public class CompositionP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Car car=new Car();
  car.startCar();
	}

}
