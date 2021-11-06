package Bai_3;

import java.util.Scanner;

public class Phieu
{
	private static String code;
	private static int n;
	private static Hang[] x;

	public static int readInt(String title, int min) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title); x = ip.nextInt();
		} while(x < min);
		return x;
	}

	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

	public static void input() {
		code = readStr("Enter code: ");
		n = readInt("Enter number of goods: ", 1);
		x = new Hang[n];
		for (int i=0; i<n; ++i) {
			System.out.println((i+1) + ":");
			x[i].input();
		}
	}

	public static void output() {
		System.out.println("Code: " + code);
		System.out.printf("%-10s | %-30s | %-10s\n", "Code", "Name", "Price");
		float sum = 0;
		for (int i=0; i<n; ++i) {
			x[i].output();
			sum += x[i].getPrice();
		}
		System.out.println("Sum: " + sum);
	}
}