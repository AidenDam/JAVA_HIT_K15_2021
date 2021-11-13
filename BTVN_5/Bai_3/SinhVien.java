package bai_3;

import java.util.Scanner;

public class SinhVien extends Nguoi
{
    private String code;
    private String majors;
    private int course;
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        setCode(sc.nextLine());
        System.out.print("Nhap nganh hoc: ");
        setMajors(sc.nextLine());
        System.out.print("Nhap khoa hoc: ");
        setCourse(sc.nextInt());
    }
    @Override
    public void output(){
        super.output();
        System.out.printf("%-20s %-20s %-20d\n", getCode(), getMajors(), getCourse());
    }
    public SinhVien() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
