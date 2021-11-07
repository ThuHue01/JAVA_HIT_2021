package com.company;

import java.util.Scanner;

class HANG {
    String maHang, tenHang;
    double donGia;
     public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        maHang = scan.nextLine();
        System.out.println("Nhập tên hàng: ");
        tenHang = scan.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scan.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-20s%-20s%f\n", maHang, tenHang, donGia);
    }
}

class PHIEU {
    String maPhieu;
    HANG[] x = new HANG[100];
    int n;
    double sum = 0;
    public void NHAP() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã phiếu: ");
        maPhieu = scan.nextLine();
        System.out.println("Nhập số mặt hàng trong phiếu: ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập mặt hàng thứ " + (i + 1));
            x[i] = new HANG();
            x[i].nhap();
            sum += x[i].donGia;
        }
    }
    public void XUAT() {
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.printf("%-20s%-20s%-20s%s\n", "Mã hàng", "Tên hàng", "Đơn giá", "Tổng tiền");
        for (int i = 0; i < n; i++)
            x[i].xuat();
        System.out.printf("%69f", sum);
    }
}
public class Bai3 {
    public static void main(String[] args) {
        PHIEU p = new PHIEU();
        p.NHAP();
        p.XUAT();
    }
}
