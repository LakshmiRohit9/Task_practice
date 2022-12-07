package MGIT;

public class Testcls1 {
	int Hno;
	String name;
	String Branch;
	String Year;
	String Address;
	int m_num;
	public Testcls1(int hno,String sname,String branch,String year,String address,int Mnum){
		Hno=hno;
		name=sname;
		Branch=branch;
		Year=year;
		Address=address;
		m_num=Mnum;
	}
	public void display() {
		System.out.println();
		System.out.println("Hallticket no:"+Hno);
		System.out.println("Student name:"+name);
		System.out.println("Branch:"+Branch);
		System.out.println("year:"+Year);
		System.out.println("address:"+Address);
		System.out.println("Mobile no:"+m_num);
	}
}
