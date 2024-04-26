package javaPractice;

import java.util.Scanner;

public class DistintElement {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array value");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=(i-1);j>=0;j++) {
				if(arr[i]==arr[j]) {
					break;
				}else
					count++;
			}
		}
System.out.println(count);
	}

}
