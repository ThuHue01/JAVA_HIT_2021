package com.company;

import java.util.Scanner;

public class Bai5 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(double n) {
        return false;
    }
    public static boolean isPrime(float n) {
        return false;
    }

    public static void main(String[] args) {
        if (isPrime(13)) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("Không là số nguyên tố");
        }
    }
}
