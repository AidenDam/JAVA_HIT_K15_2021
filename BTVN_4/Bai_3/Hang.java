package Bai_3;

import java.util.Scanner;

public class Hang
{
	private String code, name;
	private float price;

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
		code = readStr("\tEnter code: ");
		name = readStr("\tEnter name: ");
		price = readFloat("\tEnter price: ", 0);
	}

	public static void output() {
		System.out.printf("%-10s | %-30s | %-10f\n", code, name, price);
	}

	public static float getPrice() {
		return price;
	}
}