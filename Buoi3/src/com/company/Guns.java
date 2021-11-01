package com.company;

public class Guns {
    int ammoNumber;
    String weaponName;

    public  Guns() {}
    public Guns(int ammoNumber)
    {
        this.ammoNumber = ammoNumber;
    }
    public Guns(String weaponName, int ammoNumber)
    {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void Load(int x)
    {
        ammoNumber += x;
    }

    public void Shoot(int x)
    {
        if (ammoNumber - x >= 0)
            ammoNumber -= x;
        else if (ammoNumber == 0)
            System.out.println("Het dan");
    }

}
