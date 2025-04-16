package kr.ac.kopo.hyun.bookmarket.Service;

import kr.ac.kopo.hyun.bookmarket.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String id);

}
