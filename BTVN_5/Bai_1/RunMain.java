package bai_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong dieu hoa: ");
        n = sc.nextInt();
        List<DieuHoa> dieuHoas = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("Nhap thong tin dieu hoa thu " + (i+1));
            DieuHoa dh = new DieuHoa();
            dh.input();
            dieuHoas.add(dh);
        }
        System.out.println("\nDanh sach dieu hoa:");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Ma SP", "Ten SP", "Ten Hang", "Ngay Nhap", "Cong Suat", "Gia Ban");
        for (int i=0; i<n; i++) {
            dieuHoas.get(i).output();
        }
        System.out.println("\nSan pham co ten hang la Electrolux: ");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Ma SP", "Ten SP", "Ten Hang", "Ngay Nhap", "Cong Suat", "Gia Ban");
        check(dieuHoas);
    }

    public static void check(List <DieuHoa> dieuHoas) {
        DieuHoa dhh = dieuHoas.get(0);
        for (int i=0; i<dieuHoas.size(); i++) {
            if (dieuHoas.get(i).getPrice() < dhh.getPrice()) {
                dhh = dieuHoas.get(i);
            }
            if (dieuHoas.get(i).getName().compareToIgnoreCase("Electrolux")==0) {
                dieuHoas.get(i).output();
            }
        }
        System.out.println("\nSan pham co gia ban thap nhat:");
        dhh.output();
    }
}
