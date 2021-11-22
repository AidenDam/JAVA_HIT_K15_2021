package Bai_2;

import java.util.Scanner;

public class Book extends Document
{
	private String author;
	private int numbersOfPage;

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

	@Override
	public void input() {
		super.input();
		numbersOfPage = readInt("\tEnter number of page: ", 1);
		author = readStr("\tEnter author: ");
	}

	public void output() {
		System.out.printf("%-10s | %-30s | %-30s | %-30s | %-5d | %-10f\n", id, name, publisher, author, numbersOfPage, price);
	}
}