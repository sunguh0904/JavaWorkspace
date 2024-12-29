package com.uhyeon.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.uhyeon.section01");

        BookService bookService = context.getBean("bookService", BookService.class);

        // 도서 전체 조회
        bookService.selectAllBooks().forEach(System.out::println);

        // 도서 번호로 도서 조회
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
