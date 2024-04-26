package javaPractice;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit of an array");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Boolean ans=isSort(arr,n);
		System.out.println("the sorted array is"+ans);
		SortingArray obj=new SortingArray();
		System.out.println("Sorted array");
		obj.sort(arr, n);
System.out.println("now the array is sorted");
	}

	static void sort(int[] arr, int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static Boolean isSort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
