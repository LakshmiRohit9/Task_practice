public class drivercls {
	public static void main(String[] args) {
		FuncOL obj;
		obj=new FuncOL();
		obj.display();
		obj.display("arg1");
		obj.display("arg1",12);
		new FuncOL().display();
		new FuncOL().display("arg1");
		new FuncOL().display("arg1",999999999);
	}
}