package javaPractice;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.println("enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("average of array"+avg);


	}

}
