package com.uhyeon.common;

import lombok.AllArgsConstructor;

// Account 인터페이스 상속
public class PersonalAccount implements Account{
    private final int bankCode;
    private final String accNo;
    private int balance;

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니다.";
    }

    @Override
    public String deposit(int money) {
        String str = "";

        if (money > 0) {
            this.balance += money;
            str = money + "원이 입금되었습니다.";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";

        if (money <= 0) {
            str = "잔액이 부족합니다. 잔액을 확인해주세요.";
        } else {
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
