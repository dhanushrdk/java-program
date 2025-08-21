package task;
import java.util.Scanner;

public class ConvertionOfTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choice:\n1.convertion from celsius.\n 2.convertion from fahrenheit.\n 3.convertion from kelvin.\n");
		int choice=sc.nextInt();
		if(choice==1) {
		System.out.println("Enter the celsius:");
		double celsius=sc.nextDouble();
		double fahrenheit=(celsius*9/5)+32;
		double kelvin=celsius+273.15;
		System.out.println("Converting celsius into fahrenheit:");
		System.out.println(celsius+"C = "+fahrenheit+"F");
		System.out.println("converting celsius into kelvin:");
		System.out.println(celsius+"C = "+kelvin+"K");
		}
		else if(choice==2) {
		System.out.print("Enter temperature in Fahrenheit: ");
        double f2 = sc.nextDouble();
        double c2 = (f2 - 32) * 5.0 / 9.0;
        double k2 = (f2 - 32) * 5.0 / 9.0 + 273.15;
        System.out.println("Converting fahrenheit into celsius:");
        System.out.printf(f2+"F = "+c2+"C");
        System.out.println("Converting fahrenheit into kelvin:");
        System.out.println(f2+"F = "+k2+"K");
		}
        
		else if(choice==3) {
        System.out.print("Enter temperature in Kelvin: ");
        double k3 = sc.nextDouble();
        double c3 = k3 - 273.15;
        double f3 = (k3 - 273.15) * 9.0 / 5.0 + 32;
        System.out.println("Converting kelvin into celsius :");
        System.out.printf(k3+"K = "+c3+"C");
        System.out.println("Converting kelvin into fahrenheit :");
        System.out.printf(k3+"K = "+f3+"F");
        sc.close();
		}
		
		else {
			System.out.println("Enter the valid choice:");
		}
		
		
		
	}

}
