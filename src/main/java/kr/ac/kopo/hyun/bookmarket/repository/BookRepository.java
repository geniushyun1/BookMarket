package kr.ac.kopo.hyun.bookmarket.repository;

import kr.ac.kopo.hyun.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();

}
