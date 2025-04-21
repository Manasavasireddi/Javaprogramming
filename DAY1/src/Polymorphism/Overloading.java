package Polymorphism;

public class Overloading {
	
	int a,b,c; //global variable//
	
	void sum(int a,int b)//local variable//
	{
		this.a=a;
		this.b=b;
		c=a+b;
		print();
	}
	void print()
	{
		System.out.println(c); //40//
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);//60//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Overloading obj=new Overloading();
 obj.sum(20,20);
 obj.sum(20,20,20);
 
	}

}
//here it is loosing coupling because one class has the one object//
//it is overloading because we have two method name with same name as sum//


