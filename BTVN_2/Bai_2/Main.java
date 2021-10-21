package bai_2;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int n = readInt("Nhap so pha tu: ", 1);
		int[] arr = new int[n];

		while(true) {
			System.out.println("\n1. Nhap mang voi n so nguyen");
			System.out.println("2. Hien thi mang vua tao");
			System.out.println("3. Them 1 phan tu vao vi tri k bat ky");
			System.out.println("4. Xoa 1 phan tu tai vi tri k bat ky");
			System.out.println("5. Hien thi mang dao nguoc");
			System.out.println("6. Hien thi phan tu x va cac so chia het cho x");
			System.out.println("7. Xuat ra man hinh tong cac so nguyen to co trong mang");
			System.out.println("8. Thoat");
			int number = readInt("Nhap so: ");
			switch (number) {
            case 1:
                arr = inArr(arr, n);
                break;
            case 2:
            	outFront(arr);
                break;
            case 3:
            	arr = insert(arr);
                break;
            case 4:
            	arr = erase(arr);
                break;
            case 5:
            	outBack(arr);
                break;
            case 6:
            	getDivisible(arr);
                break;
            case 7:
            	sum(arr);
                break;
            case 8:
            	return;
            default:
                System.out.println("Khong hop le");
                break;
	        }
		}
	}

	public static boolean empty(int[] arr) {
		if(arr.length == 0) {
			System.out.println("Mang rong");
		}
		return arr.length == 0;
	}

	public static int readInt(String title) {
		Scanner ip = new Scanner(System.in);
		int x = ip.nextInt();
		System.out.print(title);
		return x;
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

	public static int readInt(String title, int min, int max) {
		Scanner ip = new Scanner(System.in);
		int x;
		do {
			System.out.print(title);
			x = ip.nextInt();
		} while(x < min && x > max);
		return x;
	}

	public static int[] inArr(int[] arr, int n) {
		Scanner ip = new Scanner(System.in);
		arr = new int[n];
		for (int i=0; i<n; ++i) {
			System.out.print("Nhap phan tu thu " + (i+1) + ": ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}

	public static void outFront(int[] arr) {
		if(empty(arr)) return;

		System.out.print("Mang la: ");
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static void outBack(int[] arr) {
		if(empty(arr)) return;

		System.out.print("Mang nguoc la: ");
		for (int i=arr.length-1; i>=0; --i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static int[] insert(int[] arr) {
		arr = Arrays.copyOf(arr, arr.length + 1);

		int value = readInt("Nhap gia tri muon chen: "),
			index = readInt("Nhap vi tri muon chen: ", 1, arr.length);

		for (int i=arr.length - 1; i>index+1; --i) {
			arr[i] = arr[i-1];
		}
		arr[index] = value;

		return arr;
	}

	public static int[] erase(int[] arr) {
		if(empty(arr)) return arr;

		int index = readInt("Nhap vi tri muon xoa: ", 1, arr.length);

		for (int i=index - 1; i<arr.length - 1; ++i) {
			arr[i] = arr[i+1];
		}

		arr = Arrays.copyOf(arr, arr.length - 1);

		return arr;
	}

	public static void getDivisible(int[] arr) {
		if(empty(arr)) return;

		int number = readInt("Nhap vi tri muon lay phan tu chia het: ", 1, arr.length);

		System.out.println(number);
		for (int i=0; i<arr.length; ++i) {
			if(arr[i] % number == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}

	public static void sum(int[] arr) {
		if(empty(arr)) return;

		int s = 0;
		for (int i=0; i<arr.length; ++i) {
			s += arr[i];
		}

		System.out.println("Tong cac phan tu trong mang la: " + s);
	}
}