package Bai_2;

import java.util.Scanner;

public class Document
{
	protected String id, name, publisher;
	protected float price;

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

	public void input() {
		id = readStr("\tEnter book id: ");
		name = readStr("\tEnter book name: ");
		publisher = readStr("\tEnter publisher: ");
		price = readFloat("\tEnter bookshelf: ", 0);
	}
}