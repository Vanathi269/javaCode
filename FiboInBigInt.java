package javaPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class FiboInBigInt {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(fib(n));

	}

	private static BigInteger fib(int n) {
		BigInteger a=BigInteger.valueOf(0);//0
		BigInteger b=BigInteger.valueOf(1);//1
		BigInteger c=BigInteger.valueOf(1);//0+1=1
		for(int i=2;i<=n;i++) {
			c=a.add(b);
			a=b;
			b=c;
		}
		return c;
	}

}
