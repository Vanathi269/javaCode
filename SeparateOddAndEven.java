package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddAndEven {
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		System.out.println("enter the array value");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
				
			}else {
				
					odd.add(arr[i]);
				
			}
				
		}System.out.println("even numvber");
		for(int i=0;i<even.size();i++) {
			System.out.println(even.get(i));
		
		}System.out.println("odd numvber");
		for(int i=0;i<odd.size();i++) {
			System.out.println(odd.get(i));
		
		}
	}

	

}
