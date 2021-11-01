package com.company;

import java.util.Random;

public class RunMain_B3 {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns("AKM", 100);
        System.out.println(DiepBeDe.ammoNumber);
        Guns DoanXinhGai = new Guns("M762", 100);
        Random random = new Random();
        do {
            DiepBeDe.Shoot(random.nextInt(10) + 1);
            DoanXinhGai.Shoot(random.nextInt(10) + 1);
            if (DiepBeDe.ammoNumber == 0 && DoanXinhGai.ammoNumber == 0) {
                System.out.println("Nạp thêm  đạn.");
                DiepBeDe.Load(random.nextInt(10) + 1);
                DiepBeDe.Load(random.nextInt(10) + 1);
            } else {
                if (DiepBeDe.ammoNumber == 0) {
                    System.out.println("Doan Xinh Gai thang");
                    break;
                }
                if (DoanXinhGai.ammoNumber == 0) {
                    System.out.println("Diep Be De thang");
                    break;
                }
            }
        } while (DiepBeDe.ammoNumber != 0 || DoanXinhGai.ammoNumber != 0);
    }
}
