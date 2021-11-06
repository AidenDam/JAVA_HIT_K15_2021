package Bai_4;

import java.util.Scanner;

public class PhongMay
{
	private static String code, name;
	private static float acreage;
	private static QuanLy x;
	private static int n;
	private static May[] y;

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
		code = readStr("Enter zoom code: ");
		name = readStr("Enter zoom name: ");
		acreage = readFloat("Enter zoom acreage: ", 0);
		System.out.println("Enter manage's information: "); x.input();
		n = readInt("Enter number of machine: ", 1);
		y = new May[n];
		for (int i=0; i<n; ++i) {
			System.out.println((i+1) + ":");
			y[i].input();
		}
	}

	public static void output() {
		System.out.println("\nZoom code: " + code + "\tZoom name: " + name + "\tZoom acreage: " + acreage);
		x.output();
		System.out.printf("%-10s | %-20s | %-20s\n", "Code", "Type", "Status");
		for (int i=0; i<n; ++i) {
			y[i].output();
		}
	}
}