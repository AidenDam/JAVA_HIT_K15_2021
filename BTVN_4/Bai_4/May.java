package Bai_4;

import java.util.Scanner;

public class May
{
	private static String code, type, status;

	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

	public static void input() {
		code = readStr("\tEnter code: ");
		type = readStr("\tEnter type: ");
		status = readStr("\tEnter status: ");
	}

	public static void output() {
		System.out.printf("%-10s | %-20s | %-20s\n", code, type, status);
	}
}