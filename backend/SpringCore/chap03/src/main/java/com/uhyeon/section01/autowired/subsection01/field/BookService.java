package com.uhyeon.section01.autowired.subsection01.field;

import com.uhyeon.section01.common.BookDAO;
import com.uhyeon.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service:
* @Component의 파생된 어노테이션의 한 종류로 service 계층에서 사용 */
@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
