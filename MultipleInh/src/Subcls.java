
public class Subcls extends Supercls implements Myintf {
	public void display() {
		System.out.println("Interface method invoked");
	}
	void display2() {
		display1();
	}
}
