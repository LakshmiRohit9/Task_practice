package CBIT;

public class Objcls3 {
	int Hno;
	String sname;
	String branch;
	String year;
	String address;
	int Mnum;
	public Objcls3(){
		Hno=30;
		sname="Rajesh";
		branch="CSM";
		year="2022-23";
		address="Hyderabad";
		Mnum=999979;
	}
	public void displaydata() {
		System.out.println();
		System.out.println("Hallticket no:"+Hno);
		System.out.println("Student name:"+sname);
		System.out.println("Branch:"+branch);
		System.out.println("year:"+year);
		System.out.println("address:"+address);
		System.out.println("Mobile no:"+Mnum);
	}
}
