package javaPractice;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {

Scanner in=new Scanner(System.in);
int n=100;
int i=2,x=1;
for(i=2;i<=n;i++) {
while(n%i==0) {
	n=n/i;
	System.out.println(i);
	x=x*i;
	
}
}
System.out.println("the given number is"+x);

	}

}
