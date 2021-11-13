package bai_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain
{
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();

        input(lopHoc);
        output(lopHoc);
        check(lopHoc);
        sort(lopHoc);
        output(lopHoc);

    }
    public static void input(LopHoc lopHoc) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma LH: ");
        lopHoc.setCode(sc.nextLine());
        System.out.print("Nhap ten LH: ");
        lopHoc.setName(sc.nextLine());
        System.out.print("Nhap ngay mo: ");
        lopHoc.setOpenDate(sc.nextLine());
        System.out.print("Nhap so sinh vien: ");
        lopHoc.setN(sc.nextInt());

        List <SinhVien> sinhViens = new ArrayList<>();
        for (int i=0; i<lopHoc.getN(); i++){
            System.out.println("Nhap sin vien thu " + (i+1));
            SinhVien sv = new SinhVien();
            sv.input();
            sinhViens.add(sv);
        }
        lopHoc.setSinhViens(sinhViens);
        System.out.print("Nhap giao vien: ");
        sc.nextLine();
        lopHoc.setTeacher(sc.nextLine());
    }
    public static void output(LopHoc lopHoc){
        System.out.printf("\nMa LH: %s\tTen LH: %s\n", lopHoc.getCode(), lopHoc.getName());
        System.out.printf("Ngay mo: %s\tGiao vien: %s\n", lopHoc.getOpenDate(), lopHoc.getTeacher());
        System.out.printf("%-20s %-20s %-20s ", "Ho ten", "Ngay sinh", "Que quan");
        System.out.printf("%-20s %-20s %-20s\n", "Ma SV", "Ten SV", "Khoa hoc");
        for (int i=0; i<lopHoc.getN(); i++){
            lopHoc.getSinhViens().get(i).output();
        }
    }
    public static void check(LopHoc lopHoc){
        int cnt= 0;
        for (int i=0; i<lopHoc.getN(); i++){
            if (lopHoc.getSinhViens().get(i).getCourse()==15){
                cnt++;
            }
        }
        System.out.println("Co "+ cnt +" sinh vien khoa 15");
    }
    public static void sort(LopHoc lopHoc){
        for (int i=0; i<lopHoc.getN()-1; i++){
            for (int j=i+1; j<lopHoc.getN(); j++){
                if (lopHoc.getSinhViens().get(i).getCourse()>lopHoc.getSinhViens().get(j).getCourse()){
                    SinhVien temp = lopHoc.getSinhViens().get(i);
                    lopHoc.getSinhViens().set(i, lopHoc.getSinhViens().get(j));
                    lopHoc.getSinhViens().set(j, temp);
                }
            }
        }
    }
}
