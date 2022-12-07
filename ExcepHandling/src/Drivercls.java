
public class Drivercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=5/0;  //may throw an exception
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
