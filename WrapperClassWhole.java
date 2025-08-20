package task;

public class WrapperClassWhole {

	public static void main(String[] args) {
		byte b=10;
		short s=10;
		int i=10;
		long l=40;
		float f=11.11f;
		double d=11.2334d;
		char c='a';
		boolean b2=true;
		
		//autoboxing: converting primitive data type into objects
		Byte byteobj=b;  //creating obj for particular var
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		
		//printing object
		System.out.println("printing autoboxing values:");
		System.out.println("Byte Object:"+byteobj);
		System.out.println("Short Object:"+shortobj);
		System.out.println("Integer Object:"+intobj);
		System.out.println("Long Object:"+longobj);
		System.out.println("Float Object:"+floatobj);
		System.out.println("Double Object:"+doubleobj);
		System.out.println("Char Object:"+charobj);
		System.out.println("Boolean Object:"+booleanobj);
		
		
		//unboxing:converting object into primitive data type
		byte bytevalues=byteobj;
		short shortvalues=shortobj;
		int integervalues=intobj;
		long longvalues=longobj;
		float floatvalues=floatobj;
		double doublevalues=doubleobj;
		char charvalues=charobj;
		boolean booeanvalues=booleanobj;
		
		System.out.println("printing unboxing values:");
		System.out.println("Byte values:"+bytevalues);
		System.out.println("Short values:"+shortvalues);
		System.out.println("Integer values :"+integervalues);
		System.out.println("Long values:"+longvalues);
		System.out.println("Float values:"+floatvalues);
		System.out.println("Double values:"+doublevalues);
		System.out.println("Char values:"+charvalues);
		System.out.println("Boolean values:"+booeanvalues);
		
		

	}

}
