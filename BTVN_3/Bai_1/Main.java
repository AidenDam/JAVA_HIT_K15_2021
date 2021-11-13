// package bai_1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Person a = new Person("Dao", 19, "male", "play game");
		System.out.println(a);

		Person b = new Person();
		b.setName(readStr("Enter Name: "));
		b.setAge(readInt("Enter Age: ", 0));
		b.setGender(readStr("Enter Gender: "));
		b.setHobby(readStr("Enter Hobby: "));

		System.out.println(b.getName() + " " + b.getAge() + " " + b.getGender() + " " + b.getHobby());
	}

	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

	public static int readInt(String title, int min) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title);
			x = ip.nextInt();
		} while(x < min);
		return x;
	}
}