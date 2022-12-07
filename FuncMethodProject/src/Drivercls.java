
public class Drivercls {
	void display() {
		System.out.println("I am from no args no returns");
	}
	int display1() {
		System.out.println("I am from no args with returns");
		return 10;
	}
	void display2(int a,int b) {
		System.out.println("I am from with args no returns");
		System.out.println("sum of numbers is "+(a+b));
	}
	int display3(int a,int b) {
		System.out.println("I am from with args with returns");
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drivercls d;
		d=new Drivercls();
		d.display();
		int x=d.display1();
		System.out.println("return value is:"+x);
		d.display2(4,6);
		int y=d.display3(3,9);
		System.out.println("return value is:"+y);
	}
}
