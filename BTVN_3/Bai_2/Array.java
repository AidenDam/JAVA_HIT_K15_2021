import java.util.Scanner;
import java.util.Arrays;

public class Array
{
	private int len, arr[];

	public void Array() {

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

	public void inputData() {
		Scanner ip = new Scanner(System.in);
		len = readInt("Nhap so phan tu: ", 1);
		arr = new int[len];
		for (int i=0; i<len; ++i) {
			System.out.print("Nhap phan tu thu " + (i+1) + ": ");
			arr[i] = ip.nextInt();
		}
	}

	public void show() {
		System.out.print("Mang la: ");
		for (int it : arr) {
			System.out.print(it);
		}
	}

	public int sum() {
		int s = 0;
		for (int it : arr) {
			s += it;
		}
		return s;
	}

	public void filter(boolean flag) {
		int c = (flag ? 0 : 1);
		for (int it : arr) {
			if(it % 2 == c) {
				System.out.print(it + " ");
			}
		}
	}

	public int getLen() {
		return len;
	}
	public int getElement(int i) {
		return arr[i];
	}

	public void setLen(int n) {
		len = n;
		arr = Arrays.copyOf(arr, len);
	}
	public void setElement(int i, int val) {
		arr[i] = val;
	}
}