package Bai_2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = readInt("Enter n: ", 1);
		ArrayList<Book> lst = new ArrayList<>();
		for (int i=0; i<n; i++) {
			System.out.println("Nhap thong tin cuon sach thu " + (i+1) + ":");
            Book book = new Book();
            book.input();
            lst.add(book);
		}

		System.out.printf("%-10s | %-30s | %-30s | %-30s | %-5s | %-10s\n", "id","name","publisher","price","Number of page","author");
        for (int i=0; i<n; i++){
            lst.get(i).output();
        }
        System.out.println();
        System.out.println();
        
        int choose = Menu();
        if(choose == 7){
            return;
        }
        while(choose>=1 && choose<=7){
            switch(choose) {
                case 1:
                    System.out.println("Nhap thong tin sach muon them : ");
                    Book a = new Book();
                    a.input();
                    lst.add(a);
                    break;
                case 3:
                    System.out.println("Nhap id sach muon xoa : ");
                    String s;
                    s = sc.nextLine();
                    for (int i=0; i<n; i++){
                        if(lst.get(i).id.equalsIgnoreCase(s)==true){
                            lst.remove(lst.get(i));
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i=0; i<n-1; i++){
                        for (int j=i+1;j<n;j++){
                            if(lst.get(i).name.compareToIgnoreCase(lst.get(j).name)>0){
                                Collections.swap(lst,i,j);
                            }
                        }
                    }
                    break;
                case 5:
                    for (int i=0; i<n-1; i++){
                        for (int j=i+1;j<n;j++){
                            if(lst.get(i).price < lst.get(j).price){
                                Collections.swap(lst,i,j);
                            }
                        }
                    }
                    break;
                case 6:
                    for (int i=0; i<n; i++){
                        System.out.println("Thong tin cac sach trong thu vien : ");
                        lst.get(i).output();
                    }
                case 7:
                    return;
            }
            choose = Menu();
        }
	}

	public static int readInt(String title, int min) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.print(title); x = sc.nextInt();
		} while(x < min);
		return x;
	}

	public static int Menu() {
        System.out.println("1. Add book");
        System.out.println("2. Edit book by id");
        System.out.println("3. Delete book by id");
        System.out.println("4. Sort books by name (ascending)");
        System.out.println("5. Sort books by price (descending)");
        System.out.println("6. Show all books");
        System.out.println("7. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a anumber: ");
        int x;
        x = sc.nextInt();
        return x;
    }
}