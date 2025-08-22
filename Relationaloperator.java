package task;
import java.util.Scanner;

public class Relationaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		sc.close();
		

	}

}
