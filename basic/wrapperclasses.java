package basic;

public class wrapperclasses {
/*
 * wrapper class
 * convert primitive into object
 * convertobject into primitive
 * 
 * auto boxing:primitive to object
 * unboxing:object to primitive
 */
	
	public static void main(String[] args) {
		//primitive - class
		int i=10;
		//Integer i2=Integer.valueOf(i);//converted explicitly
		Integer i2=i;//autoboxing,compiler will write integer.valueof()
		System.out.println(i);
		System.out.println(i2);
		
		//class - primitive
		Integer i3=45;
		//int i4=i3.intValue();
		int i4=i3;
		System.out.println(i3);
		System.out.println(i4);
		
		
	}
}
