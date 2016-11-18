package com.happycoding.uniquehust.accountplus.items;

/**
 * Created by qimeng on 16-11-5.
 */

public class AccountItem {
    private int type;
    private String title;
    private double amount;
    private String description;
    private int year;
    private int month;
    private int day;
    private long picTimeStamp;
    private int iconID;
    private int isIncome;


    public AccountItem(int type, String title, double amount, String description, int year, int month, int day, long picTimeStamp, int iconID, int isIncome) {

        this.type = type;
        this.title = title;
        this.amount = amount;
        this.description = description;
        this.year = year;
        this.month = month;
        this.day = day;
        this.picTimeStamp = picTimeStamp;
        this.iconID = iconID;
        this.isIncome = isIncome;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public long getPicTimeStamp() {
        return picTimeStamp;
    }

    public void setPicTimeStamp(long picTimeStamp) {
        this.picTimeStamp = picTimeStamp;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }


    public int isIncome() {
        return isIncome;
    }

    public void setIncome(int income) {
        isIncome = income;
    }
}
