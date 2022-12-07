import java.util.Scanner;
public class Drivercls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subcls1 s1;
		Subcls2 s2;
		Subcls3 s3;
		Supercls s0;
		s0=new Supercls();
		s0.display1();
		s1=new Subcls1();
		s2=new Subcls2();
		s3=new Subcls3();
		s1.display2();
		s2.display3();
		s3.display4();
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("enter number");
		x=sc.nextInt();
		System.out.println("x="+x);
		System.out.println("enter char");
		char gender = sc.next().charAt(0);
		System.out.println("char="+gender);
	}
}
