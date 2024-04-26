package javaPractice;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("1.Additon\n2.Subraction\n3.Multiplication\n4.division\n5.square\n6.square root");
		System.out.println("enter your choice");
		int n=in.nextInt();
		switch(n) {
		case 1:{
			System.out.println("enter two nnumber");
			int a=in.nextInt();
			int b=in.nextInt();
			int c=a+b;
			System.out.println("added value"+c);
			break;
		}
		case 2:{
			System.out.println("enter two nnumber");
			int a=in.nextInt();
			int b=in.nextInt();
			int c=a-b;
			System.out.println("subracted value"+c);
			break;
		}
		case 3:{
			System.out.println("enter two nnumber");
			int a=in.nextInt();
			int b=in.nextInt();
			int c=a*b;
			System.out.println("multiplied value"+c);
			break;
		}
		case 4:{
			System.out.println("enter two nnumber");
			int a=in.nextInt();
			int b=in.nextInt();
			double c=a/b;
			System.out.println("divided value"+c);
			break;
		}
		case 5:{
			System.out.println("enter nnumber");
			int a=in.nextInt();
			
			int c=a*a;
			System.out.println("square value"+c);
			break;
		}
		case 6:{
			System.out.println("enter nnumber");
			int a=in.nextInt();
			
			double c=Math.sqrt(a);
			System.out.println("square root value"+c);
			break;
		}
		}

	}

}
