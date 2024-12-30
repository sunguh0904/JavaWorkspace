package com.uhyeon.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    private String name;
    private int price;

    @Override
    public String toString() {
        return name = " " + price;
    }
}
