package bai_4;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String str = readStr("Nhap chuoi: ");

	    str = str.trim();
	    char[] a = str.toCharArray();

	    str = "" + (char)(str.charAt(0) - 32);
	    for (int i=1; i<a.length; ++i) {
	    	if(a[i] >= '0' && a[i] <= '9' || str.charAt(str.length() - 1) == ' ' && a[i] == ' ') continue;
	    	if(str.charAt(str.length() - 1) == ' ') str += (char)(a[i] - 32);
	    	else str += a[i];
	    }

		System.out.println(str);
  	}

  	public static String readStr(String title) {
		Scanner ip = new Scanner(System.in);
		System.out.print(title);
    	String str = ip.nextLine();		
		return str;
	}
}