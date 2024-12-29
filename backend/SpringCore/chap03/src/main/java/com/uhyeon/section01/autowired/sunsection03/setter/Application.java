package com.uhyeon.section01.autowired.sunsection03.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.uhyeon.section01");

        BookService bookService = context.getBean("bookServiceSetter", BookService.class);

        bookService.selectAllBooks().forEach(System.out::println);

        System.out.println(bookService.searchBookBySequence(2));
    }
}
