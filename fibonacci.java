package assingment1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit:");
		int num=in.nextInt();
		int f1=0,f2=1,f3;
		System.out.println("fibonacci series");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i<num-2;i++) {
			f3=f2+f1;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
			
		}

	}

}
