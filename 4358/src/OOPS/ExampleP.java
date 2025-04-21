package OOPS;

public class ExampleP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankP obj;   // class name object name ;//
	
		obj=new SBI();  // one object with multiple objects . it is tightly coupling //
		System.out.println("SBI Rate Of Interest: "+obj.getRateOfInterest()); //8.3//
		
		obj=new ICICI();  
		System.out.println(" ICICI Rate Of Interest: "+obj.getRateOfInterest());//7.3//
		
		obj=new HDFC();  
		System.out.println(" HDFC Rate Of Interest: "+obj.getRateOfInterest());//0.0(here this class empty  then  it checks the BankP//
		
	}

}
// HERE BankP[ identify by using key word as extends] is the override and getRateOfInterest() is a overloading. it is the multilevel inheritance because the keyword is extends.//