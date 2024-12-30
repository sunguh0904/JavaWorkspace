package com.uhyeon.common.section02.initdestory.subsection01.java;

import com.uhyeon.common.Beverage;
import com.uhyeon.common.Bread;
import com.uhyeon.common.Product;
import com.uhyeon.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(water);
        System.out.println("cart1 = " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(milk);
        System.out.println("cart2 = " + cart2.getItems());

        ((AnnotationConfigApplicationContext)context).close();
    }
}
