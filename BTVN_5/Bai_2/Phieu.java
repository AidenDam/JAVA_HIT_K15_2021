package bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phieu {
    private String code;
    private String name;
    private DateTime a;
    private List <SanPham> x = new ArrayList<>();
    private int n;

    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        code = sc.nextLine();
        System.out.print("Nhap ten phieu: ");
        name = sc.nextLine();
        a =new DateTime();
        a.input();
        System.out.print("Nhap so loai san pham: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Nhap loai san pham thu "+ (i+1));
            SanPham spp = new SanPham();
            spp.input();
            x.add(spp);
        }
    }

    public void output(){
        System.out.printf("\nMa phieu: %s \t Ten phieu: %s\n", code, name);
        System.out.printf("Ngay nhap: ");  a.output();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Ma sp", "Ten sp", "So luong", "Don gia", "Thanh tien");
        for (int i=0; i<n; i++){
            x.get(i).output();
        }
    }
}
