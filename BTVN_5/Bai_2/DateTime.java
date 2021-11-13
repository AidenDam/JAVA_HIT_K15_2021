package bai_2;

import java.util.Scanner;

public class DateTime {
    private int day;
    private int month;
    private int year;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay : ");
        day = sc.nextInt();
        System.out.print("Nhap thang : ");
        month = sc.nextInt();
        System.out.print("Nhap nam : ");
        year = sc.nextInt();
    }

    public void output(){
        System.out.println(day + "/" + month + "/" + year);
    }
}
