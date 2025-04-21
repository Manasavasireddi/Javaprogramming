package Polymorphism;
class Parent{
	//super class//
	void run()  //method name run//
	{
		System.out.println("Parent Method"); //Parent Method//
	}
}
public class Overriding extends Parent{ // sub class//
	void run() // here method name also run//
	{
		System.out.println("Child Method"); //Child Method//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Overriding obj=new Overriding();
          obj.run(); // Calls the run() method of the child class//
          
          //o/p: child method//
          
          Parent obj1=new Parent(); // here only one usage so it is a loosing coupling , Create an object of the parent class 'Parent'
          obj1.run(); // Calls the run() method of the parent class//
          
          //Parent Method//
	}
}