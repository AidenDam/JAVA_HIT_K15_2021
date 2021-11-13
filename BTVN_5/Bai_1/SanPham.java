package bai_1;

import java.util.Scanner;

public class SanPham
{
    private String code;
    private String name;
    private String brand;
    private String entryDate;
    public void input() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ma SP: ");
        code = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        name = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        brand = sc.nextLine();
        System.out.print("Nhap ngay nhap: ");
        entryDate = sc.nextLine();
    }
    public void output() {
        System.out.printf("%-20s %-20s %-20s %-20s", code, name, brand, entryDate);
    }

    public SanPham() {
    }

    public SanPham(String code, String name, String brand, String entryDate) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.entryDate = entryDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
}
