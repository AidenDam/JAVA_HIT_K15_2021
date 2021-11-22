package Bai_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("str= ");
		String s = sc.nextLine();

		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				int x = Character.getNumericValue(s.charAt(i));
				sum += x;
				arr.add(x);
			}
		}

		int mul = 1;
		for (int e : arr) {
			if(sum % e == 0) {
				mul *= e;
			}
		}

		System.out.println("Co " + arr.size() + " ky tu so");
		System.out.println("Tich: " + mul);
	}
}