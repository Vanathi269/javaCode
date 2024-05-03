package assingment1;

import java.util.Scanner;

public class largenumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=in.nextInt();	
		System.out.println("enter the second number:");
		int b=in.nextInt();
		System.out.println("enter the third number:");
		int c=in.nextInt();
		if(a>b && a>c) {
			System.out.println("the largest number is "+a);
		}else if(b>a && b>c){
			System.out.println("the largest number is "+b);
		}else {
			System.out.println("the largest number is "+c);
		}
	}

}
