package com.uhyeon.section01.scope.subsection01.singleton;

import com.uhyeon.common.Beverage;
import com.uhyeon.common.Bread;
import com.uhyeon.common.Product;
import com.uhyeon.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage("바나나우유", 1500, 500);
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 500);
    }

    @Bean
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
