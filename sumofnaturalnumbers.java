package assingment1;

import java.util.Scanner;

public class sumofnaturalnumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit of natural numbers:");
		int num=in.nextInt();
		for(int i=0;i<num;i++) {
			sum=sum+i;
		}
		System.out.println("the sum of natural numbers is "+ sum);
	}

}
