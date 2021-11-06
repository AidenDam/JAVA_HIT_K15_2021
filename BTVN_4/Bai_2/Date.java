package Bai_2;

import java.util.Scanner;

public class Date
{
	private static int day, month, year;

	public static int readInt(String title, int min) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title); x = ip.nextInt();
		} while(x < min);
		return x;
	}

	public static void input() {
		day = readInt("\t\tEnter day: ", 1);
		month = readInt("\t\tEnter month: ", 1);
		year = readInt("\t\tEnter year: ", 1);
	}

	public static void output() {
		System.out.print(day + "/" + month + "/" + year);
	}
}