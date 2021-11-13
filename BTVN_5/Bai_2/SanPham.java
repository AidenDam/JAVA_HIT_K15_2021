package bai_2;

import java.util.Scanner;

public class SanPham {
    private String code;
    private String name;
    private int soL;
    private float price;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SP: ");
        code = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        name = sc.nextLine();
        System.out.print("Nhap so luong SP: ");
        soL = sc.nextInt();
        System.out.print("Nhap ma SP: ");
        price = sc.nextFloat();
    }

    public void output(){
        System.out.printf("%-20s %-20s %-20d %-20f %-20f\n", code, name, soL, price, soL*price);
    }
}
