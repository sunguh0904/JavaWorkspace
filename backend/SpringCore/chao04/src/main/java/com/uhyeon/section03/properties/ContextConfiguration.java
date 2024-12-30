package com.uhyeon.section03.properties;

import com.uhyeon.common.Beverage;
import com.uhyeon.common.Bread;
import com.uhyeon.common.Product;
import com.uhyeon.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
/* properties 파일의 경로를 읽는다. */
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {
    /* properties를 읽은 경로에서 이 키에 해당하는 값을 꺼내온다.
     *  사용하면 xml 파일에서 정해진 값이 있어 우선적으로 정의가 된다.
     *  값을 동적으로 변경하고 싶다면, xml 파일에서
     * "클래스명.변수명.속서명 = 값"을 지우고 메소드에서 설정해 준다.
     * : 을 사용하면 값을 읽어오지 못하는 경우 사용할 대체 값을 작성할 수 있다. */
    @Value("${bread.carpbread.name:슈크림붕어빵}")
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price}")
    private int milkPrice;

    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name}")String waterName,
                         @Value("${beverage.water.price}")int waterPrice,
                         @Value("${beverage.water.capacity}")int waterCapacity) {
        return new Beverage(waterName, waterPrice, waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
