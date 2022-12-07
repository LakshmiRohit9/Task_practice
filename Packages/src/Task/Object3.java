package Task;

public class Object3 {
	int TId;
	String Tname;
	int Dur;
	String Exp_Out;
	public Object3() {
		TId=30;
		Tname="Task";
		Dur=90;
		Exp_Out="Java";
	}
	public void Output() {
		System.out.println();
		System.out.println("Training Id:"+TId);
		System.out.println("Training Name:"+Tname);
		System.out.println("Duration:"+Dur+"hrs");
		System.out.println("Expected output:"+Exp_Out+" Perfection");
	}
}
