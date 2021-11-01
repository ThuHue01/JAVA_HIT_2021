package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    int n;
    int[] a ;
    public Array() {

    }

    public Array(int n, int[] a)
    {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public void inputData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextInt();
        a =  new int[n];
        System.out.println("Nhap mang: ");
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
    }

    public void Show()
    {
        System.out.println("Mang a la: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public int Sum()
    {
        int s = 0;
        for (int i = 0; i < n; i++)
            s += a[i];
        return s;
    }

    public void Filter(boolean flag)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        //int[] trave;
        int dem = 0;
        for (int i = 0; i < n; i++)
            if(flag == true && a[i] % 2 == 0)
                arrli.add(a[i]);
            else if (flag == false && a[i] % 2 == 1)
                arrli.add(a[i]);
        for (int x:arrli) {
            System.out.print(x + " ");
        }
    }
}
