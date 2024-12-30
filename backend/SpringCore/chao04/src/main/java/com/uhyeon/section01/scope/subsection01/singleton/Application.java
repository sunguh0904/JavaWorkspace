package com.uhyeon.section01.scope.subsection01.singleton;

import com.uhyeon.common.Beverage;
import com.uhyeon.common.Bread;
import com.uhyeon.common.Product;
import com.uhyeon.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /* Spring Framework에서 bean의 기본 스코프는 singleton임
        * singleton 스코프를 갖는 bean은 어플리케이션 내에서 유일한 인스턴스를 갖음
        * 컨테이너는 cart라는 bean을 딱 한 개만 가지고 있기 때문에 둘은 같은 주소값을 가지고 있음 */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);
        System.out.println("cart1 = " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2 = " + cart2.getItems());

        System.out.println("cart1의 hashCode() = " + cart1.hashCode());
        System.out.println("cart2의 hashCode() = " + cart2.hashCode());
    }
}
