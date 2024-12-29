package com.uhyeon.common;

public interface Account {
    String getBalance();
    String deposit(int money);
    String withDraw(int money);
}
