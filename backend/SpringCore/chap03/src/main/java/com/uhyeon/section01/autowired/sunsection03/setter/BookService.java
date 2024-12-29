package com.uhyeon.section01.autowired.sunsection03.setter;

import com.uhyeon.section01.common.BookDAO;
import com.uhyeon.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceSetter")
public class BookService {
    private BookDAO bookDAO;

    // BookDAO 타입의 bean 객체를 setter에 자동으로 주입
    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
