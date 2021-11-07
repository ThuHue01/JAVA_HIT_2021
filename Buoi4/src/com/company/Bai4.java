package com.company;

import java.util.Scanner;

class May {
    String maMay, kieuMay, tinhTrang;
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        maMay = scan.nextLine();
        System.out.println("Nhập kiểu máy: ");
        kieuMay = scan.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        tinhTrang = scan.nextLine();
    }
    public void xuat() {
        System.out.printf("%-20s%-20s%s\n", maMay, kieuMay, tinhTrang);
    }
}

class QuanLy {
    String maQL, hoTen;
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        maQL = scan.nextLine();
        System.out.println("Nhập họ tên quản lý: ");
        hoTen = scan.nextLine();
    }
    public void xuat() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}

class PhongMay {
    String maPhong, tenPhong;
    float dienTich;
    QuanLy x = new QuanLy();
    May[] y = new May[100];
    int n;
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong = scan.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = scan.nextLine();
        System.out.println("Nhập diện tích phòng: ");
        dienTich = scan.nextInt();
        x.nhap();
        System.out.println("Nhập số máy tính: ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập máy thứ: " + (i + 1));
            y[i] = new May();
            y[i].nhap();
        }
    }
    public void xuat() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích phòng: " + dienTich);
        x.xuat();
        System.out.printf("%-20s%-20s%s\n", "Mã máy", "Kiểu máy", "Tình trạng máy");
        for (int i = 0; i < n; i++)
            y[i].xuat();
    }
}

public class Bai4 {
    public static void main(String[] args) {
        PhongMay pm = new PhongMay();
        pm.nhap();
        pm.xuat();
    }
}
