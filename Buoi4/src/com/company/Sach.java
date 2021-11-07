package com.company;

import java.util.Scanner;

public class Sach {
    String maSach, tenSach, NXB;
    int soTrang;
    double giaTien;
    public void NHAP()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = scan.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = scan.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        NXB = scan.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = scan.nextInt();
        System.out.println("Nhap gia tien: ");
        giaTien = scan.nextInt();
    }

    public void XUAT()
    {
        System.out.printf("%-20s%-20s%-20s%-20d%f\n", maSach, tenSach, NXB, soTrang, giaTien);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so cuon sach: ");
        int n = scan.nextInt();
        Sach[] sach = new Sach[n];
        for(int i = 0; i < n; i++)
        {
            sach[i] = new Sach();
            System.out.println("Cuon sach thu " + (i+1) + ":");
            sach[i].NHAP();
        }

        System.out.printf("%-20s%-20s%-20s%-20s%s\n","Ma sach", "Ten sach", "Nha xuat ban", "So trang", "Gia tien");
        for(int i = 0; i < n; i++)
            sach[i].XUAT();
    }
}
