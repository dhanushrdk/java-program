package task;

public class DataTypeCasting {

	public static void main(String[] args) {
		//widening casting (Automatic casting)-converting smaller type into larger type size
		//byte>short>char>int>long>float>double
		
		//narrowing casting(manual casting)-->coverting larger type size into smaller type size
		//double-->float-->long-->int-->char-->short-->byte
		
		int myInt=9;//integer
		double myDouble=myInt;//automatic or widening casting
		System.out.println("the value of myint is: "+myInt);
		System.out.println("the value of myDouble is: "+myDouble);
		
		double myDouble1=9.78d;
		int myint1=(int)myDouble;
		System.out.println("the value of myDouble1 is: "+myDouble1);
		System.out.println("the value of myint1 is: "+myint1);
		

	}

}
