package javaPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeBigInteger {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("is primeNumber"+isPrime(n));
		System.out.println("Next Prime"+nextPrime(n));
	}

	private static int nextPrime(int n) {
		BigInteger b=BigInteger.valueOf(n);
		String a=b.nextProbablePrime().toString();
		
		return Integer.parseInt(a);
	}

	private static Boolean isPrime(int n) {
		BigInteger b=BigInteger.valueOf(n);
		
		return b.isProbablePrime(1);
	}

}
