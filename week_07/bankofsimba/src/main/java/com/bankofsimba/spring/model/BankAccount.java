package com.bankofsimba.spring.model;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private String currancy;
    private boolean isKing;

    public BankAccount(String name, double balance, String animalType, String currancy, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currancy = currancy;
        this.isKing = isKing;
    }

    public boolean isKing() {
        return isKing;
    }

    public String getCurrancy() {
        return currancy;
    }


    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
