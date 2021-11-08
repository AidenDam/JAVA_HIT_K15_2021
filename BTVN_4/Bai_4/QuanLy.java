package Bai_4;

import java.util.Scanner;

public class QuanLy
{
	private String code, name;

	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

	public static void input() {
		code = readStr("\tEnter code: ");
		name = readStr("\tEnter name: ");
	}

	public static void output() {
		System.out.println("Manager code: " + code + "\tManager name: " + name);
	}
}