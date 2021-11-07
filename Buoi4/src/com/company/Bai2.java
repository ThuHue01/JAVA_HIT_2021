package com.company;

import java.util.Scanner;

class Date {
    int d, m, y;
    public void nhap()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        d = scan.nextInt();
        System.out.println("Nhập tháng: ");
        m = scan.nextInt();
        System.out.println("Nhập năm: ");
        y = scan.nextInt();
    }
    public void xuat()
    {
        System.out.printf("Ngày sinh: %d/%d/%d", d, m, y);
    }
}
class NhanSu {
    String maNS, hoTen;
    Date NS = new Date();
    public void Nhap()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        maNS = scan.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = scan.nextLine();
        NS.nhap();
    }
    public void Xuat()
    {
        System.out.println("Mã nhân sự: " + maNS);
        System.out.println("Họ tên: " + hoTen);
        NS.xuat();
    }
}
public class Bai2 {
    public static void main(String[] args) {
        NhanSu x = new NhanSu();
        x.Nhap();
        x.Xuat();
    }
}
