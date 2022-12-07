import java.util.Scanner;
public class Drivercls {
	static {
		System.out.println("Static block invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main block invoked");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println(name);
		int x=sc.nextInt();
		System.out.println(x);
	}
	
}
