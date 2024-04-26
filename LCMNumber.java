package javaPractice;

import java.util.Scanner;

public class LCMNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int y=a*b;
		int ans=y;
		for(int i=1;i<=y;i++) {
			if((a%i==0)&&(b%i==0)) {
				ans=i;
			}
		}
		System.out.println("lcm of number is "+ans);
	}

}
