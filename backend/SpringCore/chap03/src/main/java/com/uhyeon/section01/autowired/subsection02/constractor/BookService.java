package com.uhyeon.section01.autowired.subsection02.constractor;

import com.uhyeon.section01.common.BookDAO;
import com.uhyeon.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {
    private final BookDAO bookDAO;

    // 의존성 주입은 final 키워드를 사용할 수 있는 생성자 주입 방법을 많이 사용함
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
