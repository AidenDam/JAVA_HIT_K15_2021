package bai_3;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    String str = readStr("Nhap chuoi: ");

	    if(!checkNumber(str)) {
	    	System.out.println("Chuoi khong co so");
	    } else {
	    	System.out.println("Tong cac so co trong chuoi la:" + sumNumbers(str));
	    }
  	}

  	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}

  	public static boolean checkNumber(String str) {
	  	for (char c : str.toCharArray()) {
	  		if(c >= '0' && c <= '9') return true;
	  	}
	  	return false;
  	}

  	public static int sumNumbers(String str) {
	  	int s = 0;
	  	for (char c : str.toCharArray()) {
	  		if(c >= '0' && c <= '9') s += (c - '0');
	  	}
	  	return s;
  	}
}