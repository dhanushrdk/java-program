package task;

import java.util.Scanner;

public class Arthmetic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println(sum);
	
		System.out.println("Enter the first word");
		String x=sc.nextLine();
		System.out.println("Enter the second word:");
		String y=sc.nextLine();
		String summ =x+y;
		System.out.println(summ);
		
		
		System.out.println("Enter the first double:");
		Double c=sc.nextDouble();
		System.out.println("Enter the second double:");
		Double d=sc.nextDouble();
		System.out.println("sum is:"+(c+d));
		System.out.println("sub is:"+(c-d));
		System.out.println("div is:"+(c/d));
		System.out.println("mul is:"+(c*d));
		
		
		System.out.println("Enter the first float:");
		float e=sc.nextFloat();
		System.out.println("Enter the second float:");
		float f=sc.nextFloat();
		System.out.println("sum is:"+(e+f));
		System.out.println("sub is:"+(e-f));
		System.out.println("div is:"+(e/f));
		System.out.println("mul is:"+(e*f));
		sc.close();
		
	}

}

