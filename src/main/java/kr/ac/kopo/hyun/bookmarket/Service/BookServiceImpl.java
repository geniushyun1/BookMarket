package kr.ac.kopo.hyun.bookmarket.Service;

import kr.ac.kopo.hyun.bookmarket.domain.Book;
import kr.ac.kopo.hyun.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private List<Book> listOfBooks;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();

    }

    @Override
    public Book getBookById(String bookId) {
        Book book = bookRepository.getBookById(bookId);
        return book;
    }

    @Override
    public void setNewBook(Book book) {

    }
}
