package com.uhyeon.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> items;

    // 생성자가 호출될 때 ArrayList가 만들어질 수 있도록 함
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
