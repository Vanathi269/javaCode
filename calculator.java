package assingment1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int num;
		do {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.quit");
		System.out.println("enter your choice:");
		num=in.nextInt();
		switch (num) {
		case 1:
			System.out.println("enter the first number");
			a=in.nextInt();
			System.out.println("enter the second number");
			b=in.nextInt();
			c=a+b;
			System.out.println("the result is:"+c);
			break;
		case 2:
			System.out.println("enter the first number");
			a=in.nextInt();
			System.out.println("enter the second number");
			b=in.nextInt();
			c=a-b;
			System.out.println("the result is:"+c);
			break;
		case 3:
			System.out.println("enter the first number");
			a=in.nextInt();
			System.out.println("enter the second number");
			b=in.nextInt();
			c=a*b;
			System.out.println("the result is:"+c);
			break;
		case 4:
			System.out.println("enter the first number");
			a=in.nextInt();
			System.out.println("enter the second number");
			b=in.nextInt();
			c=a/b;
			System.out.println("the result is:"+c);
			break;

		default:
			break;
		}
		}while(num!=5); 
		

	
	}

}
