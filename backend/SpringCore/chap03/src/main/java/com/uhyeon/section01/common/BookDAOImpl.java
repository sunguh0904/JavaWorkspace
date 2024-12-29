package com.uhyeon.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();

        bookList.put(1, new BookDTO(1, 123456, "자바의 정석", "남궁성", "도우출판", new Date()));
        bookList.put(2, new BookDTO(2, 654321, "칭찬은 고래도 춤추게 한다", "고래", "고래출판", new Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
