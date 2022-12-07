import MGIT.*;
import CBIT.*;
import Task.*;
public class Drivercls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CBIT
		Objcls1 o1;
		Objcls2 o2;
		Objcls3 o3;
		o1=new Objcls1();
		o2=new Objcls2();
		o3=new Objcls3();
		System.out.println("CBIT");
		o1.displaydata();
		o2.displaydata();
		o3.displaydata();
		//MGIT
		System.out.println("_________________________");
		System.out.println("\nMGIT");
		Testcls1 t1;
		Testcls2 t2;
		Testcls3 t3;
		t1=new Testcls1(61,"Rohit","CSM","2022-23","Hyderabad",999999);
		t2=new Testcls2(57,"Narasimha","CSM","2022-23","Hyderabad",999989);
		t3=new Testcls3(30,"Rajesh","CSM","2022-23","Hyderabad",999979);
		t1.display();
		t2.display();
		t3.display();
		//TASK
		Object1 O1;
		Object2 O2;
		Object3 O3;
		O1=new Object1();
		O2=new Object2();
		O3=new Object3();
		System.out.println("_________________________");
		System.out.println("\nTASK");
		O1.Output();
		O2.Output();
		O3.Output();
	}
}
