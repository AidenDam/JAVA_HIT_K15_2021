package Bai_1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int n = readInt("Enter number of book: ", 1);
		Book[] lst = new Book[n];

		for (int i=0; i<n; ++i) {
			System.out.println((i+1) + ":");
			lst[i].input();
		}

		System.out.println("\n=============================================LIST==============================================");
		System.out.printf("%-10s | %-30s | %-30s | %-5s | %-10s\n", "Code", "Name", "Publisher", "Pages", "Price");
		for (int i=0; i<n; ++i) {
			lst[i].output();
		}
	}

	public static int readInt(String title, int min) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title); x = ip.nextInt();
		} while(x < min);
		return x;
	}
}