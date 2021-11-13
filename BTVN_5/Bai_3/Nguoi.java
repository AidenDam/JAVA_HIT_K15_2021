package bai_3;

import java.util.Scanner;

public class Nguoi
{
    private String name;
    private String birthday;
    private String address;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        birthday = sc.nextLine();
        System.out.print("Nhap que quan: ");
        address = sc.nextLine();
    }
    public void output(){
        System.out.printf("%-20s %-20s %-20s ", name, birthday, address);
    }

    public Nguoi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
