package bai_1;

import java.util.Scanner;

public class DieuHoa extends SanPham
{
    private int wattage;
    private int price;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cong suat: ");
        wattage = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        price = sc.nextInt();
    }


    @Override
    public void output() {
        super.output();
        System.out.printf("%-20d %-20d\n", wattage, price);
    }

    public DieuHoa() {
    }

    public DieuHoa(int wattage, int price) {
        this.wattage = wattage;
        this.price = price;
    }

    public DieuHoa(String code, String name, String brand, String entryDate, int wattage, int price) {
        super(code, name, brand, entryDate);
        this.wattage = wattage;
        this.price = price;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getPrice() {
        return price;
    }

    public void setpPrice(int price) {
        this.price = price;
    }
}
