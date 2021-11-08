package Bai_2;

import java.util.Scanner;

public class NHANSU
{
	private String code, name;
	private Date NS = new Date();

	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

	public static void input() {
		code = readStr("\tEnter code: ");
		name = readStr("\tEnter name: ");
		System.out.println("\tEnter birthday: ");
		NS.input();
	}

	public static void output() {
		System.out.println("Code: " + code);
		System.out.println("Name: " + name);
		System.out.print("Birthday: "); NS.output();
	}
}