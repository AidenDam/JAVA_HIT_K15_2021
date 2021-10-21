package bai_1;

import java.util.Scanner;
import java.lang.Math.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner ip = new Scanner(System.in);
	    int a, b, c;
	    System.out.print("Nhap a: "); a = ip.nextInt();
	    System.out.print("Nhap b: "); b = ip.nextInt();
	    System.out.print("Nhap c: "); c = ip.nextInt();
	    System.out.println("Max la: " + Math.max(a, Math.max(b, c)));
  	}
}