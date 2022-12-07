import java.util.Scanner;
public class Drivercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][];
		a=new int[5][2];
		Scanner sc;
		sc=new Scanner(System.in);
		for (int i=0;i<5;i++) {
			for (int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
