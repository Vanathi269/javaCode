package javaPractice;

import java.util.Scanner;

public class GCDNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int ans=0;
		int x=Math.min(a, b);
		for(int i=1;i<=x;i++) {
			if((a%i==0)&&(b%i==0)){
				ans=i;
				
			}
		}
		System.out.println("GCD of Numbers is"+ans);

	}

}
