package com.example.towhid.subprojectaponbloodbank;

import android.graphics.Color;

public class BloodBank {
    private String bloodBankName;
    private String bloodBankPhoneNumber;
    private String bloodBankAdress;
    private int color;

    public BloodBank(int color,String bloodBankName, String bloodBankPhoneNumber, String bloodBankAdress) {
        this.color=color;
        this.bloodBankName = bloodBankName;
        this.bloodBankPhoneNumber = bloodBankPhoneNumber;
        this.bloodBankAdress = bloodBankAdress;
    }


    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getBloodBankPhoneNumber() {
        return bloodBankPhoneNumber;
    }

    public void setBloodBankPhoneNumber(String bloodBankPhoneNumber) {
        this.bloodBankPhoneNumber = bloodBankPhoneNumber;
    }

    public String getBloodBankAdress() {
        return bloodBankAdress;
    }

    public void setBloodBankAdress(String bloodBankAdress) {
        this.bloodBankAdress = bloodBankAdress;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
