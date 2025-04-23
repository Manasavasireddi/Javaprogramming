package WrapperClass;

public class Box_Unbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12;
		Integer age=new Integer(i);
		System.out.println(age);

		int ages=age.intValue();
		System.out.println(ages);

		Integer no = new Integer(2);
		System.out.println(no);
	}

}
