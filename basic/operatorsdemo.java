package basic;

public class operatorsdemo {
	/*
	 * operators
	 * 1.arithmetic operators:+,-,*,/
	 * 2.assignment operator:=,+=,-=
	 * 3.logical operator:&&,||
	 * 4.relational operator:>,<,>=,<=,==,!=
	 * 5.unary operator:++,--
	 */
	public static void main(String[] args) {
	// in arithmetic operator division by zero is not allowed
		System.out.println(10%2);
		System.out.println(10/2);
		
		int a=5;
				a=a+1;
				a+=2;//a=a+2
				a-=3;
				System.out.println("the value is "+a);//a is concatenation
				a++;
				System.out.println(a);
				
		String city="chennai";
		if(!(city.contentEquals("delhi")))
		{
			System.out.println("eligible");
		}
		
	}

}
