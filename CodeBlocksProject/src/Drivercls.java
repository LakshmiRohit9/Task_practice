public class Drivercls {
	public static void main(String[] args) {
		//Conditional blocks
		//Simple if
		int x=10;
		if (x>5) {
			System.out.println("inside if block");
			System.out.println("True");
		}
		// if-else
		int y=5;
		if (y>15)
			System.out.println("True");
		else
			System.out.println("False");
		// nested if
		int z=10;
		if (z>5)
			if (z<15)
				System.out.println("True");
		// if else if
		int a=2;
		if (a==1)
			System.out.println("CSE");
		else if (a==2)
			System.out.println("CSM");
		else if (a==3)
			System.out.println("CIC");
		else
			System.out.println("error");
		// switch
		int c=6;
		switch(c) {
		case 1: System.out.println("CSE1");
		break;
		case 2: System.out.println("CSE2");
		break;
		case 3: System.out.println("CSE3");
		break;
		case 4: System.out.println("CSE4");
		break;
		case 5: System.out.println("CSE5");
		break;
		default: System.out.println("not CSE");
		}
		// simple for
		x=0;
		for (;x<5;) {
			System.out.println(x);
			x++;
		}
		System.out.println();
		// while
		x=0;
		while (x<5) {
			System.out.println(x);
			x++;
		}
	}
}
