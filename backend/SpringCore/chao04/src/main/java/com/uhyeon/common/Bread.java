package com.uhyeon.common;

import java.util.Date;

public class Bread extends Product {
    // 생산 시간
    private java.util.Date bakeDate;

    public Bread(String name, int price, java.util.Date bakeDate) {
        super(name, price);
        this.bakeDate = bakeDate;
    }

    public Date getBakeDate() {
        return bakeDate;
    }

    public void setBakeDate(Date bakeDate) {
        this.bakeDate = bakeDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.bakeDate;
    }
}
