package CBIT;

public class Objcls2 {
	int Hno;
	String sname;
	String branch;
	String year;
	String address;
	int Mnum;
	public Objcls2(){
		Hno=57;
		sname="Narasimha";
		branch="CSM";
		year="2022-23";
		address="Hyderabad";
		Mnum=999989;
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
