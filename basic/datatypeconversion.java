package basic;

public class datatypeconversion {
	/*
	 * data type conversion
	 * 
	 * converting the type of data from one from to another
	 * 
	 * bucket theory:
	 * bucket1>> 5l
	 * bucket2>> 3l
	 * 
	 * task:transfer all water
	 * b2 to b1>>lower to higher>>no problem
	 * b1 to b2>>higher to lower>> problems>>loss of data
	 * 
	 * byte<< short << int << long << float << double
	 * 
	 * primitive to primitive>>casting
	 * non primitive to non primitive>> casting
	 * primitive to non primitive>> no casting,use wrapper class
	 * 
	 */
	public static void main(String[]args) {
		int a;
		a=10;
		float b=34.45f;
		b=a;
		System.out.println(a);
		System.out.println(b);
		
		float c=78.95f;
		int d=(int)c;//higher to lower
		System.out.println(c);//78.95
		System.out.println(d);//78 chopping the precision
		
		int i1;
		char c1='a';
		i1=c1;
		System.out.println(c1);
		System.out.println(i1);
		
		int i2=66;
		char c2=(char) i2;
		System.out.println(i2);
		System.out.println(c2);
		
		//int to string
		int i3=345;
		String s1=Integer.toString(i3);
		String s4=String.valueOf(i3);
		System.out.println(i3+10);//here + is operator
		System.out.println(s1+10);//here + is comcatenation because of string
		System.out.println(s4);
		//string to int the string value should be a number otherwise it is an error
		String s2="123";
		int i4=Integer.parseInt(s2);
		System.out.println(s2+10);
		System.out.println(i4+10);
		
		String str=null;
		System.out.println(String.valueOf(str));
		System.out.println(str.toString());
		


	}
}
