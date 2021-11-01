package com.company;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        System.out.println("Nhap arr1: ");
        arr1.inputData();
        int tbc1 = arr1.Sum()/ arr1.n;
//        arr1.Show();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("\nTong cua day 1 la: " + arr1.Sum());
//        System.out.println("Nhap flg: ");
//        boolean flag = scan.nextBoolean();
//        System.out.println("Mang loc: ");
//        arr1.Filter(flag);
        System.out.println("Nhap arr2: ");
        Array arr2 = new Array();
        arr2.inputData();
        int tbc2 = arr2.Sum()/ arr2.n;
        System.out.println("So sanh TBC 2 mang");
        if(tbc1 == tbc2)
            System.out.println("Bye");
        else if (tbc1 > tbc2)
            System.out.println("TBC cua mang 1 lon hon");
        else
            System.out.println("TBC cua mang 2 lon hon");
    }
}

