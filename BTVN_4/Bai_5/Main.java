// package Bai_5;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		long b = ip.nextLong();
		float c = ip.nextFloat();
		double d = ip.nextDouble();

		System.out.println(isPrime(a));
		System.out.println(isPrime(b));
		System.out.println(isPrime(c));
		System.out.println(isPrime(d));
	}

	public static boolean isPrime(int n) {
		if(n == 1) return false;

		for (int i=2; i<=n/2; ++i) {
			if(n%i == 0) return false;
		}

		return true;
	}

	public static boolean isPrime(long n) {
		if(n == 1) return false;

		for (long i=2; i<=n/2; ++i) {
			if(n%i == 0) return false;
		}

		return true;
	}

	public static boolean isPrime(float n) {
		return false;
	}

	public static boolean isPrime(double n) {
		return false;
	}
}