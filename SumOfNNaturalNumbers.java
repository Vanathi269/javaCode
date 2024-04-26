package javaPractice;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		System.out.println("sum of natural number");
		sum=(n*(n+1))/2;
		System.out.println("using formula"+sum);
		int sum1=0;
		for(int i=0;i<n;i++) {
			sum1=sum1+i;
		}
System.out.println("sum using for loop"+sum1);
	}

}
