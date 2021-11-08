package Bai_1;

import java.util.Scanner;

public class Book
{
	private String code, name, publisher;
	private int pageNumbers;
	private float price;

	public static int readInt(String title, int min) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title); x = ip.nextInt();
		} while(x < min);
		return x;
	}

	public static float readFloat(String title, float min) {
		Scanner ip = new Scanner(System.in);
		float x;
		do {
			System.out.print(title); x = ip.nextFloat();
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
		code = readStr("\tEnter book code: ");
		name = readStr("\tEnter book name: ");
		publisher = readStr("\tEnter publisher: ");
		pageNumbers = readInt("\tEnter number of page: ", 1);
		price = readFloat("\tEnter bookshelf: ", 0);
	}

	public static void output() {
		System.out.printf("%-10s | %-30s | %-30s | %-5d | %-10f\n", code, name, publisher, pageNumbers, price);
	}
}