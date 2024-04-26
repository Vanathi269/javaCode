package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> small=new ArrayList<Integer>();
		System.out.println("enter the elment");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("enter the elment to see smaller number than that");
		int x=in.nextInt(); 
		for(int i=0;i<n;i++) {
			if(arr[i]<x) {
				small.add(arr[i]);
			}
		}
		System.out.println("the smaller values");
		for(int i=0;i<small.size();i++) {
		System.out.println(small.get(i));
		}

	}

}
